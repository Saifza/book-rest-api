package com.myproject.restful.web.sevice.restfulapi.services.jpa;

import java.util.List;

import com.myproject.restful.web.sevice.restfulapi.services.book.BookResponseDTO;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class BookListRepositoryImpl implements CustomBookListRepository {
 
	 @PersistenceContext
	    private EntityManager entityManager;




   
    @Override
    public List<BookResponseDTO> searchByAuthor(String author) {
        return entityManager.createQuery(
                "SELECT new com.myproject.restful.web.sevice.restfulapi.services.book.BookResponseDTO(bl.id, bl.title, bl.author, bc.category) " +
                "FROM BOOK_LIST bl " +
                "LEFT JOIN bl.bookCategory bc " +
                "WHERE LOWER(bl.author) = LOWER(:author)", BookResponseDTO.class)
                .setParameter("author", author)
                .getResultList();
    }


	@Override
	public List<BookResponseDTO> searchByTitle(String title) {
		 return entityManager.createQuery(
	                "SELECT new com.myproject.restful.web.sevice.restfulapi.services.book.BookResponseDTO(bl.id, bl.title, bl.author, bc.category) " +
	                "FROM BOOK_LIST bl " +
	                "LEFT JOIN bl.bookCategory bc " +
	                "WHERE LOWER(bl.title) = LOWER(:title)", BookResponseDTO.class)
	                .setParameter("title", title)
	                .getResultList();
	}


	
    @Override
    public List<BookResponseDTO> searchAllBooks(){
    	
    	return entityManager.createQuery(
                "SELECT new com.myproject.restful.web.sevice.restfulapi.services.book.BookResponseDTO(bl.id, bl.title, bl.author, bc.category) " +
                "FROM BOOK_LIST bl " +
                "LEFT JOIN bl.bookCategory bc " , BookResponseDTO.class)
            //    .setParameter("title", title)
                .getResultList();
    }
	
   

}

	
	
	 

