package com.familytreeservice.familytreeservice.controllers;

import com.familytreeservice.familytreeservice.business.interfaces.GraphBusinessLogic;
import com.familytreeservice.familytreeservice.controllers.response.GraphResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "http://localhost:3000")
public class FamilyTreeController{
    @Autowired
    private GraphBusinessLogic graphBusinessLogic;
    @RequestMapping(value = "/getFamilyTree", method = RequestMethod.GET)
    public GraphResponse getGraph(){
        GraphResponse graph = graphBusinessLogic.populateGraphData();
        return graph;
    }

}


