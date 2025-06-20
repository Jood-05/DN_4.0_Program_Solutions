
class Logger {
    private static Logger instance;
    private Logger(){
        System.out.println("Logger initialized.");
    }
    public static Logger getInstance(){
          if (instance == null) {
            instance = new Logger();
        }
        return instance;

    }
      public void log(String message) {
        System.out.println("Log: " + message);
    }
}




public class Test {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        l1.log("This is the first log message.");

        Logger l2 = Logger.getInstance();
        l2.log("This is the second log message.");

      
        if (l1 == l2) {
            System.out.println("Both logger instances are the same (Singleton works).");
        } else {
            System.out.println("Different instances (Singleton failed).");
        }
    }
}