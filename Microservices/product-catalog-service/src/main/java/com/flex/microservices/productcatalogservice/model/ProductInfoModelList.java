/**
 * 
 */
package com.flex.microservices.productcatalogservice.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class acts as the Model class for ProductInfoModelList.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Component
public class ProductInfoModelList {

	private String productID;
	
	private String productName;
	
	private String productDesc;
}
