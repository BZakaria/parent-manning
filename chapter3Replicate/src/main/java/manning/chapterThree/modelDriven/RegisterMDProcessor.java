package manning.chapterThree.modelDriven;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import manning.chapterThree.beans.User;
import manning.chapterThree.services.UserData;

public class RegisterMDProcessor extends ActionSupport implements ModelDriven{


    @Override
    public String execute() throws Exception {
        UserData.getInstance().addUser(user);
        return SUCCESS;
    }


    @Override
    public void validate() {
        System.out.println("validating bean " + user);
        if(user.getFirstName() == null ||user.getFirstName().isEmpty() )
            addFieldError("firstName", "Grrrr, First Name was required dude!");

        if(user.getEmail() == null ||user.getEmail().isEmpty() )
            addFieldError("email", "Grrrr, Email was required dude!");

        if(user.getUsername() == null ||user.getUsername().isEmpty() )
            addFieldError("username", "Grrrr, username was required dude!");
    }

    private User user = new User();
    @Override
    public Object getModel() {
        return user;
    }
}
