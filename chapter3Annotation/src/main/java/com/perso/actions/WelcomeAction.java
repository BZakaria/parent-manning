package com.perso.actions;


import org.apache.struts2.convention.annotation.*;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/Welcome")
@Result(name ="success", location="/pages/welcome.jsp")
@org.apache.struts2.convention.annotation.Action("First")
public class WelcomeAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}
	
}
