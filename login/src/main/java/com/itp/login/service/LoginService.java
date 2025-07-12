package com.itp.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.login.model.Login;
import com.itp.login.repository.LoginRepository;

@Service
public class LoginService {
    
	@Autowired
	LoginRepository loginRepository;
	public void registerUser(Login login) {
		loginRepository.save(login);
		
	}
	public boolean signin(Login login) {
		
	Login login2  =	loginRepository.findByUsernameAndPassword(login.getUsername(), login.getPassword());
		if (login2!=null) 
			return true;
			else 
				return false;		
			
		}
			
		
	}
    

