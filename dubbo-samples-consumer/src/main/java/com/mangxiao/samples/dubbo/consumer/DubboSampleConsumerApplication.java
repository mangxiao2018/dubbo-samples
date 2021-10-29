package com.mangxiao.samples.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboSampleConsumerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DubboSampleConsumerApplication.class, args);
    }

}
