package com.mangxiao.samples.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubbo(scanBasePackages = {"com.mangxiao.samples.dubbo.provider.service.impl"})
public class DubboSampleProviderApplication {
    public static void main(String[] args) throws Exception{
        //new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(DubboSampleProviderApplication.class, args);
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
