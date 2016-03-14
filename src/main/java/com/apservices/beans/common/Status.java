package com.apservices.beans.common;

/**
 * Created by praveen on 4/19/2015.
 */
public enum Status{
    INITIATED (100, "initiated"),
    COMPLETED (200, "completed");

    private final int id;
    private final String desc;

    Status(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
}
