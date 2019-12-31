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

	public static final String EMPLOYEE_COMPANY_DETAILS_API = "/empCompanyDetails";

	public static final String GET_EMPLOYEE_COMPANY_DETAILS = "/getEmpCompanyDetails/{empId}";
	
	public static final String HEALTH_CHECK = "/healthCheck";
}
