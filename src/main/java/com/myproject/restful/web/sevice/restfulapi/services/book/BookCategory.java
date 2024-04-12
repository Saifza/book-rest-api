package com.myproject.restful.web.sevice.restfulapi.services.book;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class BookCategory {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
    private String category;
   
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "book_list_id")  //newly added
    private BookList bookList;

    public BookCategory() {}
    
	public BookCategory(int id, String category, BookList bookList) {
		super();
		this.id = id;
		this.category = category;
		this.bookList = bookList;
	}

	public BookCategory( String category, BookList bookList) {
		super();
		
		this.category = category;
		this.bookList = bookList;
	}

	
	
	public Integer getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	

	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", category=" + category + "]";
	}

	
    
    
}


