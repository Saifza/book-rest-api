package com.myproject.restful.web.sevice.restfulapi.services.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.restful.web.sevice.restfulapi.services.book.BookList;




public interface BookListRepository extends JpaRepository<BookList, Integer> {
	List<BookList> findByAuthor(String author);
	List<BookList> findByAuthorIgnoreCase(String author);
	List<BookList> findByTitleIgnoreCase(String title);
	List<BookList> findBooksByAuthor(String authorname);
	
	
}
