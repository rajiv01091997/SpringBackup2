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

import com.globallogic.Model.Address;
import com.globallogic.Model.User;
import com.globallogic.Service.IAddressService;
import com.globallogic.Service.IUserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
@Autowired
private IUserService iUserService;

@PostMapping("/user")
public ResponseEntity<User> addUser(@RequestBody User user)
{
	return new ResponseEntity<User>(iUserService.addUser(user), HttpStatus.CREATED);
}
@GetMapping("/user/{id}")
public ResponseEntity<User> getUserById(@PathVariable  long id)
{
	return new ResponseEntity<User>(iUserService.displayBasedOnUserId(id), HttpStatus.OK);
}
@GetMapping("/user")
public ResponseEntity<List<User>> getAll()
{
	return new ResponseEntity<List<User>>(iUserService.displayAll(), HttpStatus.OK);
}
@DeleteMapping("/user/{id}")
public ResponseEntity<String> deleteById(@PathVariable   long id)
{
return new ResponseEntity<String>(iUserService.deleteById(id), HttpStatus.OK);	
}
@PutMapping("/user/{id}")
public ResponseEntity<User> update(@PathVariable   long id,@RequestBody User user)
{
return new ResponseEntity<User>(iUserService.UpdateById(id, user), HttpStatus.OK);	
}
}
