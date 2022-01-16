package com.cgc.horizon0.account.restapi;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/api")
public class CommonResource {

    @Inject
    Logger log;

    @GET
    @Path("testerrorhandle")
    @Produces(MediaType.APPLICATION_JSON)
    public Object testErrorHandling(){
        throw new RuntimeException("No one is perfect!");
    }

}
