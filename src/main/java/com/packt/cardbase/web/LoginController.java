package com.packt.cardbase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packt.cardbase.domain.AccountCredentials;
import com.packt.cardbase.service.JwtService;

@RestController
public class LoginController {
	
	@Autowired
	private JwtService jwtservice;
	
	@Autowired
	AuthenticationManager authenticationmanager;
	
	@RequestMapping(value = "/login", method =RequestMethod.POST)
	public ResponseEntity<?> getToken(@RequestBody AccountCredentials credenetials)

}
