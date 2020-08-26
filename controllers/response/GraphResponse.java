package com.familytreeservice.familytreeservice.controllers.response;

import java.util.List;

public class GraphResponse {
    private List<Nodes> nodes;
    private List<Links> links;

    public GraphResponse(List<Nodes> nodes, List<Links> links){
        this.nodes = nodes;
        this.links = links;
    }

    public List<Nodes> getNodes(){
        return this.nodes;
    }

    public void setNodes(List<Nodes> nodes){
        this.nodes = nodes;
    }

    public List<Links> getLinks(){
        return this.links;
    }

    public void setLinks(List<Links> links){
        this.links = links;
    }
}