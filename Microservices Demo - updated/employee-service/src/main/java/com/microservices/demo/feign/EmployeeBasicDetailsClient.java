/**
 * 
 */
package com.microservices.demo.feign;

import static com.microservices.demo.utils.AppConstants.GET_EMPLOYEE_BASIC_DETAILS;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.demo.model.EmployeeBasicDetails;
/**
 * @author gssmunej
 *
 */
@FeignClient(value="emp-basic-details", url="http://localhost:8081/emp-basic-details/empBasicDetails")
public interface EmployeeBasicDetailsClient {

	@GetMapping(GET_EMPLOYEE_BASIC_DETAILS)
	public EmployeeBasicDetails getEmployeeBasicDetails(@PathVariable("empId") Long empId);
}
