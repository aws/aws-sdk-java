/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class ClientTlsAuthTestBase {
    protected static final String STORE_PASSWORD = "password";
    protected static final String CLIENT_STORE_TYPE = "pkcs12";
    protected static final String TEST_KEY_STORE = "/resources/client-tls-auth/server-keystore";
    protected static final String CLIENT_KEY_STORE = "/resources/client-tls-auth/client1.p12";

    protected static File tempDir;
    protected static File serverKeyStore;
    protected static File clientKeyStore;

    @BeforeClass
    public static void setUp() throws IOException {
        tempDir = new File(new File(System.getProperty("java.io.tmpdir")), ClientTlsAuthTestBase.class.getSimpleName() + System.currentTimeMillis());
        if (!tempDir.mkdirs()) {
            throw new RuntimeException(String.format("Unable to create temp directory '%s' for testing", tempDir.getAbsolutePath()));
        }

        copyCertsToTmpDir();
    }

    @AfterClass
    public static void teardown() throws IOException {
        FileUtils.deleteDirectory(tempDir);
    }


    private static void copyCertsToTmpDir() throws IOException {
        InputStream sksStream = ClientTlsAuthTestBase.class.getResourceAsStream(TEST_KEY_STORE);
        File sks = copyToTmpDir(sksStream, "server-keystore");

        InputStream cksStream = ClientTlsAuthTestBase.class.getResourceAsStream(CLIENT_KEY_STORE);
        File cks = copyToTmpDir(cksStream, "client1.p12");

        serverKeyStore = sks;
        clientKeyStore = cks;
    }

    protected static File copyToTmpDir(InputStream srcStream, String name) throws IOException {
        File dst = new File(tempDir, name);
        FileUtils.copyInputStreamToFile(srcStream, dst);
        return dst;
    }
}
