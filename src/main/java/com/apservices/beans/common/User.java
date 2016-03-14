package com.apservices.beans.common;

import com.apservices.beans.BaseEntity;

/**
 * Created by praveen on 4/19/2015.
 */
public class User extends BaseEntity{
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    private String userId;
    private String password;
    private String email;
    private Phone phone;
}
