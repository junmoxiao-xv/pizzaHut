package com.xyj.xyjmenu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xyj.xyjmenu.mapper")
public class XyjMenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(XyjMenuApplication.class, args);
    }

}
