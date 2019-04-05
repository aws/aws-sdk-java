/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth;

import com.amazonaws.util.IOUtils;
import com.amazonaws.util.Platform;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProcessCredentialsProviderTest {
    private static String scriptLocation;

    @BeforeClass
    public static void setup() throws IOException {
        String scriptClasspathFilename = Platform.isWindows() ? "windows-credentials-script.bat"
                                                              : "linux-credentials-script.sh";
        String scriptClasspathLocation = "/resources/process/" + scriptClasspathFilename;

        InputStream scriptInputStream = null;
        OutputStream scriptOutputStream = null;

        try {
            scriptInputStream = ProcessCredentialsProviderTest.class.getResourceAsStream(scriptClasspathLocation);

            File scriptFileOnDisk = File.createTempFile("ProcessCredentialsProviderTest", scriptClasspathFilename);
            scriptFileOnDisk.deleteOnExit();

            if (!scriptFileOnDisk.setExecutable(true)) {
                throw new IllegalStateException("Could not make " + scriptFileOnDisk + " executable.");
            }

            scriptOutputStream = new FileOutputStream(scriptFileOnDisk);

            IOUtils.copy(scriptInputStream, scriptOutputStream);

            scriptLocation = scriptFileOnDisk.getAbsolutePath();
        } finally {
            IOUtils.closeQuietly(scriptInputStream, null);
            IOUtils.closeQuietly(scriptOutputStream, null);
        }
    }

    @AfterClass
    public static void teardown() {
        if (scriptLocation != null && !new File(scriptLocation).delete()) {
            throw new IllegalStateException("Failed to delete file: " + scriptLocation);
        }
    }

    @Test
    public void staticCredentialsCanBeLoaded() {
        AWSCredentials credentials =
                ProcessCredentialsProvider.builder()
                                          .withCommand(scriptLocation + " STATIC_CREDENTIALS")
                                          .build()
                                          .getCredentials();

        Assert.assertFalse(credentials instanceof AWSSessionCredentials);
        Assert.assertEquals("accessKeyId", credentials.getAWSAccessKeyId());
        Assert.assertEquals("secretAccessKey", credentials.getAWSSecretKey());
    }

    @Test
    public void sessionCredentialsCanBeLoaded() {
        ProcessCredentialsProvider credentialsProvider =
                ProcessCredentialsProvider.builder()
                                          .withCommand(scriptLocation + " SESSION_CREDENTIALS")
                                          .withCredentialExpirationBuffer(0, TimeUnit.SECONDS)
                                          .build();

        AWSCredentials credentials = credentialsProvider.getCredentials();

        Assert.assertTrue(credentials instanceof AWSSessionCredentials);

        AWSSessionCredentials sessionCredentials = (AWSSessionCredentials) credentials;

        Assert.assertEquals("accessKeyId", sessionCredentials.getAWSAccessKeyId());
        Assert.assertEquals("secretAccessKey", sessionCredentials.getAWSSecretKey());
        Assert.assertEquals("sessionToken", sessionCredentials.getSessionToken());
        Assert.assertTrue(DateTime.parse("2018-12-11T17:46:28Z")
                                  .isEqual(credentialsProvider.getCredentialExpirationTime()));
    }

    @Test
    public void expirationBufferOverrideIsApplied() {
        ProcessCredentialsProvider credentialsProvider =
                ProcessCredentialsProvider.builder()
                                          .withCommand(scriptLocation + " SESSION_CREDENTIALS")
                                          .withCredentialExpirationBuffer(10, TimeUnit.SECONDS)
                                          .build();
        credentialsProvider.getCredentials();

        Assert.assertTrue(DateTime.parse("2018-12-11T17:46:28Z").minusSeconds(10)
                                  .isEqual(credentialsProvider.getCredentialExpirationTime()));
    }

    @Test(expected = IllegalStateException.class)
    public void processOutputLimitIsEnforced() {
        ProcessCredentialsProvider.builder()
                                  .withCommand(scriptLocation + " STATIC_CREDENTIALS")
                                  .withProcessOutputLimit(1)
                                  .build()
                                  .getCredentials();
    }
}