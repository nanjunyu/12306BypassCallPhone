package com.trainticket.tk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan(basePackages = { "com.trainticket.tk.controller","com.trainticket.tk.service" })
@SpringBootApplication
@EnableAsync //开启异步调用
public class TkApplication {
    public static void main(String[] args) {
        SpringApplication.run(TkApplication.class, args);
    }

}

