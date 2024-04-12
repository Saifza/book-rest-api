package com.myproject.restful.web.sevice.restfulapi.services.book.addbook;

public class AddBookListRequestDTO {
	
	
	private String title;
	private String author;
	public AddBookListRequestDTO(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "AddBookListRequestDTO [title=" + title + ", author=" + author + "]";
	}
	
	

}
