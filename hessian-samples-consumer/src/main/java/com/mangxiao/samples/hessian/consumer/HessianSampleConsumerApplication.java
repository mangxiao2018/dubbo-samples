package com.mangxiao.samples.hessian.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class HessianSampleConsumerApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HessianSampleConsumerApplication.class, args);
    }
}
