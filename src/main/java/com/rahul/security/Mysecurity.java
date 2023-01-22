package com.rahul.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Mysecurity  {

	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder)
	{
		UserDetails admin= User
				.withUsername("rahul")
				.password(encoder.encode("rahul"))
				.roles("admin")
				.build();
		//System.out.println("this is rahul "+admin.getPassword());
		UserDetails simpleuser= User.
				withUsername("sachin")
				.password(encoder.encode("sachin"))
				.roles("simpleuser")
				.build();
	return new InMemoryUserDetailsManager(admin,simpleuser);
	}
	
	@Bean
	public PasswordEncoder passwordencoder()
	{
		
		return new BCryptPasswordEncoder();
	}
	
	
	
	@Bean
	public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception
	{
		return http.csrf().disable()
		
		.authorizeHttpRequests()
		.antMatchers("/home").permitAll()
		.and()
		
		.authorizeHttpRequests()
		.antMatchers("/contact")
		.authenticated()
		
		
		
		.and().formLogin()
		.and().build();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
