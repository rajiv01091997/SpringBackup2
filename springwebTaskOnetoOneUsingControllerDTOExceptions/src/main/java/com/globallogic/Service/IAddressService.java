package com.globallogic.Service;

import java.util.List;

import com.globallogic.Model.Address;
import com.globallogic.Model.User;

public interface IAddressService {
	public Address addAddress(Address address);
	public Address displayBasedOnAddressId(long id);
	public List<Address> displayAll();
}
