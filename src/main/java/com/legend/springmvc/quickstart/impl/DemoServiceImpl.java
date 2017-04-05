package com.legend.springmvc.quickstart.impl;

import com.legend.springmvc.quickstart.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by allen on 22/12/2016.
 */
@Component(value = "demoService")
public class DemoServiceImpl implements DemoService {
    public String demo(String name) {
        return "Demo: " + name;
    }

    public String hello(String name) {
        return name;
    }
}