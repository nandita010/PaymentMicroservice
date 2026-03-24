package com.example.paymentservice1.service;

import com.example.paymentservice1.model.Payment;
import com.example.paymentservice1.repository.PaymentRepo;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepo paymentRepo;


    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    public Payment payReservation(long reservationId) {
        Payment payment = new Payment();
        payment.setReservationId(reservationId);
        payment.setPaid(true);

        return paymentRepo.save(payment);
    }
}




