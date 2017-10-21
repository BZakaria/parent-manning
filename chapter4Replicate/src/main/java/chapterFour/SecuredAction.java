package chapterFour;

import chapterFour.inmemory.User;
import chapterFour.utils.UserAware;
import com.opensymphony.xwork2.ActionSupport;

public class SecuredAction extends ActionSupport implements UserAware{

    User user;

    @Override
    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
