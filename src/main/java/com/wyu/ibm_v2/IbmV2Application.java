package com.wyu.ibm_v2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wyu.ibm_v2.mapper")
public class IbmV2Application {

    public static void main(String[] args) {
        SpringApplication.run(IbmV2Application.class, args);
    }

}
