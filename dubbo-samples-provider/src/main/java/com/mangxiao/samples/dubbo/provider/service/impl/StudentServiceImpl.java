package com.mangxiao.samples.dubbo.provider.service.impl;

import com.mangxiao.dubbo.samples.common.model.Student;
import com.mangxiao.dubbo.samples.common.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@DubboService(version = "1.0.0")
@Component
public class StudentServiceImpl implements StudentService {

    public List<Student> getAll() {
        List<Student> dataList = new ArrayList<Student>();
        Student student = new Student();
        student.setStuNo("20211022001");
        student.setChineseScore(89);
        student.setMathScore(67);
        student.setEnglishScore(98);
        dataList.add(student);
        return dataList;
    }

    public Student getStuById(Long id) {
        return null;
    }

    public Student getStuByNo(String stuNo) {
        return null;
    }

    public boolean save(Student student) {
        return false;
    }

    public boolean update(Student student) {
        return false;
    }

    public boolean delete(String stuNo) {
        return false;
    }
}
