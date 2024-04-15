package com.bdqn.ww.mybatis.mapper;

import com.bdqn.ww.mybatis.pojo.Students;

import java.util.List;

//请写成接口 mybatis是一个绝对的面向接口编程
public interface StudentsMapper {
    int addStu();
   Students getStudentById();

}
