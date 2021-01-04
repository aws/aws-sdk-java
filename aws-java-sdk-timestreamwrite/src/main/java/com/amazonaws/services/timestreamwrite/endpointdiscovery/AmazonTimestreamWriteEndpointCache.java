/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.endpointdiscovery;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.endpointdiscovery.EndpointDiscoveryIdentifiersRefreshCache;
import com.amazonaws.endpointdiscovery.Constants;
import com.amazonaws.services.timestreamwrite.AmazonTimestreamWrite;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTimestreamWriteEndpointCache extends EndpointDiscoveryIdentifiersRefreshCache<String> {

    private static final Log log = LogFactory.getLog(AmazonTimestreamWriteEndpointCache.class);

    public AmazonTimestreamWriteEndpointCache(AmazonTimestreamWrite client) {
        super(new AmazonTimestreamWriteEndpointCacheLoader(client));
    }

    @Override
    public URI get(String key, AmazonWebServiceRequest discoveryRequest, boolean required, URI defaultEndpoint) {

        URI endpoint = cache.get(constructKey(key, discoveryRequest));

        if (endpoint != null) {
            return endpoint;
        } else {
            if (!required) {
                cache.put(key, defaultEndpoint);
            }
            return discoverEndpoint(key, discoveryRequest, required, defaultEndpoint);
        }
    }

    @Override
    public URI put(String key, AmazonWebServiceRequest discoveryRequest, Map<String, String> endpointDetails, URI defaultEndpoint) {
        URI discoveredEndpoint = URI.create(String.format("%s://%s", defaultEndpoint.getScheme(), endpointDetails.get(Constants.ENDPOINT)));

        cache.put(key, discoveredEndpoint);
        loadAndScheduleEvict(key, Long.valueOf(endpointDetails.get(Constants.CACHE_PERIOD)), TimeUnit.MINUTES);

        log.debug("Cached new endpoint from service: " + discoveredEndpoint.toASCIIString());
        log.debug("Cached endpoint TTL: " + endpointDetails.get(Constants.CACHE_PERIOD) + " minutes");

        return discoveredEndpoint;
    }

    @Override
    public String constructKey(String key, AmazonWebServiceRequest discoveryRequest) {
        return key;
    }
}
