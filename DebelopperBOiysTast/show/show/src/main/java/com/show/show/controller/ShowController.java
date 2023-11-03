package com.show.show.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class ShowController {
	
	@GetMapping("/showtime")
	public void showtime() {
		
		System.out.println("So ya Thought ya might like to... go to the show..");
	}

}
