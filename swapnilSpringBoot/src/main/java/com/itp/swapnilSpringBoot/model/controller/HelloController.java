package com.itp.swapnilSpringBoot.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
@RequestMapping("/swiggy")
public class HelloController {
	
	@RequestMapping("/hello")
	public String greet() {
		return "swapnil";
	}

}
