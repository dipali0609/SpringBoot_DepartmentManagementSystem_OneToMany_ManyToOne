package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Department;
import com.edu.repository.DepartmentRepository;



@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> findByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentName(departmentName);
	}

	@Override
	public List<Department> findAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAllDepartments();
	}

	
}
