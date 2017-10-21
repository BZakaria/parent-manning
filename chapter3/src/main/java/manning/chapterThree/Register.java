package manning.chapterThree;

import com.opensymphony.xwork2.ActionSupport;
import manning.chapterThree.utils.PortfolioService;
import manning.chapterThree.utils.User;

public class Register extends ActionSupport {

    public String execute(){
        User user = new User();
        user.setPassword(getPassword());
        user.setPortfolioName(getPortfolioName());
        user.setUsername(getUsername());
        //Creation of the user
        getPortfolioService().createAccount(user);
        return SUCCESS;
    }

    private String username;
    private String password;
    private String portfolioName;

    public String getPortfolioName() {
        return portfolioName;
    }
    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void validate() {
        PortfolioService ps = getPortfolioService();

   //     addActionError("Dude there has been something wrong!");

        if ( getPassword().length() == 0 ){
            addFieldError( "password", getText("password.required"));
        }
        if ( getUsername().length() == 0 ){
            addFieldError( "username",  getText("username.required" ));
        }
        if ( getPortfolioName().length() == 0 ){
            addFieldError( "portfolioName",  getText("portfolioName.required"));
        }
        if ( ps.userExists(getUsername() ) ){
            addFieldError("username", "user.exists");
        }
    }

    public PortfolioService getPortfolioService( ) {
        return new PortfolioService();
    }
}
