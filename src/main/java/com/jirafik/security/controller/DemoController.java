package com.jirafik.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Random;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/hello")
    public String getHello(Principal principal) {

        return "<h3> Hello " + principal.getName() + ". \n Random integer: " + new Random().nextInt() + "  </h3>";
    }

}
