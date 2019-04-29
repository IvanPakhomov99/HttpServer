package web.httpserver.io;

import java.io.IOException;

public interface HttpHandler {

    void handle(HttpServerContext serverContext,HttpRequest request, HttpResponse response) throws IOException;
}
