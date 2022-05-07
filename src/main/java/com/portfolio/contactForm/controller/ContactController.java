package com.portfolio.contactForm.controller;

import com.portfolio.contactForm.model.Contact;
import com.portfolio.contactForm.repository.ContactRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ContactController {
    @Autowired
    ContactRespository contactRespository;
    @PostMapping("/upload-contact")
    public Contact uploadContact( @RequestBody Contact contact ){
       return contactRespository.save ( contact );
    }



}
