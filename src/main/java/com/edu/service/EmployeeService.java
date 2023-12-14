package com.edu.service;

import java.util.List;

import com.edu.dao.Employee;



public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public Employee employeeAssignDepartment(Long deptid, Integer empid);

	public Employee findByEmployeeEmail(String employeeEmail);

	public List<Employee> getAllEmployees();

	public Employee findByEmployeePhone(long employeePhone);

	public List<Employee> findByEmployeeName(String employeeName);

	//public Employee findByemployeeNameemployeeSalary(String employeeName, float employeeSalary);

	




}
