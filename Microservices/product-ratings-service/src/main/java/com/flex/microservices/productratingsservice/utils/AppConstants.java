/**
 * 
 */
package com.flex.microservices.productratingsservice.utils;

import java.util.Arrays;
import java.util.List;

import com.flex.microservices.productratingsservice.model.ProductRatingModel;

/**
 * This class contains the Application level Constants.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
public class AppConstants {

	public static final String PRODUCT_RATING_SERVICE = "/ratingService";
	
	public static final String GET_RATING = "/getRating";
	
	public static final String HEALTH_CHECK = "/healthCheck";
	
	public static List<ProductRatingModel> PRODUCT_RATING_LIST = Arrays.asList(new ProductRatingModel("100", "4"),
			   new ProductRatingModel("200", "3"),
			   new ProductRatingModel("300", "4"),
			   new ProductRatingModel("400", "5"),
			   new ProductRatingModel("500", "4"));
}
