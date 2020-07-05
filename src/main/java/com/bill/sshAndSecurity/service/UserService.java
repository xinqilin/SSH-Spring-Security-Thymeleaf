package com.bill.sshAndSecurity.service;

import com.bill.sshAndSecurity.dto.UserRegistrationDto;
import com.bill.sshAndSecurity.model.User;


public interface UserService {

	public User save(UserRegistrationDto registrationDto);
}
