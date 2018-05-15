package com.vi.basiccleancode.model;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public class UserData {

    private String name, email;

    public UserData () {

    }

    public UserData(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
