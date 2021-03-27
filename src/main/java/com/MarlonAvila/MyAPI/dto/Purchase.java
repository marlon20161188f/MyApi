package com.MarlonAvila.MyAPI.dto;

import com.MarlonAvila.MyAPI.entity.Address;
import com.MarlonAvila.MyAPI.entity.Customer;
import com.MarlonAvila.MyAPI.entity.Order;
import com.MarlonAvila.MyAPI.entity.OrderItem;
import lombok.Data;

import java.util.Set;
@Data
public class Purchase {
    Customer customer;
    Order order;
    Address shippingAddress;
    Address billingAddress;
    Set<OrderItem> orderItems;
}
