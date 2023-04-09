package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete(){
         empMapper.delete(17);
    }

    @Test
    public void testGetById() {
        Emp emp = empMapper.getById(12);
        System.out.println(emp);
    }

}
