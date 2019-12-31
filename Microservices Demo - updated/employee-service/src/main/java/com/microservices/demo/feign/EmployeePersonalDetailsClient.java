/**
 * 
 */
package com.microservices.demo.feign;

import static com.microservices.demo.utils.AppConstants.GET_EMPLOYEE_PERSONAL_DETAILS;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.demo.model.EmployeePersonalDetails;

/**
 * @author gssmunej
 *
 */
@FeignClient(value="emp-personal-details", url="http://localhost:8083/emp-personal-details/empPersonalDetails")
public interface EmployeePersonalDetailsClient {

	@GetMapping(GET_EMPLOYEE_PERSONAL_DETAILS)
	public EmployeePersonalDetails getEmployeePersonalDetails(@PathVariable("empId") Long empId);
}
