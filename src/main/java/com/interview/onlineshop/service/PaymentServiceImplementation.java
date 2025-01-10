package com.interview.onlineshop.service;

import com.interview.onlineshop.model.dtos.PaymentDetails;
import com.interview.onlineshop.model.entities.ShopItems;
import com.interview.onlineshop.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImplementation implements PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentServiceImplementation(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    @Override
    public ShopItems makePayment(PaymentDetails paymentDetails) {
    var shopItems = new ShopItems(
            paymentDetails.itemname(),
            paymentDetails.stockcode(),
            paymentDetails.priceperunit()
    );

        return paymentRepository.save(shopItems);
    }
}
