package com.itp.login.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Login {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userid;	
 private String username;
 private String password;
 public int getUserid() {
	return userid;
 }
 public void setUserid(int userid) {
	this.userid = userid;
 }
 public Login() {}
 public Login(int userid, String username, String password) {
	super();
	this.userid = userid;
	this.username = username;
	this.password = password;
}
 @Override
public String toString() {
	return "Login [userid=" + userid + ", username=" + username + ", password=" + password + "]";
}
 public String getUsername() {
	return username;
 }
 public void setUsername(String username) {
	this.username = username;
 }
 public String getPassword() {
	return password;
 }
 public void setPassword(String password) {
	this.password = password;
 }
}
