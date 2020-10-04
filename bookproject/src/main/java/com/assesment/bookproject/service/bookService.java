package com.assesment.bookproject.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.bookproject.books;
import com.assesment.bookproject.repository.bookRepository;

@Service
public class bookService {
	
	@Autowired
	public bookRepository bookRepo;
	
	
	public List<books> getAllBooks()
	{
		List books=new ArrayList();	
		books = bookRepo.findAll();
		return books;
		
	}

}
