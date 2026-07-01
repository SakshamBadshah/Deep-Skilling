class Logger {

   
    private static final Logger obj = new Logger();

   
    private Logger() {
        System.out.println("Logger Created");
    }

    
    // Return single object
    public static Logger getInstance() {
        return obj;
    }

    // Logging method
    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}