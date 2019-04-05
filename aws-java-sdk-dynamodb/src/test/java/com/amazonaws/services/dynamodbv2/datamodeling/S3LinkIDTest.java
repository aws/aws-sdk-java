/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amazonaws.services.s3.model.Region;
import com.amazonaws.util.json.Jackson;

public class S3LinkIDTest {

    @Test
    public void testToFromJson() {
        String region = "ap-northeast-1";
        S3Link.ID id = new S3Link.ID(region, "bucket", "key");
        String json = id.toJson();
        S3Link.ID twin = Jackson.fromJsonString(json, S3Link.ID.class);
        assertEquals("bucket", twin.getBucket());
        assertEquals("key", twin.getKey());
        assertEquals(region, twin.getRegionId());
    }

    @Test
    public void testDefaultRegion() {
        S3Link.ID id = new S3Link.ID("bucketname", "keyname");
        assertEquals(Region.US_Standard.getFirstRegionId(), id.getRegionId());
        String json = id.toJson();
        S3Link.ID twin = Jackson.fromJsonString(json, S3Link.ID.class);
        assertEquals("bucketname", twin.getBucket());
        assertEquals("keyname", twin.getKey());
        assertEquals(Region.US_Standard.getFirstRegionId(), twin.getRegionId());
    }
}
