/**
 * 
 */
package com.flex.microservices.productratingsservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This class acts as the Model class for ProductRatingModel.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductRatingModel {

	private String productID;
	
	private String productRating;
}
