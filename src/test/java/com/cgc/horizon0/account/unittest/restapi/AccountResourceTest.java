package com.cgc.horizon0.account.unittest.restapi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
public class AccountResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/api/equity")
                .then()
                .statusCode(200)
                .body("Majesty", equalTo("Welcome to Quant Invest!"));

    }

}
