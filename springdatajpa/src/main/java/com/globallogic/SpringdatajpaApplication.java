package com.globallogic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.Dao.repository;
import com.globallogic.entity.Employee;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{

	 @Autowired
	 repository repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Rajiv");
		emp.setAge(27);
		emp.setDept("IT");
		
		//repo.save(emp);
		//System.out.println("Inserted");
		
		List<Employee>list =repo.findAll();
		for(Employee e:list)
		{
			System.out.println(e);
		}
		System.out.println("========fetch by Id");
		
		Optional<Employee> em=repo.findById(1);
		System.out.println(em);
		
		System.out.println("===========fetch by Age");
		
		Employee emp1= repo.findByAge(28);
		System.out.println(emp1);
		
		System.out.println("======find by department");
		
		List<Employee> emp2=repo.findByDept("hr");
		for(Employee e:emp2)
		{
			System.out.println(e);
		}
	}

}
