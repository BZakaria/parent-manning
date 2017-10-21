package com.perso.auth;

import com.perso.auth.inmemory.User;

public interface UserAware {
    public void setUser(User user);
}
