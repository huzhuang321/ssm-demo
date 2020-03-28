package com.zhuang.dao;

import com.zhuang.pojo.TestStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 86175 on 2020/3/28.
 */
public interface TestStudentMapper {
    //增加一个学生
    int addTestStudent(TestStudent testStudent);

    //删除一个学生
    int deleteTestStudentById(@Param("studentId") Long studentId);

    //更新一个学生
    int updateTestStudent(TestStudent testStudent);

    //查询一个学生
    TestStudent selectTestStudentById(@Param("studentId") Long studentId);

    //查询所有的学生
    List<TestStudent> selectAllTestStudent();
}
