package com.perso.forward;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class ForwardTest extends ActionSupport{

    private  String property;

    @Override
    public String execute() throws Exception {
        ServletActionContext.getRequest().setAttribute("someProp", "someValue");
        setProperty("proeprtyValue");
        return SUCCESS;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
