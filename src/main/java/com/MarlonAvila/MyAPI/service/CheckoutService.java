package com.MarlonAvila.MyAPI.service;

import com.MarlonAvila.MyAPI.dto.Purchase;
import com.MarlonAvila.MyAPI.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
