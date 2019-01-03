/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.endpointdiscovery;

import com.amazonaws.endpointdiscovery.EndpointDiscoveryRefreshCache;
import com.amazonaws.endpointdiscovery.Constants;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;

import java.util.Map;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDynamoDBEndpointCache extends EndpointDiscoveryRefreshCache<String> {

    private static final Log log = LogFactory.getLog(AmazonDynamoDBEndpointCache.class);

    public AmazonDynamoDBEndpointCache(AmazonDynamoDB client) {
        super(new AmazonDynamoDBEndpointCacheLoader(client));
    }

    @Override
    public URI get(String key, boolean required, URI defaultEndpoint) {

        URI endpoint = cache.get(key);

        if (endpoint != null) {
            return endpoint;
        } else {
            if (!required) {
                cache.put(key, defaultEndpoint);
            }
            return discoverEndpoint(key, required, defaultEndpoint);
        }
    }

    @Override
    public URI put(String key, Map<String, String> endpointDetails, URI defaultEndpoint) {
        loadAndScheduleRefresh(key, Long.valueOf(endpointDetails.get(Constants.CACHE_PERIOD)), defaultEndpoint);

        URI discoveredEndpoint = URI.create(String.format("%s://%s", defaultEndpoint.getScheme(), endpointDetails.get(Constants.ENDPOINT)));

        log.debug("Cached new endpoint from service: " + discoveredEndpoint.toASCIIString());
        log.debug("Refresh scheduled in: " + endpointDetails.get(Constants.CACHE_PERIOD) + " minutes");

        return cache.put(key, discoveredEndpoint);
    }
}
