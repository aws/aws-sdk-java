/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.regions;

import java.net.URI;


/**
 * An abstract implementation of {@link RegionMetadataProvider}
 */

public abstract class AbstractRegionMetadataProvider implements
        RegionMetadataProvider {

    @Override
    public Region getRegionByEndpoint(String endpoint) {
        String host = getHost(endpoint);

        for (Region region : getRegions()) {
            for (String serviceEndpoint :
                    region.getAvailableEndpoints()) {

                if (host.equals(getHost(serviceEndpoint))) {
                    return region;
                }
            }
        }

        throw new IllegalArgumentException(
                "No region found with any service for endpoint " + endpoint);
    }

    /**
     * Parse the host portion out of an endpoint (which may or may not
     * contain a scheme).
     *
     * @param endpoint the endpoint to parse
     * @return the host portion of the endpoint
     */
    private static String getHost(final String endpoint) {
        String host = URI.create(endpoint).getHost();
        if (host == null) {
            host = URI.create("http://" + endpoint).getHost();
        }
        return host;
    }
}
