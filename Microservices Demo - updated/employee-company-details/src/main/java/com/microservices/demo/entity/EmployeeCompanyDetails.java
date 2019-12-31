/**
 * 
 */
package com.microservices.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author gssmunej
 *
 */
@Entity
@Table(name="EMP_COMPANY_DETAILS")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class EmployeeCompanyDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="EMP_ID")
	private Long empId;
	
	@Column(name="EMP_COMPANY_NAME")
	private String empCompanyName;
	
	@Column(name="EMP_SALARY")
	private Long empSalary;
	
	@Column(name="EMP_DESIGNATION")
	private String empDesignation;

}
