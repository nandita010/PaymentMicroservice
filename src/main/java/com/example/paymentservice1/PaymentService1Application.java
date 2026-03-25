package com.example.paymentservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class PaymentService1Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentService1Application.class, args);
    }

}
