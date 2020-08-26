package com.familytreeservice.familytreeservice.controllers;

import java.util.List;

import com.familytreeservice.familytreeservice.controllers.requests.AddFamilyTreeRequest;
import com.familytreeservice.familytreeservice.controllers.requests.EditFamilyTreeRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/familytree")
@CrossOrigin

public class FamilyTreeEditController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String adding(@RequestBody AddFamilyTreeRequest addFamilyTreeRequest) {
        System.out.println(addFamilyTreeRequest.getFullName());
        return addFamilyTreeRequest.getFullName();
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public boolean adding(@RequestBody EditFamilyTreeRequest editFamilyTreeRequest) {
        System.out.println(editFamilyTreeRequest.getLinks());
        return true;
    }

    
}