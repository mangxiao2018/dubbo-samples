package com.mangxiao.samples.hessian.consumer.service.impl;

import com.mangxiao.dubbo.samples.common.model.Student;
import com.mangxiao.dubbo.samples.common.service.StudentService;
import com.mangxiao.dubbo.samples.common.service.UniversityService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    @DubboReference(protocol = "hessian", version = "1.0.1",timeout=30000)
    StudentService studentService;

    public List<Student> getStudents() {
        List<Student> dataList = studentService.getAll();
        return dataList;
    }
}
