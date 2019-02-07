package demo.test.hello4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

    @GetMapping(path="/hello")
    @ResponseBody
    public String sayHi()
    {
        return "Hellow World!! from service 4";
    }

}
