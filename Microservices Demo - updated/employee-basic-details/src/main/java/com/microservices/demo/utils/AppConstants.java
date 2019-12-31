/**
 * 
 */
package com.microservices.demo.utils;

import org.springframework.stereotype.Component;

/**
 * @author gssmunej
 *
 */
@Component
public class AppConstants {

	public static final String EMPLOYEE_BASIC_DETAILS_API = "/empBasicDetails";

	public static final String GET_EMPLOYEE_BASIC_DETAILS = "/getEmpBasicDetails/{empId}";
	
	public static final String HEALTH_CHECK = "/healthCheck";
}
