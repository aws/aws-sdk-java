/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Test cases for partition based region implementation and endpoint guessing.
 */
public class PartitionsRegionsTest {

    @Test
    public void region_name_matches_regionregex_guesses_regionalized_endpoint() {

        final String regionName = "ap-newregion-1";
        Region partitionUsWest = RegionUtils.getRegion(regionName);
        Assert.assertFalse(partitionUsWest.isServiceSupported
                (ServiceAbbreviations.KeyManagementService));
        Assert.assertFalse(partitionUsWest.hasHttpEndpoint
                (ServiceAbbreviations.KeyManagementService));
        Assert.assertFalse(partitionUsWest.hasHttpsEndpoint
                (ServiceAbbreviations.KeyManagementService));
        Assert.assertNotNull(partitionUsWest.getServiceEndpoint
                (ServiceAbbreviations.KeyManagementService));
    }

    @Test
    public void region_name_matches_regionregex_guesses_partition_wide_endpoint() {
        final String regionName = "ap-newregion-1";
        Region partitionUsWest = RegionUtils.getRegion(regionName);
        Assert.assertTrue(partitionUsWest.isServiceSupported
                (ServiceAbbreviations.IAM));
        Assert.assertFalse(partitionUsWest.hasHttpEndpoint
                (ServiceAbbreviations.IAM));
        Assert.assertTrue(partitionUsWest.hasHttpsEndpoint
                (ServiceAbbreviations.IAM));
        Assert.assertNotNull(partitionUsWest.getServiceEndpoint
                (ServiceAbbreviations.IAM));
    }

    @Test
    public void endpoint_information_for_completely_new_service_returns_null() {
        final Region region = RegionUtils.getRegion(Regions.AP_NORTHEAST_1
                .getName());
        final String serviceName = "unknown-service";
        Assert.assertNull(region.getServiceEndpoint(serviceName));
        Assert.assertFalse(region.hasHttpEndpoint(serviceName));
        Assert.assertFalse(region.hasHttpsEndpoint(serviceName));
        Assert.assertFalse(region.isServiceSupported(serviceName));
    }

    @Test
    public void region_name_not_matches_regionregex_returns_null() {
        final String regionName = "ap-new-region-1";
        Assert.assertNull(RegionUtils.getRegion(regionName));
    }
}
