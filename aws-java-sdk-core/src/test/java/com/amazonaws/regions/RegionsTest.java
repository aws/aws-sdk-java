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

import org.junit.*;

import com.amazonaws.*;

public class RegionsTest {

    @Test
    public void testDefaultDomain() {
        Region region = new Region(new InMemoryRegionImpl("region", null));
        Assert.assertEquals("amazonaws.com", region.getDomain());
    }

    @Test
    public void testSetEndpointByRegion() {

        InMemoryRegionImpl regionImpl = new InMemoryRegionImpl("region", "example.com");
        regionImpl.addEndpoint("service",
                "service-region.example.com");
        Region region = new Region(regionImpl);

        // This should use the configured region.
        AmazonServiceClient service = new AmazonServiceClient();
        service.setRegion(region);
        Assert.assertEquals("https://service-region.example.com",
                            service.getEndpoint());

        // This should guess at an endpoint based on the region's domain.
        AmazonUnknownServiceClient unknown = new AmazonUnknownServiceClient();
        unknown.setRegion(region);
        Assert.assertEquals("https://unknownservice.region.example.com",
                            unknown.getEndpoint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromName_whenRegionNameNull_throwsIllegalArgumentException() {
        Regions.fromName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromName_whenRegionNameEmpty_throwsIllegalArgumentException() {
        Regions.fromName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromName_whenRegionNameInvalid_throwsIllegalArgumentException() {
        Regions.fromName("northpole");
    }

    @Test
    public void fromName_whenRegionNameIsValid_returnsCorrectValue() {
        Assert.assertEquals(Regions.EU_CENTRAL_1, Regions.fromName("eu-central-1"));
    }

    private static class AmazonServiceClient extends AmazonWebServiceClient {
        
        public AmazonServiceClient() {
            super(new ClientConfiguration());
        }

        public String getEndpoint() {
            return endpoint.toString();
        }
    }

    private static class AmazonUnknownServiceClient
            extends AmazonWebServiceClient {

        public AmazonUnknownServiceClient() {
            super(new ClientConfiguration());
        }

        public String getEndpoint() {
            return endpoint.toString();
        }
    }
}
