/*
package com.itheima.service.impl;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {

        Long count = empMapper.count();

        Integer start = (page - 1) * pageSize;
        List<Emp> empList = empMapper.page(start,pageSize,page, pageSize,name,gender,begin,end);

        PageBean pageBean = new PageBean(count,empList);
        return pageBean;


    }


}
*/
