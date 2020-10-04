/**
 * 
 */
package com.assesment.bookproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class books {
   
	@Id
	private int id;
	private String book_title;
	private String author;
	private int year_published;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear_published() {
		return year_published;
	}
	public books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setYear_published(int year_published) {
		this.year_published = year_published;
	}
	public books(int id, String book_title, String author, int year_published) {
		super();
		this.id = id;
		this.book_title = book_title;
		this.author = author;
		this.year_published = year_published;
	}
		
}
