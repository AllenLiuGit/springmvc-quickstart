package com.legend.springmvc.quickstart.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * Created by allen on 05/04/2017.
 */
public class HelloWorldCommand extends HystrixCommand<String> {
    /**
     * name
     */
    private final String name;

    /**
     * Constructor
     * @param name name
     */
    public HelloWorldCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }
    /**
     * Actual content
     * @return result
     * @throws Exception exp
     */
    protected String run() throws Exception {
        // return "Hello " + this.name + "!";
        throw new RuntimeException("Failed Execute normally!");
    }

    @Override
    protected String getFallback() {
        return "Fail " + this.name + "!";
    }
}
