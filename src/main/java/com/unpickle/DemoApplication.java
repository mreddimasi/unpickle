package com.unpickle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoApplication {

    @RequestMapping("/demo")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}