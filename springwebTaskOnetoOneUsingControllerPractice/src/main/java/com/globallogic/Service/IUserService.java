package com.globallogic.Service;

import java.util.List;

import com.globallogic.Model.User;
import com.globallogic.dto.UserDto;

public interface IUserService {
	public UserDto addUser(UserDto userDto);
	public UserDto displayBasedOnUserId(long id);
	public List<UserDto> displayAll();
    public String deleteById(long id);
    public UserDto updateBasedOnId(long id,UserDto userDto);
}
