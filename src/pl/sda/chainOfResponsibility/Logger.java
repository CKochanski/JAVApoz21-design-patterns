package pl.sda.chainOfResponsibility;

import java.util.List;

public interface Logger {

    void log(List<LoggingType> loggingType, String message);
    LoggingType supportedType();
}
