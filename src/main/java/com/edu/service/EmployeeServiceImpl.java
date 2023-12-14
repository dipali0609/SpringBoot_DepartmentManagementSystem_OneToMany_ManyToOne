package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Department;
import com.edu.dao.Employee;
import com.edu.repository.DepartmentRepository;
import com.edu.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//inject DepartmentRepository
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	@Override
	public Employee employeeAssignDepartment(Long deptid,Integer empid) {
		Employee eob=employeeRepository.findById(empid).get();
		Department dob=departmentRepository.findById(deptid).get();
		 eob.employeeAssignDepartment(dob);
		 return employeeRepository.save(eob);
	}
	@Override
	public Employee findByEmployeeEmail(String employeeEmail) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmployeeEmail(employeeEmail);
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public Employee findByEmployeePhone(long employeePhone) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmployeePhone(employeePhone);
	}
	@Override
	public List<Employee> findByEmployeeName(String employeeName) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmployeeName(employeeName);
	}
//	@Override
//	public Employee findByemployeeNameemployeeSalary(String employeeName, float employeeSalary) {
//		// TODO Auto-generated method stub
//		return employeeRepository.findByemployeeNameemployeeSalary(employeeName,employeeSalary);
//	}
//	
	
	
}
