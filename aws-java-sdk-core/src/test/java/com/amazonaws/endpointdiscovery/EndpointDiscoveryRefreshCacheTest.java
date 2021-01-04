/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.endpointdiscovery;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.amazonaws.cache.CacheLoader;
import org.junit.Test;

public class EndpointDiscoveryRefreshCacheTest {
    private static final URI TEST_URI = URI.create("https://localhost");

    @Test
    public void loadAndScheduleEvict() throws Exception {
        CacheLoader<String, URI> cacheLoader = new CacheLoader<String, URI>() {
            @Override
            public URI load(String key) {
                return TEST_URI;
            }
        };

        EndpointDiscoveryRefreshCache<String> endpointDiscoveryRefreshCache =
            new EndpointDiscoveryRefreshCache<String>(cacheLoader) {

            @Override
            public URI get(String key, boolean required, URI defaultEndpoint) {
                throw new UnsupportedOperationException();
            }

            @Override
            public URI put(String key, Map<String, String> endpointDetails, URI defaultEndpoint) {
                throw new UnsupportedOperationException();
            }
        };

        endpointDiscoveryRefreshCache.cache.put("test-key", TEST_URI);
        endpointDiscoveryRefreshCache.loadAndScheduleEvict("test-key", 10, TimeUnit.MILLISECONDS);

        assertThat(endpointDiscoveryRefreshCache.cache, hasEntry("test-key", TEST_URI));
        Thread.sleep(100);
        assertThat(endpointDiscoveryRefreshCache.cache, not(hasKey("test-key")));
    }
}