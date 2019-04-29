package web.httpserver.io.config;

public interface HttpResponseBuilder {

    ReadableHttpResponse buildNewHttpResponse();

    void prepareHttpResponse(ReadableHttpResponse readableHttpResponse, boolean clearBody);
}
