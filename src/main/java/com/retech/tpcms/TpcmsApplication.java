package com.retech.tpcms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.retech.tpcms.mapper")
public class TpcmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpcmsApplication.class, args);
    }

}
