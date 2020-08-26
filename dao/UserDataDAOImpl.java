package com.familytreeservice.familytreeservice.dao;

import com.familytreeservice.familytreeservice.dao.interfaces.UserDataDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDataDAOImpl implements UserDataDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getGraph(String userID) {
        
        return jdbcTemplate.queryForObject("SELECT GRAPH FROM USER_DATA WHERE USER_ID =" + userID, String.class);
    }
}