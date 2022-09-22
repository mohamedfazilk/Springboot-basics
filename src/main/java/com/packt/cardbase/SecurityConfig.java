package com.packt.cardbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.packt.cardbase.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

//	public UserDetailsService userDetailsService() {
//		UserDetails user =User.withDefaultPasswordEncoder()
//				 .username("user")
//				 .password("password")
//				 .roles("USER")
//				 .build();
//
//				 return new InMemoryUserDetailsManager(user);
//				}
	@Bean
	public AuthenticationManager getAuthenticationManager() throws Exception{
		return authenticationManager();
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.
				STATELESS). and().authorizeHttpRequests()
		// POST request to /login endpoint is not secured
		.antMatchers(HttpMethod.POST, "/login")
		.permitAll()
		// All other requests are secured
		.anyRequest().authenticated();
	}
}
