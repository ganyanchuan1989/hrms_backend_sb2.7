package com.gxz.hrms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gxz.hrms.dao")
public class HrmsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmsBackendApplication.class, args);
    }

}
