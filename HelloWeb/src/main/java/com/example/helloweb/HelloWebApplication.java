package com.example.helloweb;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class HelloWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWebApplication.class, args);
    }

}
