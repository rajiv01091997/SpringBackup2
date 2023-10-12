package com.globallogic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.Model.User;
import com.globallogic.Repository.UserRepository;
@Service
public class UserServiceImpl implements IUserService {
     @Autowired
	private UserRepository repository;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		repository.save(user);
		return user;
	}

	@Override
	public User displayBasedOnUserId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<User> displayAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public String deleteById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "Deleted";
	}
  
	@Override
	public User UpdateById(long id, User user) {
		// TODO Auto-generated method stub
	
		repository.save(user);
		return user;
	}

}
