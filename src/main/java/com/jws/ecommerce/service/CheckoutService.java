package com.jws.ecommerce.service;

import com.jws.ecommerce.dto.Purchase;
import com.jws.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
