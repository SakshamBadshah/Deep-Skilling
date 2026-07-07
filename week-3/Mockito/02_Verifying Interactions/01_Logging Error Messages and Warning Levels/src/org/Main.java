import java.lang.System.Logger;

public class Main {

    private static final Logger logger = System.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Logger.Level.ERROR, "This is an error");
        logger.log(Logger.Level.WARNING, "This is a warn");
    }
}