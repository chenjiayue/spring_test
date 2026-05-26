package org.example.springboot_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@Controller
public class TestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world!!!";
    }
    @RequestMapping(value = "/hello/post",method = RequestMethod.POST)
    public String helloPost(String name){
        return "hello world!!!" + name;
    }

}
