package web.httpserver.io;

import java.util.Map;

public interface HttpRequest {

    String getStartingLine();

    String getMethod();

    String getUri();

    String getHttpVerison();

    String getRemoteAddress();

    Map<String, String> getHeaders();

    Map<String, String> getParameters();
}
