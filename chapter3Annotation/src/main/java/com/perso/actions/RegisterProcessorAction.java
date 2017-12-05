package com.perso.actions;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.perso.utils.User;
import com.perso.utils.Users;

@Namespace("/Membership")

@Results({
	@Result(name = "success", location = "/pages/register-success.jsp"),
	@Result(name = "input", location = "/pages/register.jsp")
})
@Action("RegisterProcessor")
public class RegisterProcessorAction extends ActionSupport {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		Map<String, User> users = Users.users;
		generateId(user);
		users.put(user.getId(), user);
		return ActionSupport.SUCCESS;
	}

	private void generateId(User user) {
		user.setId(String.valueOf(Users.counter++));
	}
	
	@Override
	public void validate() {
		if(user.getName() == null || user.getName().isEmpty())
		{
			addFieldError("user.name", getText("username.required"));
		}
	}
}
