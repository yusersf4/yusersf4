package com.it;

import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class CustomerMapperTest extends TestCase {


    public SqlSession getSession() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();


        return sqlSession;
    }

    @Test
    public void testFindCustomerByName() throws Exception {
        SqlSession sqlSession = getSession();
        List<Customer> customers = sqlSession.selectList("com.it.CustomerMapper.findCustomerByName", "张");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        sqlSession.close();
    }

    @Test
    public void findCustomerByIdTest() throws Exception {
        SqlSession sqlSession = getSession();
        Customer customers = sqlSession.selectOne("com.it.CustomerMapper.findCustomerByName", 1);

            System.out.println(customers);

        sqlSession.close();
    }
    @Test
    public void addCustmoerTest() throws Exception {
        SqlSession sqlSession = getSession();
        Customer customer = new Customer();
        customer.setUsername("小白");
        customer.setJobs("学生");
        customer.setPhone("133323784123");
        int rows = sqlSession.insert("com.it.CustomerMapper.addCustomer",customer);
        if (rows > 0) {
            System.out.println("你成功插入了" + rows + "条数据！");
            System.out.println(customer);
        } else {
            System.out.println("执行插入操作失败！！！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateCustomerTest() throws Exception {
        SqlSession sqlSession = getSession();
        Customer customer = new Customer();
        customer.setId(4);
        customer.setUsername("rose");
        customer.setJobs("programmer");
        customer.setPhone("13332dsfdsf123");
        int rows = sqlSession.insert("com.it.CustomerMapper.updateCustomer",customer);
        if (rows > 0) {
            System.out.println("你成功修改了" + rows + "条数据！");
            System.out.println(customer);
        } else {
            System.out.println("执行修改操作失败！！！");
        }
        sqlSession.commit();
        sqlSession.close();
    }



}