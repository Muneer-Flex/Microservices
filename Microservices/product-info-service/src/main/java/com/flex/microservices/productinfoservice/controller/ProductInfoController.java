/**
 * 
 */
package com.flex.microservices.productinfoservice.controller;

import static com.flex.microservices.productinfoservice.utils.AppConstants.GET_PRODUCT_INFO;
import static com.flex.microservices.productinfoservice.utils.AppConstants.PRODUCT_INFO_LIST;
import static com.flex.microservices.productinfoservice.utils.AppConstants.PRODUCT_INFO_SERVICE;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flex.microservices.productinfoservice.model.ProductInfoModel;
import com.flex.microservices.productinfoservice.model.ProductInfoModelList;

/**
 * This class acts as the Controller for Product Info Service.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@RestController
@RequestMapping(PRODUCT_INFO_SERVICE)
public class ProductInfoController {

	@Autowired
	private ProductInfoModelList productInfoModelList;
	
	@RequestMapping(value=GET_PRODUCT_INFO, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoModelList getProductInformation(@RequestParam("productId") String productId) {
		
		System.out.println("Entered...");
		
		List<ProductInfoModel> filteredProductList = PRODUCT_INFO_LIST.stream()
						   .filter(info -> info.getProductID().equals(productId))
						   .collect(Collectors.toList());
		
		productInfoModelList.setProductInfoModelList(filteredProductList);
		
		System.out.println("Completed...");
		
		return productInfoModelList;
	}
}
