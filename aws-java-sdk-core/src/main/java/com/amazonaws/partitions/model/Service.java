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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.Map;

/**
 * Endpoint configuration for a service in a partition.
 */
public class Service {

    /**
     * endpoint configuration for every region in a partition.
     */
    private final Map<String, Endpoint> endpoints;

    /**
     * default endpoint configuration for a service across all regions in the
     * partition
     */
    private Endpoint defaults;

    /**
     * the region name if the service is enabled partition wide.
     */
    private String partitionEndpoint;

    /**
     * Returns true if the service is regionalized.
     */
    private boolean isRegionalized;

    public Service(@JsonProperty(value = "endpoints") Map<String,
            Endpoint> endpoints) {
        // Technically the endpoints member should never be null if the
        // endpoints file is properly formed, but this is currently not always
        // true. See TRE-739 for details
        this.endpoints = endpoints == null ? Collections.<String, Endpoint>emptyMap() : endpoints;
    }

    /**
     * Returns the endpoints configuration for all regions in a partition
     * that service supports.
     */
    public Map<String, Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * returns the default endpoints configuration for all regions in a
     * partition.
     */
    public Endpoint getDefaults() {
        return defaults;
    }

    /**
     * Sets the default endpoints configuration for all regions in a
     * partition.
     */
    public void setDefaults(Endpoint defaults) {
        this.defaults = defaults;
    }

    /**
     * returns the region name if the service is enabled partition wide.
     */
    public String getPartitionEndpoint() {
        return partitionEndpoint;
    }

    /**
     * sets the region name if the service is enabled partition wide.
     */
    @JsonProperty(value = "partitionEndpoint")
    public void setPartitionEndpoint(String partitionEndpoint) {
        this.partitionEndpoint = partitionEndpoint;
    }

    /**
     * returns true if the service is regionalized.
     */
    public boolean isRegionalized() {
        return isRegionalized;
    }

    /**
     * sets the regionalized property for a service..
     */
    @JsonProperty(value = "isRegionalized")
    public void setRegionalized(boolean regionalized) {
        isRegionalized = regionalized;
    }

    /**
     * A convienient method that returns true if a service has a partition
     * wide endpoint available.
     */
    public boolean isPartitionWideEndpointAvailable() {
        return this.partitionEndpoint != null;
    }
}
