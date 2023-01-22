package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
