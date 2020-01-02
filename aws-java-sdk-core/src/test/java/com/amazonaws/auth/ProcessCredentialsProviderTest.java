/*
 * Copyright 2014-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    private final static String PROCESS_RESOURCE_PATH = "/resources/process/";
    private static String scriptLocation;

    @BeforeClass
    public static void setup() throws IOException {
        scriptLocation = copyCredentialsScript();
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
                                          .withCommand(scriptLocation + " accessKeyId secretAccessKey")
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
                                          .withCommand(scriptLocation + " accessKeyId secretAccessKey sessionToken")
                                          .withCredentialExpirationBuffer(0, TimeUnit.SECONDS)
                                          .build();

        AWSCredentials credentials = credentialsProvider.getCredentials();

        Assert.assertTrue(credentials instanceof AWSSessionCredentials);

        AWSSessionCredentials sessionCredentials = (AWSSessionCredentials) credentials;

        Assert.assertEquals("accessKeyId", sessionCredentials.getAWSAccessKeyId());
        Assert.assertEquals("secretAccessKey", sessionCredentials.getAWSSecretKey());
        Assert.assertEquals("sessionToken", sessionCredentials.getSessionToken());
    }

    @Test
    public void expirationBufferOverrideIsApplied() {
        ProcessCredentialsProvider credentialsProvider =
                ProcessCredentialsProvider.builder()
                                          .withCommand(scriptLocation + " accessKeyId secretAccessKey sessionToken " +
                                                               DateTime.parse("2018-12-11T17:46:28Z"))
                                          .withCredentialExpirationBuffer(10, TimeUnit.SECONDS)
                                          .build();
        credentialsProvider.getCredentials();

        Assert.assertTrue(DateTime.parse("2018-12-11T17:46:28Z").minusSeconds(10)
                                  .isEqual(credentialsProvider.getCredentialExpirationTime()));
    }

    @Test
    public void lackOfExpirationIsCachedForever() {
        ProcessCredentialsProvider credentialsProvider =
                ProcessCredentialsProvider.builder()
                        .withCommand(scriptLocation + " accessKeyId secretAccessKey sessionToken")
                        .withCredentialExpirationBuffer(20, TimeUnit.SECONDS)
                        .build();

        AWSCredentials request1 = credentialsProvider.getCredentials();
        AWSCredentials request2 = credentialsProvider.getCredentials();

        Assert.assertEquals(request1, request2);
    }

    @Test(expected = IllegalStateException.class)
    public void processOutputLimitIsEnforced() {
        ProcessCredentialsProvider.builder()
                                  .withCommand(scriptLocation + " STATIC_CREDENTIALS")
                                  .withProcessOutputLimit(1)
                                  .build()
                                  .getCredentials();
    }

    @Test
    public void processOutputLimitDefaultPassesLargeInput() {

        String LONG_SESSION_TOKEN = "lYzvmByqdS1E69QQVEavDDHabQ2GuYKYABKRA4xLbAXpdnFtV030UH4" +
                "bQoZWCDcfADFvBwBm3ixEFTYMjn5XQozpFV2QAsWHirCVcEJ5DC60KPCNBcDi4KLNJfbsp3r6kKTOmYOeqhEyiC4emDX33X2ppZsa5" +
                "1iwr6ShIZPOUPmuR4WDglmWubgO2q5tZv48xA5idkcHEmtGdoL343sY24q4gMh21eeBnF6ikjZdfvZ0Mn86UQ8r05AD346rSwM5bFs" +
                "t019ZkJIjLHD3HoKJ44EndRvSvQClXfJCmmQDH5INiXdFLLNm0dzT3ynbVIW5x1YYBWptyts4NUSy2eJ3dTPjYICpQVCkbuNVA7PqR" +
                "ctUyE8lU7uvnrIVnx9xTgl34J6D9VJKHQkPuGvbtN6w4CVtXoPAQcE8tlkKyOQmIeqEahhaqLW15t692SI6hwBW0b8DxCQawX5ukt4" +
                "f5gZoRFz3u8qHMSnm5oEnTgv7C5AAs0V680YvelFMNYvSoSbDnoThxfTIG9msj7WBh7iNa7mI8TXmvOegQtDWR011ZOo8dR3jnhWNH" +
                "nSW4CRB7iSC5DMZ2y56dYS28XGBl01LYXF5ZTJJfLwQEhbRWSTdXIBJq07E0YxRu0SaLokA4uknOoicwXnD7LMCld4hFjuypYgWBuk" +
                "3pC09CPA0MJjQNTTAvxGqDTqSWoXWDZRIMUWyGyz3FCkpPUjv4mIpVYt2bGl6cHsMBzVnpL6yXMCw2mNqJx8Rvi4gQaHH6LzvHbVKR" +
                "w4kE53703DNOc8cA9Zc0efJa4NHOFxc4XmMOtjGW7vbWPp0CTVCJLG94ddSFJrimpamPM59bs12x2ih51EpOFR5ITIxJnd79HEkYDU" +
                "xRIOuPIe4VpM01RnFN4g3ChDqmjQ03wQY9I8Mvh59u3MujggQfwAhCc84MAz0jVukoMfhAAhMNUPLuwRj0qpqr6B3DdKZ4KDFWF2Ga" +
                "Iu1sEFlKvPdfF1uefbTj6YdjUciWu1UBH47VbIcTbvbwmUiu2javB21kOenyDoelK5GUM4u0uPeXIOOhtZsJb8kz88h1joWkaKr2fc" +
                "jrIS08FM47Y4Z2Mi4zfwyN54L";

        ProcessCredentialsProvider credentialsProvider = ProcessCredentialsProvider.builder()
                .withCommand(scriptLocation + " accessKeyId secretAccessKey " + LONG_SESSION_TOKEN)
                .build();

        AWSCredentials credentials = credentialsProvider.getCredentials();

        Assert.assertTrue(credentials instanceof AWSSessionCredentials);

        AWSSessionCredentials sessionCredentials = (AWSSessionCredentials) credentials;

        Assert.assertEquals(sessionCredentials.getAWSAccessKeyId(),"accessKeyId");
        Assert.assertEquals(LONG_SESSION_TOKEN, sessionCredentials.getSessionToken());
    }

    public static String copyCredentialsScript() throws IOException {
        String scriptClasspathFilename = Platform.isWindows()
                ? "windows-credentials-script.bat"
                : "linux-credentials-script.sh";
        String scriptClasspathLocation = PROCESS_RESOURCE_PATH + scriptClasspathFilename;

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

            return scriptFileOnDisk.getAbsolutePath();
        } finally {
            IOUtils.closeQuietly(scriptInputStream, null);
            IOUtils.closeQuietly(scriptOutputStream, null);
        }
    }
}