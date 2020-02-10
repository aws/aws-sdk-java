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
package com.amazonaws.retry;

import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_SYSTEM_PROPERTY;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RetryPolicyTest {

    @Before
    public void setup() {
        System.clearProperty(AWS_RETRY_MODE_SYSTEM_PROPERTY);
    }

    @Test
    public void retryMode_specifiedInRetryPolicy_shouldHonour() {
        RetryPolicy defaultPolicies = PredefinedRetryPolicies.getDefaultRetryPolicy();
        RetryPolicy retryPolicy = new RetryPolicy(defaultPolicies.getRetryCondition(),
                                                  defaultPolicies.getBackoffStrategy(),
                                                  defaultPolicies.getMaxErrorRetry(),
                                                  false, RetryMode.STANDARD);

        assertEquals(RetryMode.STANDARD, retryPolicy.getRetryMode());
    }

    @Test
    public void retryMode_notSpecifiedInRetryPolicy_shouldResolve() {
        RetryPolicy defaultPolicies = PredefinedRetryPolicies.getDefaultRetryPolicy();
        System.setProperty(AWS_RETRY_MODE_SYSTEM_PROPERTY, "legacy");
        RetryPolicy retryPolicy = new RetryPolicy(defaultPolicies.getRetryCondition(),
                                                  defaultPolicies.getBackoffStrategy(),
                                                  defaultPolicies.getMaxErrorRetry(),
                                                  false);


        assertEquals(RetryMode.LEGACY, retryPolicy.getRetryMode());
    }
}
