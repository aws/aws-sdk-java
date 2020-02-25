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

package com.amazonaws.retry.internal;

import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_SYSTEM_PROPERTY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.amazonaws.retry.RetryMode;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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
            new TestData(null, null, null, RetryMode.LEGACY),
            new TestData("standard", "legacy", "PropertySetToStandard", RetryMode.STANDARD),
            new TestData( "wrongValue", null, null, RetryMode.LEGACY),
            new TestData(null, "wrongValue", null, RetryMode.LEGACY),
            new TestData( "standard", "legacy", "PropertySetToStandard", RetryMode.STANDARD),
            new TestData( null, "standard", "PropertySetToLegacy", RetryMode.STANDARD),
            new TestData(null, null, "PropertyNotSet", RetryMode.LEGACY),
            new TestData(null, null, "Property_MixedCase", RetryMode.STANDARD),
            new TestData( null, null, "Property_SetToUnsupportedValue", RetryMode.LEGACY),
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

        RetryModeResolver resolver;

        if (testData.configFile != null) {
            resolver = new RetryModeResolver(new TestProfileFileLocationProvider(testData.configFile, "/resources/retry/"));
        } else {
            resolver = new RetryModeResolver();
        }

        assertThat(resolver.retryMode(), equalTo(testData.expected));
    }


    private static class TestData {
        private String envVarValue;
        private String systemProperty;
        private String configFile;
        private RetryMode expected;

        TestData(String envVarValue, String systemProperty, String configFile,
                 RetryMode expected) {
            this.envVarValue = envVarValue;
            this.systemProperty = systemProperty;
            this.configFile = configFile;
            this.expected = expected;
        }
    }
}
