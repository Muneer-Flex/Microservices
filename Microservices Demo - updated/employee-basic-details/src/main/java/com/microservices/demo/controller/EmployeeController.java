/**
 * 
 */
package com.microservices.demo.controller;

import static com.microservices.demo.utils.AppConstants.EMPLOYEE_BASIC_DETAILS_API;
import static com.microservices.demo.utils.AppConstants.GET_EMPLOYEE_BASIC_DETAILS;
import static com.microservices.demo.utils.AppConstants.HEALTH_CHECK;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.demo.entity.EmployeeBasicDetails;
import com.microservices.demo.service.EmployeeService;
/**
 * @author gssmunej
 *
 */
@RestController
@RequestMapping(EMPLOYEE_BASIC_DETAILS_API)
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeBasicDetails employeeBasicDetails;

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = GET_EMPLOYEE_BASIC_DETAILS, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeBasicDetails getEmployeeBasicDetails(@PathVariable("empId") Long empId) {
		try {
			log.info("Executing EmployeeController#getEmployeeBasicDetails()....");

			log.info("Employee ID:: " + empId);

			employeeBasicDetails = employeeService.getEmployeeBasicDetails(empId);

			return employeeBasicDetails;
		} catch (Exception exception) {
			log.error("Exception occured in EmployeeController#getEmployeeBasicDetails(). Exception is: " + exception);

			return null;
		}
	}

	@GetMapping(value = HEALTH_CHECK, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getApiStatus() {
		return "Application is up & running fine!";
	}
}
