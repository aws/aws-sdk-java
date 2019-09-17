/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.SdkClock;
import com.amazonaws.auth.StaticSignerProvider;
import com.amazonaws.auth.presign.PresignerFacade;
import com.amazonaws.auth.presign.PresignerParams;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.internal.auth.SignerProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.util.ImmutableMapParameter;

import org.joda.time.DateTime;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Date;

import static com.amazonaws.util.ValidationUtils.assertNotNull;
import static com.amazonaws.util.ValidationUtils.assertStringNotEmpty;

/**
 * Provides authorization tokens for IAM authentication to an RDS database.
 */
@ThreadSafe
public class RdsIamAuthTokenGenerator {

    private static final String SERVICE_NAME = "rds-db";

    private static final int DEFAULT_EXPIRATION_IN_MINUTES = 15;

    private final PresignerFacade presignerFacade;
    private final SdkClock clock;

    /**
     * @param credentialsProvider Credentials to use to sign the auth token.
     * @param region              Region the database is located in.
     */
    private RdsIamAuthTokenGenerator(AWSCredentialsProvider credentialsProvider, String region) {
        this(PresignerParams.builder()
                     .credentialsProvider(assertNotNull(credentialsProvider, "credentialsProvider"))
                     .signerProvider(createSignerProvider(region))
                     .build());
    }

    @SdkTestInternalApi
    RdsIamAuthTokenGenerator(PresignerParams presignerParams) {
        this.presignerFacade = new PresignerFacade(presignerParams);
        this.clock = presignerParams.clock();
    }

    private static SignerProvider createSignerProvider(String region) {
        AWS4Signer signer = new AWS4Signer();
        signer.setRegionName(assertStringNotEmpty(region, "region"));
        signer.setServiceName(SERVICE_NAME);
        return new StaticSignerProvider(signer);
    }

    /**
     * Create an authorization token used to connect to a database that uses RDS IAM authentication.
     */
    public String getAuthToken(GetIamAuthTokenRequest request) throws AmazonClientException {
        DefaultRequest<Void> signableRequest = new DefaultRequest<Void>(SERVICE_NAME);
        signableRequest.setResourcePath("/");
        setEndpoint(signableRequest, request);
        setParameters(signableRequest, request);
        signableRequest.setHttpMethod(HttpMethodName.GET);
        return presignerFacade.presign(signableRequest, getExpirationDate()).toExternalForm().replaceFirst("http://", "");
    }

    private void setEndpoint(DefaultRequest<Void> signableRequest, GetIamAuthTokenRequest request) {
        try {
            // Add the protocol to make the signer happy
            signableRequest.setEndpoint(new URI(String.format("http://%s:%d", request.getHostname(), request.getPort())));
        } catch (URISyntaxException e) {
            throw new AmazonClientException("Invalid endpoint provided", e);
        }
    }

    private void setParameters(DefaultRequest<Void> signableRequest, GetIamAuthTokenRequest request) {
        signableRequest.setParameters(ImmutableMapParameter.of(
                "DBUser", Collections.singletonList(request.getUserName()),
                "Action", Collections.singletonList("connect")));
    }

    private Date getExpirationDate() {
        return new DateTime(clock.currentTimeMillis()).plusMinutes(DEFAULT_EXPIRATION_IN_MINUTES).toDate();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private AWSCredentialsProvider credentialsProvider;
        private String region;

        private Builder() {
        }

        public Builder credentials(AWSCredentialsProvider credentialsProvider) {
            this.credentialsProvider = credentialsProvider;
            return this;
        }

        public Builder region(Region region) {
            this.region = region.getName();
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public RdsIamAuthTokenGenerator build() {
            return new RdsIamAuthTokenGenerator(credentialsProvider, region);
        }

    }

}
