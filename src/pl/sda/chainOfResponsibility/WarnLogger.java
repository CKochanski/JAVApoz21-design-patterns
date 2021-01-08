package pl.sda.chainOfResponsibility;

public class WarnLogger implements Logger {

    private final Logger nextLogger;

    public WarnLogger() {
        this.nextLogger = new ErrorLogger();
    }

    @Override
    public void log(LoggingType loggingType, String message) {
        if (this.supportedType() == loggingType) {
            System.out.println("WARN: " + message);
        } else {
            this.nextLogger.log(loggingType, message);
        }
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.WARN;
    }
}
