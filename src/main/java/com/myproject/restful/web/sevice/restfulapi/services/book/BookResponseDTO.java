package com.myproject.restful.web.sevice.restfulapi.services.book;

public class BookResponseDTO {
	
	
	    private Integer id;
	    private String title;
	    private String author;
	    private String category;

	    public BookResponseDTO(Integer id, String title, String author, String category) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.category = category != null ? category : "N/A"; // Handle null category
	    
	    }

		public Integer getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public String getAuthor() {
			return author;
		}

		public String getCategory() {
			return category;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "BookResponseDTO [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category
					+ "]";
		}

	   
	}



