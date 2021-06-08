/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.endpointdiscovery;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.cache.EndpointDiscoveryCacheLoader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SdkInternalApi
public abstract class EndpointDiscoveryIdentifiersRefreshCache<K> {

    private static final Log log = LogFactory.getLog(EndpointDiscoveryIdentifiersRefreshCache.class);

    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor(DaemonThreadFactory.INSTANCE);
    private final EndpointDiscoveryCacheLoader<String, Map<String, String>> cacheLoader;

    protected final Map<String, URI> cache = new ConcurrentHashMap<String, URI>();

    public EndpointDiscoveryIdentifiersRefreshCache(EndpointDiscoveryCacheLoader cacheLoader) {
        this.cacheLoader = cacheLoader;
    }

    /**
     * Abstract method to be implemented by each service to handle retrieving
     * endpoints from a cache. Each service must handle converting a request
     * object into the relevant cache key.
     *
     * @param key - The cache key to use
     * @param discoveryRequest - An endpoint discovery request containing additional discovery parameters
     * @param required - Whether or not the service requires use of endpoint discovery
     * @param defaultEndpoint - The default endpoint for the service
     * @return The endpoint to use for this request
     */
    public abstract URI get(K key, AmazonWebServiceRequest discoveryRequest, boolean required, URI defaultEndpoint);

    /**
     * Abstract method to be implemented by each service to handle storing endpoints
     * in it's cache. This method must schedule refresh of cache values whenever putting
     * a new endpoint into it's cache.
     *
     * @param key - The cache key
     * @param discoveryRequest  An endpoint discovery request containing additional discovery parameters.
     * @param endpointDetails - The details for an endpoint including the address and cache period.
     * @return The endpoint used for this request
     */
    public abstract URI put(String key, AmazonWebServiceRequest discoveryRequest, Map<String, String> endpointDetails, URI defaultEndpoint);

    public abstract String constructKey(String key, AmazonWebServiceRequest discoveryRequest);

    public void evict(String key) {
        cache.remove(key);
    }

    public URI discoverEndpoint(String key, AmazonWebServiceRequest request, boolean required, URI defaultEndpoint) {
        if (required) {
            try {
                return put(key, request, cacheLoader.load(key, request), defaultEndpoint);
            } catch (Exception e) {
                throw new SdkClientException("Unable to discover required endpoint for request.", e);
            }
        }  else {
            loadAndScheduleRefresh(key, request, 1, defaultEndpoint);
            return defaultEndpoint;
        }
    }

    public ScheduledFuture<URI> loadAndScheduleRefresh(final String key,
                                                       final AmazonWebServiceRequest request,
                                                       final long refreshPeriod,
                                                       final URI defaultEndpoint) {
        return executorService.schedule(new Callable<URI>() {
            @Override
            public URI call() {
                try {
                    return put(key, request, cacheLoader.load(key, request), defaultEndpoint);
                } catch (Exception e) {
                    log.debug("Failed to refresh cached endpoint. Scheduling another refresh in 5 minutes");
                    loadAndScheduleRefresh(key, request,5, defaultEndpoint);
                    return null;
                }
            }
        }, refreshPeriod, TimeUnit.MINUTES);
    }

    public ScheduledFuture<?> loadAndScheduleEvict(final String key,
                                                   final long refreshPeriod,
                                                   final TimeUnit refreshPeriodTimeUnit) {
        return executorService.schedule(new Runnable() {
            @Override
            public void run() {
                evict(key);
            }
        }, refreshPeriod, refreshPeriodTimeUnit);
    }

    public void shutdown() {
        executorService.shutdownNow();
    }
}

