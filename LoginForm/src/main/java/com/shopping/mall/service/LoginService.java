package com.shopping.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.mall.model.Login;
import com.shopping.mall.repository.LoginRepository;



@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
  
  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
	

}
