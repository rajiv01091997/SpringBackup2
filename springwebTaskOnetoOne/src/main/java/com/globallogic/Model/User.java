package com.globallogic.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private String password;

@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@JoinColumn(name = "address_id",nullable = false)
private Address address;

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(String name, String email, String password) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}


}
