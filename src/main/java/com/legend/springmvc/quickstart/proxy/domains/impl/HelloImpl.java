package com.legend.springmvc.quickstart.proxy.domains.impl;

import com.legend.springmvc.quickstart.proxy.domains.Hello;

/**
 * Created by allen on 27/03/2017.
 */
public class HelloImpl implements Hello {
    public void say(String name) {
        System.out.println("Hello, " + name);
    }
}
