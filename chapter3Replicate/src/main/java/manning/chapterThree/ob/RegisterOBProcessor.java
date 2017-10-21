package manning.chapterThree.ob;

import com.opensymphony.xwork2.ActionSupport;
import manning.chapterThree.beans.User;
import manning.chapterThree.services.UserData;

public class RegisterOBProcessor extends ActionSupport{


    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        UserData.getInstance().addUser(user);
        return SUCCESS;
    }


    @Override
    public void validate() {
        if(user.getFirstName() == null ||user.getFirstName().isEmpty() )
            addFieldError("user.firstName", "Grrrr, First Name was required dude!");

        if(user.getEmail() == null ||user.getEmail().isEmpty() )
            addFieldError("user.email", "Grrrr, Email was required dude!");

        if(user.getUsername() == null ||user.getUsername().isEmpty() )
            addFieldError("user.username", "Grrrr, username was required dude!");

    }
}
