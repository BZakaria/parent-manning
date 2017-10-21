package multi;

import com.opensymphony.xwork2.ActionSupport;

public class MultiArrayProcessor  extends ActionSupport{


    private Double[] ages;
    private String[] names = new String[10];

    @Override
    public String execute() throws Exception {

        System.out.println(names[0]);
        return SUCCESS;
    }

    @Override
    public void validate() {
        super.validate();
    }

    public void setAges(Double[] ages) {
        this.ages = ages;
    }

    public Double[] getAges() {
        return ages;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
