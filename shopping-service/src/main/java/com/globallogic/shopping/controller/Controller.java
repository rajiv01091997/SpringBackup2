package com.globallogic.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class Controller {
    @Autowired
	private RestTemplate restTemplate;
    @GetMapping("/payment/{price}")
	public String invokePayment(@PathVariable Integer price)
	{
		          //String url = "http://localhost:8084/payNow/" + price;
				String url = "http://payment-service/payNow/" + price;
				
				return restTemplate.getForObject(url,String.class);
	}
    @GetMapping("/catalogue")
    public String invokeCatalogue()
    {
    	String url="http://catalogue-service/catalogue";
		return restTemplate.getForObject(url,String.class);
    }
    
}
