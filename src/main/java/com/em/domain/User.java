package com.em.domain;

/**
 * Created by lujunjie on 2018/6/26.
 */
public class User {
    private String id;

    private String password;

    private int role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
