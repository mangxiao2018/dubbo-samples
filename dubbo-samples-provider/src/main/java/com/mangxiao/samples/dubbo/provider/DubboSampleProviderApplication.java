package com.mangxiao.samples.dubbo.provider;

import com.mangxiao.samples.dubbo.provider.zookeeper.EmbeddedZooKeeper;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableHystrix
@EnableDubbo(scanBasePackages = {"org.apache.dubbo.spring.boot.provider.impl"})
public class DubboSampleProviderApplication {
    public static void main(String[] args) throws Exception{
        new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(DubboSampleProviderApplication.class, args);
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
