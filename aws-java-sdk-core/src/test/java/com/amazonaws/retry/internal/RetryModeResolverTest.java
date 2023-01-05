/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.retry.internal;

import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_SYSTEM_PROPERTY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;

import com.amazonaws.auth.profile.internal.BasicProfileConfigFileLoader;
import com.amazonaws.internal.config.InternalConfig;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import com.amazonaws.retry.RetryMode;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import utils.EnvironmentVariableHelper;
import utils.TestProfileFileLocationProvider;

@RunWith(Parameterized.class)
public class RetryModeResolverTest {

    private static final EnvironmentVariableHelper ENVIRONMENT_VARIABLE_HELPER = new EnvironmentVariableHelper();

    @Parameterized.Parameter
    public TestData testData;

    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[] {
            new TestData(null, null, null, null, RetryMode.LEGACY),
            new TestData("standard", "legacy", "PropertySetToStandard", null, RetryMode.STANDARD),
            new TestData("wrongValue", null, null, null, RetryMode.LEGACY),
            new TestData(null, "wrongValue", null, null, RetryMode.LEGACY),
            new TestData("standard", "legacy", "PropertySetToStandard", null, RetryMode.STANDARD),
            new TestData(null, "standard", "PropertySetToLegacy", null, RetryMode.STANDARD),
            new TestData(null, null, "PropertyNotSet", null, RetryMode.LEGACY),
            new TestData(null, null, "Property_MixedCase", null, RetryMode.STANDARD),
            new TestData(null, null, "Property_SetToUnsupportedValue", null, RetryMode.LEGACY),
            new TestData("adaptive", "legacy", "PropertySetToAdaptive", null, RetryMode.ADAPTIVE),
            new TestData(null, "adaptive", "PropertySetToLegacy", null, RetryMode.ADAPTIVE),
            new TestData(null, null, "Property_Adaptive_MixedCase", null, RetryMode.ADAPTIVE),
            new TestData(null, null, null, "STANDARD", RetryMode.STANDARD),
        });
    }

    @Before
    public void methodSetup() {
        ENVIRONMENT_VARIABLE_HELPER.reset();
        System.clearProperty(AWS_RETRY_MODE_SYSTEM_PROPERTY);
    }

    @Test
    public void differentCombinationOfConfigs_shouldResolveCorrectly() {
        if (testData.envVarValue != null) {
            ENVIRONMENT_VARIABLE_HELPER.set(AWS_RETRY_MODE_ENV_VAR, testData.envVarValue);
        }

        if (testData.systemProperty != null) {
            System.setProperty(AWS_RETRY_MODE_SYSTEM_PROPERTY, testData.systemProperty);
        }

        AwsProfileFileLocationProvider profileFileLocationProvider =
            new TestProfileFileLocationProvider(testData.configFile, "/resources/retry/");
        BasicProfileConfigFileLoader configFileLoader = new BasicProfileConfigFileLoader(profileFileLocationProvider);

        InternalConfig internalConfig = Mockito.mock(InternalConfig.class);
        when(internalConfig.getDefaultRetryMode()).thenReturn(testData.defaultRetryMode);

        RetryModeResolver resolver = new RetryModeResolver(configFileLoader, internalConfig);

        assertThat(resolver.retryMode(), equalTo(testData.expected));
    }


    private static class TestData {
        private String envVarValue;
        private String systemProperty;
        private String configFile;
        private String defaultRetryMode;
        private RetryMode expected;

        TestData(String envVarValue, String systemProperty, String configFile,
                 String defaultRetryMode, RetryMode expected) {
            this.envVarValue = envVarValue;
            this.systemProperty = systemProperty;
            this.configFile = configFile;
            this.defaultRetryMode = defaultRetryMode;
            this.expected = expected;
        }
    }
}
