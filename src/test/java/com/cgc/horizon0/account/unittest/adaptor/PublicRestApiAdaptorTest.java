package com.cgc.horizon0.account.unittest.adaptor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.wildfly.common.Assert.assertTrue;

import java.util.Set;

import javax.inject.Inject;

import com.cgc.horizon0.account.adator.restful.PublicRestApiSync;
import com.cgc.horizon0.account.adator.restful.PublicRestApisAsync;
import com.cgc.horizon0.account.vo.Country;

// import lombok.SneakyThrows;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@Disabled
@QuarkusTest
public class PublicRestApiAdaptorTest {

    @Inject
    @RestClient
    private PublicRestApisAsync praa;

    @Inject
    Logger log;

    // @SneakyThrows
    @Test
    public void testGetCountryByNameCallingAsync() throws Exception {
        Set<Country> results = praa.getCountryJsonByName("peru").toCompletableFuture().get();
        assertTrue(results.size() == 1);
        Country result = results.iterator().next();
        log.info(result.toString());        
    }

    @Inject
    @RestClient
    private PublicRestApiSync pras;

    @Test
    public void testGetCountryByNameCallingSync(){
        Set<Country> results = pras.getByName("peru");
        assertTrue(results.size()==1);
        assertEquals("Peru", results.iterator().next().name);
    }
}
