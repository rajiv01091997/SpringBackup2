package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
