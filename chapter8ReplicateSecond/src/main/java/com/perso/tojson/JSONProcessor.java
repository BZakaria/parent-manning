package com.perso.tojson;

import com.opensymphony.xwork2.ActionSupport;

public class JSONProcessor extends ActionSupport {

//TODO user lombok instead
    private  String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public void validate() {
        if(username == null || username.isEmpty())
        {
            addActionError("Username is required");
        }
    }
}
