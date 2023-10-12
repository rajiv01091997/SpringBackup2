package com.globallogic.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/product")
@RestController
@RefreshScope
public class Controller {

	@Value("${product.name}")
	private String name;
	
	@Value("${product.price}")
	private String price;
	
	@GetMapping("/details")
	public String getDetails()
	{
		return "product name:"+name+"\nPrice :"+price;
	}
}
