package com.familytreeservice.familytreeservice.controllers.response;

public class Links {
    private int source, target, value;
    private String color;

    public int getSource(){
        return this.source;
    }

    public void setSource(int source){
        this.source = source;
    }

    public int getTarget(){
        return this.target;
    }

    public void setTarget(int target){
        this.target = target;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}