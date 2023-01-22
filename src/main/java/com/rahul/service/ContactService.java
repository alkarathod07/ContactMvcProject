package com.rahul.service;

import java.util.List;

import com.rahul.entity.Contact;

public interface ContactService {
	
	
	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	
	public Contact getConatactById(Integer conatactId);
	
	
	public boolean deleteConatactById(Integer contactId);
	
	
	
	
	
	
	
}
