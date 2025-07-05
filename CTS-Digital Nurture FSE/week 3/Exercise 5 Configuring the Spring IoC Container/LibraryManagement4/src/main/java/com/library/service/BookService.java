package com.library.service;
import com.library.respository.*;
public class BookService {
	private BookRepository br;
	public void setBookRepository(BookRepository br) {
		this.br=br;
	}
	  public void displayBooks() {
	        br.getAllBooks();
	    }

}
