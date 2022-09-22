package com.packt.cardbase.service;

import java.security.Key;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtService {
	// 1 day in ms
	static final long EXPIRATIONTIME = 8640000;
	
	static final String PREFIX = "Bearer";
	
	
	 // Generate secret key. Only for the demonstration
	static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

}
