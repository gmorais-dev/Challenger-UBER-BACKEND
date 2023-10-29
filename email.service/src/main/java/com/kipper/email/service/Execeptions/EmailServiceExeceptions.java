package com.kipper.email.service.Execeptions;

import org.apache.logging.log4j.message.Message;

public class EmailServiceExeceptions extends runtimeExeceptions {
    super(Message);

    public EmailServiceExeceptions(String Message, throwable Casual) {
        super(Message, Casual);
    }
}

