/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.util.EC2MetadataUtilsServer;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * Tests broken up by fixture.
 */
@RunWith(Enclosed.class)
public class InstanceMetadataRegionProviderTest {

    /**
     * If the EC2 metadata service is running it should return the region the server is mocked
     * with.
     */
    public static class MetadataServiceRunningTest {

        private static EC2MetadataUtilsServer server;

        private AwsRegionProvider regionProvider;

        @BeforeClass
        public static void setupFixture() throws IOException {
            server = new EC2MetadataUtilsServer("localhost", 0);
            server.start();

            System.setProperty(SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY,
                               "http://localhost:" + server.getLocalPort());
        }

        @AfterClass
        public static void tearDownFixture() throws IOException {
            server.stop();
            System.clearProperty(
                    SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY);
        }

        @Before
        public void setup() {
            regionProvider = new InstanceMetadataRegionProvider();
        }

        @Test
        public void metadataServiceRunning_ProvidesCorrectRegion() {
            assertEquals("us-east-1", regionProvider.getRegion());
        }

        @Test
        public void ec2MetadataDisabled_shouldReturnRegionAfterEnabled() {
            try {
                System.setProperty("com.amazonaws.sdk.disableEc2Metadata", "true");
                regionProvider.getRegion();
                fail("exception not thrown when EC2Metadata disabled");
            } catch (AmazonClientException ex) {
                //expected
            } finally {
                System.clearProperty("com.amazonaws.sdk.disableEc2Metadata");
            }

            assertNotNull("region should not be null", regionProvider.getRegion());
        }
    }

    /**
     * If the EC2 metdata service is not present then the provider should just return null instead
     * of failing. This is to allow the provider to be used in a chain context where another
     * provider further down the chain may be able to provide the region.
     */
    public static class MetadataServiceNotRunning {

        private AwsRegionProvider regionProvider;

        @Before
        public void setup() {
            System.setProperty(SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY,
                               "http://localhost:54123");
            regionProvider = new InstanceMetadataRegionProvider();
        }

        @Test
        public void metadataServiceRunning_ProvidesCorrectRegion() {
            assertNull(regionProvider.getRegion());
        }

    }


}