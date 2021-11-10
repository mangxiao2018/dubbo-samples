package com.mangxiao.samples.dubbo.testng.testcase;

import com.mangxiao.dubbo.samples.common.model.Student;
import com.mangxiao.dubbo.samples.common.service.StudentService;
import com.mangxiao.samples.dubbo.testng.test.TestCaseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

public class StudentServiceTestCase extends TestCaseBase {

    @Autowired
    public StudentService studentService;


    @Test
    public void testGetStudents(){
        List<Student> dataList = studentService.getAll();
        for (Student st:dataList){
            System.out.println("students:" + st.toString());
        }
    }
}
