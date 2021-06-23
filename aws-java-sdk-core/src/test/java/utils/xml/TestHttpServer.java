/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package utils.xml;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * Simple HTTP server.
 */
public class TestHttpServer implements HttpHandler {

    private final String content;
    private final HttpServer server;

    /**
     * This flag indicates if the server accepted a connection.
     */
    private boolean accepted = false;

    public TestHttpServer(String content) throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/test", this);
        server.setExecutor(null);
        server.start();
        this.content = content;
    }

    public String url() {
        return String.format("http://localhost:%d/test", server.getAddress().getPort());
    }

    @Override
    public void handle(HttpExchange t) throws IOException {
        System.out.println("server: accepted a request");
        synchronized (this) {
            accepted = true;
        }
        byte[] response = content.getBytes();
        t.sendResponseHeaders(200, response.length);
        OutputStream os = t.getResponseBody();
        try {
            os.write(response);
        } finally {
            os.close();
        }
    }

    /**
     * @return True if the server accepted a connection, false otherwise.
     */
    public boolean accepted() {
        synchronized (this) {
            return accepted;
        }
    }

    public void stop() {
        server.stop(0);
    }
}