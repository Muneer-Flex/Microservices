/**
 * 
 */
package com.flex.microservices.productinfoservice.utils;

import java.util.Arrays;
import java.util.List;

import com.flex.microservices.productinfoservice.model.ProductInfoModel;

/**
 * This class contains the Application level constants.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
public class AppConstants {

	public static final String PRODUCT_INFO_SERVICE = "/ProductInfoService";
	
	public static final String GET_PRODUCT_INFO = "/getProductInfo";
	
	public static List<ProductInfoModel> PRODUCT_INFO_LIST = Arrays.asList(new ProductInfoModel("100", "Woodlands Shoes", "Good Quality Leather Shoes"),
			new ProductInfoModel("200", "Denim Jeans", "High Quality Rugged Jeans"),
			new ProductInfoModel("300", "U.S. Polo tees", "Cool stuffs for the young!"),
			new ProductInfoModel("400", "Crocs", "Premium flip flops"),
			new ProductInfoModel("500", "Ray Ban", "Cool Aviators"));
}
