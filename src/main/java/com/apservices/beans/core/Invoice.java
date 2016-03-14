package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;
import com.apservices.beans.common.Status;

import java.util.Date;

/**
 * Created by praveen on 4/19/2015.
 */
public class Invoice extends BaseEntity {
    private Date orderDate;
    private Order order;
    private Double orderAmount;
    private Shipment shipment;
    private PaymentInfo paymentInfo;
    private Status status;
}
