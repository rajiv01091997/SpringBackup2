package com.globallogic.dto;



public class UserDto {
	private long id;
	private String name;
	private String email;
	private String password;

	

	private AddressDto addressDto;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		
	}
	public UserDto(long id,String name, String email, String password) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.password = password;
		
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public AddressDto getAddress() {
		return addressDto;
	}

	public void setAddress(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", addressDto="
				+ addressDto + "]";
	}

	

	}


