/**
 * 
 */
package com.microservices.demo.controller;

import static com.microservices.demo.utils.AppConstants.EMPLOYEE_COMPANY_DETAILS_API;
import static com.microservices.demo.utils.AppConstants.GET_EMPLOYEE_COMPANY_DETAILS;
import static com.microservices.demo.utils.AppConstants.HEALTH_CHECK;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.demo.entity.EmployeeCompanyDetails;
import com.microservices.demo.service.EmployeeService;

/**
 * @author gssmunej
 *
 */
@RestController
@RequestMapping(EMPLOYEE_COMPANY_DETAILS_API)
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeCompanyDetails employeeCompanyDetails;
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = GET_EMPLOYEE_COMPANY_DETAILS, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeCompanyDetails getEmployeeCompanyDetails(@PathVariable("empId") Long empId) {
		try {
			log.info("Executing EmployeeController#getEmployeeCompanyDetails()....");

			log.info("Employee ID:: " + empId);

			employeeCompanyDetails = employeeService.getEmployeeCompanyDetails(empId);

			return employeeCompanyDetails;
		} catch (Exception exception) {
			log.info("Exception occured in EmployeeController#getEmployeeCompanyDetails(). Exception is: " + exception);

			return null;
		}
	}
	
	@GetMapping(value = HEALTH_CHECK, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getApiStatus() {
		return "Application is up & running fine!";
	}
}
