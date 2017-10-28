package com.perso.beans;

public class User {


    private String username;
    private Boolean canReceiveJunkMail;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getCanReceiveJunkMail() {
        return canReceiveJunkMail;
    }

    public void setCanReceiveJunkMail(Boolean canReceiveJunkMail) {
        this.canReceiveJunkMail = canReceiveJunkMail;
    }
}
