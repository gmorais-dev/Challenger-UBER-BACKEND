package com.kipper.email.service.Controller;

import com.kipper.email.service.Execeptions.EmailServiceExeceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Email")

public class EmailSenderController {
    private final EmailSenderService emailSenderService;
    @Autowired
    public EmailSenderController(EmailSenderService){
        this.emailSenderService = new EmailSenderService()
    }
    @PostMapping()
        public ResponseEntity<String> sendEmail(@RequestBody, EmailRequest request){
        try {
            this.emailSenderService.sendEmail(request.to, request.subject, request.body);
            return ResponseEntity.ok("email send succesfully!");

        }catch (EmailServiceExeceptions execeptions){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error while sending email");
        }
    }
}
