package com.bill.sshAndSecurity.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bill.sshAndSecurity.dto.UserRegistrationDto;
import com.bill.sshAndSecurity.model.Role;
import com.bill.sshAndSecurity.model.User;
import com.bill.sshAndSecurity.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public UserRepository userRepository;
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		User user=new User(
				registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER"))
				);
		
		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
