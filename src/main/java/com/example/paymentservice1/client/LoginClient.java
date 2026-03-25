package com.example.paymentservice1.client;

@FeignClient(name = "login-service", url = "http://localhost:8080")
public interface LoginClient {
    @GetMapping("/login/{id}")
    Login getLogin(@PathVariable long id);
}
