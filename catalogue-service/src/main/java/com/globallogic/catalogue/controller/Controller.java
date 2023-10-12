package com.globallogic.catalogue.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	@RequestMapping("/catalogue")
	public String getCatalogue()
	{
		return "catalogue is being shown";
	}
}
