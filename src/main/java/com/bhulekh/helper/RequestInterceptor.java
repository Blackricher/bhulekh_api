package com.bhulekh.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.bhulekh.Controller.CryptoMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptor implements HandlerInterceptor {

    @Autowired
    private CryptoMethod cryptoMethod;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ChooseDB db = new ChooseDB();
        String token=request.getHeader("Authorization");
        if(token!=null && token.startsWith("Bearer ")) {
        	String jwt = token.substring(7);
        	   String districtCodeCensus = cryptoMethod.decryptMethod(request.getParameter("eDCC"),jwt);
               String dc = db.chooseDb(districtCodeCensus);

               if (DatabaseContext.DB1.toString().equalsIgnoreCase(dc)) {
                   DataBaseContextHolder.setCurrentDb(DatabaseContext.DB1);
               } else if (DatabaseContext.DB2.toString().equalsIgnoreCase(dc)) {
                   DataBaseContextHolder.setCurrentDb(DatabaseContext.DB2);
               }
               else if (DatabaseContext.DB3.toString().equalsIgnoreCase(dc)) {
                   DataBaseContextHolder.setCurrentDb(DatabaseContext.DB3);
               } else if (DatabaseContext.DB4.toString().equalsIgnoreCase(dc)) {
                   DataBaseContextHolder.setCurrentDb(DatabaseContext.DB4);
               } else if (DatabaseContext.DB5.toString().equalsIgnoreCase(dc)) {
                   DataBaseContextHolder.setCurrentDb(DatabaseContext.DB5);
               } else if (DatabaseContext.DB6.toString().equalsIgnoreCase(dc)) {
                   DataBaseContextHolder.setCurrentDb(DatabaseContext.DB6);
               }
               else {
                   throw new Exception("Unknown Database Context");
               }

        	
        }

     
        return true;
    }
}
