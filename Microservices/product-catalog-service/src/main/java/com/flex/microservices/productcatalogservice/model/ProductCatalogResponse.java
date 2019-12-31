/**
 * 
 */
package com.flex.microservices.productcatalogservice.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class acts as the Model class for ProductCatalogResponse.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Component
public class ProductCatalogResponse {

	/*{
	  "productDetails": {
	    "productId": "300",
	    "productName": "U.S. Polo tees",
	    "productDesc": "Cool stuffs for the young!",
	    "productRating": "4"
	  }
	}*/
	
	private ProductCatalogModel productDetails;
	
}
