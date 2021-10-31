package com.mangxiao.samples.hessian.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class HessianSampleProviderApplication {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(HessianSampleProviderApplication.class, args);
    }
}
