/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights
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
package com.amazonaws.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * Starts a new EC2 Metadata server instance with given address and port number.
 *
 */
public class EC2MetadataUtilsServer {

    private ServerSocket server;
    private boolean tokenEnabled;

    public EC2MetadataUtilsServer(String address, int port, boolean tokenEnabled)
        throws IOException {
        server = new ServerSocket(port, 1, InetAddress.getByName(address));
        this.tokenEnabled = tokenEnabled;
    }

    public void start() {

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    startServer();
                } catch (IOException exception) {
                    if ((exception instanceof SocketException)
                            && (exception.getMessage().equals("Socket closed"))) {
                        return;
                    }
                    throw new RuntimeException("BOOM", exception);
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
    }

    public void stop() throws IOException {
        if (server != null) {
            server.close();
        }
    }

    public int getLocalPort() {
        return server.getLocalPort();
    }

    private void startServer() throws IOException {
        while (true) {
            Socket sock = server.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    sock.getInputStream()));
            PrintWriter writer = new PrintWriter(sock.getOutputStream());

            handleConnection(reader, writer);

            writer.close();
            reader.close();
            sock.close();
        }
    }

    private void handleConnection(BufferedReader input,
            PrintWriter output) throws IOException {

        String line = input.readLine();
        if (line == null) {
            return;
        }

        String[] parts = line.split(" ");
        if (parts.length != 3) {
            throw new RuntimeException("Bogus request: " + line);
        }

        String httpMethod = parts[0];

        if (!"GET".equals(httpMethod) && !"PUT".equals(httpMethod)) {
            outputBadRequest("incorrect http method", output);
            return;
        }

        if (!isRequestValid(input, httpMethod, output)) {
            return;
        }

        String path = parts[1];

        if (path.equals("/latest/meta-data/iam/info")) {
            outputIamInfo(output);
            return;
        }

        if (path.equals("/latest/meta-data/iam/security-credentials")) {
            outputIamCredList(output);
            return;
        }

        if (path.startsWith("/latest/meta-data/iam/security-credentials/")) {
            outputIamCred(output);
            return;
        }

        if (path.equals("/latest/dynamic/instance-identity/document")) {
            outputInstanceInfo(output);
            return;
        }

        if (path.equals("/latest/api/token")) {
            if (!"PUT".equals(httpMethod)) {
                outputBadRequest("incorrect http method", output);
                return;
            }

           outputTokenInfo(output);
           return;
        }

        throw new RuntimeException("Unknown path: " + path);

    }

    private boolean isRequestValid(BufferedReader input, String httpMethod, PrintWriter output) throws IOException {
        Map<String, String> headers = new HashMap<String, String>();
        while (true) {
            String line = input.readLine();

            if (line == null) {
                throw new RuntimeException("Unexpected end of input");
            }
            if (line.length() == 0) {
                break;
            }

            String[] headerEntry = line.split(":");
            headers.put(headerEntry[0].trim(), headerEntry[1].trim());
        }

        if (tokenEnabled) {
            if (httpMethod.equals("PUT") && !headers.containsKey("x-aws-ec2-metadata-token-ttl-seconds")) {
                outputBadRequest("Token ttl header is not present",  output);
                return false;
            }

            if (httpMethod.equals("GET") && !headers.containsKey("x-aws-ec2-metadata-token")) {
                outputBadRequest("Token is enabled but the request does not contain the metadata token", output);
                return false;
            }
        }

        return true;
    }

    private void outputTokenInfo(PrintWriter output) {
        if (tokenEnabled) {
            String payload = "1234567890";
            output.println("HTTP/1.1 200 OK");
            output.println("Connection: close");
            output.println("Content-Length: " + payload.length());
            output.println();
            output.print(payload);
        } else {

            output.println("HTTP/1.1 404 Not Found");
            output.println("Connection: close");
        }
        output.flush();
    }

    private void outputIamInfo(PrintWriter output) throws IOException {

        String payload =
                "{"
                + "\"Code\":\"Success\","
                + "\"LastUpdated\":\"2014-04-07T08:18:41Z\","
                + "\"InstanceProfileArn\":\"foobar\","
                + "\"InstanceProfileId\":\"moobily\","
                + "\"NewFeature\":12345"
                + "}";

        output.println("HTTP/1.1 200 OK");
        output.println("Connection: close");
        output.println("Content-Length: " + payload.length());
        output.println();

        output.print(payload);
        output.flush();
    }

    private void outputIamCredList(PrintWriter output)
            throws IOException {

        String payload = "test1\ntest2";

        output.println("HTTP/1.1 200 OK");
        output.println("Connection: close");
        output.println("Content-Length: " + payload.length());
        output.println();

        output.print(payload);
        output.flush();
    }

    private void outputIamCred(PrintWriter output) throws IOException {

        String payload =
                "{"
                + "\"Code\":\"Success\","
                + "\"LastUpdated\":\"2014-04-07T08:18:41Z\","
                + "\"Type\":\"AWS-HMAC\","
                + "\"AccessKeyId\":\"foobar\","
                + "\"SecretAccessKey\":\"moobily\","
                + "\"Token\":\"beebop\","
                + "\"Expiration\":\"2014-04-08T23:16:53Z\""
                + "}";

        output.println("HTTP/1.1 200 OK");
        output.println("Connection: close");
        output.println("Content-Length: " + payload.length());
        output.println();

        output.print(payload);
        output.flush();
    }

    private void outputInstanceInfo(PrintWriter output)
            throws IOException {

        String payload = constructInstanceInfo();

        output.println("HTTP/1.1 200 OK");
        output.println("Connection: close");
        output.println("Content-Length: " + payload.length());
        output.println();

        output.print(payload);
        output.flush();
    }

    private void outputBadRequest(String payload, PrintWriter output) {

        output.println("HTTP/1.1 400 Bad Request");
        output.println("Connection: close");
        output.println("Content-Length: " + payload.length());
        output.println();

        output.print(payload);
        output.flush();
    }

    protected String constructInstanceInfo() {
        return "{"
                + "\"pendingTime\":\"2014-08-07T22:07:46Z\","
                + "\"instanceType\":\"m1.small\","
                + "\"imageId\":\"ami-a49665cc\","
                + "\"instanceId\":\"i-6b2de041\","
                + "\"billingProducts\":[\"foo\"],"
                + "\"architecture\":\"x86_64\","
                + "\"accountId\":\"599169622985\","
                + "\"kernelId\":\"aki-919dcaf8\","
                + "\"ramdiskId\":\"baz\","
                + "\"region\":\"us-east-1\","
                + "\"version\":\"2010-08-31\","
                + "\"availabilityZone\":\"us-east-1b\","
                + "\"privateIp\":\"10.201.215.38\","
                + "\"devpayProductCodes\":[\"bar\"]"
                + "}";
    }

}
