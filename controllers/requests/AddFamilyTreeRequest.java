package com.familytreeservice.familytreeservice.controllers.requests;

public class AddFamilyTreeRequest {
    private String name, occupation, gender;
    private int birthyear, deathyear;

    public String getFullName(){
        return this.name;
    }

    public void setFullName(String str){
        this.name = str;
    }

    public int getBirthYear(){
        return this.birthyear;
    }

    public void setBirthYear(int i){
        this.birthyear = i;
    }

    public String getOccupation(){
        return this.occupation;
    }

    public void setOccupation(String str){
        this.occupation = str;
    }

    public int getDeathYear(){
        return this.deathyear;
    }

    public void setDeathYear(int i){
        this.deathyear = i;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String str){
        this.gender = str;
    }

}