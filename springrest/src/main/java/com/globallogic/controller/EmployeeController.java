package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Modal.Employee;
import com.globallogic.service.IEmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    @Autowired
	IEmployeeService iEmployee;
    
    @PostMapping("/employee")
    public Employee addingEmployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return iEmployee.addEmployee(employee);
		
	}

	@GetMapping(value="/employee/{id}")
	public Employee fetchEmployeebyId(@PathVariable  int id) {
		// TODO Auto-generated method stub
		return iEmployee.getEmployeebyId(id);
		
	}

	@GetMapping(value="/employee")
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return iEmployee.getAllEmployees();
	}

	
	
}
