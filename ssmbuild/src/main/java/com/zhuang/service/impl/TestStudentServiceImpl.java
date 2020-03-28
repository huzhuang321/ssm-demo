package com.zhuang.service.impl;

import com.zhuang.dao.TestStudentMapper;
import com.zhuang.pojo.TestStudent;
import com.zhuang.service.TestStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 86175 on 2020/3/28.
 */
@Service
public class TestStudentServiceImpl implements TestStudentService {
    @Autowired
    private TestStudentMapper testStudentMapper;

    public int addTestStudent(TestStudent testStudent) {
        return testStudentMapper.addTestStudent(testStudent);
    }

    public int deleteTestStudentById(Long studentId) {
        return testStudentMapper.deleteTestStudentById(studentId);
    }

    public int updateTestStudent(TestStudent testStudent) {
        return testStudentMapper.updateTestStudent(testStudent);
    }

    public TestStudent selectTestStudentById(Long studentId) {
        return testStudentMapper.selectTestStudentById(studentId);
    }

    public List<TestStudent> selectAllTestStudent() {
        return testStudentMapper.selectAllTestStudent();
    }
}
