package com.perso.auth;

import com.opensymphony.xwork2.ActionSupport;
import com.perso.auth.inmemory.User;
import com.perso.auth.inmemory.UserConstants;
import com.perso.auth.inmemory.Users;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LoginProcess extends ActionSupport implements SessionAware {

    private String username;
    private String password;
    private Map<String, Object> session;

    @Override
    public String execute() throws Exception {

        String password = Users.getInstance().getUsers().get(username);
        if(password == null)
        {
            addActionError(getText("no.user"));
        }else {
            if (!password.equals(this.password)) {
                addActionError(getText("not.password"));
            }
        }
        if(getActionErrors().isEmpty()) {
            User user = new User(username);
            session.put(UserConstants.USER, user);
            return SUCCESS;
        }
        return INPUT;
    }

    @Override
    public void validate() {
        //do nothing by now;
        if(username == null || username.isEmpty())
        {
            addFieldError("username", getText("username.required"));
        }
        if(password == null || password.isEmpty())
        {
            addFieldError("password", getText("password.required"));

        }

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
