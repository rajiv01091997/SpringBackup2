package com.globallogic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmailController {

	
	@GetMapping("/welcome")
	public String getDetails()
	{
		return "welcome to this page";
	}
}
