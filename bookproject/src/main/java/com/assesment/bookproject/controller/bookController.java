package com.assesment.bookproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.bookproject.books;
import com.assesment.bookproject.service.bookService;

@RestController
public class bookController {
	
	@Autowired
	public bookService bookService;
	
	
	@GetMapping("/getAllBooks")
	public List<books> getAllBooks()
	{		
		return bookService.getAllBooks();
		
	}

}
