package com.perso.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("core")
@Namespace("/Errors")
@Action("ErrorProne")
public class ErrorProneAction  extends ActionSupport{
	
	
	@Override
	public String execute() throws Exception {
		if(true)
			throw new RuntimeException("===> Error detected");
		return super.execute();
	}

}
