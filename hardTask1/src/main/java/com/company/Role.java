package com.company;

import java.util.Set;

public class Role {
    private int id;
    private String nameOfRole;
    private Set<Authority> authorities;

    public Role(int id, String nameOfRole, Set<Authority> authorities) {
        this.id = id;
        this.nameOfRole = nameOfRole;
        this.authorities = authorities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfRole() {
        return nameOfRole;
    }

    public void setNameOfRole(String nameOfRole) {
        this.nameOfRole = nameOfRole;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }
}
