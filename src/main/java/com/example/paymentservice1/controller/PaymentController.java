package com.example.paymentservice1.controller;

import com.example.paymentservice1.model.Payment;
import com.example.paymentservice1.service.PaymentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment/{reservationId}")
    public Payment payReservation(@PathVariable long reservationId) {
        return paymentService.payReservation(reservationId);
    }

}
