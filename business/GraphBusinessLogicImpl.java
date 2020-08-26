package com.familytreeservice.familytreeservice.business;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.familytreeservice.familytreeservice.business.interfaces.GraphBusinessLogic;
import com.familytreeservice.familytreeservice.controllers.response.GraphResponse;
import com.familytreeservice.familytreeservice.controllers.response.Links;
import com.familytreeservice.familytreeservice.controllers.response.Nodes;
import com.familytreeservice.familytreeservice.dao.interfaces.UserDataDAO;
import com.familytreeservice.familytreeservice.utilities.graph;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class GraphBusinessLogicImpl implements GraphBusinessLogic {

    @Autowired
    private UserDataDAO userDataDAO;

    @Override
    public GraphResponse populateGraphData() {
        String graphData = userDataDAO.getGraph("4");
        ObjectMapper objectMapper = new ObjectMapper();
        graph graph = null;
        try {
            graph = objectMapper.readValue(graphData, graph.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return new GraphResponse(graph.getGraphNodes(), graph.getGraphLinks());
    }
    
}