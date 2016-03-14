package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;
import com.apservices.beans.common.OrderStatus;
import com.apservices.beans.common.Status;

import java.util.List;

/**
 * Created by praveen on 4/19/2015.
 */
public class Order extends BaseEntity {
    private List<OrderItem> orderItems;
    private Customer customer;
    OrderStatus orderStatus;
}
