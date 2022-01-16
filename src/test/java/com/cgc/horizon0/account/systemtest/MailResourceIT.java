package com.cgc.horizon0.account.systemtest;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import com.cgc.horizon0.account.adator.email.EmailService;
import com.cgc.horizon0.account.vo.EmailRecipientVO;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.quarkus.mailer.MockMailbox;
import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;
// import io.quarkus.test.junit.mockito.InjectMock;

@QuarkusTest
class MailResourceIT {

	private static final String to = "shabir.umar@outlook.com";

	private static Mail mail;

	@Inject
	EmailService emailService;

	// @InjectMock
	// Mailer mailer;

	// @BeforeAll
	// public static void setup() {
	// 	mail = Mail.withHtml(to, "welcome to quarkus", "<h1>Quarkus</h1>");
	// 	Mailer mock = Mockito.mock(Mailer.class);
	// 	doNothing().when(mock).send(mail);
	// }
	@BeforeAll
	public static void setup() {

	}

	// @Inject
	// MockMailbox mockMailBox;

	// @BeforeEach
	// void init() {
	// 	mockMailBox.clear();
	// }

	// @Inject
	// MockEmailService emailService;


	// @Test
	public void sendEmail() {
		/*
		 * given().contentType(MediaType.APPLICATION_JSON).body("{\"to\":\""+to
		 * +"\"}").when().post("/mail").then().log().all().statusCode(200); List<Mail>
		 * sent=mockMailBox.getMessagesSentTo(to); assertThat(sent).hasSize(1); Mail
		 * actualMail=sent.get(0);
		 * assertThat(actualMail.getText()).contains("quarkus testing");
		 */
	}

	@Test
	public void testMockitoEmailService(){
		EmailService es = Mockito.mock(EmailService.class);
		EmailRecipientVO r = new EmailRecipientVO(to);
		Mockito.when(es.send(r, "test", "test")).thenReturn(true);
		//QuarkusMock.installMockForType(es, EmailService.class);
		assertTrue(es.send(r, "test", "test"));
	}
	@Test
	public void sendEmailRestAPI() {
		given().contentType(MediaType.APPLICATION_JSON).body("{\"to\":\"" + to + "\"}").when().post("/mail").then()
				.log().all().statusCode(204);
	}
}
