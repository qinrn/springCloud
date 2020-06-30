package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.entities.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {


    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") int id);

    public int registerUser(UserInfo user);

}
