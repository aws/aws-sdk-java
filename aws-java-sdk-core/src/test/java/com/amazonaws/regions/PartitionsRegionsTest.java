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

    private static final List<String> SERVICES = Arrays.asList
            (ServiceAbbreviations.Autoscaling,
                    ServiceAbbreviations.CloudFormation, ServiceAbbreviations.CloudFront,
                    ServiceAbbreviations.CloudHSM, ServiceAbbreviations.CloudSearch,
                    ServiceAbbreviations.CloudTrail, ServiceAbbreviations.CloudWatch,
                    ServiceAbbreviations.CloudWatchLogs, ServiceAbbreviations.CodeDeploy,
                    ServiceAbbreviations.CodeCommit, ServiceAbbreviations.CodePipeline,
                    ServiceAbbreviations.CognitoIdentity, ServiceAbbreviations.CognitoSync,
                    ServiceAbbreviations.Config, ServiceAbbreviations.DeviceFarm,
                    ServiceAbbreviations.DataPipeline, ServiceAbbreviations.DirectConnect,
                    ServiceAbbreviations.Directory, ServiceAbbreviations.Dynamodb,
                    ServiceAbbreviations.DynamodbStreams, ServiceAbbreviations.EC2,
                    ServiceAbbreviations.EC2ContainerService, ServiceAbbreviations.EC2SimpleSystemsManager,
                    ServiceAbbreviations.Elasticache, ServiceAbbreviations.ElasticBeanstalk,
                    ServiceAbbreviations.ElasticFileSystem, ServiceAbbreviations.ElasticLoadbalancing,
                    ServiceAbbreviations.ElasticMapReduce, ServiceAbbreviations.ElasticTranscoder,
                    ServiceAbbreviations.Email, ServiceAbbreviations.Glacier,
                    ServiceAbbreviations.IAM, ServiceAbbreviations.IoT,
                    ServiceAbbreviations.IoTData, ServiceAbbreviations.ImportExport,
                    ServiceAbbreviations.KeyManagementService, ServiceAbbreviations.Kinesis,
                    ServiceAbbreviations.Lambda, ServiceAbbreviations.MachineLearning,
                    ServiceAbbreviations.Opsworks, ServiceAbbreviations.RDS,
                    ServiceAbbreviations.RedShift, ServiceAbbreviations.Route53,
                    ServiceAbbreviations.Route53Domains, ServiceAbbreviations.S3,
                    ServiceAbbreviations.SimpleDB, ServiceAbbreviations.SimpleWorkflow,
                    ServiceAbbreviations.SNS, ServiceAbbreviations.SQS,
                    ServiceAbbreviations.StorageGateway, ServiceAbbreviations.STS,
                    ServiceAbbreviations.Support, ServiceAbbreviations.WAF,
                    ServiceAbbreviations.Workspaces);

    private static RegionMetadata legacyMetadata;

    @BeforeClass
    public static void setUp() throws IOException {
        legacyMetadata =
                RegionUtils.loadMetadataFromResource(PartitionsRegionsTest.class,
                        "legacy_regions.xml");
    }

    @Test
    public void legacy_xml_regions_are_resolved_correctly() {

        List<Region> legacyRegions = legacyMetadata.getRegions();

        for (Region legacyRegion : legacyRegions) {
            assertRegion(legacyRegion, RegionUtils.getRegion(legacyRegion.getName()));
        }
    }

    @Test
    public void aws_partition_returns_regionalized_endpoint_for_kms() {
        final String regionName = Regions.US_WEST_1.getName();
        Region legacyUSWest = legacyMetadata.getRegion(regionName);
        Region partitionUsWest = RegionUtils.getRegion(regionName);
        Assert.assertEquals(legacyUSWest.getServiceEndpoint
                (ServiceAbbreviations.KeyManagementService), partitionUsWest
                .getServiceEndpoint(ServiceAbbreviations.KeyManagementService));
    }

    @Test
    public void awscn_partition_returns_partition_wide_endpoint_for_iam() {
        final String regionName = Regions.CN_NORTH_1.getName();
        Region legacyUSWest = legacyMetadata.getRegion(regionName);
        Region partitionUsWest = RegionUtils.getRegion(regionName);
        Assert.assertEquals(legacyUSWest.getServiceEndpoint
                (ServiceAbbreviations.IAM), partitionUsWest
                .getServiceEndpoint(ServiceAbbreviations.IAM));
    }

    @Test
    public void region_name_matches_regionregex_guesses_regionalized_endpoint() {

        final String regionName = "ap-newregion-1";
        Assert.assertNull(legacyMetadata.getRegion(regionName));
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
        Assert.assertNull(legacyMetadata.getRegion(regionName));
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
        Assert.assertNull(legacyMetadata.getRegion(regionName));
        Assert.assertNull(RegionUtils.getRegion(regionName));
    }


    private void assertRegion(Region expected, Region actual) {

        Assert.assertEquals(expected.getName(), actual.getName());
        Assert.assertEquals(expected.getDomain(), actual.getDomain());
        assertEndpoints(expected, actual);
    }

    private void assertEndpoints(Region expected, Region actual) {

        for (String service : SERVICES) {
            String expectedEndpoint = expected.getServiceEndpoint(service);

            if (expectedEndpoint != null) {
                Assert.assertEquals("Endpoint resolution failed",
                        expectedEndpoint,
                        actual.getServiceEndpoint(service));
                Assert.assertEquals("Https endpoint for service " + service
                                + " in region " + expected.getName(),
                        expected.hasHttpsEndpoint(service),
                        actual.hasHttpsEndpoint(service));
                Assert.assertEquals("Http endpoint for service " + service
                                + " in region " + expected.getName(),
                        expected.hasHttpEndpoint(service),
                        actual.hasHttpEndpoint(service));
            }
        }
    }
}
