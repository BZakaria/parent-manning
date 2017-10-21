package multi;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class MultiListProcessor extends ActionSupport{

    private List names;

    @Override
    public String execute() throws Exception {
        System.out.println(getNames());
        return SUCCESS;
    }

    public List getNames() {
        return names;
    }

    public void setNames(List names) {
        this.names = names;
    }
}
