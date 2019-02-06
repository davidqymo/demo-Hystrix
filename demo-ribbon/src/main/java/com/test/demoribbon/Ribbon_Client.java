package com.test.demoribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
@Service
public class Ribbon_Client {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(path="/hello")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "hiError")
    public String testDefaultRibbon() {
        String forObject = restTemplate.getForObject("http://HELLO/hello", String.class);

        System.out.println("**********************");
        System.out.println(forObject);
        return forObject;
    }

    public String hiError()
    {
        return "Error in processing the request";
    }
}
