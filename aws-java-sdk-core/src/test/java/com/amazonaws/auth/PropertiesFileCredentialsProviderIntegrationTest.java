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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileWriter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit tests for the PropertiesFileCredentialsProvider.
 */
public class PropertiesFileCredentialsProviderIntegrationTest {

    private static String fileName = "propertiesCredentials";

    private static String data = "accessKey=testKey\nsecretKey=secretKey";

    private static File file = null;

    @BeforeClass
    public static void setUp() throws Exception {
        file = File.createTempFile(String.valueOf(System.currentTimeMillis()),
                fileName);

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write(data);
        } finally {
            fw.close();
        }
    }

    @AfterClass
    public static void tearDown() throws Exception {
        if (file != null) {
            file.delete();
        }
    }

    /** Tests that the credentials provider loads credentials appropriately */
    @Test
    public void testPropertiesCredentialsMethod() throws Exception {
        PropertiesFileCredentialsProvider provider = new PropertiesFileCredentialsProvider(
                file.getAbsolutePath());

        assertNotNull(provider.getCredentials());
        assertEquals(provider.getCredentials().getAWSAccessKeyId(), "testKey");
        assertEquals(provider.getCredentials().getAWSSecretKey(), "secretKey");
    }
}
