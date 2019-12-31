/**
 * 
 */
package com.flex.microservices.productinfoservice.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class acts as the Model class for ProductInfoModel.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Component
public class ProductInfoModel {

	private String productID;
	
	private String productName;
	
	private String productDesc;

	public ProductInfoModel(String productID, String productName, String productDesc) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productDesc = productDesc;
	}
	
}
