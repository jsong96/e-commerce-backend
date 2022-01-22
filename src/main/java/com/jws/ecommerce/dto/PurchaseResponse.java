package com.jws.ecommerce.dto;


import lombok.Data;

@Data
public class PurchaseResponse {

    // Lombok data will generate a constructor for final fields
    // or use @NonNull
    private final String orderTrackingNumber;
}
