/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.mangxiao.samples.dubbo.provider.customer;

import com.mangxiao.samples.dubbo.provider.model.Student;
import com.mangxiao.samples.dubbo.provider.service.StudentService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试
 */
@SpringBootApplication
@Service
//@EnableHystrix
@EnableDubbo
public class ConsumerApplication {

    @DubboReference(version = "1.0.0")
    private StudentService studentService;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        ConsumerApplication application = context.getBean(ConsumerApplication.class);

        List<Student> dataList = application.getAll();
        System.out.println("result: " + dataList);
    }

   // @HystrixCommand(fallbackMethod = "reliable")
    public List<Student> getAll() {
        // According to author's original purpose, the fallbackMethod is triggered by remote RpcException but not NPE of demoService.
        return studentService.getAll();
    }

    public String reliable(String name) {
        return "hystrix fallback value";
    }
}
