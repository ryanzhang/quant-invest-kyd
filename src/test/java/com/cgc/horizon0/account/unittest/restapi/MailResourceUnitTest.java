package com.cgc.horizon0.account.unittest.restapi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.inject.Inject;

import com.cgc.horizon0.account.adator.email.EmailService;
import com.cgc.horizon0.account.vo.EmailRecipientVO;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

@QuarkusTest
class MailResourceUnitTest {

	private static final String to = "rzhang@redhat.com";


	@Inject
	EmailService emailService;

	//To Fix
	// @Test
	public void testMockitoEmailService(){
		EmailService es = Mockito.mock(EmailService.class);
		EmailRecipientVO r = new EmailRecipientVO(to);
		Mockito.when(es.send(r, "test", "test")).thenReturn(true);
		//QuarkusMock.installMockForType(es, EmailService.class);
		assertTrue(es.send(r, "test", "test"));
	}

	@Test
    public void testVerifyEmail(){
        String verificationKey = "920c50c9-2a74-47fd-ac49-c17df8b2411f";
//insert verification key to table
        String username = "johndoe";
        given()
                .when().get("api/mail/verify?verificationKey="+verificationKey+"&username="+username)
                .then().log().all()
                .statusCode(200)
                .body(containsString("<h1>Your email is verified.</h1>"));
    }
}
