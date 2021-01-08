package pl.sda.chainOfResponsibility;

public interface Logger {

    void log(LoggingType loggingType, String message);
    LoggingType supportedType();
}
