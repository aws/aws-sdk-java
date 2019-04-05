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
 */package com.amazonaws.internal.auth;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SignableRequest;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.NoOpSigner;
import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.ServiceAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.auth.SignerTypeAware;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URI;
import java.net.URISyntaxException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSignerProviderTest {
    public static final Signer DEFAULT_SIGNER = new NoOpSigner();
    private static final String ENDPOINT = "https://mockservice.us-east-1.amazonaws.com";
    private static final Request<?> signerAwareRequest = new DefaultRequest<FooSignedRequest>(new FooSignedRequest(), "MockService");
    private static final Request<?> nonSignerAwareRequest = new DefaultRequest<NonSignerTypeAware>(new NonSignerTypeAware(), "MockService");

    private DefaultSignerProvider defaultSignerProvider;

    @Mock
    private AmazonWebServiceClient mockClient;

    @BeforeClass
    public static void setUp() throws URISyntaxException {
        SignerFactory.registerSigner("FooSignerType", FooSigner.class);
        URI endpoint = new URI(ENDPOINT);
        signerAwareRequest.setEndpoint(endpoint);
        nonSignerAwareRequest.setEndpoint(endpoint);
    }

    @Before
    public void methodSetUp() {
        defaultSignerProvider = new DefaultSignerProvider(mockClient, DEFAULT_SIGNER);
    }

    @Test
    public void usesDefaultIfSignerOverridden() {
        when(mockClient.getSignerOverride()).thenReturn("NoOpSignerType");

        SignerProviderContext ctx = SignerProviderContext.builder()
                .withRequest(signerAwareRequest)
                .build();

        assertThat(defaultSignerProvider.getSigner(ctx), is(equalTo(DEFAULT_SIGNER)));
    }

    @Test
    public void usesDefaultIfNotSignerAware() {
        SignerProviderContext ctx = SignerProviderContext.builder()
                .withRequest(nonSignerAwareRequest)
                .build();

        assertThat(defaultSignerProvider.getSigner(ctx), is(equalTo(DEFAULT_SIGNER)));
    }

    @Test
    public void usesOperationSignerType() {
        SignerProviderContext ctx = SignerProviderContext.builder()
                .withRequest(signerAwareRequest)
                .build();

        assertThat(defaultSignerProvider.getSigner(ctx) instanceof FooSigner, is(true));
    }

    @Test
    public void configuresServiceAndRegionWhenUsingOperationSigner() throws URISyntaxException {
        when(mockClient.getServiceName()).thenReturn("MockService");

        SignerProviderContext ctx = SignerProviderContext.builder()
                .withRequest(signerAwareRequest)
                .build();

        Signer signer = defaultSignerProvider.getSigner(ctx);

        FooSigner fooSigner = (FooSigner) signer;

        assertThat(fooSigner.getRegionName(), is(equalTo("us-east-1")));
        assertThat(fooSigner.getServiceName(), is(equalTo("MockService")));
    }

    @Test
    public void testSignerRegionWhenUsingNonStandardEndpoint() throws URISyntaxException {
        when(mockClient.getServiceName()).thenReturn("MockService");
        when(mockClient.getEndpointPrefix()).thenReturn("MockEndpointPrefix");

        Request<?> signerAwareRequest = new DefaultRequest<FooSignedRequest>(new FooSignedRequest(), "MockService");
        String bjsEndpoint = "https://MockEndpointPrefix.cn-north-1.amazonaws.com.cn";
        signerAwareRequest.setEndpoint(new URI(bjsEndpoint));

        SignerProviderContext ctx = SignerProviderContext.builder()
                .withRequest(signerAwareRequest)
                .build();

        Signer signer = defaultSignerProvider.getSigner(ctx);

        FooSigner fooSigner = (FooSigner) signer;

        assertThat(fooSigner.getRegionName(), is(equalTo("cn-north-1")));
        assertThat(fooSigner.getServiceName(), is(equalTo("MockService")));
    }

    @Test
    public void usesDefaultSignerWhenNoRequest() {
        SignerProviderContext ctx = SignerProviderContext.builder().build();
        assertThat(defaultSignerProvider.getSigner(ctx) == DEFAULT_SIGNER, is(true));
    }


    public static class FooSigner implements Signer, RegionAwareSigner, ServiceAwareSigner {
        private String regionName;
        private String serviceName;

        @Override
        public void sign(SignableRequest<?> request, AWSCredentials credentials) {

        }

        @Override
        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        public String getRegionName() {
            return regionName;
        }

        @Override
        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;

        }

        public String getServiceName() {
            return serviceName;
        }
    }

    private static class NonSignerTypeAware extends AmazonWebServiceRequest {
    }

    private static class FooSignedRequest extends AmazonWebServiceRequest implements SignerTypeAware {

        @Override
        public String getSignerType() {
            return "FooSignerType";
        }
    }
}
