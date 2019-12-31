/**
 * 
 */
package com.flex.microservices.productcatalogservice.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * This class acts as the Model class for ProductInfoResponse.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@Component
public class ProductInfoResponse {

	/*{
	  "productInfoModelList": [
	    {
	      "productID": "200",
	      "productName": "Denim Jeans",
	      "productDesc": "Desc for Denim Jeans"
	    }
	  ]
	}*/
			
	private ProductInfoModelList[] productInfoModelList;
	
	public ProductInfoResponse() {
		
	}
	
}
