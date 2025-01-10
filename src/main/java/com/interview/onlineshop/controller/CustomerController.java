package com.interview.onlineshop.controller;

import com.interview.onlineshop.model.dtos.PaymentDetails;
import com.interview.onlineshop.model.entities.ShopItems;
import com.interview.onlineshop.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private PaymentService paymentService;

    public CustomerController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @PostMapping(value = "/payment", consumes = "application/json", produces = "application/json")
    public ShopItems makePayments(@RequestBody PaymentDetails paymentDetails){
        return paymentService.makePayment(paymentDetails);
    }



}
