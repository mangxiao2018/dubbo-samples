package com.mangxiao.samples.hessian.consumer.controller;

import com.mangxiao.dubbo.samples.common.model.Student;
import com.mangxiao.dubbo.samples.common.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UniversityService universityService;

    @ResponseBody
    @RequestMapping(value = "/index")
    public List<Student> index(@RequestParam("uid")String uid){
        System.out.println("#####################uid:" + uid);
        List<Student> dataList = universityService.getStudents();
        return dataList;
    }
}
