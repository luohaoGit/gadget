package com.github.wx.gadget.controller;

import com.github.wx.gadget.dbo.Tear;
import com.github.wx.gadget.service.TearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TearService tearService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!..";
    }

    @RequestMapping(value = "/test")
    public List<Tear> test(){
        return tearService.allTears();
    }

}