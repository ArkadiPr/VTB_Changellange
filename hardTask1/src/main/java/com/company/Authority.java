package com.company;

import java.util.Set;

public class Authority {
    private   int id;
    private String nameOfAuthority;

    public Authority(int id, String nameOfAuthority) {
        this.id = id;
        this.nameOfAuthority = nameOfAuthority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfAuthority() {
        return nameOfAuthority;
    }

    public void setNameOfAuthority(String nameOfAuthority) {
        this.nameOfAuthority = nameOfAuthority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authority authority = (Authority) o;

        return id == authority.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return nameOfAuthority;
    }
}
