package com.legend.springmvc.quickstart.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * Created by allen on 05/04/2017.
 */
@Component
public class HelloWorld2Command {
    @HystrixCommand(fallbackMethod = "fallback")
    public String sayHello(String name) {
        // return "Hello2 " + name + "!";
        throw new RuntimeException("Failed");
    }

    public String fallback(String name) {
        return "Graceful fallback " + name + "!";
    }
}
