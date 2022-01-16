package com.cgc.horizon0.account.restapi;

import com.cgc.horizon0.account.domain.Equity;
import com.cgc.horizon0.account.domain.enumerate.AccountType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletionStage;

@Path("/api/equity")
public class EquityResource {

    @Inject
    Logger log;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public HashMap greeting() {
        return new HashMap<String, String>(){{
            put("Majesty", "Welcome to Quant Invest!");
        }};
    }

}
