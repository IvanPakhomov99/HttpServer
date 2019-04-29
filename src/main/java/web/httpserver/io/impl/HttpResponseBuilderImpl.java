package web.httpserver.io.impl;

import web.httpserver.io.config.HttpResponseBuilder;
import web.httpserver.io.config.ReadableHttpResponse;

class HttpResponseBuilderImpl implements HttpResponseBuilder {
    @Override
    public ReadableHttpResponse buildNewHttpResponse() {
        return new ReadableHttpResponseImpl();
    }

    @Override
    public void prepareHttpResponse(ReadableHttpResponse readableHttpResponse, boolean clearBody) {

    }
}
