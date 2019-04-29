package web.httpserver.io.config;

import web.httpserver.io.HttpServerContext;
import web.httpserver.io.ServerInfo;

import java.net.Socket;
import java.util.concurrent.ThreadFactory;

public interface HttpServerConfig {

    ServerInfo getServerInfo();

    String getStatusMessage(int statusCode);

    HttpRequestParser getHttpRequestParser();

    HttpResponseBuilder getHttpResponseBuilder();

    HttpResponseWriter getHttpResponseWriter();

    HttpServerContext getHttpServerContext();

    HttpRequestDispatcher getHttpRequestDispatcher();

    ThreadFactory getWorkerThreadFactory();

    HttpClientSocketHandler buildNewHttpClientSocketHandler(Socket clientSocket);
}
