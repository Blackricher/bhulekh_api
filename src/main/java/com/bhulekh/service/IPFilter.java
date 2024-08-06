//package com.bhulekh.service;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//@Component
//public class IPFilter implements Filter {
//
//    private final List<String> allowedIPs = Arrays.asList("10.135.28.135","10.135.28.170","0:0:0:0:0:0:0:1", "164.100.212.26","127.0.0.1"); // Add your allowed IPs here
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//        HttpServletResponse httpResponse = (HttpServletResponse) response;
//
//        String clientIP = httpRequest.getRemoteAddr();
//        System.out.println("Client IP: " + clientIP);
//        System.out.println("Client IP: " + httpResponse);
//        System.out.println("Client IP: " + httpRequest);
//        if (allowedIPs.contains(clientIP)) {
//        	
//            chain.doFilter(request, response);
//           
//        } else {
//        	 
//            httpResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
//        
//	}
//    }
//	
//	
//}
