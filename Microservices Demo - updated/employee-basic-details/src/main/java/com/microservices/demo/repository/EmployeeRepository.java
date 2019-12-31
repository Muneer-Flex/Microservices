/**
 * 
 */
package com.microservices.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.demo.entity.EmployeeBasicDetails;

/**
 * @author gssmunej
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeBasicDetails, Long> {

	public EmployeeBasicDetails findByEmpId(Long empId);

}
