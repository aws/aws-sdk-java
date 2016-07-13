/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.databind.JsonNode;

@SdkInternalApi
public final class EC2CredentialsUtils {

    private static final Log LOG = LogFactory.getLog(EC2CredentialsUtils.class);

    private static final int RETRY_COUNT = 5;

    /**
     * Connects to the given endpoint to read the resource
     * and returns the text contents.
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
     * @throws AmazonClientException
     *             If the requested service is not found.
     */
    public static String readResource(URI endpoint) throws IOException {
        URL url = endpoint.toURL();
        int retries = 0;
        InputStream inputStream = null;

        while (true) {
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setConnectTimeout(1000 * 2);
                connection.setReadTimeout(1000 * 5);
                connection.setRequestMethod("GET");
                connection.setDoOutput(true);
                // TODO should we autoredirect 3xx
                // connection.setInstanceFollowRedirects(false);
                connection.connect();

                // Reading response from the connection
                int statusCode = connection.getResponseCode();

                if (statusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = connection.getInputStream();
                    return IOUtils.toString(inputStream);
                } else if (statusCode == HttpURLConnection.HTTP_NOT_FOUND) {
                    // This is to preserve existing behavior of EC2 Instance metadata service.
                    throw new AmazonClientException("The requested metadata is not found at " + connection.getURL());
                } else {
                    if (statusCode >= 500 && statusCode < 600 && retries++ < RETRY_COUNT) {
                        continue;
                    }
                    inputStream = connection.getErrorStream();
                    handleErrorResponse(inputStream, statusCode, connection.getResponseMessage());
                }
            } catch (IOException ioException) {
                if (retries++ >= RETRY_COUNT) {
                    throw ioException;
                }
                LOG.debug("An IOException occured when connecting to service endpoint: " + url.toString()  + "\n Retrying to connect again.");
            } finally {
                IOUtils.closeQuietly(inputStream, LOG);
            }
        }
    }

    private static void handleErrorResponse(InputStream errorStream, int statusCode, String responseMessage) throws IOException {
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
