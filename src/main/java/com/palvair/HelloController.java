package com.palvair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("hello")
    public String hello() {
        LOGGER.info("Hello");
        return "Hello";
    }

    @PostMapping("/say/hello")
    public void sayHello(@RequestBody final String message) {
        LOGGER.info("Message =  {}", message);
    }
}
