package com.jirafik.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/secured/hello")
    public String getHello(Principal principal) {

        return "<h1> Hello " + principal.getName() + " from secured method </h1>";
    }

    @GetMapping("/public/hello")
    public String getPublicHello() {
        return "<h1> Hello from public Spring MVC controller </h1>";
    }
}
