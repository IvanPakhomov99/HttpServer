package web.httpserver.io.impl;

import web.httpserver.io.HttpRequest;

import java.util.Map;

class HttpRequestImpl implements HttpRequest {
    @Override
    public String getStartingLine() {
        return null;
    }

    @Override
    public String getMethod() {
        return null;
    }

    @Override
    public String getUri() {
        return null;
    }

    @Override
    public String getHttpVerison() {
        return null;
    }

    @Override
    public String getRemoteAddress() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}
