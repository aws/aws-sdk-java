/*
 * Copyright 2013-2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.regions;

import java.net.URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * A collection of metadata about a set of regions and the services they
 * contain.
 *
 * @see RegionUtils
 */
public class RegionMetadata {

    private final List<Region> regions;

    /**
     * Creates a new RegionMetadata object from the given list of regions.
     *
     * @param regions the list of regions
     */
    public RegionMetadata(final List<Region> regions) {
        if (regions == null) {
            throw new IllegalArgumentException("regions cannot be null");
        }

        this.regions =
            Collections.unmodifiableList(new ArrayList<Region>(regions));
    }

    /**
     * Returns an immutable list of all regions known to this region metadata
     * object, in no particular order.
     *
     * @return an immutable list of all regions
     */
    public List<Region> getRegions() {
        return regions;
    }

    /**
     * Returns the region with the name given, if it exists. Otherwise, returns
     * null.
     *
     * @param name the name of the region to search for
     * @return the corresponding region, if it exists
     */
    public Region getRegion(final String name) {
        for (Region region : regions) {
            if (region.getName().equals(name)) {
                return region;
            }
        }
        return null;
    }

    /**
     * Returns a list of the regions that support the service given.
     *
     * @param service the service abbreviation to search for
     * @return the list of regions with support for the given service
     * @see ServiceAbbreviations
     */
    public List<Region> getRegionsForService(final String service) {
        List<Region> results = new LinkedList<Region>();

        for (Region region : regions) {
            if (region.isServiceSupported(service)) {
                results.add(region);
            }
        }

        return results;
    }

    /**
     * Searches through all known regions to find one with any service at the
     * specified endpoint. If no region is found with a service at that
     * endpoint, an exception is thrown.
     *
     * @param endpoint
     *            The endpoint for any service residing in the desired region.
     * @return The region containing any service running at the specified
     *         endpoint, otherwise an exception is thrown if no region is found
     *         with a service at the specified endpoint.
     * @throws IllegalArgumentException
     *             If the given URL is malformed, or if the one of the service
     *             URLs on record is malformed.
     */
    public Region getRegionByEndpoint(final String endpoint) {
        String host = getHost(endpoint);

        for (Region region : regions) {
            for (String serviceEndpoint
                     : region.getServiceEndpoints().values()) {

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

    @Override
    public String toString() {
        return regions.toString();
    }
}
