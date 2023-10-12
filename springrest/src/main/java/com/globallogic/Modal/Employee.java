package com.globallogic.Modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="Emptable")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String dept;
private double salary;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, String dept, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}



}
