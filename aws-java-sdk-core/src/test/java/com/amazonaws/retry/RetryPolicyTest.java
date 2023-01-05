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
package com.amazonaws.retry;

import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_SYSTEM_PROPERTY;
import static com.amazonaws.retry.PredefinedBackoffStrategies.STANDARD_BACKOFF_STRATEGY;
import static com.amazonaws.retry.PredefinedRetryPolicies.DEFAULT_BACKOFF_STRATEGY;
import static com.amazonaws.retry.PredefinedRetryPolicies.DYNAMODB_DEFAULT_BACKOFF_STRATEGY;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

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


        assertEquals(RetryMode.STANDARD, retryPolicy.getRetryMode());
    }

    @Test
    public void honorBackoffStrategyInRetryModeTrue_standardMode_shouldHonor() {
        RetryPolicy retryPolicy = honorBackoffStrategyTrue(RetryMode.STANDARD);
        assertEquals(STANDARD_BACKOFF_STRATEGY, retryPolicy.getBackoffStrategy());
    }

    @Test
    public void honorBackoffStrategyInRetryModeTrue_adaptiveMode_shouldHonor() {
        RetryPolicy retryPolicy = honorBackoffStrategyTrue(RetryMode.ADAPTIVE);
        assertEquals(STANDARD_BACKOFF_STRATEGY, retryPolicy.getBackoffStrategy());
    }

    @Test
    public void honorBackoffStrategyInRetryModeTrue_legacyMode_shouldHonor() {
        RetryPolicy retryPolicy = honorBackoffStrategyTrue(RetryMode.LEGACY);
        assertEquals(DEFAULT_BACKOFF_STRATEGY, retryPolicy.getBackoffStrategy());
    }

    @Test
    public void DDBDefaultBackoffStrategy_standard_shouldNotUseStandardBackoffStrategy() {
        verifyDDBBackOffStrategy(RetryMode.STANDARD);
    }

    @Test
    public void DDBDefaultBackoffStrategy_adaptive_shouldNotUseStandardBackoffStrategy() {
        verifyDDBBackOffStrategy(RetryMode.ADAPTIVE);
    }

    @Test
    public void DDBDefaultBackoffStrategy_legacy_shouldNotUseStandardBackoffStrategy() {
        verifyDDBBackOffStrategy(RetryMode.LEGACY);
    }

    private void verifyDDBBackOffStrategy(RetryMode retryMode) {
        System.setProperty(AWS_RETRY_MODE_SYSTEM_PROPERTY, retryMode.getName());
        RetryPolicy retryPolicy = PredefinedRetryPolicies.getDynamoDBDefaultRetryPolicy();
        assertEquals(DYNAMODB_DEFAULT_BACKOFF_STRATEGY, retryPolicy.getBackoffStrategy());
    }

    @Test
    public void honorBackoffStrategyInRetryModeFalse_standard_shouldUseTheProvidedOne() {
        verifyProvidedBackoffStrategy(RetryMode.STANDARD);
    }

    @Test
    public void honorBackoffStrategyInRetryModeFalse_adaptive_shouldUseTheProvidedOne() {
        verifyProvidedBackoffStrategy(RetryMode.ADAPTIVE);
    }

    @Test
    public void honorBackoffStrategyInRetryModeFalse_legacy_shouldUseTheProvidedOne() {
        verifyProvidedBackoffStrategy(RetryMode.LEGACY);
    }


    @Test
    public void fastFailRateLimiting_defaultToFalse() {
        RetryPolicy retryPolicy = RetryPolicy.builder()
                .withRetryMode(RetryMode.ADAPTIVE)
                .build();

        assertFalse(retryPolicy.isFastFailRateLimiting());
    }

    @Test
    public void fastFailRateLimiting_returnsCorrectValue() {
        RetryPolicy retryPolicy = RetryPolicy.builder()
                .withRetryMode(RetryMode.ADAPTIVE)
                .withFastFailRateLimiting(true)
                .build();

        assertTrue(retryPolicy.isFastFailRateLimiting());
    }

    @Test
    public void builder_build_maximal() {
        RetryPolicy.RetryCondition retryCondition = mock(RetryPolicy.RetryCondition.class);
        RetryPolicy.BackoffStrategy backoffStrategy = mock(RetryPolicy.BackoffStrategy.class);
        int maxRetry = 1234;

        RetryPolicy retryPolicy = RetryPolicy.builder()
                .withRetryCondition(retryCondition)
                .withBackoffStrategy(backoffStrategy)
                .withMaxErrorRetry(maxRetry)
                .withFastFailRateLimiting(true)
                .withHonorMaxErrorRetryInClientConfig(true)
                .withHonorDefaultMaxErrorRetryInRetryMode(true)
                .withRetryMode(RetryMode.ADAPTIVE)
                .build();

        assertThat(retryPolicy.getRetryCondition(), sameInstance(retryCondition));
        assertThat(retryPolicy.getBackoffStrategy(), sameInstance(backoffStrategy));
        assertEquals(maxRetry, retryPolicy.getMaxErrorRetry());
        assertTrue(retryPolicy.isFastFailRateLimiting());
        assertTrue(retryPolicy.isMaxErrorRetryInClientConfigHonored());
        assertTrue(retryPolicy.isDefaultMaxErrorRetryInRetryModeHonored());
        assertEquals(RetryMode.ADAPTIVE, retryPolicy.getRetryMode());
    }

    private RetryPolicy honorBackoffStrategyTrue(RetryMode retryMode) {
        RetryPolicy defaultPolicies = PredefinedRetryPolicies.getDefaultRetryPolicy();
        return RetryPolicy.builder()
                          .withRetryMode(retryMode)
                          .withBackoffStrategy(defaultPolicies.getBackoffStrategy())
                          .withHonorDefaultBackoffStrategyInRetryMode(true)
                          .build();
    }

    private void verifyProvidedBackoffStrategy(RetryMode retryMode) {
        RetryPolicy defaultPolicies = PredefinedRetryPolicies.getDefaultRetryPolicy();
        RetryPolicy retryPolicy = RetryPolicy.builder()
                                             .withRetryMode(retryMode)
                                             .withBackoffStrategy(defaultPolicies.getBackoffStrategy())
                                             .withHonorDefaultBackoffStrategyInRetryMode(false)
                                             .build();

        assertEquals(defaultPolicies.getBackoffStrategy(), retryPolicy.getBackoffStrategy());
    }
}
