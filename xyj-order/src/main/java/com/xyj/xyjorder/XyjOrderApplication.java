package com.xyj.xyjorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xyj.xyjorder.mapper")
public class XyjOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XyjOrderApplication.class, args);
    }

}
