package com.myproject.restful.web.sevice.restfulapi.services.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.restful.web.sevice.restfulapi.services.book.BookCategory;





public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {
	
	List<BookCategory> findByCategoryIgnoreCase(String category);
	
	

}
