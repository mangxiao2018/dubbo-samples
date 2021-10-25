package com.mangxiao.samples.dubbo.provider.service.impl;

import com.mangxiao.samples.dubbo.provider.model.Student;
import com.mangxiao.samples.dubbo.provider.service.StudentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

@DubboService(version = "1.0.0")
public class StudentServiceImpl implements StudentService {
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
    @Override
    public List<Student> getAll() {
        List<Student> dataList = new ArrayList<>();
        Student student = new Student();
        student.setStuNo("20211022001");
        student.setChineseScore(89);
        student.setMathScore(67);
        student.setEnglishScore(98);
        dataList.add(student);
        return dataList;
    }

    @Override
    public Student getStuById(Long id) {
        return null;
    }

    @Override
    public Student getStuByNo(String stuNo) {
        return null;
    }

    @Override
    public boolean save(Student student) {
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(String stuNo) {
        return false;
    }
}
