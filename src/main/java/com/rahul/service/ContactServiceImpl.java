package com.rahul.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.constant.AppConstant;
import com.rahul.entity.Contact;
import com.rahul.repository.ContactRepository;

@Service
public class ContactServiceImpl   implements  ContactService{
	
	@Autowired
	private ContactRepository contactRepository;
	

	@Override
	public boolean saveContact(Contact contact) {
		
		contact.setIsactive(AppConstant.YES);
		
		Contact save = this.contactRepository.save(contact);
		
		if(save !=null && save.getContactid() !=null)
		{
			return true;
		}
		
		return false;
	}


	@Override
	public List<Contact> getAllContacts() {
	
		List<Contact> findAll = contactRepository.findAll();
		
		
		return findAll.stream()
				.filter(contact -> contact.getIsactive()== AppConstant.YES)
				.collect(Collectors.toList());
	}


	@Override
	public Contact getConatactById(Integer conatactId) {
		
		Optional<Contact> findById = contactRepository.findById(conatactId);
		
		
		if(findById.isPresent())
		{
			return findById.get();		
	}
		
		return null;
	}


	@Override
	public boolean deleteConatactById(Integer contactId) {
		Optional<Contact> findById = contactRepository.findById(contactId);
		
		if(findById.isPresent())
		{
			Contact contact = findById.get();
			
			//This is for Soft delete
			contact.setIsactive(AppConstant.NO);
			contactRepository.save(contact);
		
			
			
			//This is for hard delete 
			//	contactRepository.delete(contact);
			return true;
		}
		return false;
	}


		}
