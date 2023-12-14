package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Department;
import com.edu.service.DepartmentService;


@RestController
public class DepartmentController {
@Autowired
private DepartmentService departmentService;

@PostMapping("/savedepartment")
public Department saveDepartment(@RequestBody Department department) {
	return departmentService.saveDepartment(department);
	
  }

@GetMapping("/findByDepartmentName/{dname}")
public List<Department> findByDepartmentName(@PathVariable("dname") String departmentName) {
	return departmentService.findByDepartmentName(departmentName);
}

@GetMapping("/findalldepartments")
public List<Department> findAllDepartments(){
	return departmentService.findAllDepartments();
}




}
