/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy;
import com.amazonaws.util.EC2MetadataUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Fetch resources from EC2 Instance Metadata Service.
 */
@SdkInternalApi
public final class InstanceMetadataServiceResourceFetcher extends EC2ResourceFetcher {
    private static final Log LOG = LogFactory.getLog(InstanceMetadataServiceResourceFetcher.class);

    private static final String EC2_TOKEN_ROOT = "/latest/api/token";
    private static final String TOKEN_TTL_HEADER = "x-aws-ec2-metadata-token-ttl-seconds";
    private static final String TOKEN_HEADER = "x-aws-ec2-metadata-token";
    private static final String DEFAULT_TOKEN_TTL = "21600";

    private InstanceMetadataServiceResourceFetcher() {
    }

    @SdkTestInternalApi
    InstanceMetadataServiceResourceFetcher(ConnectionUtils connectionUtils) {
        super(connectionUtils);
    }

    public static InstanceMetadataServiceResourceFetcher getInstance() {
        return InstanceMetadataServiceResourceFetcherHolder.INSTANCE;
    }

    /**
     * Connects to the given endpoint to read the resource
     * and returns the text contents.
     *
     */
    @Override
    public String readResource(URI endpoint, CredentialsEndpointRetryPolicy retryPolicy, Map<String, String> headers) {
        if (SDKGlobalConfiguration.isEc2MetadataDisabled()) {
            throw new AmazonClientException("EC2 Instance Metadata Service is disabled");
        }

        Map<String, String> newHeaders = addDefaultHeaders(headers);
        String token = getToken();

        if (token != null) {
            newHeaders.put(TOKEN_HEADER, token);
        }

        return doReadResource(endpoint, retryPolicy, newHeaders);
    }

    /**
     * Retrieve the token
     *
     * @return the token
     */
    private String getToken() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(TOKEN_TTL_HEADER, DEFAULT_TOKEN_TTL);

        String token = null;
        String host = EC2MetadataUtils.getHostAddressForEC2MetadataService();

        try {
            token = doReadResource(URI.create(host + EC2_TOKEN_ROOT), CredentialsEndpointRetryPolicy.NO_RETRY, headers, "PUT");
        } catch (SdkClientException e) {
           handleException(e);
        }

        return token;
    }

    private void handleException(SdkClientException e) {
        if (isTokenUnsupported(e)) {
            LOG.debug("Token is not supported. Ignoring ");
            return;
        }

        LOG.warn("Fail to retrieve token ", e);
        throw e;
    }

    /**
     * Token is unsupported if the exception is a non-retryable, non-400 status code or the exception is caused by timeout
     */
    private boolean isTokenUnsupported(SdkClientException sdkClientException) {
        if (sdkClientException instanceof AmazonServiceException) {
            AmazonServiceException serviceException = (AmazonServiceException) sdkClientException;
            return serviceException.getStatusCode() != 400 && !isRetryable(serviceException.getCause()) &&
                   !isRetryable(serviceException.getStatusCode());
        }

        return  sdkClientException.getCause() instanceof SocketTimeoutException ||
                sdkClientException.getMessage().contains("The requested metadata is not found at ");
    }

    private boolean isRetryable(int statusCode) {
        return statusCode >= 500 && statusCode < 600;
    }

    private boolean isRetryable(Throwable exception) {
        return exception instanceof IOException;
    }

    private static final class InstanceMetadataServiceResourceFetcherHolder {
        private static final InstanceMetadataServiceResourceFetcher INSTANCE = new InstanceMetadataServiceResourceFetcher();
    }
}
