package com.globallogic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.Modal.Employee;
import com.globallogic.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		return employee;
		
	}

	@Override
	public Employee getEmployeebyId(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> list=employeeRepository.findAll();
		return list;
	}

}
