package com.example.demo;

import ch.sbb.esta.openshift.gracefullshutdown.GracefulshutdownSpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        GracefulshutdownSpringApplication.run(DemoApplication.class, args);
//        SpringApplication.run(DemoApplication.class, args);
    }

}
