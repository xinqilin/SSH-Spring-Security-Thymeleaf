package com.bill.sshAndSecurity.model;

import java.util.Collection;

import lombok.Data;


@Data
public class User {

	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Collection<Role> roles;
}
