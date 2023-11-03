package com.prestige.prestige.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PrestigeController {
	
	@GetMapping("/prestige")
	public void prestiged() {
		
		System.out.println("Get PRESTIGED on BIYatCH");
	}

}
