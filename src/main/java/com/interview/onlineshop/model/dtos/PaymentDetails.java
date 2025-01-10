package com.interview.onlineshop.model.dtos;

public record PaymentDetails(
        String itemname,
        String stockcode,
        Double priceperunit
) {
}
