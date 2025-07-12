package com.itp.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itp.login.model.Login;
import com.itp.login.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	
	
    @PostMapping("/signup")
	public String signup(@RequestBody Login login) {
    	System.out.println(login.getUsername());
    	System.out.println(login.getPassword());
    	try {
    		loginService.registerUser(login);
    		return "sucess";
		} catch (Exception e) {
			return "failed";
		}
    }
    	
    	@GetMapping("/signin")
    	public String signin(@RequestBody Login login) {
        	System.out.println(login.getUsername());
        	System.out.println(login.getPassword());
        	try {
        		
        		if (loginService.signin(login)) {
					return "success";
				}
    		} catch (Exception e) {
    			return "error";
    		}
        	return "failed";
	}
}
