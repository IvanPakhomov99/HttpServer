package web.httpserver.io.exception;

public class HttpServerConfigException extends HttpServerException{
    private static final long serialVersionUID = -7113457992909635002L;

    public HttpServerConfigException(String message) {
        super(message);
    }

    public HttpServerConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpServerConfigException(Throwable cause) {
        super(cause);
    }
}
