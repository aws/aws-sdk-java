/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.util.AwsHostNameUtils;
import java.net.URI;

/**
 * Utilities to attempt to convert from a hostname/endpoint to an AWS region.
 *
 * Unlike {@link AwsHostNameUtils#parseRegion(String, String)}, this also considers the contents of endpoints.json, and unlike
 * {@link RegionMetadata#getRegionByEndpoint(String)}, this considers common endpoint patterns and supports more than just the
 * "known" regions, like the legacy XML file would.
 */
@SdkProtectedApi
public class EndpointToRegion {
    /**
     * Attempt to convert the provided hostname into a region name, returning null if the conversion fails.
     */
    public static String guessRegionNameForEndpoint(String hostname) {
        return guessRegionNameForEndpoint(hostname, null);
    }

    /**
     * Attempt to convert the provided hostname and service hint into a region name, returning null if the conversion fails.
     */
    public static String guessRegionNameForEndpoint(String endpoint, String serviceHint) {
        return guessRegionOrRegionNameForEndpoint(endpoint, serviceHint).getRegionName();
    }

    /**
     * Attempt to convert the provided hostname and service hint into a region name, returning null if the conversion fails.
     */
    public static String guessRegionNameForEndpointWithDefault(String hostname, String serviceHint, String defaultRegion) {
        String region = guessRegionNameForEndpoint(hostname, serviceHint);
        return region != null ? region : defaultRegion;
    }

    /**
     * Attempt to convert the provided hostname into a region, returning null if the conversion fails.
     */
    public static Region guessRegionForEndpoint(String hostname) {
        return guessRegionForEndpoint(hostname, null);
    }

    /**
     * Attempt to convert the provided hostname and service hint into a region, returning null if the conversion fails.
     */
    public static Region guessRegionForEndpoint(String endpoint, String serviceHint) {
        return guessRegionOrRegionNameForEndpoint(endpoint, serviceHint).getRegion();
    }

    private static RegionOrRegionName guessRegionOrRegionNameForEndpoint(String endpoint, String serviceHint) {
        if (endpoint == null) {
            return new RegionOrRegionName();
        }

        String host = URI.create(endpoint).getHost();
        if (host == null) {
            host = URI.create("http://" + endpoint).getHost();
        }

        if (host == null) {
            return new RegionOrRegionName();
        }

        String regionFromInternalConfig = AwsHostNameUtils.parseRegionFromInternalConfig(host);
        if (regionFromInternalConfig != null) {
            return new RegionOrRegionName(regionFromInternalConfig);
        }

        String regionFromAwsPartitionPattern = AwsHostNameUtils.parseRegionFromAwsPartitionPattern(host);
        if (regionFromAwsPartitionPattern != null) {
            return new RegionOrRegionName(regionFromAwsPartitionPattern);
        }

        String serviceHintRegion = AwsHostNameUtils.parseRegionUsingServiceHint(host, serviceHint);
        if (serviceHintRegion != null) {
            return new RegionOrRegionName(serviceHintRegion);
        }

        RegionMetadata regionMetadata = RegionUtils.getRegionMetadata();

        Region regionByExplicitEndpoint = regionMetadata.tryGetRegionByExplicitEndpoint(host);
        if (regionByExplicitEndpoint != null) {
            return new RegionOrRegionName(regionByExplicitEndpoint);
        }

        Region regionByDnsSuffix = regionMetadata.tryGetRegionByEndpointDnsSuffix(host);
        if (regionByDnsSuffix != null) {
            return new RegionOrRegionName(regionByDnsSuffix);
        }

        String regionFromAfterServiceName = AwsHostNameUtils.parseRegionFromAfterServiceName(host, serviceHint);
        if (regionFromAfterServiceName != null) {
            return new RegionOrRegionName(regionFromAfterServiceName);
        }

        return new RegionOrRegionName();
    }

    private static class RegionOrRegionName {
        private final Region region;
        private final String regionName;

        private RegionOrRegionName(Region region) {
            this.region = region;
            this.regionName = null;
        }

        private RegionOrRegionName(String regionName) {
            this.region = null;
            this.regionName = regionName;
        }

        private RegionOrRegionName() {
            this.region = null;
            this.regionName = null;
        }

        public Region getRegion() {
            if (regionName != null) {
                return RegionUtils.getRegion(regionName);
            }

            return region;
        }

        public String getRegionName() {
            if (region != null) {
                return region.getName();
            }

            return regionName;
        }
    }

}
