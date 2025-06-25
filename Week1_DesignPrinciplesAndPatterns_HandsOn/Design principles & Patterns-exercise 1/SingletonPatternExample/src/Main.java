// Main.java
public class Main {
    public static void main(String[] args) {

        // Getting logger instance 1
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        // Getting logger instance 2
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        // Testing if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works).");
        } else {
            System.out.println("Different logger instances (Singleton failed).");
        }
    }
}
