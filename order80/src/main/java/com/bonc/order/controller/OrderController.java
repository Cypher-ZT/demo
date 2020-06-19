package com.bonc.order.controller;

import com.bonc.order.entities.Payment;
import com.bonc.order.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 闫泽宁
 * @date 2020/6/17 17:49
 */
@RestController
@Slf4j
public class OrderController {
//    @Resource
//    private RestTemplate restTemplate;
//
//    private static final String PAYMENT_URL = "http://app-payment/";
//
//    @PostMapping(value = "/consumer/payment")
//    public ResponseEntity<Void> save(Payment payment){
//       return restTemplate.postForEntity(PAYMENT_URL+"/payment",payment,null);
//    }
//
//    @GetMapping(value = "/consumer/payment/{id}")
//    public ResponseEntity<Payment> getPaymentById(@PathVariable("id") Long id){
//        return restTemplate.getForEntity(PAYMENT_URL+"/payment/"+id,Payment.class);
//    }

    @Resource
    private PaymentFeignService paymentFeignService;

    @PostMapping(value = "/consumer/payment")
    public ResponseEntity<Void> save(Payment payment){
       return paymentFeignService.save(payment);
    }

    @GetMapping(value = "/consumer/payment/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
