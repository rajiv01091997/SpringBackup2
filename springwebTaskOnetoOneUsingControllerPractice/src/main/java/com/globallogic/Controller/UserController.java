package com.globallogic.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Exceptions.IdNotFoundException;
import com.globallogic.Model.Address;
import com.globallogic.Model.User;
import com.globallogic.Service.IAddressService;
import com.globallogic.Service.IUserService;
import com.globallogic.dto.UserDto;

@RestController
@RequestMapping("/api/v1")
public class UserController {
@Autowired
private IUserService iUserService;

@PostMapping("/user")
public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto)
{
	return new ResponseEntity<UserDto>(iUserService.addUser(userDto), HttpStatus.CREATED);
}
@GetMapping("/user/{id}")
public ResponseEntity<UserDto> getUserById(@PathVariable  long id)
{
	return new ResponseEntity<UserDto>(iUserService.displayBasedOnUserId(id), HttpStatus.OK);
}
@GetMapping("/user")
public ResponseEntity<List<UserDto>> getAll()
{
	return new ResponseEntity<List<UserDto>>(iUserService.displayAll(), HttpStatus.OK);
}
@DeleteMapping("/user/{id}")
public ResponseEntity<String> deleteById(@PathVariable   long id)
{
return new ResponseEntity<String>(iUserService.deleteById(id), HttpStatus.OK);	
}
@PutMapping("/user/{id}")
public ResponseEntity<UserDto> updateById(@PathVariable   long id, @RequestBody UserDto userDto)
{
return new ResponseEntity<UserDto>(iUserService.updateBasedOnId(id, userDto), HttpStatus.OK);	
}

}
