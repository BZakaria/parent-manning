package manning.chapterThree;

import com.opensymphony.xwork2.ActionSupport;
import manning.chapterThree.beans.User;
import manning.chapterThree.services.UserData;

public class Register  extends ActionSupport {


    private String username;
    private String firstName;
    private String mail;

    @Override
    public String execute() throws Exception {

        User user = new User();

        user.setUsername(getUsername());
        user.setEmail(getMail());
        user.setFirstName(getFirstName());

        UserData.getInstance().addUser(user);

        return SUCCESS;
    }


    //validate all the fields
    @Override
    public void validate() {
        if(username == null || username.isEmpty())
            addFieldError("username",getText("username.required"));

        if(mail == null || mail.isEmpty())
            addFieldError("mail",getText("mail.required"));

        if(firstName == null || firstName.isEmpty())
            addFieldError("firstName",getText("firstname.required"));
    }



    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
}
