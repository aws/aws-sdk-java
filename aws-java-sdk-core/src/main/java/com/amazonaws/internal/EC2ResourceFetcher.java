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


import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.retry.internal.CredentialsEndpointRetryParameters;
import com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.VersionInfoUtils;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SdkInternalApi
public abstract class EC2ResourceFetcher {

    private static final Log LOG = LogFactory.getLog(EC2ResourceFetcher.class);

    private final ConnectionUtils connectionUtils;

    private static final String USER_AGENT = VersionInfoUtils.getUserAgent();

    EC2ResourceFetcher() {
        connectionUtils = ConnectionUtils.getInstance();
    }

    @SdkTestInternalApi
    EC2ResourceFetcher(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public static EC2ResourceFetcher defaultResourceFetcher() {
        return DefaultEC2ResourceFetcher.DEFAULT_BASE_RESOURCE_FETCHER;
    }

    public abstract String readResource(URI endpoint, CredentialsEndpointRetryPolicy retryPolicy, Map<String, String> headers);

    public final String readResource(URI endpoint) {
        return readResource(endpoint, CredentialsEndpointRetryPolicy.NO_RETRY, null);
    }

    public final String readResource(URI endpoint, CredentialsEndpointRetryPolicy retryPolicy) {
        return readResource(endpoint, retryPolicy, null);
    }

    final String doReadResource(URI endpoint, CredentialsEndpointRetryPolicy retryPolicy, Map<String, String> headers) {
        return doReadResource(endpoint, retryPolicy, headers, "GET");
    }

    final String doReadResource(URI endpoint, CredentialsEndpointRetryPolicy retryPolicy, Map<String, String> headers, String method) {
        int retriesAttempted = 0;
        InputStream inputStream = null;
        Map<String, String> headersToSent = addDefaultHeaders(headers);
        while (true) {
            try {

                HttpURLConnection connection = connectionUtils.connectToEndpoint(endpoint, headersToSent, method);

                int statusCode = connection.getResponseCode();

                if (statusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = connection.getInputStream();
                    return IOUtils.toString(inputStream);
                } else if (statusCode == HttpURLConnection.HTTP_NOT_FOUND) {
                    // This is to preserve existing behavior of EC2 Instance metadata service.
                    throw new SdkClientException("The requested metadata is not found at " + connection.getURL());
                } else {
                    if (!retryPolicy.shouldRetry(retriesAttempted++,
                                                 CredentialsEndpointRetryParameters.builder().withStatusCode(statusCode).build())) {
                        inputStream = connection.getErrorStream();
                        handleErrorResponse(inputStream, statusCode, connection.getResponseMessage());
                    }
                }
            } catch (IOException ioException) {
                if (!retryPolicy.shouldRetry(retriesAttempted++,
                                             CredentialsEndpointRetryParameters.builder().withException(ioException).build())) {
                    throw new SdkClientException("Failed to connect to service endpoint: ", ioException);
                }
                LOG.debug("An IOException occurred when connecting to service endpoint: " + endpoint + "\n Retrying to connect "
                          + "again.");
            } finally {
                IOUtils.closeQuietly(inputStream, LOG);
            }
        }
    }


    protected final Map<String, String> addDefaultHeaders(Map<String, String> headers) {
        HashMap<String, String> map = new HashMap<String, String>();
        if (headers != null) {
            map.putAll(headers);
        }

        putIfAbsent(map, "User-Agent", USER_AGENT);
        putIfAbsent(map, "Accept", "*/*");
        putIfAbsent(map, "Connection", "keep-alive");
        return map;
    }

    private <K, V> void putIfAbsent(Map<K, V> map, K key, V value) {
        if (map.get(key) == null) {
            map.put(key, value);
        }
    }

    private void handleErrorResponse(InputStream errorStream, int statusCode, String responseMessage) throws IOException {
        String errorCode = null;

        // Parse the error stream returned from the service.
        if (errorStream != null) {
            String errorResponse = IOUtils.toString(errorStream);

            try {
                JsonNode node = Jackson.jsonNodeOf(errorResponse);
                JsonNode code = node.get("code");
                JsonNode message = node.get("message");
                if (code != null && message != null) {
                    errorCode = code.asText();
                    responseMessage = message.asText();
                }
            } catch (Exception exception) {
                LOG.debug("Unable to parse error stream");
            }
        }

        AmazonServiceException ase = new AmazonServiceException(responseMessage);
        ase.setStatusCode(statusCode);
        ase.setErrorCode(errorCode);
        throw ase;
    }

    static final class DefaultEC2ResourceFetcher extends EC2ResourceFetcher {
        private static final DefaultEC2ResourceFetcher DEFAULT_BASE_RESOURCE_FETCHER = new DefaultEC2ResourceFetcher();

        DefaultEC2ResourceFetcher() {
        }

        @SdkTestInternalApi
        DefaultEC2ResourceFetcher(ConnectionUtils connectionUtils) {
            super(connectionUtils);
        }

        @Override
        public String readResource(URI endpoint, CredentialsEndpointRetryPolicy retryPolicy, Map<String, String> headers) {
            return doReadResource(endpoint, retryPolicy, headers);
        }
    }
}
