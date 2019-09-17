/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.SdkClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.retry.internal.CredentialsEndpointRetryParameters;
import com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.json.Jackson;
import com.amazonaws.util.VersionInfoUtils;
import com.fasterxml.jackson.databind.JsonNode;

@SdkInternalApi
public final class EC2CredentialsUtils {

    private static final Log LOG = LogFactory.getLog(EC2CredentialsUtils.class);

    private static EC2CredentialsUtils instance;

    private final ConnectionUtils connectionUtils;

    private static final String USER_AGENT = VersionInfoUtils.getUserAgent();

    private EC2CredentialsUtils() {
        this(ConnectionUtils.getInstance());
    }

    EC2CredentialsUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public static EC2CredentialsUtils getInstance() {
        if (instance == null) {
            instance = new EC2CredentialsUtils();
        }
        return instance;
    }

    /**
     * Connects to the given endpoint to read the resource
     * and returns the text contents.
     *
     * If the connection fails, the request will not be retried.
     *
     * @param endpoint
     *            The service endpoint to connect to.
     *
     * @return The text payload returned from the Amazon EC2 endpoint
     *         service for the specified resource path.
     *
     * @throws IOException
     *             If any problems were encountered while connecting to the
     *             service for the requested resource path.
     * @throws SdkClientException
     *             If the requested service is not found.
     */
    public String readResource(URI endpoint) throws IOException {
        return readResource(endpoint, CredentialsEndpointRetryPolicy.NO_RETRY, null);
    }

    /**
     * Connects to the given endpoint to read the resource
     * and returns the text contents.
     *
     * @param endpoint
     *            The service endpoint to connect to.
     *
     * @param retryPolicy
     *            The custom retry policy that determines whether a
     *            failed request should be retried or not.
     *
     * @return The text payload returned from the Amazon EC2 endpoint
     *         service for the specified resource path.
     *
     * @throws IOException
     *             If any problems were encountered while connecting to the
     *             service for the requested resource path.
     * @throws SdkClientException
     *             If the requested service is not found.
     */
    public String readResource(URI endpoint, CredentialsEndpointRetryPolicy retryPolicy, Map<String, String> headers) throws IOException {
        int retriesAttempted = 0;
        InputStream inputStream = null;

        headers = addDefaultHeaders(headers);

        while (true) {
            try {
                HttpURLConnection connection = connectionUtils.connectToEndpoint(endpoint, headers);

                int statusCode = connection.getResponseCode();

                if (statusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = connection.getInputStream();
                    return IOUtils.toString(inputStream);
                } else if (statusCode == HttpURLConnection.HTTP_NOT_FOUND) {
                    // This is to preserve existing behavior of EC2 Instance metadata service.
                    throw new SdkClientException("The requested metadata is not found at " + connection.getURL());
                } else {
                    if (!retryPolicy.shouldRetry(retriesAttempted++, CredentialsEndpointRetryParameters.builder().withStatusCode(statusCode).build())) {
                        inputStream = connection.getErrorStream();
                        handleErrorResponse(inputStream, statusCode, connection.getResponseMessage());
                    }
                }
            } catch (IOException ioException) {
                if (!retryPolicy.shouldRetry(retriesAttempted++, CredentialsEndpointRetryParameters.builder().withException(ioException).build())) {
                    throw ioException;
                }
                LOG.debug("An IOException occured when connecting to service endpoint: " + endpoint  + "\n Retrying to connect again.");
            } finally {
                IOUtils.closeQuietly(inputStream, LOG);
            }
        }

    }

    private Map<String,String> addDefaultHeaders(Map<String,String> headers) {
        HashMap<String, String> map = new HashMap<String, String>();
        if (headers != null) {
            map.putAll(headers);
        }

        putIfAbsent(map,"User-Agent", USER_AGENT);
        putIfAbsent(map,"Accept", "*/*");
        putIfAbsent(map,"Connection", "keep-alive");
        return map;
    }

    private <K,V> void putIfAbsent(Map<K,V> map, K key, V value) {
        if (map.get(key) == null) {
            map.put(key, value);
        }
    }

    private void handleErrorResponse(InputStream errorStream, int statusCode, String responseMessage) throws IOException {
        String errorCode = null;

        // Parse the error stream returned from the service.
        if(errorStream != null) {
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
}
