package pl.sda.chainOfResponsibility;

import java.util.List;

public class WarnLogger implements Logger {

    private final Logger nextLogger;

    public WarnLogger() {
        this.nextLogger = new ErrorLogger();
    }

    @Override
    public void log(List<LoggingType> loggingType, String message) {
        if (loggingType.contains(this.supportedType())) {
            System.out.println("WARN: " + message);
        }
        this.nextLogger.log(loggingType, message);
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.WARN;
    }
}
