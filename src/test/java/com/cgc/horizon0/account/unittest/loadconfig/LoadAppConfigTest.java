package com.cgc.horizon0.account.unittest.loadconfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class LoadAppConfigTest {

    @ConfigProperty( name = "quarkus.profile" )
    String currentProfile;

    @Test
    void readCurrentProfile(){
        assertEquals("test", currentProfile);
    }

}
