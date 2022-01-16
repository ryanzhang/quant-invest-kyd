package com.cgc.horizon0.account.unittest.service;

import io.quarkus.qute.Template;
import io.quarkus.test.junit.QuarkusTest;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class QuteTemplateTest {

    @Inject
    Template registrationEmailVerification;

    @Inject
    Template emailVerificationSuccessful;

    @Inject
    Logger log;



    @Test
    public void testReturnHtmlPage(){
        String renderResult = emailVerificationSuccessful.render();
        assertTrue(renderResult.contains("<h1>Your email is verified.</h1>"));
    }

}
