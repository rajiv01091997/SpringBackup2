package com.globallogic.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	
@GetMapping("/payNow/{price}")
 public String payNow(@PathVariable Integer price)
 {
	return "payment with price "+ price + " is successful"; 
 }
}
