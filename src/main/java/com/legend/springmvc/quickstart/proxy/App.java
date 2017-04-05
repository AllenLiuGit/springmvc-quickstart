package com.legend.springmvc.quickstart.proxy;

import com.legend.springmvc.quickstart.proxy.domains.Hello;
import com.legend.springmvc.quickstart.proxy.domains.impl.HelloImpl;
import com.legend.springmvc.quickstart.proxy.dynamics.CGLibProxy;
import com.legend.springmvc.quickstart.proxy.dynamics.DynamicProxy;
import com.legend.springmvc.quickstart.proxy.statics.HelloProxy;

import java.lang.reflect.Proxy;

/**
 * Created by allen on 27/03/2017.
 */
public final class App {
    private App() {
    }
    /**
     * @param args 入参
     */
    public static void main(String[] args) {
        // testDynamicsProxy();
        // testDynamicsProxy2();
        testCGLibDynamicProxy();
    }

    /**
     * test
     */
    public static void testStaticsProxy() {
        HelloProxy helloProxy = new HelloProxy();

        helloProxy.say("Allen");
    }

    /**
     * test dynamics proxy
     */
    public static void testDynamicsProxy() {
        Hello hello = new HelloImpl();

        DynamicProxy dynamicProxy = new DynamicProxy(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);

        helloProxy.say("Allen");
    }

    /**
     * test
     */
    public static void testDynamicsProxy2() {
        Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        Hello helloProxy = dynamicProxy.getProxy();

        helloProxy.say("Jack");
    }

    /**
     * test
     */
    public static void testCGLibDynamicProxy() {
        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("May");
    }
}
