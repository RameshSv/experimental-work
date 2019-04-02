package com.springbt.app.springbtsecurity.config;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticateFilter implements Filter {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthenticateFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.debug(" AuthenticateFilter Initialized :: ");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String authType  = req.getAuthType();
		logger.debug(" authType -> "+authType);
		Principal principal  = req.getUserPrincipal();
		logger.debug(" userName -> "+principal.getName());

	}

	@Override
	public void destroy() {
		logger.debug(" AuthenticateFilter Destoryed :: ");

	}

}
