/**
 * 
 */
package com.microservices.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.demo.controller.EmployeeController;
import com.microservices.demo.entity.EmployeeCompanyDetails;
import com.microservices.demo.repository.EmployeeRepository;

/**
 * @author gssmunej
 *
 */
@Service
public class EmployeeService {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeCompanyDetails employeeCompanyDetails;

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeCompanyDetails getEmployeeCompanyDetails(Long empId) {
		try {
			log.info("Executing EmployeeService#getEmployeeCompanyDetails()...");

			employeeCompanyDetails = employeeRepository.findByEmpId(empId);

			return employeeCompanyDetails;
		} catch (Exception exception) {
			log.info("Exception occured in EmployeeService#getEmployeeCompanyDetails(). Exception is: " + exception);

			return null;
		}
	}
}
