package com.jirafik.security.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        UserDetails jwt = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return "<h1> Hello " +jwt.getUsername() + " from secured method </h1>";
    }

    @GetMapping("/public/hello")
    public String getPublicHello() {
        return "<h1> Hello from public Spring MVC controller </h1>";
    }
}
