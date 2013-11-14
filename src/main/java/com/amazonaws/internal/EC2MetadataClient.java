/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import static com.amazonaws.SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;

/**
 * Simple client for accessing the Amazon EC2 Instance Metadata Service.
 */
public class EC2MetadataClient {


    /** Default endpoint for the Amazon EC2 Instance Metadata Service. */
    private static final String EC2_METADATA_SERVICE_URL = "http://169.254.169.254";

    /** Default resource path for credentials in the Amazon EC2 Instance Metadata Service. */
    public static final String SECURITY_CREDENTIALS_RESOURCE = "/latest/meta-data/iam/security-credentials/";

    private static final Log log = LogFactory.getLog(EC2MetadataClient.class);

    /**
     * Connects to the Amazon EC2 Instance Metadata Service to retrieve the
     * default credential information (if any).
     *
     * @return The response from the Amazon EC2 Instance Metadata Service, or
     *         null if no credential information was available.
     *
     * @throws IOException
     *             If any problems are encountered while connecting to the
     *             Amazon EC2 Instance Metadata Service.
     */
    public String getDefaultCredentials() throws IOException {
        String securityCredentialsList = readResource(SECURITY_CREDENTIALS_RESOURCE);

        securityCredentialsList = securityCredentialsList.trim();
        String[] securityCredentials = securityCredentialsList.split("\n");
        if (securityCredentials.length == 0) return null;

        String securityCredentialsName = securityCredentials[0];

        return readResource(SECURITY_CREDENTIALS_RESOURCE + securityCredentialsName);
    }

    /**
     * Connects to the metadata service to read the specified resource and
     * returns the text contents.
     *
     * @param resourcePath
     *            The resource
     *
     * @return The text payload returned from the Amazon EC2 Instance Metadata
     *         service for the specified resource path.
     *
     * @throws IOException
     *             If any problems were encountered while connecting to metadata
     *             service for the requested resource path.
     * @throws AmazonClientException
     *             If the requested metadata service is not found.
     */
    public String readResource(String resourcePath) throws IOException, AmazonClientException {
        URL url = getEc2MetadataServiceUrlForResource(resourcePath);
        log.debug("Connecting to EC2 instance metadata service at URL: " + url.toString());

        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setConnectTimeout(1000 * 2);
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.connect();

        return readResponse(connection);
    }


    /**
     * Reads a response from the Amazon EC2 Instance Metadata Service and
     * returns the content as a string.
     *
     * @param connection
     *            The connection to the Amazon EC2 Instance Metadata Service.
     *
     * @return The content contained in the response from the Amazon EC2
     *         Instance Metadata Service.
     *
     * @throws IOException
     *             If any problems ocurred while reading the response.
     */
    private String readResponse(HttpURLConnection connection) throws IOException {
    	if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND)
    		throw new AmazonClientException("The requested metadata is not found at " + connection.getURL());
    	
        InputStream inputStream = connection.getInputStream();

        try {
            StringBuilder buffer = new StringBuilder();
            while (true) {
                int c = inputStream.read();
                if (c == -1) break;
                buffer.append((char)c);
            }

            return buffer.toString();
        } finally {
            inputStream.close();
        }
    }

    /**
     * Constructs a URL to the EC2 metadata service for the specified
     * resource path.
     *
     * @param resourcePath
     *            The resource portion of the URL.
     *
     * @return A URL to the EC2 metadata service for the specified resource
     *         path.
     *
     * @throws IOException
     *             If a valid URL could not be constructed.
     */
    private URL getEc2MetadataServiceUrlForResource(String resourcePath) throws IOException {
        String endpoint = EC2_METADATA_SERVICE_URL;
        if (System.getProperty(EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY) != null) {
            endpoint = System.getProperty(EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY);
        }

        return new URL(endpoint + resourcePath);
    }
}