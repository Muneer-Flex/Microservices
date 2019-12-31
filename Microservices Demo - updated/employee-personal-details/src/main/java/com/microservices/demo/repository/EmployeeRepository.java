/**
 * 
 */
package com.microservices.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.demo.entity.EmployeePersonalDetails;

/**
 * @author gssmunej
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePersonalDetails, Long> {

	public EmployeePersonalDetails findByEmpId(Long empId);
}
