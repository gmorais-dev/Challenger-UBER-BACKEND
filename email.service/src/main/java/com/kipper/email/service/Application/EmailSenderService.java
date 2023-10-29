package com.kipper.email.service.Application;

import com.kipper.email.service.Adapters.EmailSenderGetWay;
import com.kipper.email.service.Core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {
    private final EmailSenderGetWay emailSendGetWay;

    @Autowired
    public  EmailSenderService(EmailSenderGetWay emailGetway){
    this.emailSendGetWay = emailGetway;
}
    @Override
    public void sendEmail(String To, String subject, String body) {
   this.emailSendGetWay.sendEmail(To, subject, body);
}
}

