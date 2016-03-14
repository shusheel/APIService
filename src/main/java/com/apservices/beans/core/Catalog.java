package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;

/**
 * Created by praveen on 4/19/2015.
 */
public class Catalog extends BaseEntity {
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private String identifier;
    private String description;
    private Vendor vendor;
    private double listPrice;
    private double discount;
}
