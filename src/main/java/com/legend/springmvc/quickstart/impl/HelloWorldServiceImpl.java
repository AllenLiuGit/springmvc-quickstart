package com.legend.springmvc.quickstart.impl;

import com.legend.springmvc.quickstart.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by allen on 7/25/16.
 */
// @Component(value = "helloWorldService")
@Controller
public class HelloWorldServiceImpl implements HelloWorldService {

    @RequestMapping(value = "/hello/{msg}")
    @ResponseBody
    public String hello(@PathVariable(value = "msg") String paramHello) {
        return "Hello World " + paramHello;
    }
}
