package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	List<Employee> findByFirstName(String firstName);
	List<Employee> findByEmpSalGreaterThanEqualOrderByFirstNameDesc(Double empSal);
	List<Employee> findByFirstNameLikeAndEmpIdBetween(String firstName,Integer eid1,Integer eid2);
}
