package com.xyj.xyjuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xyj.xyjuser.mapper")
public class XyjUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(XyjUserApplication.class, args);
    }

}
