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
package com.amazonaws.auth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AWSStaticCredentialsProviderTest {

    @Test
    public void getBasicAwsCredentials_ReturnsSameCredentials() throws Exception {
        final BasicAWSCredentials credentials = new BasicAWSCredentials("akid", "skid");
        final AWSCredentials actualCredentials =
                new AWSStaticCredentialsProvider(credentials).getCredentials();
        assertEquals(credentials, actualCredentials);
    }

    @Test
    public void getSessionAwsCredentials_ReturnsSameCredentials() throws Exception {
        final BasicSessionCredentials credentials =
                new BasicSessionCredentials("akid", "skid", "token");
        final AWSCredentials actualCredentials =
                new AWSStaticCredentialsProvider(credentials).getCredentials();
        assertEquals(credentials, actualCredentials);
    }

    @Test
    public void refreshCalled_DoesNotChangeCredentials() throws Exception {
        final BasicAWSCredentials credentials = new BasicAWSCredentials("akid", "skid");
        final AWSStaticCredentialsProvider credentialsProvider =
                new AWSStaticCredentialsProvider(credentials);
        final AWSCredentials actualCredentials = credentialsProvider.getCredentials();

        // Should not affect the credentials served by getCredentials
        credentialsProvider.refresh();

        assertEquals(credentials, actualCredentials);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullCredentials_ThrowsIllegalArgumentException() {
        new AWSStaticCredentialsProvider(null);
    }

}