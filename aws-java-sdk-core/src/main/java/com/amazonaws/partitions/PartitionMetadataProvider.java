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
package com.amazonaws.partitions;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.partitions.model.Endpoint;
import com.amazonaws.partitions.model.Partition;
import com.amazonaws.partitions.model.Service;
import com.amazonaws.regions.AbstractRegionMetadataProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.util.ValidationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Region metadata provider based on partitions.
 */
@SdkInternalApi
public class PartitionMetadataProvider extends AbstractRegionMetadataProvider {

    private static final String STANDARD_PARTITION_HOSTNAME = "{service}.{region}.{dnsSuffix}";

    private final Map<String, Partition> partitionMap = new HashMap<String, Partition>();

    private final Map<String, Region> credentialScopeRegionByHost = new HashMap<String, Region>();

    private final Set<String> standardHostnamePatternDnsSuffixes = new HashSet<String>();

    private final Map<String, Region> regionCache = new ConcurrentHashMap<String, Region>();

    public PartitionMetadataProvider(List<Partition> partitions) {
        ValidationUtils.assertNotNull(partitions, "partitions");

        for (Partition p : partitions) {
            partitionMap.put(p.getPartition(), p);

            if (p.getDefaults() != null && STANDARD_PARTITION_HOSTNAME.equals(p.getDefaults().getHostName())) {
                standardHostnamePatternDnsSuffixes.add(p.getDnsSuffix());
            }

            for (Service service : p.getServices().values()) {
                for (Endpoint endpoint : service.getEndpoints().values()) {
                    if (endpoint.getHostName() != null &&
                        endpoint.getCredentialScope() != null &&
                        endpoint.getCredentialScope().getRegion() != null) {

                        // Assume the same hostname will never be in two different partitions.
                        Region region = cacheRegion(new PartitionRegionImpl(endpoint.getCredentialScope().getRegion(), p));
                        credentialScopeRegionByHost.put(endpoint.getHostName(), region);
                    }
                }
            }
        }
    }

    @Override
    public List<Region> getRegions() {
        final List<Region> regions = new ArrayList<Region>();

        for (Partition p : partitionMap.values()) {
            for (Map.Entry<String, com.amazonaws.partitions.model.Region>
                    entry : p.getRegions().entrySet()) {
                regions.add(new Region(new PartitionRegionImpl(entry.getKey(),
                        p)));
            }
        }
        return Collections.unmodifiableList(regions);
    }

    @Override
    public Region getRegion(String regionName) {

        if (regionName == null) return null;

        final Region regionFromCache = getRegionFromCache(regionName);

        if (regionFromCache != null) {
            return regionFromCache;
        }

        return createNewRegion(regionName);
    }

    private Region createNewRegion(String regionName) {
        for (Partition p : partitionMap.values()) {
            if (p.hasRegion(regionName)) {
                return cacheRegion(new PartitionRegionImpl(regionName, p));
            }
        }
        // If we can't match the regex with any partition then assume the AWS partition if it's available.
        Partition awsPartition = partitionMap.get("aws");
        if (awsPartition != null) {
            return cacheRegion(new PartitionRegionImpl(regionName, awsPartition));
        } else {
            return null;
        }
    }

    private Region getRegionFromCache(String regionName) {
        return regionCache.get(regionName);
    }

    private Region cacheRegion(PartitionRegionImpl regionImpl) {
        final Region region = new Region(regionImpl);

        regionCache.put(region.getName(), region);

        return region;
    }

    @Override
    public List<Region> getRegionsForService(String serviceName) {
        final List<Region> allRegions = getRegions();
        final List<Region> serviceSupportedRegions = new ArrayList<Region>();

        for (Region r : allRegions) {
            if (r.isServiceSupported(serviceName)) {
                serviceSupportedRegions.add(r);
            }
        }
        return serviceSupportedRegions;
    }

    @Override
    public Region tryGetRegionByExplicitEndpoint(String endpoint) {
        String host = getHost(endpoint);
        return credentialScopeRegionByHost.get(host);
    }

    @Override
    public Region tryGetRegionByEndpointDnsSuffix(String endpoint) {
        String host = getHost(endpoint);

        for (String dnsSuffix : standardHostnamePatternDnsSuffixes) {
            dnsSuffix = "." + dnsSuffix;

            // This host name ends with a DNS suffix of a specific partition
            // Assume it matches the partition hostname pattern
            if (host.endsWith(dnsSuffix)) {
                String serviceRegion = host.substring(0, host.length() - dnsSuffix.length());
                String region = serviceRegion.substring(serviceRegion.lastIndexOf('.') + 1);

                if (region.isEmpty()) {
                    return null;
                }

                // We don't use the partition that matched the DNS suffix because multiple partitions can have the same DNS
                // suffix. Now that we think we have a region out of the host name, make sure it's in the endpoints.json and
                // attach the associated partition that region is actually under.
                return getRegion(region);
            }
        }

        return null;
    }
}
