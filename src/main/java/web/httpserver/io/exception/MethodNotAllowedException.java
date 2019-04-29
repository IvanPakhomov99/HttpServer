package web.httpserver.io.exception;

import web.httpserver.io.Constants;

public class MethodNotAllowedException extends AbstractRequestParseFailedException{
    private static final long serialVersionUID = 5016553383608229804L;

    public MethodNotAllowedException(String method, String startingLine) {
        super("Only " + Constants.ALLOWED_METHODS+" are supported. Current method is " + method, startingLine);
        setStatusCode(405);
    }
}
