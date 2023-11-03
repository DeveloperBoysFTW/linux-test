package com.reveal.reveal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class RevealController {
	
	@GetMapping("/revealed")
	public void revealed() {
		
		System.out.println("you just got REVEALED");
	}

}
