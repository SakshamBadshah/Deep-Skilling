package Library.service;

import Library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookService() {
        System.out.println("BookService is working.");

        bookRepository.displayRepositoryMessage();
    }
}
