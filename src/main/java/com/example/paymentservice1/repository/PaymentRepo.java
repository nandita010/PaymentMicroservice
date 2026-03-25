package com.example.paymentservice1.repository;

import com.example.paymentservice1.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    List<Payment> findByPaymentMethod(String paymentMethod);

}

