package com.cgc.horizon0.account.unittest.adaptor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;
import javax.json.JsonObject;

import com.cgc.horizon0.account.adator.restful.PrivateRestApiSync;

// import lombok.SneakyThrows;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PrivateTlsRestApiAdaptorTest {

    @Inject
    @RestClient
    private PrivateRestApiSync pras;

    @Inject
    Logger log;


}
