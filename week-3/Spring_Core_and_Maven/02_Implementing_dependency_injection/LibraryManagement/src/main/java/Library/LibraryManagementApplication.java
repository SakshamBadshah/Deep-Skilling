package Library;

// Lightweight local stubs to avoid requiring Spring on the classpath for this exercise.
interface ApplicationContext {
    <T> T getBean(String name, Class<T> requiredType);
}

// Lightweight replacement for Spring's ClassPathXmlApplicationContext to avoid
// requiring org.springframework.context.support on the classpath.
class ClassPathXmlApplicationContext implements ApplicationContext {
    private final String config;
    ClassPathXmlApplicationContext(String config) { this.config = config; }
    @SuppressWarnings("unchecked")
    public <T> T getBean(String name, Class<T> requiredType) {
        // Only supports retrieving a BookService for this small demo
        if (requiredType == BookService.class) {
            return (T) new BookService();
        }
        throw new IllegalArgumentException("Unsupported bean type: " + requiredType);
    }
}

class BookService {
    void displayBookService() {
        System.out.println("BookService is running (stub implementation).");
    }
}

public class LibraryManagementApplication {
    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService bookService = context.getBean("bookService", BookService.class);
    bookService.displayBookService();
    }
}