/**
 * 
 */
package com.microservices.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.demo.feign.EmployeeBasicDetailsClient;
import com.microservices.demo.feign.EmployeeCompanyDetailsClient;
import com.microservices.demo.feign.EmployeePersonalDetailsClient;
import com.microservices.demo.model.EmployeeBasicDetails;
import com.microservices.demo.model.EmployeeCompanyDetails;
import com.microservices.demo.model.EmployeeMasterData;
import com.microservices.demo.model.EmployeePersonalDetails;

/**
 * @author gssmunej
 *
 */
@Service
public class EmployeeService {

	private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private EmployeeMasterData employeeMasterData;

	@Autowired
	private EmployeeBasicDetails employeeBasicDetails;

	@Autowired
	private EmployeeCompanyDetails employeeCompanyDetails;

	@Autowired
	private EmployeePersonalDetails employeePersonalDetails;
	
	@Autowired
	private EmployeeBasicDetailsClient employeeBasicDetailsClient;
	
	@Autowired
	private EmployeeCompanyDetailsClient employeeCompanyDetailsClient;
	
	@Autowired
	private EmployeePersonalDetailsClient employeePersonalDetailsClient;
	
	public EmployeeMasterData getEmployeeMasterData(Long empId) {
		try {
			log.info("Executing EmployeeService#getEmployeeMasterData()...");
			
			//Using Rest Template - Traditional way
			
			/*employeeBasicDetails = restTemplate.getForObject(
					"http://localhost:8081/emp-basic-details/empBasicDetails/getEmpBasicDetails/" + empId,
					EmployeeBasicDetails.class);

			employeeCompanyDetails = restTemplate.getForObject(
					"http://localhost:8082/emp-company-details/empCompanyDetails/getEmpCompanyDetails/" + empId,
					EmployeeCompanyDetails.class);

			employeePersonalDetails = restTemplate.getForObject(
					"http://localhost:8083/emp-personal-details/empPersonalDetails/getEmpPersonalDetails/" + empId,
					EmployeePersonalDetails.class);*/
			
			//Using Feign Clients
			
			employeeBasicDetails = employeeBasicDetailsClient.getEmployeeBasicDetails(empId);
			
			employeeCompanyDetails = employeeCompanyDetailsClient.getEmployeeCompanyDetails(empId);
			
			employeePersonalDetails = employeePersonalDetailsClient.getEmployeePersonalDetails(empId);

			employeeMasterData.setEmployeeBasicDetails(employeeBasicDetails);
			employeeMasterData.setEmployeeCompanyDetails(employeeCompanyDetails);
			employeeMasterData.setEmployeePersonalDetails(employeePersonalDetails);

			return employeeMasterData;
		} catch (Exception exception) {
			log.error("Exception occured in EmployeeService#getEmployeeMasterData(). Exception is: " + exception);

			return null;
		}
	}
}
