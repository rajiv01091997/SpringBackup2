package com.globallogic.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="EmpTable")
public class Employee {
@Id	
private int Id;
private String name;
private int age;
private String dept;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [Id=" + Id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
}


}
