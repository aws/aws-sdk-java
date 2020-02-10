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

import static com.amazonaws.SDKGlobalConfiguration.AWS_MAX_ATTEMPTS_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_MAX_ATTEMPTS_SYSTEM_PROPERTY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.EnvironmentVariableHelper;
import utils.TestProfileFileLocationProvider;

@RunWith(Parameterized.class)
public class MaxAttemptsResolverTest {

    private static final EnvironmentVariableHelper ENVIRONMENT_VARIABLE_HELPER = new EnvironmentVariableHelper();

    @Parameterized.Parameter
    public TestData testData;

    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[] {
            new TestData(null, null, null, null),
            new TestData("5", "2", "PropertySetToStandard", 5),
            new TestData( "wrongValue", null, null, null),
            new TestData(null, "wrongValue", null, null),
            new TestData( null, "5", "PropertySetMaxAttempts10", 5),
            new TestData( null, null, "PropertySetMaxAttempts10", 10),
            new TestData(null, null, "PropertyNotSet", null),
            new TestData( null, null, "Property_SetToUnsupportedValue", null),
        });
    }

    @Before
    public void methodSetup() {
        ENVIRONMENT_VARIABLE_HELPER.reset();
        System.clearProperty(AWS_MAX_ATTEMPTS_SYSTEM_PROPERTY);
    }

    @Test
    public void differentCombinationOfConfigs_shouldResolveCorrectly() {
        if (testData.envVarValue != null) {
            ENVIRONMENT_VARIABLE_HELPER.set(AWS_MAX_ATTEMPTS_ENV_VAR, testData.envVarValue);
        }

        if (testData.systemProperty != null) {
            System.setProperty(AWS_MAX_ATTEMPTS_SYSTEM_PROPERTY, testData.systemProperty);
        }

        MaxAttemptsResolver resolver;

        if (testData.configFile != null) {
            resolver = new MaxAttemptsResolver(new TestProfileFileLocationProvider(testData.configFile, "/resources/retry/"));
        } else {
            resolver = new MaxAttemptsResolver();
        }

        assertThat(resolver.maxAttempts(), equalTo(testData.expected));
    }


    private static class TestData {
        private String envVarValue;
        private String systemProperty;
        private String configFile;
        private Integer expected;

        TestData(String envVarValue, String systemProperty, String configFile,
                 Integer expected) {
            this.envVarValue = envVarValue;
            this.systemProperty = systemProperty;
            this.configFile = configFile;
            this.expected = expected;
        }
    }
}
