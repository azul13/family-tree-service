package com.familytreeservice.familytreeservice.business;

import java.util.HashMap;
import java.util.Map;

import com.familytreeservice.familytreeservice.business.interfaces.AuthenticationBusinessLogic;
import com.familytreeservice.familytreeservice.dao.interfaces.UserDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationBusinessLogicImpl implements AuthenticationBusinessLogic{
    private Map<String,String> userStore;
    @Autowired
    private UserDAO userDAO;
    //private Logger logger = LoggerFactory.getLogger(AuthenticationBusinessLogicImpl.class);

    public AuthenticationBusinessLogicImpl (){
        this.userStore = new HashMap<>();
        this.userStore.put("Admin", "password");
        this.userStore.put("azul13", "123ABC890XYZ");

    }

    @Override
    public boolean authenticate(String username, String password) {
        // TODO Auto-generated method stub
        //logger.info("Username: {} Password: {}", username, password);
        return userDAO.isValid(username, password);
    }

}