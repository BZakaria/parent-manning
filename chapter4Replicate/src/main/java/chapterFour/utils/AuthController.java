package chapterFour.utils;

import chapterFour.inmemory.User;
import chapterFour.inmemory.UserConstants;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

public class AuthController  implements Interceptor{

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        final Map<String, Object> session = invocation.getInvocationContext().getSession();

        User user = (User) session.get(UserConstants.USER);
        if (user == null) {
            return Action.LOGIN;
        }

        Action action = (Action)invocation.getAction();

        if(action instanceof UserAware)
        {
            ((UserAware)action).setUser(user);
        }

        return invocation.invoke();
    }

    @Override
    public void destroy() {
        //Nothing
    }

    @Override
    public void init() {
        //Nothing
    }
}
