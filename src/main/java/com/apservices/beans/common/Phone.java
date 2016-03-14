package com.apservices.beans.common;

import com.apservices.beans.BaseEntity;

/**
 * Created by praveen on 4/19/2015.
 */
public class Phone extends BaseEntity{
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    private PhoneType  type;
}
