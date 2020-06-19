package com.bonc.payment.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 闫泽宁
 * @date 2020/6/17 16:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("_payment")
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
