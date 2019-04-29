package web.httpserver.io.exception;

public class BadRequestException extends AbstractRequestParseFailedException {
    private static final long serialVersionUID = 2733250191404274779L;

    public BadRequestException(String message, Throwable cause, String startingLine) {
        super(message, cause, startingLine);
        setStatusCode(400);
    }
}
