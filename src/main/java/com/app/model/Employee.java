package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boot_emptab")
public class Employee {

	@Id
	private Integer empId;
	private String firstName;
	private String lastName;
	private Double empSal;
	private String empDept;
	private String empCode;

	public Employee() {
		super();
	}

	
	

	public Employee(Integer empId, String firstName, String lastName, Double empSal, String empDept, String empCode) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSal = empSal;
		this.empDept = empDept;
		this.empCode = empCode;
	}




	public Integer getEmpId() {
		return empId;
	}




	public void setEmpId(Integer empId) {
		this.empId = empId;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public Double getEmpSal() {
		return empSal;
	}




	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}




	public String getEmpDept() {
		return empDept;
	}




	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}




	public String getEmpCode() {
		return empCode;
	}



	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", empSal=" + empSal
				+ ", empDept=" + empDept + ", empCode=" + empCode + "]";
	}

     
	
}
