/**
 * 
 */
package com.microservices.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.demo.entity.EmployeePersonalDetails;
import com.microservices.demo.repository.EmployeeRepository;

/**
 * @author gssmunej
 *
 */
@Service
public class EmployeeService {

	private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeePersonalDetails employeePersonalDetails;

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeePersonalDetails getEmployeePersonalDetails(Long empId) {
		try {
			log.info("Executing EmployeeService#getEmployeePersonalDetails()...");

			employeePersonalDetails = employeeRepository.findByEmpId(empId);

			return employeePersonalDetails;
		} catch (Exception exception) {
			log.error("Exception occured in EmployeeService#getEmployeePersonalDetails(). Exception is: " + exception);

			return null;
		}
	}
}
