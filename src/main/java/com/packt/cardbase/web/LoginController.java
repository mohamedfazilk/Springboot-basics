package com.packt.cardbase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.
Authentication;

import com.packt.cardbase.domain.AccountCredentials;
import com.packt.cardbase.service.JwtService;

@RestController
public class LoginController {

	@Autowired
	private JwtService jwtservice;

	@Autowired
    AuthenticationManager authenticationManager;

	@RequestMapping(value = "/login", method =RequestMethod.POST)
	public ResponseEntity<?> getToken(@RequestBody AccountCredentials credenetials){
		UsernamePasswordAuthenticationToken creds = 
				new UsernamePasswordAuthenticationToken(
						credenetials.getUsername(),
						credenetials.getPassword()
						);
		
		Authentication auth = authenticationManager.authenticate(creds);
		
		 // Generate token
		String jwts = jwtservice.getToken(auth.getName());
		
		// Build response with the generated token
			return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION, "Bearer " + jwts)
					.header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS,
							 "Authorization")
					.build();
			}
	

}
