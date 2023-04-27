package com.nagarro.swatiidevops.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@RequestMapping("/")
	public List<String> home() {
		List<String> test=new ArrayList<>();
		test.add("Java");
		test.add("Node js");
		test.add("Angular");
		test.add("Microservices");
		return test;
	}
		
}