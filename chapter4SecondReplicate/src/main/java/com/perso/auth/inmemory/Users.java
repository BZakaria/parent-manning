package com.perso.auth.inmemory;

import java.util.HashMap;
import java.util.Map;

public class Users {
    private static Users ourInstance = new Users();

    public Map<String, String> getUsers() {
        return new HashMap<String,String>(users);
    }

    private Map<String,String> users = new HashMap<String,String>();

    public static Users getInstance() {
        return ourInstance;
    }

    private Users() {
        users.put("user1","user1");
        users.put("user3","user3");
    }
}
