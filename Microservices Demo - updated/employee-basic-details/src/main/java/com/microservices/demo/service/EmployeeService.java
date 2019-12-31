/**
 * 
 */
package com.microservices.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.demo.controller.EmployeeController;
import com.microservices.demo.entity.EmployeeBasicDetails;
import com.microservices.demo.repository.EmployeeRepository;

/**
 * @author gssmunej
 *
 */
@Service
public class EmployeeService {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeBasicDetails employeeBasicDetails;

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeBasicDetails getEmployeeBasicDetails(Long empId) {
		try {
			log.info("Executing EmployeeService#getEmployeeBasicDetails()...");

			employeeBasicDetails = employeeRepository.findByEmpId(empId);

			return employeeBasicDetails;
		} catch (Exception exception) {
			log.error("Exception occured in EmployeeService#getEmployeeBasicDetails(). Exception is: " + exception);

			return null;
		}
	}
}
