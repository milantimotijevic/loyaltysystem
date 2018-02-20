package com.loyalty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/test")
    public String test() {
        return "Test successful. Loyalty system online";
    }

    public String drawInfo() {
        return "You have accessed critical draw information!";
    }
}
