package chapterFour;

import chapterFour.inmemory.User;
import chapterFour.inmemory.UserConstants;
import chapterFour.inmemory.Users;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Logging extends ActionSupport implements SessionAware {


    private String username;
    private String password;
    private Map<String, Object> session;

    @Override
    public String execute() throws Exception {

        String password = Users.getInstance().getUsers().get(username);
        if(password == null)
        {
            addActionError("No corresponding user in our database!");
        }else {
            if (!password.equals(this.password)) {
                addActionError("Password is not good!");
            }
        }
        if(getActionErrors().isEmpty()) {
            User user = new User(username);
            session.put(UserConstants.USER, user);
            return SUCCESS;
        }
        return INPUT;
    }


    @Override
    public void validate() {

        if(username == null || username.isEmpty())
        {
            addFieldError("username", "Username is fucking required man!");
        }
        if(password == null || password.isEmpty())
        {
            addFieldError("password", "Password is fucking required man!");

        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }


}
