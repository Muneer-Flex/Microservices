/**
 * 
 */
package com.microservices.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.demo.entity.EmployeeCompanyDetails;

/**
 * @author gssmunej
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeCompanyDetails, Long>{

	public EmployeeCompanyDetails findByEmpId(Long empId);
}
