package com.ssp.sst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.ssp.sst.dao")
public class SstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SstApplication.class, args);
        System.out.println("程序在运行");
    }

}
