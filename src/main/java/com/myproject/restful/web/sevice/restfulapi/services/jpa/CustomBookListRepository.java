package com.myproject.restful.web.sevice.restfulapi.services.jpa;

import java.util.List;




import com.myproject.restful.web.sevice.restfulapi.services.book.BookResponseDTO;




public interface CustomBookListRepository {
	
	// method to find title and, author from Book_List entity and category from Book category
	// entity for a certain author
	public List<BookResponseDTO> searchByAuthor(String author);

	// method to find title and  author from Book_List entity and category from Book category
		// entity for a certain title
	public List<BookResponseDTO> searchByTitle(String title);
	
	// method to find title and author from Book_List entity and category from Book category
		// entity and list all the books
	public List<BookResponseDTO> searchAllBooks();
}



      
     
      


