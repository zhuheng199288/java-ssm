package com.zhuheng.dao;

import com.zhuheng.daomain.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmpDao {
    @Insert("insert into emp (workno,name,gender,age,idcard,workaddress,entrydate) values(#{workno},#{name},#{gender},#{age},#{idcard},#{workaddress},#{entrydate})")
    public void save(Emp emp);

    @Update("update emp set workno = #{workno}, name = #{name}, gender = #{gender},gender=#{gender},age=#{age},idcard=#{idcard},workaddress = #{workaddress},entrydate=#{entrydate} where id = #{id}")
    public void update(Emp emp);

    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);

    @Select("select * from emp")
    public List<Emp> getAll();
}
