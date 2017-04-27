package com.sdaacademy.jawny.daniel.retrofitdropbox.model;

public class Name {
    private String given_name;
    private String surname;
    private String familiar_name;
    private String display_name;
    private String abbreviated_name;

    public Name() {
    }

    public String getGiven_name() {
        return given_name;
    }

    public void setGiven_name(String given_name) {
        this.given_name = given_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFamiliar_name() {
        return familiar_name;
    }

    public void setFamiliar_name(String familiar_name) {
        this.familiar_name = familiar_name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getAbbreviated_name() {
        return abbreviated_name;
    }

    public void setAbbreviated_name(String abbreviated_name) {
        this.abbreviated_name = abbreviated_name;
    }
}
