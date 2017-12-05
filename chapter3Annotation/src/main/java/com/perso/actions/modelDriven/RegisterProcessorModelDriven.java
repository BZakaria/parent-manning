package com.perso.actions.modelDriven;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.perso.actions.utils.NamespaceMembership;
import com.perso.utils.User;


@Namespace(NamespaceMembership.MEMBERSHIP)
@Result(name=ActionSupport.SUCCESS, location = "/pages/modelDriven/register-success.jsp")
@Action("RegisterProcessorModelDriven")
public class RegisterProcessorModelDriven extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}
	
}
