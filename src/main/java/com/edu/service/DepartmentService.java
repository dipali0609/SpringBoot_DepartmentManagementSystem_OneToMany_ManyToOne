package com.edu.service;

import java.util.List;

import com.edu.dao.Department;



public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> findByDepartmentName(String departmentName);

	public List<Department> findAllDepartments();

}
