package pl.sda.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Logger logger = new InfoLogger();

        logger.log(LoggingType.ERROR, "Test");
        logger.log(LoggingType.INFO, "Test");
        logger.log(LoggingType.WARN, "Test");
        logger.log(LoggingType.DEBUG, "Test");
    }
}
