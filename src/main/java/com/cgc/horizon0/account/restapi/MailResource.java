package com.cgc.horizon0.account.restapi;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.quarkus.qute.Template;
import io.smallrye.common.annotation.Blocking;

import java.time.LocalDateTime;
import java.util.HashMap;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/mail")
public class MailResource {

    @Inject
    Mailer mailer;

    @GET
    @Path("/postmail")
    @Blocking
    public void sendingHtml(){
        String body = "<strong>Hello!</strong>" + "\n" +
                "<p>Here is an image for you: <img src=\"cid:my-image@quarkus.io\"/></p>" +
                "<p>Regards</p>";
        mailer.send(Mail.withHtml("ryan.zhangcheng@qq.com", "testing email from quarkus", body));
    }

    @Inject
    Template emailVerificationSuccessful;

    @Path("/notify")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sendEmailVerification(@QueryParam("username") String username) {

        // emailVerificationService.sendRegistrationEmailVerification(username);
        return Response.status(Response.Status.OK).entity(
                new HashMap<String, String>() {{
                    put("code", "200");
                    put("msg", "testing");
                    put("timestamp", LocalDateTime.now().toString());
                }}).build();
    }

    @Path("/verify")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String verifyEmail(@QueryParam("verificationKey") String verificationKey, @QueryParam("username") String username){

        return emailVerificationSuccessful.render();
    }

}
