package com.mangxiao.samples.dubbo.provider.service;

import com.mangxiao.samples.dubbo.provider.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student getStuById(Long id);

    Student getStuByNo(String stuNo);

    boolean save(Student student);

    boolean update(Student student);

    boolean delete(String stuNo);

}
