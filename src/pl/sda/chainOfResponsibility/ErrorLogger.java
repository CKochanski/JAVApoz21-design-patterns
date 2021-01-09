package pl.sda.chainOfResponsibility;

public class ErrorLogger implements Logger {

    private final Logger nextLogger;

    public ErrorLogger() {
        this.nextLogger = new DebugLogger();
    }

    @Override
    public void log(LoggingType loggingType, String message) {
        if (this.supportedType() == loggingType) {
            System.out.println("ERROR: " + message);
        } else {
            this.nextLogger.log(loggingType, message);
        }
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.ERROR;
    }
}
