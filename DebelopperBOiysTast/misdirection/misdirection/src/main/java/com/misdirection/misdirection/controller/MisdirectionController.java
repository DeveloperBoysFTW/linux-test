package com.misdirection.misdirection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MisdirectionController {
	
	@GetMapping("/misdirected")
	public void misdirect() {
		
		System.out.println("misdirected BOOYAH!");
	}

}
