package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;
import com.apservices.beans.common.Address;
import com.apservices.beans.common.User;

/**
 * Created by praveen on 4/19/2015.
 */
public class Customer extends BaseEntity {
    private String firstName;
    private String lastName;
    private String middleName;
    private Address billAddress;
    private Address shipAddress;
    private User user;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Address getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(Address billAddress) {
        this.billAddress = billAddress;
    }

    public Address getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(Address shipAddress) {
        this.shipAddress = shipAddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
