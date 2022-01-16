package com.cgc.horizon0.account.systemtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class SomeSystemIT {
    
    @Test
    void someExternalTest(){
        assertTrue(2 == 1+1);
    }

}
