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
package com.amazonaws.partitions;

import com.amazonaws.partitions.model.Endpoint;
import com.amazonaws.partitions.model.Partition;
import com.amazonaws.partitions.model.Service;
import com.amazonaws.regions.RegionImpl;
import com.amazonaws.util.ValidationUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A region implementation backed by the partition.
 */
public class PartitionRegionImpl implements RegionImpl {

    private static final String SERVICE = "{service}";
    private static final String REGION = "{region}";
    private static final String DNS_SUFFIX = "{dnsSuffix}";

    /**
     * partition where the region is present.
     */
    private final Partition partition;

    /**
     * the name of the region.
     */
    private final String region;

    /**
     * endpoint cache for a service.
     */
    private final Map<String, Endpoint> endpointCache = new ConcurrentHashMap<String,
                Endpoint>();

    public PartitionRegionImpl(String region, Partition p) {
        this.partition = ValidationUtils.assertNotNull(p, "partition");
        this.region = ValidationUtils.assertNotNull(region, "region");
    }

    @Override
    public String getName() {
        return region;
    }

    @Override
    public String getDomain() {
        return partition.getDnsSuffix();
    }

    @Override
    public String getPartition() {
        return partition.getPartition();
    }

    /**
     * Returns the endpoint for the given service.
     * If the region is not present under service configuration; but matches
     * the region regex, then this system tries to guess the endpoint and
     * returns it.
     */
    @Override
    public String getServiceEndpoint(String serviceName) {
        return getEndpointString(serviceName, getEndpoint(serviceName));
    }

    /**
     * Returns the endpoint configuration for a given service.
     */
    private Endpoint getEndpoint(String serviceName) {
        Endpoint cachedEndpoint = endpointCache.get(serviceName);

        if (cachedEndpoint == null) {
            cachedEndpoint = computeEndpoint(serviceName);
            if (cachedEndpoint == null) {
                return null;
            }
        }

        endpointCache.put(serviceName, cachedEndpoint);
        return cachedEndpoint;
    }

    private Endpoint computeEndpoint(String serviceName) {

        Service service = partition.getServices().get(serviceName);


        if (service != null) {
            if (service.getEndpoints().containsKey(region)) {

                Endpoint merged = Endpoint.merge(
                        partition.getDefaults(),
                        Endpoint.merge(service.getDefaults(),
                                service.getEndpoints().get(region)));

                return merged;

            } else if (service.isPartitionWideEndpointAvailable() && !service
                        .isRegionalized()) {
                // partition doesn't have any information about a service.

                Endpoint merged = Endpoint.merge(
                        partition.getDefaults(),
                        Endpoint.merge(service.getDefaults(),
                                service.getEndpoints().get(
                                        service.getPartitionEndpoint())));

                return merged;

            } else {
                if (partition.getDefaults() != null
                        && partition.getDefaults().getHostName() != null) {
                    return partition.getDefaults();
                }
            }
        }
        return null;
    }

    private String getEndpointString(String serviceName, Endpoint endpoint) {
        return endpoint == null
                ? null
                : endpoint.getHostName()
                .replace(SERVICE, serviceName)
                .replace(REGION, region)
                .replace(DNS_SUFFIX, partition.getDnsSuffix());
    }

    /**
     * Returns true if the service is explicitly enabled for a region or a
     * service is partition wide enabled. Returns false otherwise.
     * <p/>
     * For new regions that match the partition's region regex, if the
     * service is enabled partition wide then this method will return true.
     */
    @Override
    public boolean isServiceSupported(String serviceName) {
        return isServiceSupportedInRegion(serviceName) || isServicePartitionWide
                (serviceName);
    }

    /**
     * This method returns true only if the metadata for the service contains the given
     * region in the list of supported regions.
     */
    private boolean isServiceSupportedInRegion(String serviceName) {
        return partition.getServices().get(serviceName) != null
                && partition.getServices().get(serviceName).getEndpoints()
                .containsKey(region);
    }

    private boolean isServicePartitionWide(String serviceName) {
        return partition.getServices().get(serviceName) != null
                && partition.getServices().get(serviceName)
                .getPartitionEndpoint() != null;
    }

    /**
     * Returns true if the service is explicitly enabled for https in this
     * region or a service is partition wide enabled. Returns false otherwise.
     * <p/>
     * For new regions that match the partition's region regex, if the
     * service is enabled partition wide then this method will return true.
     */
    @Override
    public boolean hasHttpsEndpoint(String serviceName) {

        if (!isServiceSupported(serviceName)) return false;

        return getEndpoint(serviceName).hasHttpsSupport();

    }

    /**
     * Returns true if the service is explicitly enabled for http in this
     * region or a service is partition wide enabled. Returns false otherwise.
     * <p/>
     * For new regions that match the partition's region regex, if the
     * service is enabled partition wide then this method will return true.
     */
    @Override
    public boolean hasHttpEndpoint(String serviceName) {
        if (!isServiceSupported(serviceName)) return false;

        return getEndpoint(serviceName).hasHttpSupport();
    }

    @Override
    public Collection<String> getAvailableEndpoints() {
        final List<String> endpoints = new ArrayList<String>();
        for (String service : partition.getServices().keySet()) {
            if (isServiceSupported(service)) {
                endpoints.add(getServiceEndpoint(service));
            }
        }
        return Collections.unmodifiableCollection(endpoints);
    }
}
