package Library.service;
import Library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Method;

public class LibraryManagementApplication {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService =
                context.getBean("bookService", BookService.class);

        try {
            Method m = bookService.getClass().getMethod("displayBooks");
            m.invoke(bookService);
        } catch (NoSuchMethodException e) {
            System.out.println("Method displayBooks() not found on BookService implementation.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}