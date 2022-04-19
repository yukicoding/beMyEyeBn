package com.daniel.bemyeyebn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.daniel.bemyeyebn.mapper")
@SpringBootApplication
public class BeMyEyeBnApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeMyEyeBnApplication.class, args);
    }

}
