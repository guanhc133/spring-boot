package com.guan.moduleone.sprinboot.applicationTest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION:
 * Create on:2017/11/30,16:17
 *
 * @author guanhc
 */
@RestController
@RequestMapping("springboot")
public class HelloWordController {

    @RequestMapping(value = "/{name}")
    public String helloWord(@PathVariable("name") String name) {
        return "Hello   " + name;
    }
}
