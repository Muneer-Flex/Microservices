/**
 * 
 */
package com.microservices.demo.feign;

import static com.microservices.demo.utils.AppConstants.GET_EMPLOYEE_COMPANY_DETAILS;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.demo.model.EmployeeCompanyDetails;
/**
 * @author gssmunej
 *
 */
@FeignClient(value="emp-company-details", url="http://localhost:8082/emp-company-details/empCompanyDetails")
public interface EmployeeCompanyDetailsClient {

	@GetMapping(GET_EMPLOYEE_COMPANY_DETAILS)
	public EmployeeCompanyDetails getEmployeeCompanyDetails(@PathVariable("empId") Long empId);
}
