package com.legend.springmvc.quickstart.impl;

import com.legend.springmvc.quickstart.HelloWorldService;
import com.legend.springmvc.quickstart.JdbcProperties;
import com.legend.springmvc.quickstart.hystrix.HelloWorld2Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by allen on 7/25/16.
 */
@Controller
public class HelloWorldServiceImpl implements HelloWorldService {
    @Autowired
    private JdbcProperties jdbcProperties;
    @Autowired HelloWorld2Command helloWorld2Command;

    @RequestMapping(value = "/hello/{msg}")
    @ResponseBody
    public String hello(@PathVariable(value = "msg") String paramHello) {
        String result = helloWorld2Command.sayHello("Bob");

        return "Hello World " + paramHello + "; driver=" + jdbcProperties.getDriver()
                + "; url=" + jdbcProperties.getUrl() + "; username=" + jdbcProperties.getUsername()
                + "; password=" + jdbcProperties.getPassword() + "; result=" + result;
    }
}
