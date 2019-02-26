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

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.ContainerCredentialsProvider.FullUriCredentialsEndpointProvider;
import org.junit.AfterClass;
import org.junit.Test;
import utils.EnvironmentVariableHelper;

import java.net.URISyntaxException;
import java.util.Map;

public class FullUriCredentialsEndpointProviderTest {

    private static final EnvironmentVariableHelper helper = new EnvironmentVariableHelper();
    private static final FullUriCredentialsEndpointProvider sut = new FullUriCredentialsEndpointProvider();

    @AfterClass
    public static void restoreOriginal() {
        helper.reset();
    }

    @Test
    public void takesUriFromTheEnvironmentVariable() throws URISyntaxException {
        String fullUri = "http://localhost:8080/endpoint";
        helper.set(ContainerCredentialsProvider.CONTAINER_CREDENTIALS_FULL_URI, fullUri);

        assertThat(sut.getCredentialsEndpoint().toString(), equalTo(fullUri));
    }

    @Test
    public void theLoopbackAddressIsAlsoAcceptable() throws URISyntaxException {
        String fullUri = "http://127.0.0.1:9851/endpoint";
        helper.set(ContainerCredentialsProvider.CONTAINER_CREDENTIALS_FULL_URI, fullUri);

        assertThat(sut.getCredentialsEndpoint().toString(), equalTo(fullUri));
    }

    @Test(expected = SdkClientException.class)
    public void onlyLocalHostAddressesAreValid() throws URISyntaxException {
        helper.set(ContainerCredentialsProvider.CONTAINER_CREDENTIALS_FULL_URI, "https://google.com/endpoint");
        sut.getCredentialsEndpoint();
    }

    @Test
    public void authorizationHeaderIsPresentIfEnvironmentVariableSet() {
        helper.set(ContainerCredentialsProvider.CONTAINER_AUTHORIZATION_TOKEN, "hello authorized world!");
        Map<String, String> headers = sut.getHeaders();
        assertThat(headers.size(), equalTo(1));
        assertThat(headers, hasEntry("Authorization", "hello authorized world!"));
    }

}