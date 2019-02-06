package com.test.demoribbon;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrimConfig {
        @Bean
        public ServletRegistrationBean hystrixMetricsStreamServlet() {
            ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
            registration.addUrlMappings("/hystrix.stream");
            return registration;
        }
    }
