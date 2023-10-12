package com.globallogic.Dao;


import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.Employee;

public interface repository extends JpaRepository<Employee, Integer>{

	public Employee findByAge(int age);
	public List<Employee> findByDept(String dept);
	
}
