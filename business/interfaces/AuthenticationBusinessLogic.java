package com.familytreeservice.familytreeservice.business.interfaces;

public interface AuthenticationBusinessLogic {
    boolean authenticate(String username, String password);
    //registration TODO
}