package com.gxz.hrms.services;

import com.gxz.hrms.dao.TestMapper;
import com.gxz.hrms.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public List<Test> queryAllTest(){
        return  testMapper.queryAllTest();
    }

}
