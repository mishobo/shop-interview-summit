package com.interview.onlineshop.service;

import com.interview.onlineshop.model.dtos.PaymentDetails;
import com.interview.onlineshop.model.entities.ShopItems;

public interface PaymentService {

    public ShopItems makePayment(PaymentDetails paymentDetails);

}
