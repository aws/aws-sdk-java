/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
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
package com.amazonaws.auth;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.AmazonClientException;

public class InstanceProfileCredentialsProviderIntegrationTest {

    private EC2MetadataServiceMock mockServer;

    /** Starts up the mock EC2 Instance Metadata Service. */
    @Before
    public void setUp() throws Exception {
        mockServer = new EC2MetadataServiceMock();
        mockServer.start();
    }

    /** Shuts down the mock EC2 Instance Metadata Service. */
    @After
    public void tearDown() throws Exception {
        mockServer.stop();
        Thread.sleep(1000);
    }

    /**
     * This test case tests the Async credentials refresh functionality provided
     * by InstanceProfileCredentialsProvider. Initially the need to load
     * credentials is asserted to true as the credentials is not yet loaded.
     * Sleeps for the specified time and wakes to assert that the need to load
     * credential is false.
     *
     * Deliberately uses an expired credentials to see if the getCredentials
     * throws an AmazonClientException.
     */
    @Test
    public void testAsyncRefreshCredentials() throws Exception {
        final String securityCredentialNames = "test-credentials";

        mockServer.setResponseFileName("sessionResponse");
        mockServer.setAvailableSecurityCredentials(securityCredentialNames);

        boolean refreshCredentialsAsync = true;
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(
                refreshCredentialsAsync);
        assertTrue(provider.needsToLoadCredentials());
        Thread.sleep(70000);
        assertFalse(provider.needsToLoadCredentials());

        mockServer.setResponseFileName("sessionResponseExpired");
        mockServer.setAvailableSecurityCredentials(securityCredentialNames);

        provider.refresh();
        assertTrue(provider.needsToLoadCredentials());
        Thread.sleep(70000);

        assertTrue(provider.needsToLoadCredentials());

        try {
            provider.getCredentials();
            fail("Expected an AmazonClientException, but wasn't thrown");
        } catch (AmazonClientException ace) {
            assertNotNull(ace.getMessage());
        }
    }
}
