package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController

public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public Result list(){
        log.info("查询全部部门数据");
        List<Student> studentList = studentService.list();
        return Result.success(studentList);
    }
}
