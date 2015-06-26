/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights
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


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RegionXmlTest {

    @Test
    public void kms() {
        RegionUtils.initialize();
        assertEquals("/com/amazonaws/regions/regions.xml",
                RegionUtils.getSource());
        String[] regions = {
                "us-east-1",
                "us-west-1",
                "us-west-2",
                "ap-northeast-1",
                "ap-southeast-1",
                "ap-southeast-2",
                "sa-east-1",
                "eu-west-1",
                "eu-central-1"
        };
        for (String region : regions) {
            assertEquals(
                    region,
                    RegionUtils.getRegionByEndpoint(
                            "kms." + region + ".amazonaws.com/bla").getName());
            assertEquals(
                    region,
                    RegionUtils.getRegionByEndpoint(
                            "https://kms." + region + ".amazonaws.com").getName());
            assertEquals("kms." + region + ".amazonaws.com",
                    RegionUtils.getRegion(region).getServiceEndpoint("kms"));
        }
    }
}
