package com.pratik.intellij.springproj.springbootintellij;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping(value = "/helloworld/{message}")
    public String helloWorld(@PathVariable(value="message") String message) {
        logger.info("hello there returingin  hola {}", message);
        testMethod();
        return message;
    }

    private void testMethod() {

    }
}
