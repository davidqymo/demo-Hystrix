package com.test.demo.demohello2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

    @GetMapping(path="/hello")
    @ResponseBody
    public String sayHi()
    {
        return "Hello2 World!!";
    }

}