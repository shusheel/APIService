package com.apservices.beans.common;

/**
 * Created by praveen on 4/19/2015.
 */
public enum OrderStatus {
    ORDER_INITIATED (1000, "Order Initiated"),
    ORDER_PENDING(2000, "Order Pending"),
    SHIPMENT_PENDING(3000, "Shipment is being prepared"),
    SHIPPED (4000, "Order is shipped");

    private final long id;
    private final String desc;

    OrderStatus(long id, String desc) {
        this.id = id;
        this.desc = desc;
    }
}
