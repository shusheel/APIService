package com.apservices.beans.common;

/**
 * Created by praveen on 4/19/2015.
 */
public enum PhoneType {
    CELL ("Cell Phone"),
    HOME ("Home Phone"),
    OTHER ("Other Phone");

    private final String type;

    PhoneType(String type) {
        this.type = type;
    }
}
