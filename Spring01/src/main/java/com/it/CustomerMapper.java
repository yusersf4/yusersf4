package com.it;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CustomerMapper {

        public Customer findCustomerById(int id);
        public Customer findCustomerByName(String value);

        public int addCustomer (Customer customer);

        public int updateCustomer (Customer customer);


        public int deleteCustomer (int id);
}
