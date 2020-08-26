package com.familytreeservice.familytreeservice.dao.interfaces;

public interface UserDAO {
    boolean isValid(String username, String password);
}