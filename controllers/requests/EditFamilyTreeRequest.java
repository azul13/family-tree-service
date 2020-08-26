package com.familytreeservice.familytreeservice.controllers.requests;

import java.util.List;

public class EditFamilyTreeRequest {
    private String name, birthyear;

    private List<String> links;

    public String getFullName(){
        return this.name;
    }

    public void setFullName(String str){
        this.name = str;
    }

    public String getBirthYear(){
        return this.birthyear;
    }

    public void setBirthYear(String str){
        this.birthyear = str;
    }

    public List<String> getLinks(){
        return this.links;
    }

    public void setLinks(List<String> links){
        this.links = links;
    }
}