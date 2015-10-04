package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Test resource for the servlet3-webapp example.
 *
 * @author Adam Lindenthal (adam.lindenthal at oracle.com)
 */
@Path("dog")
public class DogResource {
    @GET
    @Produces("text/plain")
    public String bark() {
        return "Woof!";
    }
}
