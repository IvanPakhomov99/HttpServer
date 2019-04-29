package web.httpserver.io.impl;

import web.httpserver.io.HttpServer;

import java.util.Properties;

public class HttpServerFactory {

    private HttpServerFactory() {
    }

    public static HttpServerFactory create(){
        return  new HttpServerFactory();
    }

    public HttpServer createHttpServer(Properties overridesServerProperties){
        return new HttpServer(){
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
    }
}
