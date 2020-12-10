package com.itsu.token.sample.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsu.itsutoken.annotation.Token;
import com.itsu.itsutoken.controller.TokenRegisterController;

@RestController
public class TestController {

	@Resource
	private TokenRegisterController regCon;

	@Token
	@GetMapping("/index")
	public String idx() {
		return "index";
	}

	@GetMapping("/generateRsaToken")
	public String generateRsa() throws Exception {
		regCon.generateToken("");
		return "";
	}
}
