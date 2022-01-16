package com.cgc.horizon0.account.adator.email;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.cgc.horizon0.account.vo.EmailRecipientVO;

import org.jboss.logging.Logger;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;

@ApplicationScoped
public class EmailService {
    @Inject
    Logger log;

    @Inject
    Mailer mailer;

    public boolean send(EmailRecipientVO recipient, String subject, String body){
        try {
            mailer.send(Mail.withHtml(recipient.getTo(), subject, body));
            return true;
            
        } catch (Exception e) {
            //TODO: handle exception
            log.error(e);
            e.printStackTrace();
            return false;
        }

    }
    
}
