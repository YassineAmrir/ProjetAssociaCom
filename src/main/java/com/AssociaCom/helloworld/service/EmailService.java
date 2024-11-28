package com.AssociaCom.helloworld.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.bridge.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@NoArgsConstructor
public class EmailService {
    private static final Logger LOGGER = LogManager.getLogger(EmailService.class);

    //"Post office" how charged of sending email
    @Autowired
    private  JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    public void sendEmail (String to , String email , String objet )
    {
        send(to,email,objet);
    }

    @Async
    public void send(String to, String email, String objet)
    {
        try {
            //it's the build of the message that you want to create
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            //Help you to work with MimeMessage
            MimeMessageHelper helper =
                    new MimeMessageHelper(mimeMessage, "utf-8");
            helper.setTo(to);
            helper.setSubject(objet);
            helper.setText(email);
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
           // LOGGER.error("failed to send email", e);
            //throw new IllegalStateException("failed to send email");
            LOGGER.error("Failed to send email to {}: {}", to, e.getMessage());
            throw new IllegalStateException("Failed to send email", e);
        }
    }
}
