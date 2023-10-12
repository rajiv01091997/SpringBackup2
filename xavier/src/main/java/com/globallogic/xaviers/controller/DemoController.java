package com.globallogic.xaviers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class DemoController {
    @GetMapping("/aaja")
	public String getMsg()
	{
		return "aaja ve maahi";
	}
}
