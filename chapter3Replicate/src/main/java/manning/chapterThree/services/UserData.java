package manning.chapterThree.services;

import manning.chapterThree.beans.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private static UserData ourInstance = new UserData();

    public static List<User> userList = new ArrayList<User>();

    public static UserData getInstance() {
        return ourInstance;
    }

    private UserData() {
    }

    public void addUser(User pUser)
    {
        System.out.println("adding " + pUser);
        userList.add(pUser);
    }

}
