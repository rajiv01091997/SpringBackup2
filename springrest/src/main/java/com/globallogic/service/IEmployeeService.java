package com.globallogic.service;

import java.util.List;

import com.globallogic.Modal.Employee;

public interface IEmployeeService {
public Employee addEmployee(Employee employee);
public Employee getEmployeebyId(int id);
public List<Employee> getAllEmployees();
}
