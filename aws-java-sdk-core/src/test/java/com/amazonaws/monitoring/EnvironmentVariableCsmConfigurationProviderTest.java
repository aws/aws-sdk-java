/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import utils.EnvironmentVariableHelper;

import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_CLIENT_ID_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_ENABLED_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_HOST_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_PORT_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_CLIENT_ID;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_HOST;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_PORT;
import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link EnvironmentVariableCsmConfigurationProvider}.
 */
public class EnvironmentVariableCsmConfigurationProviderTest {
    private static final EnvironmentVariableHelper environmentVariableHelper =
        new EnvironmentVariableHelper();
    private final EnvironmentVariableCsmConfigurationProvider provider =
        new EnvironmentVariableCsmConfigurationProvider();

    @Before
    public void testSetup() {
        environmentVariableHelper.set(AWS_CSM_ENABLED_ENV_VAR, "");
        environmentVariableHelper.set(AWS_CSM_PORT_ENV_VAR, "");
        environmentVariableHelper.set(AWS_CSM_CLIENT_ID_ENV_VAR, "");
    }

    @AfterClass
    public static void cleanup() {
        environmentVariableHelper.reset();
    }

    @Test
    public void testCorrectlyResolvesConfiguration() {
        environmentVariableHelper.set(AWS_CSM_ENABLED_ENV_VAR, "true");
        environmentVariableHelper.set(AWS_CSM_HOST_ENV_VAR, "bar");
        environmentVariableHelper.set(AWS_CSM_PORT_ENV_VAR, "1234");
        environmentVariableHelper.set(AWS_CSM_CLIENT_ID_ENV_VAR, "foo");

        CsmConfiguration cfg = provider.getConfiguration();

        assertEquals(CsmConfiguration.builder().withEnabled(true).withHost("bar").withPort(1234).withClientId("foo").build(), cfg);
    }

    @Test(expected = SdkClientException.class)
    public void testThrowsSdkClientExceptionWhenVariablesNotPresent() {
        provider.getConfiguration();
    }

    @Test(expected = SdkClientException.class)
    public void testThrowsSdkClientExceptionWhenPortCannotBeParsed() {
        environmentVariableHelper.set(AWS_CSM_ENABLED_ENV_VAR, "true");
        environmentVariableHelper.set(AWS_CSM_PORT_ENV_VAR, "onetwothreefour");
        environmentVariableHelper.set(AWS_CSM_CLIENT_ID_ENV_VAR, "foo");

        provider.getConfiguration();
    }

    @Test
    public void optionalValuesNotSet_shouldUseDefaultValues() {
        environmentVariableHelper.reset();
        environmentVariableHelper.set(AWS_CSM_ENABLED_ENV_VAR, "true");

        CsmConfiguration configuration = provider.getConfiguration();
        assertEquals(DEFAULT_AWS_CSM_PORT, configuration.getPort());
        assertEquals(DEFAULT_AWS_CSM_HOST, configuration.getHost());
        assertEquals(DEFAULT_AWS_CSM_CLIENT_ID, configuration.getClientId());
    }
}
