package manning.chapterSeven.beans;

public class User {

    String username;
    boolean canReceiveJunkMail;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isCanReceiveJunkMail() {
        return canReceiveJunkMail;
    }

    public void setCanReceiveJunkMail(boolean canReceiveJunkMail) {
        this.canReceiveJunkMail = canReceiveJunkMail;
    }
}
