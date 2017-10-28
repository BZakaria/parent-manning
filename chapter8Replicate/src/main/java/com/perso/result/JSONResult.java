package com.perso.result;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import java.io.PrintWriter;

public class JSONResult implements Result{

    /** The default parameter */
    public static final String DEFAULT_PARAM = "mode";

    private String mode;

    public void execute(ActionInvocation invocation) throws Exception {


        ServletActionContext.getResponse().setContentType("application/json");
        PrintWriter responseStream = ServletActionContext.getResponse()
                .getWriter();

		/* Retrieve Objects to Serialize to JSON from ValueStack */

		/*
        ValueStack valueStack = invocation.getStack();
        Object jsonModel = valueStack.findValue("jsonModel");

*/
        final ValueStack stack = invocation.getStack();
        final String userName = stack.findString("username");

		/* Write to the response stream */
        responseStream.println("\"artist\":{\"name\":\""+ userName+"\" , \"mode\" : \" "+ mode +"\"}");

    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
