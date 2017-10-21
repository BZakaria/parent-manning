package com.perso.auth;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.perso.auth.inmemory.User;
import com.perso.auth.inmemory.UserConstants;

import java.util.Map;

public class AuthChecker implements Interceptor {
    public void destroy() {
    }

    public void init() {
    }

    public String intercept(final ActionInvocation invocation) throws Exception {

        final Map<String, Object> session = invocation.getInvocationContext().getSession();

        final User currentUser = (User)session.get(UserConstants.USER);
        if(currentUser == null)
        {
            return Action.LOGIN;
        }

        Action action = (Action) invocation.getAction();
        if(action instanceof UserAware)
        {
            ( (UserAware)action).setUser(currentUser);
        }
        return invocation.invoke();
    }
}
