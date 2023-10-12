package com.globallogic.Service;

import java.util.List;

import com.globallogic.Model.User;

public interface IUserService {
	public User addUser(User user);
	public User displayBasedOnUserId(long id);
	public List<User> displayAll();
    public String deleteById(long id);
    public User UpdateById(long id, User user);
}
