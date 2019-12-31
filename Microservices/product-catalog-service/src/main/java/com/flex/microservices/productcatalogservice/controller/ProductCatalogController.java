/**
 * 
 */
package com.flex.microservices.productcatalogservice.controller;

import static com.flex.microservices.productcatalogservice.utils.AppConstants.GET_PRODUCT_DETAILS;
import static com.flex.microservices.productcatalogservice.utils.AppConstants.GET_PRODUCT_RATING_HEALTH_CHECK;
import static com.flex.microservices.productcatalogservice.utils.AppConstants.PRODUCT_CATALOG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flex.microservices.productcatalogservice.model.ProductCatalogModel;
import com.flex.microservices.productcatalogservice.model.ProductCatalogResponse;
import com.flex.microservices.productcatalogservice.model.ProductInfoResponse;
import com.flex.microservices.productcatalogservice.model.ProductRatingResponse;
import com.flex.microservices.productcatalogservice.service.ProductCatalogService;

/**
 * This class acts as the Controller for Product Catalog Service.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@RestController
@RequestMapping(PRODUCT_CATALOG)
public class ProductCatalogController {

	@Autowired
	private ProductRatingResponse productRatingResponse;
	
	@Autowired
	private ProductInfoResponse productInfoResponse;
	
	@Autowired
	private ProductCatalogModel productCatalog;
	
	@Autowired
	private ProductCatalogResponse productCatalogReponse;
	
	@Autowired
	private ProductCatalogService productCatalogService;
	
	@RequestMapping(value=GET_PRODUCT_DETAILS, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductCatalogResponse getProductDetails(@RequestParam("productId") String productId) {
		
		try {
			productRatingResponse = productCatalogService.getProductRating(productId);
			productInfoResponse = productCatalogService.getProductInfo(productId);
			
			productCatalog = productCatalogService.objectMapper(productRatingResponse, productInfoResponse);
			
			productCatalogReponse.setProductDetails(productCatalog);
			
			return productCatalogReponse;
		} catch(Exception exception) {
			System.out.println("Exception occured in ProductCatalogController#getProductDetails(). The Exception is: "+exception);
			return null;
		}
		
	}
	
	@RequestMapping(value=GET_PRODUCT_RATING_HEALTH_CHECK, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getRatingApiStatus() {
		
		try {
			String value = productCatalogService.getRatingApiStatus();
			
			return value;
		} catch (Exception exception) {
			System.out.println("Exception occured in ProductCatalogController#getRatingApiStatus(). The Exception is: "+exception);
			
			return null;
		}
		
	}
}
