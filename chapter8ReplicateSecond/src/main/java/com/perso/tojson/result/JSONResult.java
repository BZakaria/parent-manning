package com.perso.tojson.result;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import java.io.PrintWriter;

public class JSONResult implements Result {

    public static final String DEFAULT_PARAM = "mode";

    private int mode;

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void execute(ActionInvocation invocation) throws Exception {

        ServletActionContext.getResponse().setContentType("text/html");

        final ValueStack stack = invocation.getStack();
        final String username = stack.findString("username");

        final PrintWriter writer = ServletActionContext.getResponse().getWriter();
        writer.println("\"rootUser\":{\"name\":\""+ username +"\", \"mode\":"+mode+"}");


    }
}
