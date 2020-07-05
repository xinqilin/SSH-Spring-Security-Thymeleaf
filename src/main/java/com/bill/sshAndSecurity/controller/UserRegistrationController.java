package com.bill.sshAndSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bill.sshAndSecurity.dto.UserRegistrationDto;
import com.bill.sshAndSecurity.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	public UserService userService;

	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto userRegistrationDto) {
		userService.save(userRegistrationDto);
		return "redirect:/registration?success";
	}

}