package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private int id;
    private String serial;

    public static void main(String[] args) {
        System.out.println("Hello ~this is Liu");
        System.out.println("I am liubaolai");
        System.out.println("i an qinruo nan");
    }
}


