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
package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URI;

import org.junit.Test;

/** Unit tests for the utility methods that parse information from AWS URLs. */
public class AwsHostNameUtilsTest {

    private static final URI IAM_ENDPOINT              = URI.create("https://iam.amazonaws.com");
    private static final URI IAM_REGION_ENDPOINT       = URI.create("https://iam.us-west-2.amazonaws.com");
    private static final URI EC2_REGION_ENDPOINT       = URI.create("https://ec2.us-west-2.amazonaws.com");
    private static final URI S3_ENDPOINT               = URI.create("https://s3.amazonaws.com");
    private static final URI S3_BUCKET_ENDPOINT        = URI.create("https://bucket.name.with.periods.s3.amazonaws.com");
    private static final URI S3_REGION_ENDPOINT        = URI.create("https://s3-eu-west-1.amazonaws.com");
    private static final URI S3_BUCKET_REGION_ENDPOINT = URI.create("https://bucket.name.with.periods.s3-eu-west-1.amazonaws.com");

    @Test
    public void testParseServiceName() {
        // Verify that parseServiceName keeps working the way it used to.
        assertEquals("iam", AwsHostNameUtils.parseServiceName(IAM_ENDPOINT));
        assertEquals("iam", AwsHostNameUtils.parseServiceName(IAM_REGION_ENDPOINT));
        assertEquals("ec2", AwsHostNameUtils.parseServiceName(EC2_REGION_ENDPOINT));
        assertEquals("s3",  AwsHostNameUtils.parseServiceName(S3_ENDPOINT));
        assertEquals("s3",  AwsHostNameUtils.parseServiceName(S3_BUCKET_ENDPOINT));
        assertEquals("s3",  AwsHostNameUtils.parseServiceName(S3_REGION_ENDPOINT));
        assertEquals("s3",  AwsHostNameUtils.parseServiceName(S3_BUCKET_REGION_ENDPOINT));
    }

    @Test
    public void testStandardNoHint() {
        // Verify that standard endpoints parse correctly without a service hint
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("iam.amazonaws.com", null));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("iam.us-west-2.amazonaws.com", null));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("ec2.us-west-2.amazonaws.com", null));

        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("s3.amazonaws.com", null));
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("bucket.name.s3.amazonaws.com", null));

        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("s3-eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("s3.eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("bucket.name.with.periods.s3-eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("bucket.name.with.periods.s3.eu-west-1.amazonaws.com", null));

        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("cloudsearch.us-west-2.amazonaws.com", null));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("domain.us-west-2.cloudsearch.amazonaws.com", null));
    }

    @Test
    public void testStandard() {
        // Verify that standard endpoints parse correctly with a service hint
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("iam.amazonaws.com", "iam"));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("iam.us-west-2.amazonaws.com", "iam"));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("ec2.us-west-2.amazonaws.com", "ec2"));

        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("s3.amazonaws.com", "s3"));
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("bucket.name.s3.amazonaws.com", "s3"));

        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("s3.eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("bucket.name.with.periods.s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName("bucket.name.with.periods.s3.eu-west-1.amazonaws.com", "s3"));

        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("cloudsearch.us-west-2.amazonaws.com", "cloudsearch"));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("domain.us-west-2.cloudsearch.amazonaws.com", "cloudsearch"));
    }

    @Test
    public void testBJS() {
        // Verify that BJS endpoints parse correctly even though they're non-standard.
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegionName("iam.cn-north-1.amazonaws.com.cn", "iam"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegionName("ec2.cn-north-1.amazonaws.com.cn", "ec2"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegionName("s3.cn-north-1.amazonaws.com.cn", "s3"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegionName("bucket.name.with.periods.s3.cn-north-1.amazonaws.com.cn", "s3"));

        assertEquals("cn-north-1", AwsHostNameUtils.parseRegionName("cloudsearch.cn-north-1.amazonaws.com.cn", "cloudsearch"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegionName("domain.cn-north-1.cloudsearch.amazonaws.com.cn", "cloudsearch"));
    }

    @Test
    public void testS3SpecialRegions() {
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("s3-external-1.amazonaws.com", null));
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("bucket.name.with.periods.s3-external-1.amazonaws.com", null));

        assertEquals("us-gov-west-1", AwsHostNameUtils.parseRegionName("s3-fips-us-gov-west-1.amazonaws.com", null));
        assertEquals("us-gov-west-1", AwsHostNameUtils.parseRegionName("bucket.name.with.periods.s3-fips-us-gov-west-1.amazonaws.com", null));
    }

    @Test
    public void testParseRegionWithStandardEndpointsNoHint() {
        // Verify that standard endpoints parse correctly without a service hint
        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("iam.amazonaws.com", null));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("iam.us-west-2.amazonaws.com", null));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("ec2.us-west-2.amazonaws.com", null));

        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("s3.amazonaws.com", null));
        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("bucket.name.s3.amazonaws.com", null));

        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("s3-eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("s3.eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("bucket.name.with.periods.s3-eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("bucket.name.with.periods.s3.eu-west-1.amazonaws.com", null));

        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("cloudsearch.us-west-2.amazonaws.com", null));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("domain.us-west-2.cloudsearch.amazonaws.com", null));
    }

    @Test
    public void testParseRegionWithStandardEndpointsWithServiceHint() {
        // Verify that standard endpoints parse correctly with a service hint
        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("iam.amazonaws.com", "iam"));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("iam.us-west-2.amazonaws.com", "iam"));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("ec2.us-west-2.amazonaws.com", "ec2"));

        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("s3.amazonaws.com", "s3"));
        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("bucket.name.s3.amazonaws.com", "s3"));

        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("s3.eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("bucket.name.with.periods.s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegion("bucket.name.with.periods.s3.eu-west-1.amazonaws.com", "s3"));

        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("cloudsearch.us-west-2.amazonaws.com", "cloudsearch"));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegion("domain.us-west-2.cloudsearch.amazonaws.com", "cloudsearch"));
    }

    @Test
    public void testParseRegionWithBJSEndpoints() {
        // Verify that BJS endpoints parse correctly even though they're non-standard.
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegion("iam.cn-north-1.amazonaws.com.cn", "iam"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegion("ec2.cn-north-1.amazonaws.com.cn", "ec2"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegion("s3.cn-north-1.amazonaws.com.cn", "s3"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegion("bucket.name.with.periods.s3.cn-north-1.amazonaws.com.cn", "s3"));

        assertEquals("cn-north-1", AwsHostNameUtils.parseRegion("cloudsearch.cn-north-1.amazonaws.com.cn", "cloudsearch"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegion("domain.cn-north-1.cloudsearch.amazonaws.com.cn", "cloudsearch"));
    }

    @Test
    public void testParseRegionWithS3SpecialRegions() {
        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("s3-external-1.amazonaws.com", null));
        assertEquals("us-east-1", AwsHostNameUtils.parseRegion("bucket.name.with.periods.s3-external-1.amazonaws.com", null));

        assertEquals("us-gov-west-1", AwsHostNameUtils.parseRegion("s3-fips-us-gov-west-1.amazonaws.com", null));
        assertEquals("us-gov-west-1", AwsHostNameUtils.parseRegion("bucket.name.with.periods.s3-fips-us-gov-west-1.amazonaws.com", null));
    }

    @Test
    public void testParseRegionWithIpv4() {
        assertNull(AwsHostNameUtils.parseRegion("54.231.16.200", null));
    }
}
