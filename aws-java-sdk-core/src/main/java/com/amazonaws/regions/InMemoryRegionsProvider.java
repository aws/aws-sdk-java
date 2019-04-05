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
import com.amazonaws.util.ValidationUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Region metadata provider that holds all data in memory and returns data
 * from them.
 */
@SdkInternalApi
public class InMemoryRegionsProvider extends AbstractRegionMetadataProvider {

    /** list of regions. */
    private final List<Region> regions;

    public InMemoryRegionsProvider(List<Region> regions) {
        ValidationUtils.assertNotNull(regions, "regions");
        this.regions = Collections.unmodifiableList(new ArrayList<Region>
                (regions));
    }

    @Override
    public List<Region> getRegions() {
        return Collections.unmodifiableList(new ArrayList<Region>(regions));
    }

    @Override
    public Region getRegion(String regionName) {
        for (Region region : regions) {
            if (region.getName().equals(regionName)) {
                return region;
            }
        }
        return null;
    }

    @Override
    public List<Region> getRegionsForService(String serviceName) {
        final List<Region> results = new LinkedList<Region>();

        for (Region region : regions) {
            if (region.isServiceSupported(serviceName)) {
                results.add(region);
            }
        }

        return results;
    }

    @Override
    public String toString() {
        return regions.toString();
    }
}
