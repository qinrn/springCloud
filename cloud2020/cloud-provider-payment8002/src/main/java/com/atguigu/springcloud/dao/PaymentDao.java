package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.entities.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") int id);

    public int registerUser(UserInfo user);



}
