package com.gxz.hrms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test implements Serializable {
    private Integer id;
    private String name;
}
