/**
 * 
 */
package com.flex.microservices.productcatalogservice.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class acts as the Model class for ProductCatalogModel.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProductCatalogModel {

	private String productId;
	
	private String productName;
	
	private String productDesc;
	
	private String productRating;
	
}
