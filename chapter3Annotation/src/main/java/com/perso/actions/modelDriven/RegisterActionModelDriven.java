package com.perso.actions.modelDriven;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.perso.actions.utils.NamespaceMembership;

@Namespace(NamespaceMembership.MEMBERSHIP)
@Result(name=ActionSupport.SUCCESS, location = "/pages/modelDriven/register.jsp")
@Action("RegisterMD")
public class RegisterActionModelDriven  extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
		return super.execute();
	}

}
