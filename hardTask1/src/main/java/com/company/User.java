package com.company;

import java.util.Set;

public class User {
   private int id;
   private String userName;
   private Set<Role> roles;

    public User(int id, String userName, Set<Role> roles) {
        this.id = id;
        this.userName = userName;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
