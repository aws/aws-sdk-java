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
package com.amazonaws.auth;


import static com.amazonaws.SDKGlobalConfiguration.ACCESS_KEY_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.SECRET_KEY_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.SESSION_TOKEN_SYSTEM_PROPERTY;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.amazonaws.SdkClientException;
import org.junit.After;
import org.junit.Test;

public class SystemPropertiesCredentialsProviderTest {

    private final SystemPropertiesCredentialsProvider provider = new SystemPropertiesCredentialsProvider();

    @After
    public void tearDown() {
        System.clearProperty(ACCESS_KEY_SYSTEM_PROPERTY);
        System.clearProperty(SECRET_KEY_SYSTEM_PROPERTY);
        System.clearProperty(SESSION_TOKEN_SYSTEM_PROPERTY);
    }

    @Test
    public void accessKeyAndSecretPropertiesSet_ReturnsBasicCredentials() {
        System.setProperty(ACCESS_KEY_SYSTEM_PROPERTY, "akid-value");
        System.setProperty(SECRET_KEY_SYSTEM_PROPERTY, "skid-value");
        final AWSCredentials credentials = provider.getCredentials();
        assertThat(credentials, not(instanceOf(AWSSessionCredentials.class)));
        assertEquals("akid-value", credentials.getAWSAccessKeyId());
        assertEquals("skid-value", credentials.getAWSSecretKey());
    }

    @Test
    public void sessionTokenSet_ReturnsSessionCredentials() {
        System.setProperty(ACCESS_KEY_SYSTEM_PROPERTY, "akid-value");
        System.setProperty(SECRET_KEY_SYSTEM_PROPERTY, "skid-value");
        System.setProperty(SESSION_TOKEN_SYSTEM_PROPERTY, "session-value");
        final AWSCredentials credentials = provider.getCredentials();
        assertThat(credentials, instanceOf(AWSSessionCredentials.class));
        assertEquals("akid-value", credentials.getAWSAccessKeyId());
        assertEquals("skid-value", credentials.getAWSSecretKey());
        assertEquals("session-value", ((AWSSessionCredentials) credentials).getSessionToken());
    }

    @Test(expected = SdkClientException.class)
    public void noPropertiesSet_ProviderThrowsException() {
        provider.getCredentials();
    }
}