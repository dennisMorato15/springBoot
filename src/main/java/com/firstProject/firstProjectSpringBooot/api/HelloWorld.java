package com.firstProject.firstProjectSpringBooot.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
    @RequestMapping(value = "hello")
    public String hello() {
        return "Hello World";
    }
}
