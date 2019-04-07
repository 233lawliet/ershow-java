package com.lutong.ershow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.lutong.ershow.mapper")
public class ErshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErshowApplication.class, args);
    }

}
