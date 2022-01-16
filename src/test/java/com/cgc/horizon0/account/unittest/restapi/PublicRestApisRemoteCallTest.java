package com.cgc.horizon0.account.unittest.restapi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PublicRestApisRemoteCallTest {

    @Test
    public void testGetCountryByNameApi() {
        given()
                .when().get("/api/countries/name/peru")
                .then()
                .statusCode(200)
                .body("[0].name", is("Peru"),
                        "[0].capital", is("Lima")                        
                );
    }
}
