package com.familytreeservice.familytreeservice.dao;

import com.familytreeservice.familytreeservice.dao.interfaces.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public UserDAOImpl(){
        
    }
    @Override
    public boolean isValid(String username, String password){
        return jdbcTemplate.queryForObject(
            "SELECT COUNT(1) FROM USERS WHERE user_name = '" + username + "' AND password = '" + password + "'", Integer.class
        ) == 1 ? true : false;
    }

    


}