package web.httpserver.io.exception;

public class HttpVersionNotSupportedException extends AbstractRequestParseFailedException {
    private static final long serialVersionUID = 2542417095720030393L;

    public HttpVersionNotSupportedException(String message, String startingLine) {
        super(message, startingLine);
        setStatusCode(505);
    }
}
