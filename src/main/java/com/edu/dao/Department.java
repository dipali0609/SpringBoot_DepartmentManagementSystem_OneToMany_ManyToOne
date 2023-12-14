package com.edu.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="dept_table")
public class Department {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="deptid")
	 private Long departmentId;
	@Column(name="deptname", length = 40, nullable = false)
	@NotBlank(message="Please enter departmentname")
	 private String departmentName;
	@Column(name="deptlocation", length = 30,nullable = false)
	@NotBlank(message="Please enter departmentlocation")
	 private String departmentLocation;
	
	//onetomany  ->one dept many employees
	
	//@JsonIgnore
	@OneToMany(mappedBy = "dept")
	Set<Employee> eob=new HashSet<Employee>();
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long departmentId, String departmentName, String departmentLocation) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	//"departmentName": "Comp",
	//"departmentLocation": "pune"
	
	public Set<Employee> getEob() {
		return eob;
	}
	public void setEob(Set<Employee> eob) {
		this.eob = eob;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentLocation=" + departmentLocation + "]";
	}
	
	

}
