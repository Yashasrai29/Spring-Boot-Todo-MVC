package com.thoughtclan.springdemos.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.thoughtclan.springdemos.controllers.TodoController;

/**
 * Simple logging interceptor implementation which logs each incoming request.
 */
public class LoggingInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
	
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
    	logger.info("Intercepting todo.");
        return true;
    }
}
