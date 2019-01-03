/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.regions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegionMetadataTest {

    private static RegionMetadata metadata;

    @BeforeClass
    public static void setUp() {
        Region us_east_1_region = new Region(new InMemoryRegionImpl
                ("us-east-1",
                null).addEndpoint("s3", "s3.amazonaws.com"));

        Region us_west_1_region = new Region(new InMemoryRegionImpl
                ("us-west-1", null).addEndpoint("s3", "s3-us-west-1.amazonaws.com"));

        Region cn_north_1_region = new Region(new InMemoryRegionImpl("cn-north-1",
                "amazonaws.com.cn"));

        metadata = new RegionMetadata(new InMemoryRegionsProvider(Arrays
                .asList(us_east_1_region, us_west_1_region,cn_north_1_region)));
    }

    @Test
    public void testGetRegion() {
        Region region = metadata.getRegion("us-east-1");
        Assert.assertNotNull(region);
        Assert.assertEquals("us-east-1", region.getName());

        region = metadata.getRegion("us-west-1");
        Assert.assertNotNull(region);
        Assert.assertEquals("us-west-1", region.getName());

        region = metadata.getRegion("cn-north-1");
        Assert.assertNotNull(region);
        Assert.assertEquals("cn-north-1", region.getName());

        region = metadata.getRegion("bogus-monkeys");
        Assert.assertNull(region);
    }

    @Test
    public void testGetRegionsForService() {
        List<Region> regions = metadata.getRegionsForService("s3");
        Assert.assertNotNull(regions);
        Assert.assertEquals(2, regions.size());

        Assert.assertEquals("us-east-1", regions.get(0).getName());
        Assert.assertEquals("us-west-1", regions.get(1).getName());

        regions = metadata.getRegionsForService("bogus-monkeys");
        Assert.assertNotNull(regions);
        Assert.assertTrue(regions.isEmpty());
    }

    @Test
    public void testGetRegionByEndpoint() {
        Region region =
            metadata.getRegionByEndpoint("s3-us-west-1.amazonaws.com");

        Assert.assertNotNull(region);
        Assert.assertEquals("us-west-1", region.getName());

        try {
            metadata.getRegionByEndpoint("bogus-monkeys");
            Assert.fail("Expected an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
}
