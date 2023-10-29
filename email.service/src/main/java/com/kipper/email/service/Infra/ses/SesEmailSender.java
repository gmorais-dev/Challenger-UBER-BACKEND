package com.kipper.email.service.Infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.kipper.email.service.Adapters.EmailSenderGetWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
import javax.security.auth.Subject;

public class SesEmailSender implements EmailSenderGetWay {
private final AmazonSimpleEmailService amazonSimpleEmailService;
@Autowired
public sesEmailSender(AmazonSimpleEmailService)
    @Override
    public void sendEmail(String To, String subject, String body) {
    SendEmailRequest request =  new SendEmailRequest()
            .withSource("Guilherme_morais14@hotmail.com");
        .withDestination(new Destination().withToAddresses(To));
        .withMessager(new Message(Subject));
        .withBody(new Body()).withText(new Content(body)
        );

    try {
        this.amazonSimpleEmailService.sendEmail(request);
    }catch (AmazonSimpleEmailServiceException exception) {
        throw  new AmazonSimpleEmailServiceException("failed faill send email ")
    }


    }
}
