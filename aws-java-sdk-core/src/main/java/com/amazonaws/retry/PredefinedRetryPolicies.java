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
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import java.io.IOException;

/**
 * This class includes a set of pre-defined retry policies, including default
 * policies used by SDK.
 */
public class PredefinedRetryPolicies {

    /** No retry policy **/
    public static final RetryPolicy NO_RETRY_POLICY = new RetryPolicy(
            RetryPolicy.RetryCondition.NO_RETRY_CONDITION,
            RetryPolicy.BackoffStrategy.NO_DELAY,
            0,      // maxErrorRetry
            false); // honorMaxErrorRetryInClientConfig

    /* SDK default */

    /** SDK default max retry count **/
    public static final int DEFAULT_MAX_ERROR_RETRY = 3;

    /**
     * SDK default retry policy. Amazon DynamoDB has a custom retry policy that is used when no
     * {@link ClientConfiguration} is provided.
     */
    public static final RetryPolicy DEFAULT;

    /* Default for DynamoDB client */

    /** Default max retry count for DynamoDB client **/
    public static final int DYNAMODB_DEFAULT_MAX_ERROR_RETRY = 10;

    /** Default policy for DynamoDB client **/
    public static final RetryPolicy DYNAMODB_DEFAULT;

    /* Reusable retry policy components */

    /**
     * The SDK default retry condition, which checks for various conditions in
     * the following order:
     * <ul>
     *   <li>Never retry on requests with non-repeatable content;
     *   <li>Retry on client exceptions caused by IOException;
     *   <li>Retry on service exceptions that are either 500 internal server
     *       errors, 503 service unavailable errors, service throttling errors or
     *       clock skew errors.
     * </ul>
     */
    public static final RetryPolicy.RetryCondition DEFAULT_RETRY_CONDITION = new SDKDefaultRetryCondition();

    /**
     * The SDK default back-off strategy, which increases exponentially up to a max amount of delay. It also applies a larger
     * scale factor upon service throttling exception.
     */
    public static final RetryPolicy.BackoffStrategy DEFAULT_BACKOFF_STRATEGY =
            new PredefinedBackoffStrategies.SDKDefaultBackoffStrategy();

    /**
     * The SDK default back-off strategy, which increases exponentially up to a max amount of delay. It also applies a larger
     * scale factor upon service throttling exception.
     */
    public static final V2CompatibleBackoffStrategy DEFAULT_BACKOFF_STRATEGY_V2 =
            new PredefinedBackoffStrategies.SDKDefaultBackoffStrategy();

    /**
     * The default back-off strategy for DynamoDB client, which increases
     * exponentially up to a max amount of delay. Compared to the SDK default
     * back-off strategy, it applies a smaller scale factor.
     */
    public static final RetryPolicy.BackoffStrategy DYNAMODB_DEFAULT_BACKOFF_STRATEGY =
            new PredefinedBackoffStrategies.SDKDefaultBackoffStrategy(PredefinedBackoffStrategies.DYNAMODB_DEFAULT_BASE_DELAY,
                                                                      PredefinedBackoffStrategies.SDK_DEFAULT_THROTTLED_BASE_DELAY,
                                                                      PredefinedBackoffStrategies.SDK_DEFAULT_MAX_BACKOFF_IN_MILLISECONDS);

    static {
        DEFAULT = getDefaultRetryPolicy();
        DYNAMODB_DEFAULT = getDynamoDBDefaultRetryPolicy();
    }

    /**
     * Returns the SDK default retry policy. This policy will honor the
     * maxErrorRetry set in ClientConfiguration.
     *
     * @see ClientConfiguration#setMaxErrorRetry(int)
     */
    public static RetryPolicy getDefaultRetryPolicy() {
        return new RetryPolicy(DEFAULT_RETRY_CONDITION,
                               DEFAULT_BACKOFF_STRATEGY,
                               DEFAULT_MAX_ERROR_RETRY,
                               true);
    }

    /**
     * Returns the default retry policy for DynamoDB client. This policy will
     * honor the maxErrorRetry set in ClientConfiguration.
     *
     * @see ClientConfiguration#setMaxErrorRetry(int)
     */
    public static RetryPolicy getDynamoDBDefaultRetryPolicy() {
        return new RetryPolicy(DEFAULT_RETRY_CONDITION,
                               DYNAMODB_DEFAULT_BACKOFF_STRATEGY,
                               DYNAMODB_DEFAULT_MAX_ERROR_RETRY,
                               true);
    }

    /**
     * Returns the SDK default retry policy with the specified max retry count.
     */
    public static RetryPolicy getDefaultRetryPolicyWithCustomMaxRetries(int maxErrorRetry) {
        return new RetryPolicy(DEFAULT_RETRY_CONDITION,
                               DEFAULT_BACKOFF_STRATEGY,
                               maxErrorRetry,
                               false);
    }

    /**
     * Returns the default retry policy for DynamoDB client with the specified
     * max retry count.
     */
    public static RetryPolicy getDynamoDBDefaultRetryPolicyWithCustomMaxRetries(int maxErrorRetry) {
        return new RetryPolicy(DEFAULT_RETRY_CONDITION,
                               DYNAMODB_DEFAULT_BACKOFF_STRATEGY,
                               maxErrorRetry,
                               false);
    }

    /**
     * The default implementation of RetryCondition used by the SDK. User could
     * extend this class to provide additional custom conditions.
     * The default implementation checks for various conditions in
     * the following order:
     * <ul>
     *   <li>Retry on client exceptions caused by IOException;
     *   <li>Retry on service exceptions that are either 500 internal server
     *       errors, 503 service unavailable errors, service throttling errors or
     *       clock skew errors.
     * </ul>
     */
    public static class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {

        @Override
        public boolean shouldRetry(AmazonWebServiceRequest originalRequest,
                                   AmazonClientException exception,
                                   int retriesAttempted) {
            // Always retry on client exceptions caused by IOException
            if (exception.getCause() instanceof IOException) return true;

            // Only retry on a subset of service exceptions
            if (exception instanceof AmazonServiceException) {
                AmazonServiceException ase = (AmazonServiceException)exception;

                /*
                 * For 500 internal server errors and 503 service
                 * unavailable errors, we want to retry, but we need to use
                 * an exponential back-off strategy so that we don't overload
                 * a server with a flood of retries.
                 */
                if (RetryUtils.isRetryableServiceException(ase)) return true;

                /*
                 * Throttling is reported as a 400 error from newer services. To try
                 * and smooth out an occasional throttling error, we'll pause and
                 * retry, hoping that the pause is long enough for the request to
                 * get through the next time.
                 */
                if (RetryUtils.isThrottlingException(ase)) return true;

                /*
                 * Clock skew exception. If it is then we will get the time offset
                 * between the device time and the server time to set the clock skew
                 * and then retry the request.
                 */
                if (RetryUtils.isClockSkewError(ase)) return true;
            }

            return false;
        }

    }
}
