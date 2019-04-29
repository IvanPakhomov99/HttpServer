package web.httpserver.io.config;

import web.httpserver.io.HttpResponse;

import java.io.InputStream;
import java.io.Reader;
import java.util.Map;

public interface ReadableHttpResponse extends HttpResponse {

    void getStatus();

    Map<String, String> getHeaders();

    byte[] getBody();

    boolean isBodyEmpty();

    int getBodyLength();
}
