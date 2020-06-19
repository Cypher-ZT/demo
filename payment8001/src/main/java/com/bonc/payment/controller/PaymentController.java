package com.bonc.payment.controller;

import com.bonc.payment.service.PaymentService;
import com.bonc.payment.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 闫泽宁
 * @date 2020/6/17 17:49
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "payment")
    public ResponseEntity<Void> save(@RequestBody Payment payment){
        try {
            this.paymentService.save(payment);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (Exception e){
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping(value = "payment/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable("id") Long id){
        try {
            Payment payment = this.paymentService.getById(id);
            if (payment == null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            return ResponseEntity.ok(payment);
        }catch (Exception e){
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}
