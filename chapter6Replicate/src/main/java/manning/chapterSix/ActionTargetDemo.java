package manning.chapterSix;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

public class ActionTargetDemo extends ActionSupport implements RequestAware{

    private Map<String, Object> request;

    @Override
    public String execute() throws Exception {
        request.put("anotherRequest", "anotherRequestValue");
        return SUCCESS;
    }

    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    public Map<String, Object> getRequest() {
        return request;
    }
}
