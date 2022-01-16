package com.cgc.horizon0.account.restapi;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.cgc.horizon0.account.adator.restful.PublicRestApisAsync;
import com.cgc.horizon0.account.vo.Country;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@Path("/api/countries")
public class CountryResource {

    @Inject
    @RestClient
    PublicRestApisAsync commonOpenApisService;

    @ConfigProperty( name = "quarkus.profile" )
    String currentProfile;

    @Inject
    Logger logger;
    /**
     * agent calling an api to get payload from another microservice or open API.
     * max retries 3 times.
     * fallbacks on default empty json array payload.
     * @param name - country name in lowercase (e.g. peru)
     * @return List<JsonArray> (CompletionStage - the future of the http api payload)
     */
    @GET
    @Path("/name/{name}")
    @Retry(maxRetries = 3)
    @Fallback(fallbackMethod = "getCountryDefault")
    public CompletionStage<Set<Country>> getCountry(@PathParam("name") String name){
        logger.info("Current Profile:" + currentProfile);

        return commonOpenApisService.getCountryJsonByName(name);
    }

    /**
     * default empty json array for fallback of get-country-by-name.
     * @param name - @PathParam("name") String name
     * @return List<JsonArray> (CompletionStage - the future of the http api payload)
     */
    public CompletionStage<Set<Country>> getCountryDefault(String name) {
        Set<Country> defaultRes = new HashSet<Country>();
        defaultRes.add(Country.of("China", "cn", "Beijing"));
        return CompletableFuture.completedStage(defaultRes);
    }
}
