package com.globallogic.feign.FeignController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FeignController {
@Autowired
private IFiegnController controller;
@GetMapping("/userName")
public String getUserName()
{
	return controller.getName();
}
@GetMapping("/userAge")
public int getUserAge()
{
	return controller.getAge();
}
@GetMapping("/userStatus")
public String getUserStatus()
{
	return controller.getStatus();
}
}
