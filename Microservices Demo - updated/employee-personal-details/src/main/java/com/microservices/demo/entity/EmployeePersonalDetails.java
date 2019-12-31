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
@Table
@Entity(name="EMP_PERSONAL_DETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class EmployeePersonalDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMP_ID")
	private Long empId;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
}
