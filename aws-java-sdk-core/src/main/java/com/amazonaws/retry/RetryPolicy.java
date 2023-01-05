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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.retry.internal.RetryModeResolver;

/**
 * Retry policy that can be configured on a specific service client using
 * {@link ClientConfiguration}. This class is immutable, therefore safe to be
 * shared by multiple clients.
 * 
 * @see ClientConfiguration
 * @see PredefinedRetryPolicies
 */
@Immutable
public final class RetryPolicy {

    private static final RetryModeResolver RETRY_MODE_RESOLVER = new RetryModeResolver();
    /**
     * Condition on whether a request should be retried. This field
     * should not be null.
     */
    private final RetryCondition retryCondition;
    
    /**
     * Back-off strategy to control the sleep time between retry attempts. This
     * field should not be null.
     */
    private final BackoffStrategy backoffStrategy;
    
    /**
     * Non-negative integer indicating the max retry count.
     */
    private final int maxErrorRetry;
    
    /**
     * Whether this retry policy should honor the max error retry set in ClientConfiguration.
     * @see ClientConfiguration#setMaxErrorRetry(int)
     */
    private final boolean honorMaxErrorRetryInClientConfig;

    /**
     * The retry mode to use
     */
    private final RetryMode retryMode;

    /**
     * Whether it should honor the default max error retry in {@link RetryMode}
     */
    private final boolean honorDefaultMaxErrorRetryInRetryMode;

    /**
     * Whether to fail fast when rate limiting is enabled and not enough
     * capacity is available to execute the request immediately.
     */
    private final boolean fastFailRateLimiting;

    /**
     * Whether it should honor the default backoff strategy in {@link RetryMode}
     */
    private final boolean honorBackoffStrategyInRetryMode;

    /**
     * Constructs a new retry policy. See {@link PredefinedRetryPolicies} for
     * some pre-defined policy components, and also the default policies used by
     * SDK.
     * 
     * @param retryCondition
     *            Retry condition on whether a specific request and exception
     *            should be retried. If null value is specified, the SDK'
     *            default retry condition is used.
     * @param backoffStrategy
     *            Back-off strategy for controlling how long the next retry
     *            should wait. If null value is specified, the SDK' default
     *            exponential back-off strategy is used.
     * @param maxErrorRetry
     *            Maximum number of retry attempts for failed requests.
     * @param honorMaxErrorRetryInClientConfig
     *            Whether this retry policy should honor the max error retry set
     *            by {@link ClientConfiguration#setMaxErrorRetry(int)}
     * @see ClientConfiguration
     * @see PredefinedRetryPolicies
     */
    public RetryPolicy(RetryCondition retryCondition,
                       BackoffStrategy backoffStrategy,
                       int maxErrorRetry,
                       boolean honorMaxErrorRetryInClientConfig) {
        this(retryCondition, backoffStrategy, maxErrorRetry, honorMaxErrorRetryInClientConfig, false, false);
    }

    @SdkInternalApi
    public RetryPolicy(RetryCondition retryCondition,
                       BackoffStrategy backoffStrategy,
                       int maxErrorRetry,
                       boolean honorMaxErrorRetryInClientConfig,
                       boolean honorDefaultMaxErrorRetryInRetryMode,
                       boolean honorBackoffStrategyInRetryMode) {
        this(retryCondition, backoffStrategy, maxErrorRetry, honorMaxErrorRetryInClientConfig, null,
             honorDefaultMaxErrorRetryInRetryMode, false, honorBackoffStrategyInRetryMode);
    }

    public RetryPolicy(RetryCondition retryCondition,
                       BackoffStrategy backoffStrategy,
                       int maxErrorRetry,
                       boolean honorMaxErrorRetryInClientConfig,
                       RetryMode retryMode) {
        this(retryCondition, backoffStrategy, maxErrorRetry, honorMaxErrorRetryInClientConfig, retryMode, false, false, false);
    }

    private RetryPolicy(RetryPolicyBuilder builder) {
        this(builder.retryCondition,
             builder.backoffStrategy,
             builder.maxErrorRetry,
             builder.honorMaxErrorRetryInClientConfig,
             builder.retryMode,
             builder.honorDefaultMaxErrorRetryInRetryMode,
             builder.fastFailRateLimiting,
             builder.honorBackOffStrategyInRetryMode);
    }

    @SdkInternalApi
    RetryPolicy(RetryCondition retryCondition,
                BackoffStrategy backoffStrategy,
                int maxErrorRetry,
                boolean honorMaxErrorRetryInClientConfig,
                RetryMode retryMode,
                boolean honorDefaultMaxErrorRetryInRetryMode,
                boolean fastFailRateLimiting,
                boolean honorBackoffStrategyInRetryMode) {
        if (retryCondition == null) {
            retryCondition = PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION;
        }

        if (maxErrorRetry < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }

        if (backoffStrategy == null) {
            backoffStrategy = PredefinedRetryPolicies.DEFAULT_BACKOFF_STRATEGY;
        }

        this.honorDefaultMaxErrorRetryInRetryMode = honorDefaultMaxErrorRetryInRetryMode;
        this.retryCondition = retryCondition;
        this.maxErrorRetry = maxErrorRetry;
        this.honorMaxErrorRetryInClientConfig = honorMaxErrorRetryInClientConfig;
        this.retryMode = retryMode != null ? retryMode : RETRY_MODE_RESOLVER.retryMode();
        this.honorBackoffStrategyInRetryMode = honorBackoffStrategyInRetryMode;
        if (honorBackoffStrategyInRetryMode) {
            this.backoffStrategy = PredefinedRetryPolicies.getDefaultBackoffStrategy(this.retryMode);
        } else {
            this.backoffStrategy = backoffStrategy;
        }

        this.fastFailRateLimiting = fastFailRateLimiting;
    }

    /**
     * Returns the retry condition included in this retry policy.
     * 
     * @return The retry condition included in this retry policy.
     */
    public RetryCondition getRetryCondition() {
        return retryCondition;
    }

    /**
     * Returns the back-off strategy included in this retry policy.
     * 
     * @return The back-off strategy included in this retry policy.
     */
    public BackoffStrategy getBackoffStrategy() {
        return backoffStrategy;
    }

    /**
     * Returns the maximum number of retry attempts.
     * 
     * @return The maximum number of retry attempts.
     */
    public int getMaxErrorRetry() {
        return maxErrorRetry;
    }
    
    /**
     * Returns whether this retry policy should honor the max error retry set in
     * ClientConfiguration.
     * 
     * @return Whether this retry policy should honor the max error retry set in
     *         ClientConfiguration
     * @see ClientConfiguration#setMaxErrorRetry(int)
     */
    public boolean isMaxErrorRetryInClientConfigHonored() {
        return honorMaxErrorRetryInClientConfig;
    }

    /**
     * Returns the {@link RetryMode} to be used.
     *
     * @return retryMode
     */
    public RetryMode getRetryMode() {
        return retryMode;
    }

    /**
     * Whether the client should fail immediately when {@link RetryMode#ADAPTIVE} is enabled, and there is not enough
     * capacity in the rate limiter to execute the request immediately.
     * <p>
     * The default configuration value is {@code false}, which will cause client to wait until enough capacity is
     * available.
     *
     * @return The fast fail configuration value.
     */
    public boolean isFastFailRateLimiting() {
        return fastFailRateLimiting;
    }

    /**
     * @return Whether the default max error in retry mode should be honored.
     */
    boolean isDefaultMaxErrorRetryInRetryModeHonored() {
        return honorDefaultMaxErrorRetryInRetryMode;
    }

    /**
     * @return Whether the default backoff strategy in retry mode should be honored.
     */
    boolean isBackoffStrategyInRetryModeHonored() {
        return honorBackoffStrategyInRetryMode;
    }

    /**
     * @return A builder for conveniently building a retry policy.
     */
    public static RetryPolicyBuilder builder() {
        return new RetryPolicyBuilder();
    }

    public static final class RetryPolicyBuilder {
        private RetryCondition retryCondition;
        private BackoffStrategy backoffStrategy;
        private int maxErrorRetry;
        private boolean honorMaxErrorRetryInClientConfig;
        private RetryMode retryMode;
        private boolean honorDefaultMaxErrorRetryInRetryMode;
        private boolean fastFailRateLimiting;
        private boolean honorBackOffStrategyInRetryMode;

        /**
         * Set the retry condition on whether a specific request and exception should be retried. If null value is
         * specified, the SDK' *default retry condition is used.
         *
         * @param retryCondition The retry condition.
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withRetryCondition(RetryCondition retryCondition) {
            this.retryCondition = retryCondition;
            return this;
        }

        public void setRetryCondition(RetryCondition retryCondition) {
            withRetryCondition(retryCondition);
        }

        /**
         * Set the back-off strategy for controlling how long the next retry should wait. If null value is specified,
         * the SDK' default exponential back-off strategy is used.
         *
         * @param backoffStrategy The backoff strategy.
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withBackoffStrategy(BackoffStrategy backoffStrategy) {
            this.backoffStrategy = backoffStrategy;
            return this;
        }

        public void setBackoffStrategy(BackoffStrategy backoffStrategy) {
            withBackoffStrategy(backoffStrategy);
        }

        /**
         * Set aximum number of retry attempts for failed requests.
         *
         * @param maxErrorRetry The max retry attempts.
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withMaxErrorRetry(int maxErrorRetry) {
            this.maxErrorRetry = maxErrorRetry;
            return this;
        }

        public void setMaxErrorRetry(int maxErrorRetry) {
            withMaxErrorRetry(maxErrorRetry);
        }

        /**
         * Set whether this retry policy should honor the max error retry set by {@link
         * ClientConfiguration#setMaxErrorRetry(int)}.
         *
         * @param honorMaxErrorRetryInClientConfig Whether the policy should honor the max error retry setting on the
         * client configuration.
         *
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withHonorMaxErrorRetryInClientConfig(boolean honorMaxErrorRetryInClientConfig) {
            this.honorMaxErrorRetryInClientConfig = honorMaxErrorRetryInClientConfig;
            return this;
        }

        public void setHonorMaxErrorRetryInClientConfig(boolean honorMaxErrorRetryInClientConfig) {
            withHonorMaxErrorRetryInClientConfig(honorMaxErrorRetryInClientConfig);
        }

        /**
         * Set the retry mode for the client.
         *
         * @param retryMode The retry mode.
         *
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withRetryMode(RetryMode retryMode) {
            this.retryMode = retryMode;
            return this;
        }

        public void setRetryMode(RetryMode retryMode) {
            withRetryMode(retryMode);
        }

        /**
         * Whether the policy should honor the max error retries dictated by the configured retry mode.
         *
         * @param honorDefaultMaxErrorRetryInRetryMode Whether the policy should honor the max error retries dictated
         *                                             by the configured retry mode.
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withHonorDefaultMaxErrorRetryInRetryMode(boolean honorDefaultMaxErrorRetryInRetryMode) {
            this.honorDefaultMaxErrorRetryInRetryMode = honorDefaultMaxErrorRetryInRetryMode;
            return this;
        }

        public void setHonorDefaultMaxErrorRetryInRetryMode(boolean honorDefaultMaxErrorRetryInRetryMode) {
            withHonorDefaultMaxErrorRetryInRetryMode(honorDefaultMaxErrorRetryInRetryMode);
        }

        /**
         * Whether the client should fail immediately when it cannot immediately make a request because there is not enough capacity in the rate limiter.
         * <p>
         * <b>Note:</b> This configuration only has an effect when used in combination with the {@link RetryMode#ADAPTIVE} retry mode.
         *
         * @param fastFailRateLimiting Whether to fail fast.
         *
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withFastFailRateLimiting(boolean fastFailRateLimiting) {
            this.fastFailRateLimiting = fastFailRateLimiting;
            return this;
        }

        public void setFastFailRateLimiting(boolean fastFailRateLimiting) {
            withFastFailRateLimiting(fastFailRateLimiting);
        }

        /**
         * Whether the policy should honor the backoff strategy dictated by the configured retry mode.
         *
         * @param honorBackOffStrategyInRetryMode Whether the policy should honor the backoff strategy dictated
         *                                             by the configured retry mode.
         * @return This object for method chaining.
         */
        public RetryPolicyBuilder withHonorDefaultBackoffStrategyInRetryMode(boolean honorBackOffStrategyInRetryMode) {
            this.honorBackOffStrategyInRetryMode = honorBackOffStrategyInRetryMode;
            return this;
        }

        public void setHonorDefaultBackoffStrategyInRetryMode(boolean honorBackOffStrategyInRetryMode) {
            withHonorDefaultBackoffStrategyInRetryMode(honorBackOffStrategyInRetryMode);
        }

        public RetryPolicy build() {
            return new RetryPolicy(this);
        }
    }
    
    /**
     * The hook for providing custom condition on whether a failed request
     * should be retried.
     */
    public interface RetryCondition {
        RetryCondition NO_RETRY_CONDITION = new RetryCondition() {
            @Override
            public boolean shouldRetry(AmazonWebServiceRequest originalRequest,
                                       AmazonClientException exception,
                                       int retriesAttempted) {
                return false;
            }
        };

        /**
         * Returns whether a failed request should be retried according to the
         * given request context. In the following circumstances, the request
         * will fail directly without consulting this method:
         * <ul>
         *   <li> if it has already reached the max retry limit,
         *   <li> if the request contains non-repeatable content,
         *   <li> if any RuntimeException or Error is thrown when executing the request.
         * </ul>
         * 
         * @param originalRequest
         *            The original request object being executed. For
         *            performance reason, this object is not a defensive copy,
         *            and caller should not attempt to modify its data.
         * @param exception
         *            The exception from the failed request, represented as an
         *            AmazonClientException object. There are two types of
         *            exception that will be passed to this method:
         *            <ul>
         *            <li>AmazonServiceException (sub-class of
         *            AmazonClientException) indicating a service error
         *            <li>AmazonClientException caused by an IOException when
         *            executing the HTTP request.
         *            </ul>
         *            Any other exceptions are regarded as unexpected failures
         *            and are thrown immediately without any retry. For
         *            performance reason, this object is not a defensive copy,
         *            and caller should not attempt to modify its data.
         * @param retriesAttempted
         *            The number of times the current request has been
         *            attempted.
         * 
         * @return True if the failed request should be retried.
         */
        boolean shouldRetry(AmazonWebServiceRequest originalRequest,
                                   AmazonClientException exception,
                                   int retriesAttempted);
        
    }

    /**
     * The hook for providing custom back-off strategy to control the sleep time
     * between retries.
     */
    public interface BackoffStrategy {
        RetryPolicy.BackoffStrategy NO_DELAY = new BackoffStrategy() {
            @Override
            public long delayBeforeNextRetry(AmazonWebServiceRequest originalRequest,
                                             AmazonClientException exception,
                                             int retriesAttempted) {
                return 0;
            }
        };

        /**
         * Returns the delay (in milliseconds) before next retry attempt.
         * 
         * @param originalRequest
         *            The original request object being executed. For
         *            performance reason, this object is not a defensive copy,
         *            and caller should not attempt to modify its data.
         * @param exception
         *            The exception from the failed request, represented as an
         *            AmazonClientException object. There are two types of
         *            exception that will be passed to this method:
         *            <ul>
         *              <li>AmazonServiceException (sub-class of
         *                  AmazonClientException) indicating a service error
         *              <li>AmazonClientException caused by an IOException when
         *                  executing the HTTP request.
         *            </ul>
         *            Any other exceptions are regarded as unexpected failures
         *            and are thrown immediately without any retry. For
         *            performance reason, this object is not a defensive copy,
         *            and caller should not attempt to modify its data.
         * @param retriesAttempted
         *            The number of times the current request has been attempted
         *            (not including the next attempt after the delay).
         * 
         * @return The delay (in milliseconds) before next retry attempt.
         */
        long delayBeforeNextRetry(AmazonWebServiceRequest originalRequest,
                                         AmazonClientException exception,
                                         int retriesAttempted);
    }
}
