/**
 * 
 */
package com.flex.microservices.productratingsservice.controller;

import static com.flex.microservices.productratingsservice.utils.AppConstants.GET_RATING;
import static com.flex.microservices.productratingsservice.utils.AppConstants.HEALTH_CHECK;
import static com.flex.microservices.productratingsservice.utils.AppConstants.PRODUCT_RATING_LIST;
import static com.flex.microservices.productratingsservice.utils.AppConstants.PRODUCT_RATING_SERVICE;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flex.microservices.productratingsservice.model.ProductRatingModel;
import com.flex.microservices.productratingsservice.model.ProductRatingModelList;

/**
 * This class acts as the Controller for Product Rating Service.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@RestController
@RequestMapping(PRODUCT_RATING_SERVICE)
public class ProductRatingController {

	@Autowired
	private ProductRatingModelList productRatingModelList;
	
	@RequestMapping(value=GET_RATING, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductRatingModelList getProductRating(@RequestParam("productId") String productId) {
		
		List<ProductRatingModel> filteredRatingList =  PRODUCT_RATING_LIST.stream()
													   .filter(rating -> rating.getProductID().equals(productId))
													   .collect(Collectors.toList());
		
		productRatingModelList.setProductRatingModelList(filteredRatingList);
		
		return productRatingModelList;
	}
	
	@RequestMapping(value = HEALTH_CHECK, method=RequestMethod.GET)
	public String healthCheck() {
		
		return "Product Rating Service is up & running fine!";
	}
	
}
