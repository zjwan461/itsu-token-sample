package com.itsu.token.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsu.itsutoken.annotation.Token;

@RestController
public class TestController {

	@Token
	@GetMapping("/index")
	public String idx() {
		return "index";
	}
}
