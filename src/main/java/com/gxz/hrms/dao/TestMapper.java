package com.gxz.hrms.dao;

import com.gxz.hrms.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TestMapper {

    List<Test> queryAllTest();
}
