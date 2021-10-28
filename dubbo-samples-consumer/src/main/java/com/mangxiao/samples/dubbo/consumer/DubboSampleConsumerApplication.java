package com.mangxiao.samples.dubbo.consumer;

import com.mangxiao.samples.dubbo.provider.model.Student;
import com.mangxiao.samples.dubbo.provider.service.StudentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class DubboSampleConsumerApplication {

//    @DubboReference(version = "1.0.0")
//    private StudentService studentService;

    public static void main(String[] args) {
//        SpringApplication.run(DubboSampleConsumerApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring/dubbo-samples-ws-consumer.xml" });
        context.start();
        StudentService studentService = (StudentService)context.getBean("studentService");
        List<Student> dataList = studentService.getAll();
        System.out.println("====dataList:" + dataList.toString());
    }

}
