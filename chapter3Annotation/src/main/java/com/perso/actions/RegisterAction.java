package com.perso.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.perso.actions.utils.NamespaceMembership;
import com.perso.utils.User;


@Namespace(NamespaceMembership.MEMBERSHIP)
@Result(name = "success", location = "/pages/register.jsp")
@Action("Register")
public class RegisterAction  extends ActionSupport{
	


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
}
