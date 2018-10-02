/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.internal.config;

import com.amazonaws.regions.Regions;
import com.amazonaws.util.ClassLoaderHelper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class InternalConfigTest {

    private static InternalConfig config = null;

    private static final String DEFAULT_SIGNER_TYPE = "AWS4SignerType";

    private static final String S3V4_SIGNER_TYPE = "AWSS3V4SignerType";

    private static final String NEW_REGION = "newregion";

    private static final Map<String, String> serviceSignerMap = new HashMap<String, String>();

    @BeforeClass
    public static void setUp() throws JsonParseException, JsonMappingException,
            IOException {
        config = InternalConfig.Factory.getInternalConfig();
        assertNotNull(config);
        assertSame(config, InternalConfig.Factory.getInternalConfig());

        serviceSignerMap.put("ec2", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("dynamodb", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("cloudfront", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("cloudtrail", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("monitoring", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("sts", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("iam", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("route53", DEFAULT_SIGNER_TYPE);
    }

    /**
     * This test case tests signers for all AWS regions mentioned in the
     * <code>Regions</code>
     */
    @Test
    public void testServiceSpecificSigners() {
        Set<Map.Entry<String, String>> entrySet = serviceSignerMap.entrySet();

        for (Entry<String, String> entry : entrySet) {
            testAllRegions(entry.getKey(), entry.getValue());
        }
    }

    private void testAllRegions(String serviceName, String signerType) {

        assertSignerType(DEFAULT_SIGNER_TYPE, serviceName, null);
        for (Regions region : Regions.values()) {

            if (region == Regions.CN_NORTH_1) {
                signerType = DEFAULT_SIGNER_TYPE;
            }

            assertSignerType(signerType, serviceName, region.getName());
        }
    }

    /**
     * This test case tests the Amazon S3 specific signers.
     */
    @Test
    public void testS3Signers() {
        final String serviceName = "s3";
        assertSignerType(S3V4_SIGNER_TYPE, serviceName, null);

        for (Regions region : Regions.values()) {
            assertSignerType(S3V4_SIGNER_TYPE, serviceName,
                    region.getName());
        }
        assertSignerType(S3V4_SIGNER_TYPE, serviceName, NEW_REGION);
    }

    @Test
    public void testSDBSigners() {
        assertSignerType("QueryStringSignerType", "sdb", "us-east-1");
        assertSignerType("QueryStringSignerType", "sdb", "us-west-1");
        assertSignerType("QueryStringSignerType", "sdb", "us-west-2");
        assertSignerType("QueryStringSignerType", "sdb", "ap-northeast-1");
        assertSignerType("QueryStringSignerType", "sdb", "ap-southeast-1");
        assertSignerType("QueryStringSignerType", "sdb", "ap-southeast-2");
        assertSignerType("QueryStringSignerType", "sdb", "sa-east-1");
        assertSignerType("QueryStringSignerType", "sdb", "eu-west-1");
    }

    /**
     * This test case tests the Import/Export specific signers.
     */
    @Test
    public void testImportExportSigners() {
        assertSignerType("QueryStringSignerType", "importexport", null);
    }

    /**
     * This test case tests the Simple Email Service specific signers.
     */
    @Test
    public void testSimpleEmailServiceSigners() {
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", "us-east-1");
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", "us-west-1");
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", "us-west-2");
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", NEW_REGION);
    }

    /**
     * This test cases tests the default signers for any new regions added to
     * any AWS service.
     */
    @Test
    public void testNewRegions() {
        assertSignerType(DEFAULT_SIGNER_TYPE, "dynamodb", NEW_REGION);
        assertSignerType(S3V4_SIGNER_TYPE, "s3", NEW_REGION);
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", NEW_REGION);
        assertSignerType(DEFAULT_SIGNER_TYPE, "ec2", NEW_REGION);
        assertSignerType(DEFAULT_SIGNER_TYPE, "sdb", NEW_REGION);
    }

    private void assertSignerType(String expected, String serviceName,
            String region) {
        SignerConfig signer = config.getSignerConfig(serviceName, region);
        assertEquals("Service Signer validation failed for " + serviceName
                + " in region " + region, expected, signer.getSignerType());
    }

    /**
     * This test case tests the Cognito specific signers.
     */
    @Test
    public void testCognitoAssertions() {
        assertSignerType("AWS4SignerType", "cognito-identity", null);
        assertSignerType("AWS4SignerType", "cognito-identity",
                Regions.US_EAST_1.getName());
        assertSignerType("AWS4SignerType", "cognito-sync", null);
        assertSignerType("AWS4SignerType", "cognito-sync",
                Regions.US_EAST_1.getName());
    }

    @Test
    public void loadFromFile() throws Exception {
        loadFrom(InternalConfig.DEFAULT_CONFIG_RESOURCE_ABSOLUTE_PATH);
    }

    private void loadFrom(String resource) throws Exception {
        URL url = ClassLoaderHelper.getResource(resource);
        assertNotNull(url);
        InternalConfigJsonHelper config = InternalConfig.loadfrom(url, InternalConfigJsonHelper.class);
        assertNotNull(config);
    }

    @Test
    public void load() throws Exception {
        InternalConfig config = InternalConfig.load();
        assertNotNull(config);
        config.dump();
    }
}
