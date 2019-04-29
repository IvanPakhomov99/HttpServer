package web.httpserver.io.config;

import web.httpserver.io.HttpRequest;
import web.httpserver.io.exception.HttpServerException;

import java.io.IOException;
import java.io.InputStream;

public interface HttpRequestParser {

    HttpRequest parseHttpRequest(InputStream inputStream, String remoteAddress) throws IOException, HttpServerException;
}
