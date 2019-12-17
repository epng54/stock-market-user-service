package com.ibm.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ibm.model.User;

public interface UserService extends UserDetailsService{

	User findOne(String userName);

}
