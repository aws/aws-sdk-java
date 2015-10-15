/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights
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
package com.amazonaws.http.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ProblematicServer {

    public enum ServerIssue {
        UNRESPONSIVE,
        OVERLOADED
    }
    
    private final ServerIssue issue;
    
    /**
     * The server socket which the test service will listen to.
     */
    private ServerSocket serverSocket;

    private Thread listenerThread;
    
    public ProblematicServer(final ServerIssue issue) {
        this.issue = issue;
    }
    
    public void startServer() {
        try {
            serverSocket = new ServerSocket(0); // auto-assign a port at localhost
        } catch (IOException e) {
            throw new RuntimeException("Unable to start the server socker.", e);
        }

        if (issue == ServerIssue.UNRESPONSIVE) {
            listenerThread = new UnresponsiveSocketListenerThread(serverSocket);
        } else if (issue == ServerIssue.OVERLOADED) {
            listenerThread = new OverloadedSocketListenerThread(serverSocket);
        } else {
            throw new RuntimeException("Unsupported implementation for server issue: " + issue.toString());
        }
        
        listenerThread.setDaemon(true);
        listenerThread.start();
    }
    
    public void stopServer() {
        listenerThread.interrupt();
        try {
            listenerThread.join(10 * 1000);
        } catch (InterruptedException e1) {
            System.err.println("The listener thread didn't terminate " +
                    "after waiting for 10 seconds.");
        }

        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(
                        "Unable to stop the server socket.", e);
            }
        }
    }
    
    public int getPort() {
        return serverSocket.getLocalPort();
    }
    
    /**
     * A daemon thread which runs a simple server that listens to a specific
     * server socket. Whenever a connection is created, the server simply keeps
     * holding the connection open and no byte will be written to the socket.
     * The test client talking to this server is expected to timeout
     * appropriately, instead of hanging and waiting for the response forever.
     */
    private static class UnresponsiveSocketListenerThread extends Thread {

        /** The server socket which this tread listens and responds to */
        private final ServerSocket serverSocket;

        public UnresponsiveSocketListenerThread(ServerSocket serverSocket) {
            super("aws-java-sdk-test-unresponsive-socket-listner");
            this.serverSocket = serverSocket;
            setDaemon(true);
        }

        @Override
        public void run() {
            try {
                Socket socket = serverSocket.accept();
                System.out.println("Socket created on port " + socket.getLocalPort());
                while (true) {
                    System.out.println("I don't want to talk.");
                    Thread.sleep(10 * 1000);
                }
            } catch (IOException e) {
                throw new RuntimeException("Error when waiting for new socket connection.", e);
            } catch (InterruptedException e) {
                System.err.println("Socket listener thread interrupted. Terminating the thread...");
                return;
            }
        }
    }
    
    /**
     * A daemon thread which runs a simple server that listens to a specific
     * server socket. Whenever a connection is created, the server simply keeps
     * holding the connection open while periodically writing data.
     * The test client talking to this server is expected to timeout
     * appropriately, instead of hanging and waiting for the response forever.
     */
    private static class OverloadedSocketListenerThread extends Thread {

        /** The server socket which this tread listens and responds to */
        private final ServerSocket serverSocket;

        public OverloadedSocketListenerThread(ServerSocket serverSocket) {
            super("aws-java-sdk-test-overloaded-socket-listner");
            this.serverSocket = serverSocket;
            setDaemon(true);
        }

        @Override
        public void run() {
            try {
                while (true) {
                    try {
                        Socket socket = serverSocket.accept();
                        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                        out.writeBytes("HTTP/1.1 200 OK\r\n");
                        out.writeBytes("Content-Type: text/html\r\n\r\n");
                        out.writeBytes("<html><head></head><body><h1>Hello.");
                        while(true) {
                            Thread.sleep(1 * 1000);
                            out.writeBytes("Hi.");
                        }
                    } catch(SocketException se) {}
                }
            } catch (IOException e) {
                throw new RuntimeException("Error when waiting for new socket connection.", e);
            } catch (InterruptedException e) {
                System.err.println("Socket listener thread interrupted. Terminating the thread...");
                return;
            }
        }
    }

}
