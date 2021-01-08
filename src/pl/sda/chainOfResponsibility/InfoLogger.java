package pl.sda.chainOfResponsibility;

public class InfoLogger implements Logger {

    private final Logger nextLogger;

    public InfoLogger() {
        this.nextLogger = new WarnLogger();
    }

    @Override
    public void log(LoggingType loggingType, String message) {
        if (this.supportedType() == loggingType) {
            System.out.println("INFO: " + message);
        } else {
            this.nextLogger.log(loggingType, message);
        }
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.INFO;
    }
}
