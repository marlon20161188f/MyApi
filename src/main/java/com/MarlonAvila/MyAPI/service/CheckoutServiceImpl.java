package com.MarlonAvila.MyAPI.service;

import com.MarlonAvila.MyAPI.dao.CustomerRepository;
import com.MarlonAvila.MyAPI.dto.Purchase;
import com.MarlonAvila.MyAPI.dto.PurchaseResponse;
import com.MarlonAvila.MyAPI.entity.Customer;
import com.MarlonAvila.MyAPI.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{
    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        String trackingNumber=getTrackingNumber();
        Order order= purchase.getOrder();
        order.setTrackingNumber(trackingNumber);
        order.setShippingAddress(purchase.getShippingAddress());
        order.setBillingAddress(purchase.getBillingAddress());

        purchase.getOrderItems().forEach(oi->{
            order.addOrderItem(oi);
        });
        Customer customer=purchase.getCustomer();
        customer.addOrder(order);

        customerRepository.save(customer);

        return new PurchaseResponse(trackingNumber);
    }
    private String getTrackingNumber(){
        return UUID.randomUUID().toString();
    }
}
