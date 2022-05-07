package com.portfolio.contactForm.repository;

import com.portfolio.contactForm.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRespository extends JpaRepository<Contact, String>{

}
