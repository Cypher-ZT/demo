package com.bonc.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bonc.payment.entities.Payment;
import com.bonc.payment.mapper.PaymentMapper;
import com.bonc.payment.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author 闫泽宁
 * @date 2020/6/17 18:30
 */
@Service(value = "PaymentService")
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
        implements PaymentService {
}
