package pl.sda.chainOfResponsibility;

public class ErrorLogger implements Logger {

    @Override
    public void log(LoggingType loggingType, String message) {
        if (this.supportedType() == loggingType) {
            System.out.println("ERROR: " + message);
        } else {
            System.out.println(message);
        }
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.ERROR;
    }
}
