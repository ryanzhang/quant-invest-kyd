package com.cgc.horizon0.account.adator.restful;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.cgc.horizon0.account.vo.Country;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/v2")
@RegisterRestClient(configKey = "countries-api")
public interface PublicRestApiSync {

    @GET
    @Path("/name/{name}")
    Set<Country> getByName(@PathParam String name);
    
}
