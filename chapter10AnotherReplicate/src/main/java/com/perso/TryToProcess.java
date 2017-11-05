package com.perso;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TryToProcess extends ActionSupport implements ModelDriven{

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }

    private User user = new User();
    public Object getModel() {
        return user;
    }
}
