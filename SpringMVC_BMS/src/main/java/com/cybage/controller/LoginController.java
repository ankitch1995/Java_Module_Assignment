package com.cybage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cybage.model.User;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String greet()
	{
	
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginform") User userForm, Model model) {
		
		String username=userForm.getUserName();
		String password=userForm.getUserName();
		
		if("Ankit".equals(username) && "12345".equals(password)) {
			return "home";
		}
		model.addAttribute("invalidCredentials", true);		
		return "home";
	}
}
