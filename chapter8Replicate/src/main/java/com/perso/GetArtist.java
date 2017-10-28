package com.perso;

import com.opensymphony.xwork2.ActionSupport;

public class GetArtist  extends ActionSupport{

    private String username;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
