package com.globallogic.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.Exceptions.IdNotFoundException;
import com.globallogic.Model.Address;
import com.globallogic.Model.User;
import com.globallogic.Repository.UserRepository;
import com.globallogic.dto.AddressDto;
import com.globallogic.dto.UserDto;
@Service
public class UserServiceImpl implements IUserService {
     @Autowired
	private UserRepository repository;
	@Override
	public UserDto addUser(UserDto userDto) {
		User user=new User();
		Address address=new Address();
		
		address.setCity(userDto.getAddress().getCity());
		address.setState(userDto.getAddress().getState());
		address.setCountry(userDto.getAddress().getCountry());
		

		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		
		
		user.setAddress(address);
		address.setUser(user);
		
		User user1=repository.save(user);
		
		return covertEntityToDto(user1);
	}

	@Override
	public UserDto displayBasedOnUserId(long id) {
		if(repository.findById(id).isEmpty())
			throw new IdNotFoundException("No user present for asked ID");
		User user=repository.findById(id).get();
		
		
		return covertEntityToDto(user);
	}

	@Override
	public List<UserDto> displayAll() {
		
		//return repository.findAll();
		List<User> userList=repository.findAll();
		List<UserDto> userDtoList=new ArrayList<>();
		for(User user:userList)
		{
			UserDto userDto1=covertEntityToDto(user);
			userDtoList.add(userDto1);
		}
		return userDtoList ;
	}

	@Override
	public String deleteById(long id) {
		// TODO Auto-generated method stub
		if(repository.findById(id).isEmpty())
			throw new IdNotFoundException("ID not found");
		repository.deleteById(id);
		return "Deleted";
	}
	
	
	public UserDto covertEntityToDto(User user)
	{
		UserDto userDto=new UserDto(user.getId(),user.getName(),user.getEmail(),user.getPassword());
		AddressDto addressDto=new AddressDto(user.getAddress().getId(),user.getAddress().getCity(),
				                  user.getAddress().getCountry(),user.getAddress().getCountry());
		userDto.setAddress(addressDto);
		return userDto;
	}

}
