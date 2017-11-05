package com.perso.validation;

import com.opensymphony.xwork2.ActionSupport;

public class GetValidateProcess extends ActionSupport {

    private String password;

    @Override
    public String execute() throws Exception {
        System.out.println(password);
        return super.execute();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
