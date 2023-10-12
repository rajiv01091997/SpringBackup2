package com.globallogic.feignservice.controller;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class controller {
@GetMapping("/name")
public String getName()
{
	return "Rajiv Yadav";
}
@GetMapping("/age")
public int getAge()
{
	return 25;
}
@GetMapping("/status")
public String getStatus()
{
	return "active";
}
}
