/**
 * 
 */
package com.flex.microservices.productcatalogservice.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class acts as the Model class for ProductRatingModelList.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Component
public class ProductRatingModelList {

	private String productID;
	
	private String productRating;
}
