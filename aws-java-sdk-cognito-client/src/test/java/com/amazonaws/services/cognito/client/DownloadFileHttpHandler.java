package com.amazonaws.services.cognito.client;

import com.google.common.io.Files;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Taken from <a href="https://gist.github.com/rponte/710d65dc3beb28d97655">rponte gist</a>
 */
public class DownloadFileHttpHandler implements HttpHandler {

    private final File file;
    private final String contentType = "application/zip";

    public DownloadFileHttpHandler(File fileToDownload) {
        this.file = fileToDownload;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        exchange.getResponseHeaders().add("Content-Type", contentType);
        exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, file.length());
        Files.copy(this.file, exchange.getResponseBody());
        exchange.close();
    }
}
