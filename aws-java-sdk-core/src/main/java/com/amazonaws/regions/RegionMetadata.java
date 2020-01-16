/*
 * Copyright 2013-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;

/**
 * A collection of metadata about a set of regions and the services they
 * contain.
 *
 * @see RegionUtils
 */
public class RegionMetadata {

    private final RegionMetadataProvider provider;

    /**
     * Creates a new RegionMetadata object from the given list of regions.
     *
     * @param regions the list of regions
     */
    public RegionMetadata(final List<Region> regions) {
        this.provider = new InMemoryRegionsProvider(regions);
    }

    public RegionMetadata(RegionMetadataProvider provider) {
        this.provider = provider;
    }

    /**
     * Returns an immutable list of all regions known to this region metadata
     * object, in no particular order.
     *
     * @return an immutable list of all regions
     */
    public List<Region> getRegions() {
        return provider.getRegions();
    }

    /**
     * Returns the region with the name given, if it exists. Otherwise, returns
     * null.
     *
     * @param name the name of the region to search for
     * @return the corresponding region, if it exists
     */
    public Region getRegion(final String name) {
        return provider.getRegion(name);
    }

    /**
     * Returns a list of the regions that support the service given.
     *
     * @param service
     *         The service endpoint prefix which can be retrieved from the
     *         constant ENDPOINT_PREFIX of the specific service client interface,
     *         e.g. AmazonEC2.ENDPOINT_PREFIX.
     * @return the list of regions with support for the given service
     */
    public List<Region> getRegionsForService(final String service) {
        return provider.getRegionsForService(service);
    }

    /**
     * Returns the region associated with the specified endpoint by searching the endpoint configuration for an endpoint
     * that is explicitly listed. This is likely to be null, because most endpoints are not explicitly listed in the endpoints
     * file.
     *
     * This is mostly useful for retrieving the region of non-standard endpoints that do not include the region in the host name.
     * These include global endpoints (budgets.amazonaws.com),
     *
     * Unlike {@link #getRegionByEndpoint(String)}, this returns null on failure instead of raising an exception.
     *
     * @param endpoint The endpoint to look up in the region metadata.
     * @return The region, or null if it cannot be determined.
     */
    public Region tryGetRegionByExplicitEndpoint(String endpoint) {
        return provider.tryGetRegionByExplicitEndpoint(endpoint);
    }

    /**
     * Returns the region associated with the specified endpoint by searching the endpoint configuration for a partition
     * that matches the DNS suffix of the provided endpoint and extracting the region name based on the endpoint pattern for
     * that partition. This may be wrong if the service does not follow the endpoint pattern for the partition. This returns
     * null if the endpoint provided does not appear to include a region, or does not match a known partition DNS suffix.
     *
     * Unlike {@link #getRegionByEndpoint(String)}, this returns null on failure instead of raising an exception.
     *
     * @param endpoint The endpoint to look up in the region metadata based on the DNS suffix.
     * @return The region, or null if it cannot be determined.
     */
    public Region tryGetRegionByEndpointDnsSuffix(String endpoint) {
        return provider.tryGetRegionByEndpointDnsSuffix(endpoint);
    }

    /**
     * Searches through all known regions to find one with any service at the
     * specified endpoint. If no region is found with a service at that
     * endpoint, an exception is thrown.
     *
     * @param endpoint The endpoint for any service residing in the desired region.
     * @return The region containing any service running at the specified
     * endpoint, otherwise an exception is thrown if no region is found
     * with a service at the specified endpoint.
     * @throws IllegalArgumentException If the given URL is malformed, or if the one of the service
     *                                  URLs on record is malformed.
     * @deprecated sdk no longer holds the complete endpoint for every service in the region.
     * It now uses the partition metadata to compute the endpoints dynamically for new regions and services.
     */
    @Deprecated
    public Region getRegionByEndpoint(String endpoint) {
        return provider.getRegionByEndpoint(endpoint);
    }

    @Override
    public String toString() {
        return provider.toString();
    }
}
