/**
 * 
 */
package com.flex.microservices.productcatalogservice.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * This class acts as the Model class for ProductRatingResponse.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@Component
public class ProductRatingResponse {

	/*{
	  "productRatingModelList": [
	    {
	      "productID": "200",
	      "productRating": "3"
	    }
	  ]
	}*/
	
	private ProductRatingModelList[] productRatingModelList;
	
	public ProductRatingResponse() {
		
	}
}
