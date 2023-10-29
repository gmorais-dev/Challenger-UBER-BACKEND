package com.kipper.email.service.Adapters;

public interface EmailSenderGetWay {
    void sendEmail(String To, String subject, String body);
}
