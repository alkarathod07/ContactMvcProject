package com.rahul.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyException {
	
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String  nullPointerHandlerExceptions(Model model)
	{
		model.addAttribute("msg", "Nullpointer Exceptionp please check.... ");
		
		return "Exception";
	}
	
	

	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
	@ExceptionHandler(value = ArithmeticException.class)
	public String  arithmeticException(Model model)
	{
		model.addAttribute("msg", "Arithmetic Exception ");
		
		return "Exception";
	}

	
	
	

}
