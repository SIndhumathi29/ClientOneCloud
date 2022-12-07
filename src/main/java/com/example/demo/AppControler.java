package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppControler {

	@GetMapping("home")
	public String getHome() {
		return "hello from client one";
	}
}
