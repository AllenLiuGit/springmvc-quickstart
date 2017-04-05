package com.legend.springmvc.quickstart.hystrix;

/**
 * Created by allen on 05/04/2017.
 */
public class HystrixApp {
    public static void main(String[] args) {
//        HelloWorldCommand helloWorldCommand = new HelloWorldCommand("Bob");
//        String result = helloWorldCommand.execute();
//        System.out.println(result);
        HelloWorld2Command helloWorld2Command = new HelloWorld2Command();
        String result = helloWorld2Command.sayHello("Bob");
        System.out.println(result);
    }
}
