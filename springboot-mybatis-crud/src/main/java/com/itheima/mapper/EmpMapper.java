package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpMapper {

    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);


    @Results({
            @Result(column = "dept_id",property = "deptId"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime")
    })
    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);
}
