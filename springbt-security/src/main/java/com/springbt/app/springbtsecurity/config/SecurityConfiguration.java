package com.springbt.app.springbtsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.swagger.annotations.ApiOperation;

/**
 * @author Ramesh Sv
 * SecurityConfiguration class provides Basic Authentication method
 *
 */
@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@ApiOperation(value="Configured InMemoryAuthentication")
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("ramesh").password("{noop}ramesh").roles("ADMIN").
		and().withUser("manasa").password("{noop}bhavishya").roles("USER");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		http.addFilterBefore(getAuthenticateFilter(), BasicAuthenticationFilter.class).httpBasic();
		http.csrf().disable();
	}

	public AuthenticateFilter getAuthenticateFilter() {
		// TODO Auto-generated method stub
		return new AuthenticateFilter();
	}
	
	

}
