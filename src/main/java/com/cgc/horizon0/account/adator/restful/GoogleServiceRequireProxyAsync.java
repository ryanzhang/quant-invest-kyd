package com.cgc.horizon0.account.adator.restful;

import java.util.concurrent.CompletionStage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/")
@RegisterRestClient(configKey = "google-api")
public interface GoogleServiceRequireProxyAsync {

    @GET
    @Path("/")
    CompletionStage<String> fetchWithoutAuthentication();
  
}
