package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;

@Component
public class AppRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

//		repo.saveAll(Arrays.asList(
//				new Employee(1,"akshay","khadse",300.9,"dev","aa"),
//				new Employee(2,"harish","rohadkar",345.9,"dev","bb"),
//				new Employee(3,"avi","thakare",245.9,"mgr","cc"),
//				new Employee(4,"ashwin","godve",100.9,"dev","dd"),
//				new Employee(5,"ajay","cheke",700.9,"qa","ee")
//				));
		
		//repo.findByFirstName("akshay").forEach(System.out::println);
		
	//	repo.findByEmpSalGreaterThanEqualOrderByFirstNameDesc(300.0).forEach(System.out::println);
		
		repo.findByFirstNameLikeAndEmpIdBetween("a%",2,4).forEach(System.out::println);
	}

}
