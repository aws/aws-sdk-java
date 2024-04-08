/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.auth;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;

import com.amazonaws.auth.ContainerCredentialsProvider.FullUriCredentialsEndpointProvider;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.EnvironmentVariableHelper;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

public class FullUriCredentialsEndpointProviderIntegrationTest {

    private static final EnvironmentVariableHelper helper = new EnvironmentVariableHelper();
    private static final FullUriCredentialsEndpointProvider sut = new FullUriCredentialsEndpointProvider();

private static String fileName = "tokenFile";

    private static String data = "hello authorized world!";

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
        helper.reset();

        if (file != null) {
            file.delete();
        }
    }

    @Test
    public void authorizationHeaderIsPresentIfEnvironmentVariableSet() {
        helper.set(ContainerCredentialsProvider.CONTAINER_AUTHORIZATION_TOKEN_FILE, file.getAbsolutePath());
        Map<String, String> headers = sut.getHeaders();
        assertThat(headers.size(), equalTo(1));
        assertThat(headers, hasEntry("Authorization", "hello authorized world!"));
    }

}