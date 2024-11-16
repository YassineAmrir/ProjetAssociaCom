package com.AssociaCom.helloworld.dao.mapper;

import com.AssociaCom.helloworld.dao.entity.ContactUsEntity;
import com.AssociaCom.helloworld.model.ContactUs;
import org.springframework.stereotype.Component;

@Component
public class ContactUsMapper {
    public ContactUsEntity mapTo(ContactUs contactUs){
        return ContactUsEntity.builder()
                .email(contactUs.getEmail())
                .message(contactUs.getMessage())
                .name(contactUs.getName())
                .subject(contactUs.getSubject())
                .build();
    }
    public ContactUs mapTo(ContactUsEntity contactUsEntity){
        return ContactUs.builder()
                .email(contactUsEntity.getEmail())
                .message(contactUsEntity.getMessage())
                .name(contactUsEntity.getName())
                .subject(contactUsEntity.getSubject())
                .build();
    }
}
