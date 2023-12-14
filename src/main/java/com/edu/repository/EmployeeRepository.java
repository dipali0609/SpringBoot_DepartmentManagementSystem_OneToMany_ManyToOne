package com.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edu.dao.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Employee findByEmployeeEmail(String employeeEmail);

	public Employee findByEmployeePhone(long employeePhone);

	public List<Employee> findByEmployeeName(String employeeName);
	

	//public Employee findByemployeeNameemployeeSalary(String employeeName, float employeeSalary);

}
