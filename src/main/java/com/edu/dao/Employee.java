package com.edu.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="emp_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	 private Integer employeeId;
	@Column(name="empname", length = 50,nullable = false)
	
	  private String employeeName;
	@Column(name="empemail",length = 60,nullable = false, unique = true)
	  private String employeeEmail;
	@Column(name="empphone",unique = true)
	  private long employeePhone;
	@Column(name="empsalary")
	  private float employeeSalary;
	
	
	
//	"employeeName": "dipali",
//    "employeeEmail": "dipaliiii",
//    "employeePhone": 123456,
//    "employeeSalary": 5262,
//    
	
	//ManyToOne->many employees work under one department
    @JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptid",referencedColumnName = "deptid")
	Department dept;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer employeeId, String employeeName, String employeeEmail, long employeePhone,
			float employeeSalary, int employeeStatus) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeePhone = employeePhone;
		this.employeeSalary = employeeSalary;
		
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeePhone=" + employeePhone + ", employeeSalary=" + employeeSalary +"]";
	}
	public void employeeAssignDepartment(Department dob) {
		this.dept=dob;
		
	}
	
	

}
