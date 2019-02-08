package com.test.demoribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
    @HystrixCommand(fallbackMethod = "hiError",threadPoolProperties =
            {@HystrixProperty(name="coreSize",value="30"),
            @HystrixProperty(name="maxQueueSize",value="-1")})
    public String testDefaultRibbon() {
        String forObject = restTemplate.getForObject("http://helloservice/hello", String.class);

        return forObject;
    }

    public String hiError()
    {
        return "Error in processing the request";
    }
}
