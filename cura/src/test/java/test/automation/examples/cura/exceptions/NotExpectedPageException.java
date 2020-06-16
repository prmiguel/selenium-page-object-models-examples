package test.automation.examples.cura.exceptions;

public class NotExpectedPageException extends RuntimeException {
    public NotExpectedPageException(String errorMessage, Throwable error) {
        super(errorMessage, error);
    }

    public NotExpectedPageException(String message) {
        super(message);
    }
}
