package demo.test.hello4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoHello4Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoHello4Application.class, args);
    }

}

