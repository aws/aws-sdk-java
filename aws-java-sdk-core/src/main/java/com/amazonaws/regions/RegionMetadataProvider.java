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

import com.amazonaws.annotation.SdkInternalApi;

import java.util.List;

@SdkInternalApi
public interface RegionMetadataProvider {

    /**
     * Returns an immutable list of all regions known to this region metadata
     * object, in no particular order.
     *
     * @return an immutable list of all regions
     */
    List<Region> getRegions();

    /**
     * Returns the region with the name given, if it exists in the metadata
     * or if it can be derived from the metadata.
     * Otherwise, returns null.
     *
     * @param regionName the name of the region to search for
     * @return the corresponding region, if it exists or derived.
     */
    Region getRegion(final String regionName);

    /**
     * Returns a list of the regions that support the service given.
     *
     * @param serviceName
     *         The service endpoint prefix which can be retrieved from the
     *         constant ENDPOINT_PREFIX of the specific service client interface,
     *         e.g. AmazonEC2.ENDPOINT_PREFIX.
     * @return the list of regions with support for the given service
     */
    List<Region> getRegionsForService(final String serviceName);

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
    Region getRegionByEndpoint(final String endpoint);
}
