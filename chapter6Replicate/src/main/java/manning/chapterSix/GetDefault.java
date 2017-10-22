package manning.chapterSix;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class GetDefault  extends ActionSupport {

    private String testValueInStack;

    @Override
    public String execute() throws Exception {
        ValueStack stack = ActionContext.getContext().getValueStack();

        stack.setValue("testValueInStack","Blablah Value!");

        return SUCCESS;
    }

    public String getTestValueInStack() {
        return testValueInStack;
    }

    public void setTestValueInStack(String testValueInStack) {
        this.testValueInStack = testValueInStack;
    }
}
