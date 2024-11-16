package com.AssociaCom.helloworld.service;

import com.AssociaCom.helloworld.dao.mapper.ContactUsMapper;
import com.AssociaCom.helloworld.dao.repository.ContactUsReository;
import com.AssociaCom.helloworld.model.ContactUs;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContactUsService {
    @Autowired
    private ContactUsReository contactUsReository;
    @Autowired
    private ContactUsMapper contactUsMapper;

    public void save(ContactUs contactUs)
    {
       contactUsReository.save(contactUsMapper.mapTo(contactUs));
    }

}
