package com.familytreeservice.familytreeservice.controllers.response;

public class Nodes {
    private String name, gender, occupation, id;
    private int birthyear, deathyear;

    public String getName(){
        return this.name;
    }

    public void setName(final String str) {
        this.name = str;
    }

    public int getBirthyear() {
        return this.birthyear;
    }

    public void setBirthyear(final int i) {
        this.birthyear = i;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String str) {
        this.gender = str;
    }

    public int getDeathyear() {
        return this.deathyear;
    }

    public void setDeathyear(final int i) {
        this.deathyear = i;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(final String str) {
        this.occupation = str;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}