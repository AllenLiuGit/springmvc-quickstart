package com.legend.springmvc.quickstart.resources;

import com.legend.springmvc.quickstart.datas.GlobalResponse;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by allen on 7/25/16.
 */
@Controller
@Path(value = HelloWorldResource.HELLOWORLD_URL)
public class HelloWorldResource {
    public static final String HELLOWORLD_URL = "/helloworld";

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("say/{lastName}")
    public GlobalResponse sayHello(@PathParam("lastName") String lastName) {
        return new GlobalResponse(GlobalResponse.SUCCESS, "Hello, " + lastName);
    }
}
