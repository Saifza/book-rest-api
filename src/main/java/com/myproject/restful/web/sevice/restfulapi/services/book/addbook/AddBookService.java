package com.myproject.restful.web.sevice.restfulapi.services.book.addbook;

import org.springframework.stereotype.Service;

import com.myproject.restful.web.sevice.restfulapi.services.book.BookList;
import com.myproject.restful.web.sevice.restfulapi.services.jpa.BookListRepository;

@Service
public class AddBookService {
	
	
	    private BookListRepository bookListRepository;
	    

	    public AddBookService(BookListRepository bookListRepository) {
			super();
			this.bookListRepository = bookListRepository;
		}


		public void addBook(AddBookListRequestDTO requestDTO) {
	        BookList bookList = new BookList();
	        bookList.setTitle(requestDTO.getTitle());
	        bookList.setAuthor(requestDTO.getAuthor());
	       

	        bookListRepository.save(bookList);
	    }

}
