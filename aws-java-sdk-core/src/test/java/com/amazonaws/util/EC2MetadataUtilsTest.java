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
package com.amazonaws.util;

import java.io.*;
import java.net.*;
import java.util.*;

import org.junit.*;

import com.amazonaws.SDKGlobalConfiguration;

public class EC2MetadataUtilsTest {

    private static ServerSocket server;

    @BeforeClass
    public static void setUp() throws IOException {

        server = new ServerSocket(0, 1, InetAddress.getByName("localhost"));

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    runServer();
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

        System.setProperty(
                SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY,
                "http://localhost:" + server.getLocalPort());
    }

    @AfterClass
    public static void cleanUp() throws IOException {
        killServer();

        System.clearProperty(SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY);
    }

    @Test
    public void testIamInfo() {
        EC2MetadataUtils.IAMInfo info = EC2MetadataUtils
                .getIAMInstanceProfileInfo();

        Assert.assertEquals("Success", info.code);
        Assert.assertNull(info.message);
        Assert.assertEquals("2014-04-07T08:18:41Z", info.lastUpdated);
        Assert.assertEquals("foobar", info.instanceProfileArn);
        Assert.assertEquals("moobily", info.instanceProfileId);
    }

    @Test
    public void testIamCredentials() {
        Map<String, EC2MetadataUtils.IAMSecurityCredential> map = EC2MetadataUtils
                .getIAMSecurityCredentials();

        Assert.assertEquals(2, map.size());

        for (Map.Entry<String, EC2MetadataUtils.IAMSecurityCredential> entry : map
                .entrySet()) {

            Assert.assertNotNull(entry.getKey());
            Assert.assertNotNull(entry.getValue().code);
            Assert.assertNotNull(entry.getValue().lastUpdated);
            Assert.assertEquals("AWS-HMAC", entry.getValue().type);
            Assert.assertEquals("foobar", entry.getValue().accessKeyId);
            Assert.assertEquals("moobily", entry.getValue().secretAccessKey);
            Assert.assertEquals("beebop", entry.getValue().token);
            Assert.assertNotNull(entry.getValue().expiration);
        }
    }

    @Test
    public void testInstanceInfo() {
        EC2MetadataUtils.InstanceInfo info = EC2MetadataUtils.getInstanceInfo();
        Assert.assertEquals("2014-08-07T22:07:46Z", info.getPendingTime());
        Assert.assertEquals("m1.small", info.getInstanceType());
        Assert.assertEquals("ami-a49665cc", info.getImageId());
        Assert.assertEquals("i-6b2de041", info.getInstanceId());
        Assert.assertEquals("foo", info.getBillingProducts()[0]);
        Assert.assertEquals("x86_64", info.getArchitecture());
        Assert.assertEquals("599169622985", info.getAccountId());
        Assert.assertEquals("aki-919dcaf8", info.getKernelId());
        Assert.assertEquals("baz", info.getRamdiskId());
        Assert.assertEquals("us-east-1", info.getRegion());
        Assert.assertEquals("2010-08-31", info.getVersion());
        Assert.assertEquals("us-east-1b", info.getAvailabilityZone());
        Assert.assertEquals("10.201.215.38", info.getPrivateIp());
        Assert.assertEquals("bar", info.getDevpayProductCodes()[0]);
    }

    private static void runServer() throws IOException {
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

    private static void handleConnection(BufferedReader input,
            PrintWriter output) throws IOException {

        String line = input.readLine();
        if (line == null) {
            return;
        }

        String[] parts = line.split(" ");
        if (parts.length != 3) {
            throw new RuntimeException("Bogus request: " + line);
        }
        if (!"GET".equals(parts[0])) {
            throw new RuntimeException("Bogus verb: " + line);
        }

        ignoreRequest(input);

        String path = parts[1];
        if (path.equals("/latest/meta-data/iam/info")) {
            outputIamInfo(output);

        } else if (path.equals("/latest/meta-data/iam/security-credentials")) {
            outputIamCredList(output);

        } else if (path
                .startsWith("/latest/meta-data/iam/security-credentials/")) {

            outputIamCred(output);

        } else if (path.equals("/latest/dynamic/instance-identity/document")) {
            outputInstanceInfo(output);
        } else {
            throw new RuntimeException("Unknown path: " + path);
        }
    }

    private static void ignoreRequest(BufferedReader input) throws IOException {

        while (true) {
            String line = input.readLine();
            if (line == null) {
                throw new RuntimeException("Unexpected end of input");
            }
            if (line.length() == 0) {
                return;
            }
        }
    }

    private static void outputIamInfo(PrintWriter output) throws IOException {

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

    private static void outputIamCredList(PrintWriter output)
            throws IOException {

        String payload = "test1\ntest2";

        output.println("HTTP/1.1 200 OK");
        output.println("Connection: close");
        output.println("Content-Length: " + payload.length());
        output.println();

        output.print(payload);
        output.flush();
    }

    private static void outputIamCred(PrintWriter output) throws IOException {

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

    private static void outputInstanceInfo(PrintWriter output)
            throws IOException {
        String payload =
                "{"
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

        output.println("HTTP/1.1 200 OK");
        output.println("Connection: close");
        output.println("Content-Length: " + payload.length());
        output.println();

        output.print(payload);
        output.flush();
    }

    private static void killServer() throws IOException {
        if (server != null) {
            server.close();
        }
    }
}
