package com.gxz.hrms.controller;

import com.gxz.hrms.dao.TestMapper;
import com.gxz.hrms.entity.Test;
import com.gxz.hrms.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    TestService testService;

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/queryAll")
    public List<Test> queryAll(){
        return testService.queryAllTest();
    }
}
