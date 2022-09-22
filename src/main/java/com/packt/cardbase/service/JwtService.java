package com.packt.cardbase.service;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {
	// 1 day in ms
	static final long EXPIRATIONTIME = 8640000;

	static final String PREFIX = "Bearer";

	// Generate secret key. Only for the demonstration
	static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	 // Generate signed JWT token
	public String getToken(String username) {
		String token = Jwts.builder().setSubject(username)
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
				.signWith(key).compact();
		return token;
	}

}
