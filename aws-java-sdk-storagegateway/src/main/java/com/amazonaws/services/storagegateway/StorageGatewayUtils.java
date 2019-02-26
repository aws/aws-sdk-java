/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import com.amazonaws.AmazonClientException;
import com.amazonaws.regions.Region;

/**
 * Utilities for working with the AWS Storage Gateway service, such as
 * requesting a running AWS Storage Gateway instances's activation key for
 * registering a Storage Gateway server.
 */
public class StorageGatewayUtils {

    /**
     * Sends a request to the AWS Storage Gateway server running at the
     * specified address, and returns the activation key for that server.
     * 
     * @param gatewayAddress
     *            The DNS name or IP address of a running AWS Storage Gateway
     * 
     * @return The activation key required for some API calls to AWS Storage
     *         Gateway.
     * 
     * @throws AmazonClientException
     *             If any problems are encountered while trying to contact the
     *             remote AWS Storage Gateway server.
     */
    public static String getActivationKey(String gatewayAddress) throws AmazonClientException {
        return getActivationKey(gatewayAddress, (String)null);
    }

    /**
     * Sends a request to the AWS Storage Gateway server running at the
     * specified address, and returns the activation key for that server.
     * 
     * @param gatewayAddress
     *            The DNS name or IP address of a running AWS Storage Gateway
     * 
     * @param activationRegionName
     *            The region in which the gateway will be activated.
     * 
     * @return The activation key required for some API calls to AWS Storage
     *         Gateway.
     * 
     * @throws AmazonClientException
     *             If any problems are encountered while trying to contact the
     *             remote AWS Storage Gateway server.
     */
    public static String getActivationKey(String gatewayAddress, Region activationRegion) throws AmazonClientException {
        return getActivationKey(gatewayAddress, 
                activationRegion == null ?
                        null : activationRegion.getName());
    }

    /**
     * Sends a request to the AWS Storage Gateway server running at the
     * specified address and activation region, and returns the activation key
     * for that server.
     * 
     * @param gatewayAddress
     *            The DNS name or IP address of a running AWS Storage Gateway
     * 
     * @param activationRegionName
     *            The name of the region in which the gateway will be activated.
     * 
     * @return The activation key required for some API calls to AWS Storage
     *         Gateway.
     * 
     * @throws AmazonClientException
     *             If any problems are encountered while trying to contact the
     *             remote AWS Storage Gateway server.
     */
    public static String getActivationKey(String gatewayAddress, String activationRegionName) throws AmazonClientException {
        try {
            HttpParams httpClientParams = new BasicHttpParams();
            httpClientParams.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, false);
            DefaultHttpClient client = new DefaultHttpClient(httpClientParams);

            String url = "http://" + gatewayAddress;
            if (activationRegionName != null) {
                url += "/?activationRegion=" + activationRegionName;
            }
            HttpGet method = new HttpGet(url);
            HttpResponse response = client.execute(method);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode != 302)
                throw new AmazonClientException("Could not fetch activation key.  HTTP status code: " + statusCode);

            Header[] headers = response.getHeaders("Location");
            if (headers.length < 1)
                throw new AmazonClientException("Could not fetch activation key, no location header found");

            String activationUrl = headers[0].getValue();
            String[] parts = activationUrl.split("activationKey=");

            if (parts.length < 2 || null == parts[1])
                throw new AmazonClientException("Unable to get activation key from : " + activationUrl);

            return parts[1];
        } catch (IOException ioe) {
            throw new AmazonClientException("Unable to get activation key", ioe);
        }
    }
}
