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
package com.amazonaws.partitions.model;

import com.amazonaws.util.ValidationUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * This class models a AWS partition and contains all metadata about it.
 */
public class Partition {

    /**
     * The name of the partition.
     */
    private final String partition;

    /**
     * Supported regions.
     */
    private final Map<String, Region> regions;

    /**
     * Supported services;
     */
    private final Map<String, Service> services;

    /**
     * description of the partition.
     */
    private String partitionName;

    /**
     * dns suffix for the endpoints in the partition.
     */
    private String dnsSuffix;

    /**
     * region name regex for regions in the partition.
     */
    private String regionRegex;

    /**
     * default endpoint configuration.
     */
    private Endpoint defaults;

    public Partition(@JsonProperty(value = "partition") String partition,
                     @JsonProperty(value = "regions") Map<String, Region>
                             regions,
                     @JsonProperty(value = "services") Map<String,
                             Service> services) {
        this.partition = ValidationUtils.assertNotNull(partition, "Partition");
        this.regions = regions;
        this.services = services;
    }

    /**
     * Returns the name of the partition.
     */
    public String getPartition() {
        return partition;
    }

    /**
     * Returns the description of the partition.
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * Sets the description of the partition.
     */
    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    /**
     * Returns the dns suffix of the partition.
     */
    public String getDnsSuffix() {
        return dnsSuffix;
    }

    /**
     * Sets the dns suffix of the partition.
     */
    public void setDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
    }

    /**
     * Returns the regex for the regions in the partition.
     */
    public String getRegionRegex() {
        return regionRegex;
    }

    /**
     * Sets the regex for the regions in the partition.
     */
    public void setRegionRegex(String regionRegex) {
        this.regionRegex = regionRegex;
    }

    /**
     * Returns the default endpoint configuration of the partition.
     */
    public Endpoint getDefaults() {
        return defaults;
    }

    /**
     * Sets the default endpoint configuration of the partition.
     */
    public void setDefaults(Endpoint defaults) {
        this.defaults = defaults;
    }

    /**
     * Returns the set of regions associated with the partition.
     */
    public Map<String, Region> getRegions() {
        return regions;
    }

    /**
     * Returns the set of services supported by the partition.
     */
    public Map<String, Service> getServices() {
        return services;
    }

    /**
     * Returns true if the region is explicitly configured in the partition
     * or if the region matches the {@link #regionRegex} of the partition.
     */
    public boolean hasRegion(String region) {
        return regions.containsKey(region) || matchesRegionRegex(region) || hasServiceEndpoint
                (region);
    }

    private boolean matchesRegionRegex(String region) {
        final Pattern p = Pattern.compile(regionRegex);
        return p.matcher(region).matches();
    }

    /**
     * returns true if any of the services in the partition has a custom endpoint
     * like s3 having s3-external-1.
     * TODO Remove this support as part of next major version.
     * @Deprecated use the {@link com.amazonaws.AmazonWebServiceClient#setEndpoint(String)} method
     * for custom endpoints.
     */
    @Deprecated
    private boolean hasServiceEndpoint(String endpoint) {
        for(Service s : services.values()) {
            if (s.getEndpoints().containsKey(endpoint)) {
                return true;
            }
        }
        return false;
    }
}
