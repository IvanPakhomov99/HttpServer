package web.httpserver.io;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Constants {
    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String HEAD = "HEAD";
    public static final List<String> ALLOWED_METHODS = Collections.unmodifiableList(Arrays.asList(GET, POST, HEAD));

    private Constants(){

    }
}
