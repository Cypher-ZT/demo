package com.bonc.order.service;

import com.bonc.order.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 闫泽宁
 * @date 2020/6/18 18:49
 */
@FeignClient(value = "app-payment")
public interface PaymentFeignService {

    @PostMapping(value = "/payment")
    ResponseEntity<Void> save(Payment payment);

    @GetMapping(value = "/payment/{id}")
    ResponseEntity<Payment> getPaymentById(@PathVariable("id") Long id);


}
