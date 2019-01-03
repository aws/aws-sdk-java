/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SignableRequest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_CONTENT_SHA256;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AWS4UnsignedPayloadRequest {
    private static final Date SIGNING_DATE = new Date(System.currentTimeMillis());
    private static final AWS4UnsignedPayloadSigner UNSIGNED_PAYLOAD_SIGNER = new AWS4UnsignedPayloadSigner(new SdkClock.MockClock(SIGNING_DATE));
    private static final AWSCredentials CREDENTIALS = new BasicAWSCredentials("akid", "skid");

    @BeforeClass
    public static void setUp() {
        UNSIGNED_PAYLOAD_SIGNER.setOverrideDate(SIGNING_DATE);
        UNSIGNED_PAYLOAD_SIGNER.setServiceName("test-service");
        UNSIGNED_PAYLOAD_SIGNER.setRegionName("test-region");
    }

    @Test
    public void doesNotComputeContentHash_HTTPS() throws UnsupportedEncodingException {
        SignableRequest<?> request1 = MockRequestBuilder.create()
                .withEndpoint("https://test-service.example.com")
                .withContent(new ByteArrayInputStream("CONTENT-1".getBytes("UTF-8")))
                .withHeader("headerName", "headerValue")
                .withParameter("parameterName", "parameterValue")
                .build();

        SignableRequest<?> request2 = MockRequestBuilder.create()
                .withEndpoint("https://test-service.example.com")
                .withContent(new ByteArrayInputStream("CONTENT-2".getBytes("UTF-8")))
                .withHeader("headerName", "headerValue")
                .withParameter("parameterName", "parameterValue")
                .build();

        UNSIGNED_PAYLOAD_SIGNER.sign(request1, CREDENTIALS);
        UNSIGNED_PAYLOAD_SIGNER.sign(request2, CREDENTIALS);

        assertThat(request1.getHeaders().get("Authorization"), is(equalTo(request2.getHeaders().get("Authorization"))));
    }

    @Test
    public void computesContentHash_HTTP() throws UnsupportedEncodingException {

        SignableRequest<?> request = MockRequestBuilder.create()
                .withEndpoint("http://test-service.example.com")
                .withHeader("headerName", "headerValue")
                .withParameter("parameterName", "parameterValue")
                .withContent(new ByteArrayInputStream("".getBytes("UTF-8")))
                .build();

        UNSIGNED_PAYLOAD_SIGNER.sign(request, CREDENTIALS);
        assertThat(request.getHeaders().get(X_AMZ_CONTENT_SHA256), is(equalTo("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")));
    }

    @Test
    public void setsContentSha256Header() throws UnsupportedEncodingException {
        SignableRequest<?> request1 = MockRequestBuilder.create()
                .withEndpoint("https://test-service.example.com")
                .withHeader("headerName", "headerValue")
                .withParameter("parameterName", "parameterValue")
                .withContent(new ByteArrayInputStream("content".getBytes("UTF-8")))
                .build();

        UNSIGNED_PAYLOAD_SIGNER.sign(request1, CREDENTIALS);
        assertThat(request1.getHeaders().get(X_AMZ_CONTENT_SHA256), is(equalTo("UNSIGNED-PAYLOAD")));
    }
}
