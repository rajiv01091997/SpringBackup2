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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="addresstable")
public class Address{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String city;
private String state;
private String country;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="user_id",referencedColumnName = "id")
@JsonManagedReference
private User user;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(String city, String state, String country) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + ", user=" + user
			+ "]";
}


}
