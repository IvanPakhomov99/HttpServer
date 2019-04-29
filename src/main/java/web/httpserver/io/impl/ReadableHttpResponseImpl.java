package web.httpserver.io.impl;

import web.httpserver.io.config.ReadableHttpResponse;

import java.io.InputStream;
import java.io.Reader;
import java.util.Map;

public class ReadableHttpResponseImpl implements ReadableHttpResponse {
    @Override
    public void getStatus() {

    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

    @Override
    public byte[] getBody() {
        return new byte[0];
    }

    @Override
    public boolean isBodyEmpty() {
        return false;
    }

    @Override
    public int getBodyLength() {
        return 0;
    }

    @Override
    public void setStatus(int status) {

    }

    @Override
    public void setHeader(String name, Object value) {

    }

    @Override
    public void setBody(String content) {

    }

    @Override
    public void setBody(InputStream inputStream) {

    }

    @Override
    public void setBody(Reader reader) {

    }
}
