/**
 * 
 */
package com.flex.microservices.productinfoservice.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@ToString
@Component
public class ProductInfoModelList {

	private List<ProductInfoModel> productInfoModelList;
}
