package com.globallogic.dto;



public class AddressDto {
	private long id;
	private String city;
	private String state;
	private String country;

	
	

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressDto(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public AddressDto(long id,String city, String state, String country) {
		super();
		this.id=id;
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

	@Override
	public String toString() {
		return "AddressDto [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	
	

}
