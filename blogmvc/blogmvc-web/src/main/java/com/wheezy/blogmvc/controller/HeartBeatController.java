package com.wheezy.blogmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/heartbeat")
public class HeartBeatController {

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "I'm alive!";
    }

}