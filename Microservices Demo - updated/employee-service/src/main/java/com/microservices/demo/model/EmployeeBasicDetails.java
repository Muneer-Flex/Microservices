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
 * @author Muneer Ahmed J
 *
 */
@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeBasicDetails {
	
	private Long empId;
	
	private String empFirstName;
	
	private String empLastName;
	
	private String empEmailId;
}
