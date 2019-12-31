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

	public static final String EMPLOYEE_PERSONAL_DETAILS_API = "/empPersonalDetails";

	public static final String GET_EMPLOYEE_PERSONAL_DETAILS = "/getEmpPersonalDetails/{empId}";
	
	public static final String HEALTH_CHECK = "/healthCheck";
}
