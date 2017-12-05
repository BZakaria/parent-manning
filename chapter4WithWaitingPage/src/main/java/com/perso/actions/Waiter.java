package com.perso.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.DefaultInterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/wait")
@Action("Waiter")
//@ParentPackage("default")
@InterceptorRef("waitStack")
@Results({ @Result(name = "success", location = "/result.jsp"), @Result(name = "wait", location = "/wait.jsp") })
public class Waiter extends ActionSupport {

	@Override
	public String execute() throws Exception {

		// Generate wait

		Thread.currentThread().sleep(5000);

		return super.execute();
	}

}
