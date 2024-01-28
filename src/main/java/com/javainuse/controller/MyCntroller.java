package com.javainuse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCntroller {

    @RequestMapping("/test1")
    public String test() {
        return "Hello World1";
    }
}
