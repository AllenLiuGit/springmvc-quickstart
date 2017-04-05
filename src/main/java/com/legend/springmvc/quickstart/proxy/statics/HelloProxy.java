package com.legend.springmvc.quickstart.proxy.statics;

import com.legend.springmvc.quickstart.proxy.domains.Hello;
import com.legend.springmvc.quickstart.proxy.domains.impl.HelloImpl;

/**
 * Created by allen on 27/03/2017.
 */
public class HelloProxy implements Hello {
    private Hello hello;

    public HelloProxy() {
        this.hello = new HelloImpl();
    }

    public void say(String name) {
        before();

        hello.say(name);

        after();
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
