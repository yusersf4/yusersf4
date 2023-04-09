package com.itheima.service.impl;

import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> list() {
        return studentMapper.list();
    }
}
