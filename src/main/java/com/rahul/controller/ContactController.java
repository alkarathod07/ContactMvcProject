package com.rahul.controller;

import java.net.BindException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.rahul.constant.AppConstant;
import com.rahul.entity.Contact;
import com.rahul.props.AppProps;
import com.rahul.service.ContactService;

@Controller
public class ContactController {
	
	
	@Autowired
	private ContactService  contactService;
	
	@Autowired
	private AppProps appProps;
	
	
//	@PreAuthorize("hasAuthority"("Role_Admin"))
	@GetMapping("/home")
	public String load()
	{
		return"Index";
	}
	
	@GetMapping("/contact") 
	public String loadControlform(Model model)
	{
		
		
		
		Contact contact = new Contact();
		
		model.addAttribute("contact", contact);
		
		return AppConstant.CONTACTINFO;
	}
	
	@PostMapping("/saveContact")
	public String saveContact(Contact contact ,Model model)
	{
		
		boolean save=contactService.saveContact(contact);
	
		Map<String , String> messages=appProps.getMessages();
		
		if(save)
		{
			model.addAttribute(AppConstant.SUCCESS, messages.get(AppConstant.SAVE_SUCCESS));
		}
		
		else
		{
			model.addAttribute(AppConstant.FAIL, messages.get(AppConstant.SAVE_FAIL));
		}
			return AppConstant.CONTACTINFO;
	
	}
	
	@GetMapping("/viewContacts")
	public String viewAllContact( Model model)
	{
		

		List<Contact> allContacts = contactService.getAllContacts();
		
		model.addAttribute(AppConstant.CONTACT, allContacts);
		
		return AppConstant.CONTACT;
	}
	
	
}



