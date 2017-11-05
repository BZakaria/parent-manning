package com.perso.validation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

public class GetValidateProcessUser extends ActionSupport implements ModelDriven<User>{

   private static final Logger LOG = org.apache.log4j.Logger.getLogger(GetValidateProcessUser.class);

    @Getter @Setter
    private User user;

    public GetValidateProcessUser() {
        this.user = new User();
    }

    @Override
    public String execute() throws Exception {
        LOG.info("Logging stuff <<<< ");
        return super.execute();
    }

    public User getModel() {
        return user;
    }
}
