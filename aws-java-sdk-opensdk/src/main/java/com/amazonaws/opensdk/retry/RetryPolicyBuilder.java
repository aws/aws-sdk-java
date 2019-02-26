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
package com.amazonaws.opensdk.retry;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.v2.AndRetryCondition;
import com.amazonaws.retry.v2.BackoffStrategy;
import com.amazonaws.retry.v2.FixedDelayBackoffStrategy;
import com.amazonaws.retry.v2.MaxNumberOfRetriesCondition;
import com.amazonaws.retry.v2.OrRetryCondition;
import com.amazonaws.retry.v2.RetryCondition;
import com.amazonaws.retry.v2.RetryOnExceptionsCondition;
import com.amazonaws.retry.v2.RetryOnStatusCodeCondition;
import com.amazonaws.retry.v2.RetryPolicy;
import com.amazonaws.retry.v2.SimpleRetryPolicy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Fluent builder to construct a {@link RetryPolicy} implementation.
 */
public final class RetryPolicyBuilder {

    private final List<Class<? extends Exception>> exceptions = new ArrayList<>();
    private final List<Integer> statusCodes = new ArrayList<>();
    private BackoffStrategy backoffStrategy = PredefinedRetryPolicies.DEFAULT_BACKOFF_STRATEGY_V2;
    private int maxNumberOfRetries = PredefinedRetryPolicies.DEFAULT_MAX_ERROR_RETRY;

    /**
     * @return Builder with standard defaults.
     */
    public static RetryPolicyBuilder standard() {
        return new RetryPolicyBuilder();
    }

    private RetryPolicyBuilder() {
    }

    /**
     * @param exceptions Exception classes to retry on.
     * @return This object for method chaining.
     */
    @SafeVarargs
    public final RetryPolicyBuilder retryOnExceptions(Class<? extends Exception>... exceptions) {
        Collections.addAll(this.exceptions, exceptions);
        return this;
    }

    /**
     * @param statusCodes HTTP status codes to retry on.
     * @return This object for method chaining.
     */
    public RetryPolicyBuilder retryOnStatusCodes(int... statusCodes) {
        for (int statusCode : statusCodes) {
            this.statusCodes.add(statusCode);
        }
        return this;
    }

    /**
     * The default value for max number of retries is {@value PredefinedRetryPolicies#DEFAULT_MAX_ERROR_RETRY}.
     *
     * <p>Note that the actual max allowed retries may be less due to retry throttling. See this <a
     * href="https://aws.amazon.com/blogs/developer/introducing-retry-throttling/">blog</a> for more details.</p>
     *
     * @param maxNumberOfRetries Max number of retries to allow.
     * @return This object for method chaining.
     */
    public RetryPolicyBuilder maxNumberOfRetries(int maxNumberOfRetries) {
        this.maxNumberOfRetries = maxNumberOfRetries;
        return this;
    }

    /**
     * Note, this option and {@link #backoffStrategy(BackoffStrategy)} are mutually exclusive settings.
     *
     * <p>If backoff strategy is not provided, {@link PredefinedRetryPolicies#DEFAULT_BACKOFF_STRATEGY} will be used.</p>
     *
     * <p>See {@link com.amazonaws.retry.PredefinedBackoffStrategies} for precanned implementations.</p>
     *
     * @param backoff Fixed delay before each retry attempt.
     * @return This object for method chaining.
     */
    public RetryPolicyBuilder fixedBackoff(int backoff) {
        this.backoffStrategy = new FixedDelayBackoffStrategy(backoff);
        return this;
    }

    /**
     * Note, this option and {@link #fixedBackoff(int)} are mutually exclusive settings.
     *
     * <p>If backoff strategy is not provided, {@link PredefinedRetryPolicies#DEFAULT_BACKOFF_STRATEGY} will be used.</p>
     *
     * <p>See {@link com.amazonaws.retry.PredefinedBackoffStrategies} for precanned implementations.</p>
     *
     * @param backoffStrategy Backoff strategy to use in the RetryPolicy.
     * @return This object for method chaining.
     */
    public RetryPolicyBuilder backoffStrategy(BackoffStrategy backoffStrategy) {
        this.backoffStrategy = backoffStrategy;
        return this;
    }

    /**
     * Construct a RetryPolicy with the current configuration in the builder.
     *
     * @return Configured RetryPolicy object.
     */
    public RetryPolicy build() {
        return new SimpleRetryPolicy(buildCondition(), backoffStrategy);
    }

    private RetryCondition buildCondition() {
        return new AndRetryCondition(new MaxNumberOfRetriesCondition(maxNumberOfRetries),
                                     new OrRetryCondition(
                                             new RetryOnExceptionsCondition(exceptions),
                                             new RetryOnStatusCodeCondition(statusCodes)));
    }
}