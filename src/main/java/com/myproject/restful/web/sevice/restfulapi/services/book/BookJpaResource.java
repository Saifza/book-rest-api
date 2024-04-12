package com.myproject.restful.web.sevice.restfulapi.services.book;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.restful.web.sevice.restfulapi.services.book.addbook.AddBookListRequestDTO;
import com.myproject.restful.web.sevice.restfulapi.services.book.addbook.AddBookService;
import com.myproject.restful.web.sevice.restfulapi.services.jpa.BookCategoryRepository;
import com.myproject.restful.web.sevice.restfulapi.services.jpa.BookListRepository;
import com.myproject.restful.web.sevice.restfulapi.services.jpa.BookListRepositoryImpl;

@RestController
public class BookJpaResource {
	
	private BookCategoryRepository bookCategoryRepository;
	private BookListRepository bookListRepository;
	private BookListRepositoryImpl booklistRepositoryImpl;
	private AddBookService addBookService;
	
	
	public BookJpaResource(BookCategoryRepository bookCategoryRepository, BookListRepository bookListRepository, BookListRepositoryImpl booklistRepositoryImpl,  AddBookService addBookService) {
		super();
		this.bookCategoryRepository = bookCategoryRepository;
		this.bookListRepository = bookListRepository;
		
		this.booklistRepositoryImpl= booklistRepositoryImpl;
		this.addBookService=addBookService;
	}

	
	
	@GetMapping(path= "/book")
	public List<BookList> findAllBooks() {
		
 	
	return bookListRepository.findAll();
	
	}
	
	 @GetMapping(path = "/book-collection")
	    public List<BookResponseDTO> allBooks() {
     return booklistRepositoryImpl.searchAllBooks();
 }

	@GetMapping(path= "/book/{id}")
	public Optional<BookList> findaBookById(@PathVariable Integer id) {
		
 	
	return bookListRepository.findById(id);
	
	}
	
		
	
	
	@DeleteMapping(path= "/book/{id}")
	public void deleteABookById(@PathVariable Integer id) {
	 	
	bookListRepository.deleteById(id);
	
	
	}
	
 
	@GetMapping(path = "/book/author/{author}")
	public List<BookList> findBooksByAuthorIgnoreCase(@PathVariable String author) {
	    return bookListRepository.findByAuthorIgnoreCase(author);
	}
	
	@GetMapping(path = "/book/title/{title}")
	public List<BookList> findBooksByTitle(@PathVariable ("title") String title) {
	    return bookListRepository.findByTitleIgnoreCase(title);
	}	
	
	
	
	
	@GetMapping(path = "/book/bookcategory/{category}")
	public List<BookCategory> findBooksByCategory(@PathVariable ("category") String category) {
		
		
		
	    return bookCategoryRepository.findByCategoryIgnoreCase(category);
	}	
	
	 @GetMapping(path = "/book/search/author/{author}")
	    public List<BookResponseDTO> customSearchByAuthor(@PathVariable("author") String author) {
        return booklistRepositoryImpl.searchByAuthor(author);
    }
	

	 @GetMapping(path = "/book/search/title/{title}")
	    public List<BookResponseDTO> customSearchByTitle(@PathVariable("title") String title) {
        return booklistRepositoryImpl.searchByTitle(title);
    }
	
	 
	 
	 @PostMapping("book/add")
	    public ResponseEntity<String> addBook(@RequestBody AddBookListRequestDTO requestDTO) {
	        // Call the service method to add the book
	        addBookService.addBook(requestDTO);

	        return ResponseEntity.ok("Book added successfully");
	    }
	 
	 
}
