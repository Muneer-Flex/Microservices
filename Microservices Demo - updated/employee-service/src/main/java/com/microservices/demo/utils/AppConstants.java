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

	public static final String EMPLOYEE_MASTER_DETAILS_API = "/empMasterDetails";

	public static final String GET_EMPLOYEE_MASTER_DETAILS = "/getEmpMasterDetails/{empId}";
	
	public static final String HEALTH_CHECK = "/healthCheck";
	
	public static final String GET_EMPLOYEE_BASIC_DETAILS = "/getEmpBasicDetails/{empId}";
	
	public static final String GET_EMPLOYEE_COMPANY_DETAILS = "/getEmpCompanyDetails/{empId}";
	
	public static final String GET_EMPLOYEE_PERSONAL_DETAILS = "/getEmpPersonalDetails/{empId}";
}
