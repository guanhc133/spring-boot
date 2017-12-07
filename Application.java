package com.guan.moduleone.sprinboot.applicationTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION:
 * Create on:2017/11/30,15:50
 *
 * @author guanhc
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String greeting() {
        return "MY FIRST SPRINGBOOT PROJECT!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
