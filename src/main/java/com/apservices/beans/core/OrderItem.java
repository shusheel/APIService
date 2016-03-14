package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;

/**
 * Created by praveen on 4/19/2015.
 */
public class OrderItem extends BaseEntity {
    Catalog catalog;
    int quantity;
    double price;
}
