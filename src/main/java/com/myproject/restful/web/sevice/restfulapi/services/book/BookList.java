package com.myproject.restful.web.sevice.restfulapi.services.book;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity (name="BOOK_LIST")
public class BookList {
	
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
  private String title;
  private String author;
  
  public BookList() {}
  
public BookList(int id, String title, String author) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
}

public BookList(String title, String author) {
    this.title = title;
    this.author = author;
}
   @OneToOne (mappedBy= "bookList", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private BookCategory bookCategory;

public int getid() {
	return id;
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public void setID(int id) {
	this.id = id;
}
public void setTitle(String title) {
	this.title = title;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "BookList [ID=" + id + ", title=" + title + ", author=" + author + "]";
}


  
  
}
