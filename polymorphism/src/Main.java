public class Main {
    public static void main(String[] args) {
        CustomerLogger customerLogger = new CustomerLogger(new EmailLogger());
        customerLogger.add();
    }
}