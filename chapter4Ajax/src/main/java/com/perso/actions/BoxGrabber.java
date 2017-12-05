package com.perso.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.ws.soap.MTOM;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/*
 
   <result type="stream">
        <param name="contentType">text/html</param>
        <param name="inputName">inputStream</param>
    </result>
 */
@Namespace("/ajax")
@Action("BoxGrabber")
@Result(type = "stream", params = { "contentType", "text/html", "inputName", "inputStream" })
public class BoxGrabber extends ActionSupport {

	private InputStream inputStream;

	public InputStream getInputStream() {
		return inputStream;
	}

	@Override
	public String execute() throws Exception {
		inputStream = new ByteArrayInputStream(
				"Hello World! This is a text string response from a Struts 2 Action developed by Zak."
						.getBytes("UTF-8"));
		return super.execute();
	}

	public String test() throws Exception {
		inputStream = new ByteArrayInputStream(
				"Hello World! This is a text string response from a Struts 2 Action developed by Zak with test method instead."
						.getBytes("UTF-8"));
		return super.execute();
	}
}
