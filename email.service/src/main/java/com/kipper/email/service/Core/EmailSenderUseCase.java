package com.kipper.email.service.Core;

public interface EmailSenderUseCase {
    void sendEmail(String To, String subject, String body);
}
