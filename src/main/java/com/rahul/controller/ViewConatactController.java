package com.rahul.controller;

import java.net.BindException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.rahul.entity.Contact;
import com.rahul.service.ContactService;

@Controller
public class ViewConatactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/edit")
	public String editContact(@RequestParam("contactid") Integer contactid, Model model)
	{
		
		Contact contact = contactService.getConatactById(contactid);
		model.addAttribute("contact", contact);
		return "contactInfo";
	}
	
	@GetMapping("/delete")
	public String deleteContact(@RequestParam("contactid") Integer contactid, Model model)
	{
		 contactService.deleteConatactById(contactid);
		
		return "redirect:viewContacts";
		
		
	}
	

	


}


