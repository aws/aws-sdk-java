/*
 * Copyright 2016-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     */
    Region getRegionByEndpoint(final String endpoint);

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
    Region tryGetRegionByExplicitEndpoint(String endpoint);

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
    Region tryGetRegionByEndpointDnsSuffix(String endpoint);
}
