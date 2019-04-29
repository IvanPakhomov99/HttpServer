package web.httpserver.io.impl;

import web.httpserver.io.HttpRequest;
import web.httpserver.io.config.HttpRequestParser;
import web.httpserver.io.exception.HttpServerException;

import java.io.IOException;
import java.io.InputStream;

class HttpRequestParserImpl implements HttpRequestParser {
    @Override
    public HttpRequest parseHttpRequest(InputStream inputStream, String remoteAddress) throws IOException, HttpServerException {
        return new HttpRequestImpl();
    }
}
