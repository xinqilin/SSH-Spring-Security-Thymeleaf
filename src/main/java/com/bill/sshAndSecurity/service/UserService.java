package com.bill.sshAndSecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bill.sshAndSecurity.controller.dto.UserRegistrationDto;
import com.bill.sshAndSecurity.model.User;


public interface UserService extends UserDetailsService{

	public User save(UserRegistrationDto registrationDto);
}
