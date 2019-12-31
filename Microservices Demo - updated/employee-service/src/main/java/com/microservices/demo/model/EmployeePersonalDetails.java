/**
 * 
 */
package com.microservices.demo.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author gssmunej
 *
 */
@Component
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePersonalDetails {

	private Long empId;
	
	private String city;
	
	private String state;
	
	private String country;
}
