package multi.circles;

import com.opensymphony.xwork2.ActionSupport;

public class CircleFormProcessor extends ActionSupport{
    private String circle;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getCircle() {
        return circle;
    }
}
