package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.gcu" })
public class Topic51Application {

    public static void main(String[] args) {
        SpringApplication.run(Topic51Application.class, args);
    }
}
