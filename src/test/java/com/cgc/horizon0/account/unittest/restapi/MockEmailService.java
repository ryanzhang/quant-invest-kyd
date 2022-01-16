package com.cgc.horizon0.account.unittest.restapi;

import javax.enterprise.context.ApplicationScoped;

import com.cgc.horizon0.account.adator.email.EmailService;
import com.cgc.horizon0.account.vo.EmailRecipientVO;


// @Mock
// @ApplicationScoped
public class MockEmailService extends EmailService{
    public boolean send(EmailRecipientVO recipient, String subject, String body){
        if(recipient.getTo().contains("@"))
            return true;
        else
            return false;
    }
}
