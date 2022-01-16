package com.cgc.horizon0.account.adator.restful;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/auth/realms/horizon0/.well-known/")
@RegisterRestClient(configKey = "private-tls-api")
public interface PrivateRestApiSync {

    @GET
    @Path("/openid-configuration")
    public JsonObject getOpenIdConfiguration();
    
}
