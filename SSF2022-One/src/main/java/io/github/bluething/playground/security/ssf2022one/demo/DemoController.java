package io.github.bluething.playground.security.ssf2022one.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello!";
    }
}
