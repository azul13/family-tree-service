package com.familytreeservice.familytreeservice.utilities;

import java.util.List;

import com.familytreeservice.familytreeservice.controllers.response.Links;
import com.familytreeservice.familytreeservice.controllers.response.Nodes;
import com.fasterxml.jackson.annotation.JsonProperty;

public class graph {
    @JsonProperty("nodes")
    List<Nodes> graphNodes;
    @JsonProperty("links")
    List<Links> graphLinks;

    public List<Nodes> getGraphNodes() {
        return graphNodes;
    }

    public void setGraphNodes(List<Nodes> graphNodes) {
        this.graphNodes = graphNodes;
    }

    public List<Links> getGraphLinks() {
        return graphLinks;
    }

    public void setGraphLinks(List<Links> graphLinks) {
        this.graphLinks = graphLinks;
    }
}