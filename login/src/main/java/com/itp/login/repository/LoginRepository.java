package com.itp.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itp.login.model.Login;

@Repository
public interface LoginRepository  extends JpaRepository<Login,Integer >{
	
	public Login findByUsernameAndPassword(String a,String b);

}
