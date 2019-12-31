/**
 * 
 */
package com.flex.microservices.productratingsservice.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This class acts as the Model class for ProductRatingModelList.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@Component
@ToString
public class ProductRatingModelList {

	List<ProductRatingModel> productRatingModelList;
	
	public ProductRatingModelList() {
		
	}
	
}
