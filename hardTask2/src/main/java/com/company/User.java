package com.company;

import java.util.Set;

public class User {

    private int id;
    private Set<Bill> bills;

    public User(int id, Set<Bill> bills) {
        this.id = id;
        this.bills = bills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }
}
