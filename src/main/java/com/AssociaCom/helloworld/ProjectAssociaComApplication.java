package com.AssociaCom.helloworld;

import com.AssociaCom.helloworld.service.AssociationService;
import com.AssociaCom.helloworld.service.EmailService;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;


@SpringBootApplication
public class ProjectAssociaComApplication implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(ProjectAssociaComApplication.class, args);
        //JavaMailSender javaMailSender = new JavaMailSenderImpl();

        // Step 2: Instantiate EmailService
        //EmailService emailService = new EmailService(javaMailSender);
        //emailService.send("amriry9@gmail.com", "Subject", "Body");

    }


   @Override
   public void run(String... args) {
       // Setup properties for SMTP
       Properties props = new Properties();
       props.put("mail.smtp.host", "smtp.gmail.com");
       props.put("mail.smtp.port", "587");
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.starttls.enable", "true"); // Enables STARTTLS

       // Create a new session with the authenticator
       Session session = Session.getInstance(props, new Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication("yassinamrir49@gmail.com", "19492006@@");
           }
       });

       try {
           // Compose the email
           Message message = new MimeMessage(session);
           message.setFrom(new InternetAddress("yassinamrir49@gmail.com"));
           message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("amriry9@gmail.com"));
           message.setSubject("Test Email from Java");
           message.setText("Hello, this is a test email sent from Java application!");

           // Send the email
           Transport.send(message);
           System.out.println("Email sent successfully!");

       } catch (MessagingException e) {
           throw new RuntimeException(e);
       }







      /* try {
           System.out.println("Testing email service...");
           emailService.sendEmail(
                   "amriry9@gmail.com", // Replace with recipient email
                   "This is a test email body.",
                   "Test Email Subject"
           );
           System.out.println("Email sent successfully!");
       } catch (Exception e) {
           System.err.println("Error sending email: " + e.getMessage());
           e.printStackTrace();
       }
    }*/


   }
}
