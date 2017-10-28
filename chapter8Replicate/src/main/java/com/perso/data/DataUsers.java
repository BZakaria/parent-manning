package com.perso.data;

import com.perso.beans.User;

import java.util.HashMap;
import java.util.Map;

public class DataUsers {
    private static DataUsers ourInstance = new DataUsers();

    private Map<String,User> users = new HashMap<String, User>();

    public static DataUsers getInstance() {
        return ourInstance;
    }

    private DataUsers() {
        User user1 = new User();
        user1.setUsername("Zakaria");

        User user2 = new User();
        user2.setUsername("Amine");

        User user3 = new User();
        user3.setUsername("Hamza");

        User user4 = new User();
        user4.setUsername("Jean");

        users.put(user1.getUsername(), user1);
        users.put(user2.getUsername(), user2);
        users.put(user3.getUsername(), user3);
        users.put(user4.getUsername(), user4);
    }


}
