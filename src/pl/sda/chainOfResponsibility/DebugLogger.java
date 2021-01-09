package pl.sda.chainOfResponsibility;

public class DebugLogger implements Logger {

    @Override
    public void log(LoggingType loggingType, String message) {
        if (this.supportedType() == loggingType) {
            System.out.println("DEBUG: " + message);
        } else {
            System.out.println(message);
        }
    }

    @Override
    public LoggingType supportedType() {
        return LoggingType.DEBUG;
    }
}
