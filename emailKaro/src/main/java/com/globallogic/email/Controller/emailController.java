package com.globallogic.email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.email.Model.Entity;
import com.globallogic.email.service.ServiceImpl;

@RestController
@RequestMapping("/api/v2")
public class emailController {
	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping("/sendmail")
	public String sendMessage()
	{
		return "its ok";
	}
	@PostMapping("/mailer")
	public String mailSender(@RequestBody Entity entity)
	{
		boolean flag=serviceImpl.sendMail(entity);
		if(flag==true)
			return "Sent Successfully";
		else
			return "couldn't send";
	}

}
