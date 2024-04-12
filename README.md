# Book API

This API allows one to manage books and perform various operations related to books.

## Endpoints

### Book Operations

- POST /book/add: Add a new book to the database.
- GET /book: Get all books with the title and the author.
- GET /book/{id}: Get a book by its ID.
- DELETE /book/{id}: Delete a book by its ID.
- GET /book/title/{title}: Get a book by its title.
- GET /book/search/title/{title}: Search books by title.
- GET /book/search/author/{author}: Search books by author.
- GET /book/bookcategory/{category}: Get books by category.
- GET /book/author/{author}: Get books by author.
- GET /book-collection: Get all books with the title, the author and th category (genre).

### Hello World Operations

- GET /hello-world: Get a hello world message.
- GET /hello-world/path-variable/{name}: Get a hello world message with a path variable.
- GET /hello-world/fromString: Get a hello world message from a string.

## Schemas

- AddBookListRequestDTO: Request object for adding a list of books.
- HelloWorld: Sample schema for hello world operations.
- BookList: List of books.
- BookResponseDTO: Response object for book operations.
- BookCategory: Category of books.

## Usage

1. Clone the repository.
2. Configure your environment variables and database settings in the application.properties file.
3. Build and run the application using Maven or your IDE.
4. Access the Swagger UI to interact with the API endpoints.

## Technologies Used

- Java
- Spring Boot
- Swagger UI
- Maven

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
