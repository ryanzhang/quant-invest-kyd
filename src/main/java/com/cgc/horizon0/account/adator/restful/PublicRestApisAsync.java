package com.cgc.horizon0.account.adator.restful;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.cgc.horizon0.account.vo.Country;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v2")
@RegisterRestClient(configKey = "countries-api")
public interface PublicRestApisAsync {

    @GET
    @Path("/name/{name}")
    CompletionStage<Set<Country>> getCountryJsonByName(@PathParam("name") String name);
  
}
