package com.authentication.authapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthAppController {
	
	@GetMapping("/auth")
	public void authenticate() {
		
		System.out.println("good");
	}

}
