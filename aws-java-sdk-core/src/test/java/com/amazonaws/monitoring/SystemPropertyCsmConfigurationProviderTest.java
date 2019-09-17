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
package com.amazonaws.monitoring;

import com.amazonaws.SdkClientException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_ENABLED_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_HOST_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_PORT_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_CLIENT_ID;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_HOST;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_PORT;
import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link SystemPropertyCsmConfigurationProvider}.
 */
public class SystemPropertyCsmConfigurationProviderTest {
    private final SystemPropertyCsmConfigurationProvider provider =
        new SystemPropertyCsmConfigurationProvider();

    @Before
    public void testSetup() {
        System.clearProperty(AWS_CSM_ENABLED_SYSTEM_PROPERTY);
        System.clearProperty(AWS_CSM_PORT_SYSTEM_PROPERTY);
        System.clearProperty(AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY);
    }

    @AfterClass
    public static void cleanup() {
        System.clearProperty(AWS_CSM_ENABLED_SYSTEM_PROPERTY);
        System.clearProperty(AWS_CSM_PORT_SYSTEM_PROPERTY);
        System.clearProperty(AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY);
    }

    @Test
    public void testCorrectlyResolvesConfiguration() {
        System.setProperty(AWS_CSM_ENABLED_SYSTEM_PROPERTY, "true");
        System.setProperty(AWS_CSM_HOST_SYSTEM_PROPERTY, "bar");
        System.setProperty(AWS_CSM_PORT_SYSTEM_PROPERTY, "1234");
        System.setProperty(AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY, "foo");

        CsmConfiguration cfg = provider.getConfiguration();

        CsmConfiguration expected = CsmConfiguration.builder()
                .withEnabled(true)
                .withHost("bar")
                .withPort(1234)
                .withClientId("foo")
                .build();
        assertEquals(expected, cfg);
    }

    @Test(expected = SdkClientException.class)
    public void testThrowsSdkClientExceptionWhenVariablesNotPresent() {
        provider.getConfiguration();
    }

    @Test(expected = SdkClientException.class)
    public void testThrowsSdkClientExceptionWhenPortCannotBeParsed() {
        System.setProperty(AWS_CSM_ENABLED_SYSTEM_PROPERTY, "true");
        System.setProperty(AWS_CSM_PORT_SYSTEM_PROPERTY, "onetwothreefour");
        System.setProperty(AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY, "foo");

        provider.getConfiguration();
    }

    @Test
    public void optionalValuesNotSet_shouldUseDefaultValues() {
        System.setProperty(AWS_CSM_ENABLED_SYSTEM_PROPERTY, "true");

        CsmConfiguration configuration = provider.getConfiguration();
        assertEquals(DEFAULT_AWS_CSM_HOST, configuration.getHost());
        assertEquals(DEFAULT_AWS_CSM_PORT, configuration.getPort());
        assertEquals(DEFAULT_AWS_CSM_CLIENT_ID, configuration.getClientId());
    }
}
