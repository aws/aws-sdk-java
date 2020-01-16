/*
 * Copyright 2020-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.regions.EndpointToRegion.guessRegionNameForEndpoint;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class EndpointToRegionTest {
    @Test
    public void guessRegionForHostname_returnsRegionFromExplicitEndpointsJsonEntry_aws() {
        verifyRegionAndPartitionForHostname("us-east-1", "aws", "s3.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_returnsRegionFromS3ArnEndpoint_aws() {
        verifyRegionAndPartitionForHostname("us-west-2", "aws", "ap-1234.s3-accesspoint.us-west-2.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_returnsRegionFromExplicitEndpointsJsonEntry_gov() {
        verifyRegionAndPartitionForHostname("us-gov-west-1", "aws-us-gov", "iam.us-gov.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_returnsRegionFromExplicitEndpointsJsonEntry_iso() {
        verifyRegionAndPartitionForHostname("us-iso-east-1", "aws-iso", "route53.c2s.ic.gov");
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_aws() {
        verifyRegionAndPartitionForHostname("us-east-1", "aws", "foo.us-east-1.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_cn() {
        verifyRegionAndPartitionForHostname("cn-north-1", "aws-cn", "foo.cn-north-1.amazonaws.com.cn");
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_gov() {
        verifyRegionAndPartitionForHostname("us-gov-east-1", "aws-us-gov", "foo.us-gov-east-1.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_iso() {
        verifyRegionAndPartitionForHostname("us-iso-east-1", "aws-iso", "foo.us-iso-east-1.c2s.ic.gov");
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_isob() {
        verifyRegionAndPartitionForHostname("us-isob-east-1", "aws-iso-b", "foo.us-isob-east-1.c2s.ic.gov");
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_ignoringExtraDots() {
        verifyRegionAndPartitionForHostname("us-iso-east-1", "aws-iso", "a.b.c.d.us-iso-east-1.c2s.ic.gov");
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_blankIsNull() {
        assertNull(EndpointToRegion.guessRegionForEndpoint("blah..c2s.ic.gov"));
    }

    @Test
    public void guessRegionForHostname_basedOnStandardEndpointPattern_justSuffixIsNull() {
        assertNull(EndpointToRegion.guessRegionForEndpoint("c2s.ic.gov", null));
    }

    @Test
    public void guessRegionForHostname_basedOnWeirdServicePatterns_s3() {
        verifyRegionAndPartitionForHostname("us-west-2", "aws", "s3-us-west-2.amazonaws.com");
        verifyRegionAndPartitionForHostname("us-west-2", "aws", "foo.s3-us-west-2.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_basedOnWeirdServicePatterns_cloudsearch() {
        verifyRegionAndPartitionForHostname("us-west-2", "aws", "a.us-west-2.cloudsearch.amazonaws.com");
        verifyRegionAndPartitionForHostname("us-west-2", "aws", "us-west-2.cloudsearch.amazonaws.com");
        verifyRegionAndPartitionForHostname("us-west-2", "aws", "foo.us-west-2.cloudsearch.bar.amazonaws.com.cn", "cloudsearch");
    }

    @Test
    public void guessRegionForHostname_basedOnWeirdServicePatterns_noRegion() {
        verifyRegionAndPartitionForHostname("us-east-1", "aws", "x.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_basedOnWeirdServicePatterns_iam() {
        verifyRegionAndPartitionForHostname("us-gov-west-1", "aws-us-gov", "iam.us-gov.amazonaws.com");
    }

    @Test
    public void guessRegionForHostname_basedOnFollowingServiceName() {
        verifyRegionAndPartitionForHostname("us-east-1", "aws", "iam.us-east-1.banana.com", "iam");
        verifyRegionAndPartitionForHostname("us-gov-west-1", "aws-us-gov", "iam.us-gov-west-1.banana.com", "iam");
    }

    /**
     * We migrated from AwsHostNameUtils.parseRegion to EndpointToRegion.guessRegionNameForHostname, because EndpointToRegion
     * can consider the contents of endpoints.json.
     *
     * This test copies the AwsHostNameUtils test cases at the time of the migration in order to validate that this migration
     * remains backwards-compatible.
     */
    @Test
    public void guessRegionForHostname_isBackwardCompatibleReplacementForAwsHostNameUtilsParseRegion() {
        assertEquals("us-east-1", guessRegionNameForEndpoint("iam.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("iam.us-west-2.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("ec2.us-west-2.amazonaws.com"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("s3.amazonaws.com"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("bucket.name.s3.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("s3-eu-west-1.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("s3.eu-west-1.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3-eu-west-1.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3.eu-west-1.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("cloudsearch.us-west-2.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("domain.us-west-2.cloudsearch.amazonaws.com"));
        assertEquals("us-east-1", EndpointToRegion.guessRegionNameForEndpoint("iam.amazonaws.com", "iam"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("iam.us-west-2.amazonaws.com", "iam"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("ec2.us-west-2.amazonaws.com", "ec2"));
        assertEquals("us-east-1", EndpointToRegion.guessRegionNameForEndpoint("s3.amazonaws.com", "s3"));
        assertEquals("us-east-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.s3.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("s3.eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.with.periods.s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.with.periods.s3.eu-west-1.amazonaws.com", "s3"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("cloudsearch.us-west-2.amazonaws.com", "cloudsearch"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("domain.us-west-2.cloudsearch.amazonaws.com", "cloudsearch"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("iam.cn-north-1.amazonaws.com.cn", "iam"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("ec2.cn-north-1.amazonaws.com.cn", "ec2"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("s3.cn-north-1.amazonaws.com.cn", "s3"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.with.periods.s3.cn-north-1.amazonaws.com.cn", "s3"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("cloudsearch.cn-north-1.amazonaws.com.cn", "cloudsearch"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("domain.cn-north-1.cloudsearch.amazonaws.com.cn", "cloudsearch"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("s3-external-1.amazonaws.com"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3-external-1.amazonaws.com"));
        assertEquals("us-gov-west-1", guessRegionNameForEndpoint("s3-fips-us-gov-west-1.amazonaws.com"));
        assertEquals("us-gov-west-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3-fips-us-gov-west-1.amazonaws.com"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("iam.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("iam.us-west-2.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("ec2.us-west-2.amazonaws.com"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("s3.amazonaws.com"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("bucket.name.s3.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("s3-eu-west-1.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("s3.eu-west-1.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3-eu-west-1.amazonaws.com"));
        assertEquals("eu-west-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3.eu-west-1.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("cloudsearch.us-west-2.amazonaws.com"));
        assertEquals("us-west-2", guessRegionNameForEndpoint("domain.us-west-2.cloudsearch.amazonaws.com"));
        assertEquals("us-east-1", EndpointToRegion.guessRegionNameForEndpoint("iam.amazonaws.com", "iam"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("iam.us-west-2.amazonaws.com", "iam"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("ec2.us-west-2.amazonaws.com", "ec2"));
        assertEquals("us-east-1", EndpointToRegion.guessRegionNameForEndpoint("s3.amazonaws.com", "s3"));
        assertEquals("us-east-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.s3.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("s3.eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.with.periods.s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.with.periods.s3.eu-west-1.amazonaws.com", "s3"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("cloudsearch.us-west-2.amazonaws.com", "cloudsearch"));
        assertEquals("us-west-2", EndpointToRegion.guessRegionNameForEndpoint("domain.us-west-2.cloudsearch.amazonaws.com", "cloudsearch"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("iam.cn-north-1.amazonaws.com.cn", "iam"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("ec2.cn-north-1.amazonaws.com.cn", "ec2"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("s3.cn-north-1.amazonaws.com.cn", "s3"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("bucket.name.with.periods.s3.cn-north-1.amazonaws.com.cn", "s3"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("cloudsearch.cn-north-1.amazonaws.com.cn", "cloudsearch"));
        assertEquals("cn-north-1", EndpointToRegion.guessRegionNameForEndpoint("domain.cn-north-1.cloudsearch.amazonaws.com.cn", "cloudsearch"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("s3-external-1.amazonaws.com"));
        assertEquals("us-east-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3-external-1.amazonaws.com"));
        assertEquals("us-gov-west-1", guessRegionNameForEndpoint("s3-fips-us-gov-west-1.amazonaws.com"));
        assertEquals("us-gov-west-1", guessRegionNameForEndpoint("bucket.name.with.periods.s3-fips-us-gov-west-1.amazonaws.com"));
        assertNull(guessRegionNameForEndpoint("54.231.16.200"));
    }

    private void verifyRegionAndPartitionForHostname(String regionName, String partitionName, String hostname) {
        verifyRegionAndPartitionForHostname(regionName, partitionName, hostname, null);
    }

    private void verifyRegionAndPartitionForHostname(String regionName, String partitionName,
                                                     String hostname, String serviceNameHint) {
        doVerifyRegionAndPartitionForHostname(regionName, partitionName, hostname, serviceNameHint);
        doVerifyRegionAndPartitionForHostname(regionName, partitionName, hostname + "/foo/bar", serviceNameHint);
        doVerifyRegionAndPartitionForHostname(regionName, partitionName, "https://" + hostname, serviceNameHint);
        doVerifyRegionAndPartitionForHostname(regionName, partitionName, "https://" + hostname + "/foo/bar", serviceNameHint);
    }

    private void doVerifyRegionAndPartitionForHostname(String regionName, String partitionName,
                                                       String hostname, String serviceNameHint) {
        Region region = EndpointToRegion.guessRegionForEndpoint(hostname, serviceNameHint);
        assertNotNull(region);
        assertEquals(regionName, region.getName());
        assertEquals(partitionName, region.getPartition());
    }
}