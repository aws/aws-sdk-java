package com.amazonaws.services.cognito.client;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.junit.rules.ExternalResource;

import java.net.InetSocketAddress;

/**
 * Simulates a HTTP Server
 * Taken from <a href="https://gist.github.com/rponte/710d65dc3beb28d97655">rponte gist</a>
 */
public class HttpServerRule extends ExternalResource {

    public static final int DEFAULT_PORT = 6991;
    private final int port;
    private HttpServer server;

    public HttpServerRule() {
        this(DEFAULT_PORT);
    }

    public HttpServerRule(int port) {
        this.port = port;
    }

    @Override
    protected void before() throws Throwable {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.setExecutor(null);
        server.start();
    }

    @Override
    protected void after() {
        if (server != null) {
            server.stop(0);
        }
    }

    public String getUriFor(String path) {
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        String host = "http://localhost:" + port;
        return host + path;
    }

    public void registerHandler(String uriToHandle, HttpHandler httpHandler) {
        server.createContext(uriToHandle, httpHandler);
    }
}
