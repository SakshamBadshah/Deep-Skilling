package Library;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting the Application");

        // Spring is not available on the classpath. Skip loading ApplicationContext.
        // If you add Spring dependencies, restore usage of ClassPathXmlApplicationContext.
        Object context = null;
    }
}