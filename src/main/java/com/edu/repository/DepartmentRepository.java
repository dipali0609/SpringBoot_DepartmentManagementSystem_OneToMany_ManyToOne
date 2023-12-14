package com.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edu.dao.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	//HQL query
//	@Query("select d from Department d where d.departmentName=:n")
//	public Department findByDepartmentName(@Param("n") String departmentName);
  
	
	//JPQL query
//    @Query("SELECT d FROM Department d WHERE d.departmentName = ?1")
//	public Department findByDepartmentName(String departmentName);
	
	
//	@Query(value = "select * from dept_table d where d.deptname = ?1", nativeQuery = true)
//	public Department findByDepartmentName(String departmentName);

	
	@Query(value = "select * from dept_table d where d.deptname LIKE ?1%", nativeQuery = true)
	public List<Department>findByDepartmentName(String departmentName);


//	@Query(value="select * from Department ORDER BY departmentName ASC", nativeQuery=true )
//	public List<Department> findAllDepartments();
	
	
	//public Department findByDepartmentName(String departmentName);

	@Query(value="SELECT * FROM dept_table d WHERE d.deptname LIKE 'c%'", nativeQuery=true )
     public List<Department> findAllDepartments();
}

