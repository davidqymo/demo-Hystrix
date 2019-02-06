package com.test.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

    @GetMapping(path="/hello")
    @ResponseBody
    public String sayHi()
    {
        return "Hellow World!!";
    }

}
