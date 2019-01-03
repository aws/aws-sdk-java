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
package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.Immutable;

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
        if (retryCondition == null) {
            retryCondition = PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION;
        }
        if (backoffStrategy == null) {
            backoffStrategy = PredefinedRetryPolicies.DEFAULT_BACKOFF_STRATEGY;
        }
        if (maxErrorRetry < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }
        
        this.retryCondition = retryCondition;
        this.backoffStrategy = backoffStrategy;
        this.maxErrorRetry = maxErrorRetry;
        this.honorMaxErrorRetryInClientConfig = honorMaxErrorRetryInClientConfig;
    };

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
