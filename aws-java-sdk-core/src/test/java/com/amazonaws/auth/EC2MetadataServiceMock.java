/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import static com.amazonaws.SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.amazonaws.util.EC2MetadataUtils;

/**
 * Mock server for imitating the Amazon EC2 Instance Metadata Service. Tests can
 * use this class to start up a server on a localhost port, and control what
 * response the server will send when a connection is made.
 */
public class EC2MetadataServiceMock {

    private EC2MockMetadataServiceListenerThread hosmMockServerThread;

    private static final String OUTPUT_HEADERS = "HTTP/1.1 200 OK\r\n" +
            "Content-Type: text/html\r\n" +
            "Content-Length: ";

    private static final String OUTPUT_END_OF_HEADERS = "\r\n\r\n";

    /**
     * Sets the name of the file that should be sent back as the response from
     * this mock server. The files are loaded from the com/amazonaws/auth
     * directory of the tst folder, and no file extension should be specified.
     *
     * @param responseFileName
     *            The name of the file that should be sent back as the response
     *            from this mock server.
     */
    public void setResponseFileName(String responseFileName) {
        hosmMockServerThread.setResponseFileName(responseFileName);
    }

    /**
     * Accepts a newline delimited list of security credential names that the
     * mock metadata service should advertise as available.
     *
     * @param securityCredentialNames
     *            A newline delimited list of security credentials that the
     *            metadata service will advertise as available.
     */
    public void setAvailableSecurityCredentials(String securityCredentialNames) {
        hosmMockServerThread.setAvailableSecurityCredentials(securityCredentialNames);
    }

    public void start() throws IOException {
        hosmMockServerThread = new EC2MockMetadataServiceListenerThread(startServerSocket());
        hosmMockServerThread.start();
    }

    public void stop() {
        hosmMockServerThread.stopServer();
    }

    private ServerSocket startServerSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(0);

            System.setProperty(EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY, "http://localhost:" + serverSocket.getLocalPort());
            System.out.println("Started mock metadata service at: " + System.getProperty(EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY));

            return serverSocket;
        } catch (IOException ioe) {
            throw new RuntimeException("Unable to start mock EC2 metadata server", ioe);
        }
    }

    /**
     * Thread subclass that listens for connections on an opened server socket
     * and response with a predefined response file.
     */
    private static class EC2MockMetadataServiceListenerThread extends Thread {
        private ServerSocket serverSocket;
        private String responseFileName;
        private String securityCredentialNames;

        public EC2MockMetadataServiceListenerThread(ServerSocket serverSocket) {
            this.serverSocket = serverSocket;
        }

        public void setResponseFileName(String responseFileName) {
            this.responseFileName = responseFileName;
        }

        public void setAvailableSecurityCredentials(String securityCredentialNames) {
            this.securityCredentialNames = securityCredentialNames;
        }

        @Override
        public void run() {
            while (true) {
                Socket socket = null;
                try {
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    // Just exit if the socket gets shut down while we're waiting
                    return;
                }

                OutputStream outputStream = null;
                try {
                    outputStream = socket.getOutputStream();
                    InputStream inputStream = socket.getInputStream();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String requestLine = reader.readLine();

                    String[] strings = requestLine.split(" ");
                    String resourcePath = strings[1];


                    String httpResponse = null;

                    if (resourcePath.equals(EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE)) {
                        httpResponse = formHttpResponse(securityCredentialNames);
                        outputStream.write(httpResponse.getBytes());

                    } else if (resourcePath.startsWith(EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE)) {
                        String responseFilePath = "/com/amazonaws/auth/" + responseFileName + ".json";
                        System.out.println("Serving: " + responseFilePath);

                        InputStream responseFileInputStream = this.getClass().getResourceAsStream(responseFilePath);

                        List<String> dataFromFile = IOUtils.readLines(responseFileInputStream);

                        StringBuilder credentialsString = new StringBuilder();

                        for(String line : dataFromFile)
                            credentialsString.append(line);

                        httpResponse = formHttpResponse(credentialsString
                                .toString());
                        outputStream.write(httpResponse.getBytes());

                    } else {
                        throw new RuntimeException("Unknown resource requested: " + resourcePath);
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Unable to respond to request", e);
                } finally {
                    try {outputStream.close();} catch (Exception e) {}
                }
            }
        }

        private String formHttpResponse(String content){

            StringBuilder outputStringToWrite = new StringBuilder(
                    OUTPUT_HEADERS);
            outputStringToWrite.append(content.length());
            outputStringToWrite.append(OUTPUT_END_OF_HEADERS);
            outputStringToWrite.append(content);
            return outputStringToWrite.toString();
        }

        public void stopServer() {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException("Unable to stop server", e);
                }
            }
        }
    }
}
