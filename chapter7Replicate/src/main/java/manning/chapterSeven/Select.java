package manning.chapterSeven;

import com.opensymphony.xwork2.ActionSupport;
import manning.chapterSeven.beans.User;

public class Select extends ActionSupport {

    private User user;

    @Override
    public String execute() throws Exception {

        System.out.println(user);
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
