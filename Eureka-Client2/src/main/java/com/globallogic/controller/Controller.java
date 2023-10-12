package com.globallogic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
@GetMapping("/product")
public String getMessage()
{
	return "this is client number 2";
}
}
