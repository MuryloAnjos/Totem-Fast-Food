package com.bsp.projbim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class teste {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
}
