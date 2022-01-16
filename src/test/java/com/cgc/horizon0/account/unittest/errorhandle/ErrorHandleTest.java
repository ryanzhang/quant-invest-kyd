package com.cgc.horizon0.account.unittest.errorhandle;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;


@QuarkusTest
public class ErrorHandleTest {

    @Test
    public void returnStructureErrorCodeWhenRequestIsWrong(){
        
    }
    
    @Test
    void returnStructureErrorWhenThrowException(){
        given().when().get("/api/testerrorhandle")
        .then()
        .statusCode(200)
        .body("code", equalTo("500"))
        .body("msg", equalTo("No one is perfect!"));        
    }

}
