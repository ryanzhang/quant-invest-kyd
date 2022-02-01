package com.cgc.horizon0.account.unittest.restapi;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@Disabled
@QuarkusTest
public class PrivateTlsRestApisRemoteCallTest {

    @Test
    public void testGetCountryByNameApi() {
        given()
                .when().get("/api/countries/name/china")
                .then()
                .statusCode(200)
                .body("[0].name", is("China"),
                        "[0].capital", is("Beijing")                        
                );
    }
}
