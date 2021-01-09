package pl.sda.chainOfResponsibility;

import java.util.List;

public class InfoLogger implements Logger {

    private final Logger nextLogger;

    public InfoLogger() {
        this.nextLogger = new WarnLogger();
    }

    @Override
    public void log(List<LoggingType> loggingType, String message) {
        if (loggingType.contains(this.supportedType())) {
            System.out.println("INFO: " + message);
        }
        this.nextLogger.log(loggingType, message);
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.INFO;
    }
}
