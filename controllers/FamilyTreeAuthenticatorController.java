package com.familytreeservice.familytreeservice.controllers;

import com.familytreeservice.familytreeservice.business.interfaces.AuthenticationBusinessLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/auth")
@CrossOrigin
public class FamilyTreeAuthenticatorController {
    @Autowired
    private AuthenticationBusinessLogic authenticationBusinessLogic;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean authenticate(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        return authenticationBusinessLogic.authenticate(username, password);
    }
}