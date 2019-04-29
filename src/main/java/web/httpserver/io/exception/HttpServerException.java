package web.httpserver.io.exception;

public class HttpServerException extends RuntimeException {
    private static final long serialVersionUID = 4737105088996710864L;
    private int statusCode = 500;
    public HttpServerException(String message) {
        super(message);
    }

    public HttpServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpServerException(Throwable cause) {
        super(cause);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
