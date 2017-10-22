package manning.chapterSix;

import com.opensymphony.xwork2.ActionSupport;

public class TagSetDemo extends ActionSupport {

    private  User user = new User();

    @Override
    public String execute() throws Exception {
        user.setUsername("Zikoo");
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
