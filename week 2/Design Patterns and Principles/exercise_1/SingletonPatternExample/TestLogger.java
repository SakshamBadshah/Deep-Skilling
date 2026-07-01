public class TestLogger {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Application Started");
        l2.log("User Logged In");

        System.out.println(l1 == l2);
    }
}