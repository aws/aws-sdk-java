/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.internal.auth.DefaultSignerProvider;
import com.amazonaws.internal.auth.SignerProvider;
import com.amazonaws.internal.auth.SignerProviderContext;
import org.junit.Before;
import org.junit.Test;
import utils.http.WireMockTestBase;

import static com.amazonaws.auth.internal.SignerConstants.AUTHORIZATION;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class AmazonHttpClientMockTest extends WireMockTestBase {
    private static final String OPERATION = "/some-operation";
    private static final String HEADER = "Some-Header";
    private static final String CONFIG_HEADER_VALUE = "client config header value";
    private static final String REQUEST_HEADER_VALUE = "request header value";

    @Before
    public void setUp() {
        stubFor(any(urlPathEqualTo(OPERATION)).willReturn(aResponse()));
    }

    @Test
    public void headersSpecifiedInClientConfigurationArePutOnRequest() throws Exception {
        Request<?> request = newGetRequest(OPERATION);

        AmazonHttpClient sut = createClient(HEADER, CONFIG_HEADER_VALUE);
        sut.requestExecutionBuilder().request(request).execute();

        verify(getRequestedFor(urlPathEqualTo(OPERATION)).withHeader(HEADER, matching(CONFIG_HEADER_VALUE)));
    }

    @Test
    public void headersOnRequestsWinOverClientConfigurationHeaders() throws Exception {
        Request<?> request = newGetRequest(OPERATION);
        request.getOriginalRequest().putCustomRequestHeader(HEADER, REQUEST_HEADER_VALUE);

        AmazonHttpClient sut = createClient(HEADER, CONFIG_HEADER_VALUE);

        sut.requestExecutionBuilder().request(request).execute();

        verify(getRequestedFor(urlPathEqualTo(OPERATION)).withHeader(HEADER, matching(REQUEST_HEADER_VALUE)));
    }

    @Test
    public void canHandleOptionsRequest() throws Exception {
        Request<?> request = newRequest(OPERATION);
        request.setHttpMethod(HttpMethodName.OPTIONS);

        AmazonHttpClient sut = new AmazonHttpClient(new ClientConfiguration());
        sut.requestExecutionBuilder().request(request).execute();

        verify(optionsRequestedFor(urlPathEqualTo(OPERATION)));
    }

    @Test
    public void signerServiceNameHandlerContextKeyAbsent_shouldNotOverride() throws Exception {
        Request<?> request = newGetRequest(OPERATION);
        AmazonHttpClient client = createClient(HEADER, CONFIG_HEADER_VALUE);
        ExecutionContext context = ExecutionContext.builder()
                                                            .withSignerProvider(new TestSignerProvider())
                                                            .build();
        context.setCredentialsProvider(new AWSStaticCredentialsProvider(new BasicAWSCredentials("test", "test")));
        client.requestExecutionBuilder().request(request).executionContext(context).execute();
        verify(getRequestedFor(urlPathEqualTo(OPERATION)).withHeader(AUTHORIZATION, containing("foo-service")));
    }

    @Test
    public void signerServiceNameHandlerContextKeyPresent_signerOverridden_shouldNotOverride() throws Exception {
        Request<?> request = newGetRequest(OPERATION);
        request.addHandlerContext(HandlerContextKey.SIGNING_NAME, "bar-service");

        AmazonHttpClient client = new AmazonHttpClient(new ClientConfiguration().withSignerOverride("AWS4Signer"));

        ExecutionContext context = ExecutionContext.builder()
                                                   .withSignerProvider(new TestSignerProvider())
                                                   .build();
        context.setCredentialsProvider(new AWSStaticCredentialsProvider(new BasicAWSCredentials("test", "test")));
        client.requestExecutionBuilder().request(request).executionContext(context).execute();

        verify(getRequestedFor(urlPathEqualTo(OPERATION)).withHeader(AUTHORIZATION, containing("foo-service")));
    }

    private AmazonHttpClient createClient(String headerName, String headerValue) {
        ClientConfiguration clientConfiguration = new ClientConfiguration().withHeader(headerName, headerValue);
        return new AmazonHttpClient(clientConfiguration);
    }

    private class TestSignerProvider extends SignerProvider {
        @Override
        public Signer getSigner(SignerProviderContext context) {
            AWS4Signer signer = new AWS4Signer();
            signer.setServiceName("foo-service");
            return signer;
        }
    }
}
