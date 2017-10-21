package multi;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class MultiMapProcessor extends ActionSupport {
    private Map users;

    @Override
    public String execute() throws Exception {
        return  SUCCESS;
    }

    public Map getUsers() {
        return users;
    }

    public void setUsers(Map users) {
        this.users = users;
    }
}
