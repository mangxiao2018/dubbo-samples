package com.mangxiao.dubbo.samples.common.service;



import com.mangxiao.dubbo.samples.common.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student getStuById(Long id);

    Student getStuByNo(String stuNo);

    boolean save(Student student);

    boolean update(Student student);

    boolean delete(String stuNo);

}
