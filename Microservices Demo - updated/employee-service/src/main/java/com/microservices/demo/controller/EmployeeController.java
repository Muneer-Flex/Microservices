/**
 * 
 */
package com.microservices.demo.controller;

import static com.microservices.demo.utils.AppConstants.EMPLOYEE_MASTER_DETAILS_API;
import static com.microservices.demo.utils.AppConstants.GET_EMPLOYEE_MASTER_DETAILS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.demo.model.EmployeeMasterData;
import com.microservices.demo.service.EmployeeService;
/**
 * @author gssmunej
 *
 */
@RestController
@RequestMapping(EMPLOYEE_MASTER_DETAILS_API)
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeMasterData employeeMasterData;

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = GET_EMPLOYEE_MASTER_DETAILS, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeMasterData getEmployeeMasterData(@PathVariable("empId") Long empId) {
		try {
			log.info("Executing EmployeeController#getEmployeeMasterData()...");

			log.info("Employee ID:: " + empId);

			employeeMasterData = employeeService.getEmployeeMasterData(empId);

			return employeeMasterData;
		} catch (Exception exception) {
			log.error("Exception occured in EmployeeController#getEmployeeMasterData(). Exception is: " + exception);

			return null;
		}
	}
}
