package Library.service;

import Library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookService() {
        System.out.println("BookService is working.");

        if (bookRepository != null) {
            bookRepository.displayRepositoryMessage();
        } else {
            System.out.println("No BookRepository available.");
        }
    }
}