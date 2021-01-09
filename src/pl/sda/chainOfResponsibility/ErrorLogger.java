package pl.sda.chainOfResponsibility;

import java.util.List;

public class ErrorLogger implements Logger {

    @Override
    public void log(List<LoggingType> loggingType, String message) {
        if (loggingType.contains(this.supportedType())) {
            System.out.println("ERROR: " + message);
        }
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.ERROR;
    }
}
