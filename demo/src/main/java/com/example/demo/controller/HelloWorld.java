package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author biang
 * @date 2020/3/24-9:31
 */
@Controller
public class HelloWorld {

    @RequestMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){

        return "helloWorld";
    }
}
