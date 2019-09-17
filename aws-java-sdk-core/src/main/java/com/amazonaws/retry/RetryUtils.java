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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkBaseException;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.HttpStatus;

public class RetryUtils {

    static final Set<String> THROTTLING_ERROR_CODES = new HashSet<String>(9);
    static final Set<String> CLOCK_SKEW_ERROR_CODES = new HashSet<String>(6);
    static final Set<String> RETRYABLE_ERROR_CODES = new HashSet<String>(1);
    static final Set<Integer> RETRYABLE_STATUS_CODES = new HashSet<Integer>(4);

    static {
        THROTTLING_ERROR_CODES.add("Throttling");
        THROTTLING_ERROR_CODES.add("ThrottlingException");
        THROTTLING_ERROR_CODES.add("ThrottledException");
        THROTTLING_ERROR_CODES.add("ProvisionedThroughputExceededException");
        THROTTLING_ERROR_CODES.add("SlowDown");
        THROTTLING_ERROR_CODES.add("TooManyRequestsException");
        THROTTLING_ERROR_CODES.add("RequestLimitExceeded");
        THROTTLING_ERROR_CODES.add("BandwidthLimitExceeded");
        THROTTLING_ERROR_CODES.add("RequestThrottled");
        THROTTLING_ERROR_CODES.add("RequestThrottledException");

        CLOCK_SKEW_ERROR_CODES.add("RequestTimeTooSkewed");
        CLOCK_SKEW_ERROR_CODES.add("RequestExpired");
        CLOCK_SKEW_ERROR_CODES.add("InvalidSignatureException");
        CLOCK_SKEW_ERROR_CODES.add("SignatureDoesNotMatch");
        CLOCK_SKEW_ERROR_CODES.add("AuthFailure");
        CLOCK_SKEW_ERROR_CODES.add("RequestInTheFuture");

        RETRYABLE_ERROR_CODES.add("PriorRequestNotComplete");
        RETRYABLE_ERROR_CODES.add("TransactionInProgressException");

        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_BAD_GATEWAY);
        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_SERVICE_UNAVAILABLE);
        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_GATEWAY_TIMEOUT);
    }

    /**
     * Returns true if the specified exception is a retryable service side exception.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a retryable service error, otherwise false.
     */
    public static boolean isRetryableServiceException(SdkBaseException exception) {
        return isAse(exception) && isRetryableServiceException(toAse(exception));
    }

    /**
     * Returns true if the specified exception is a retryable service side exception.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a retryable service error, otherwise false.
     */
    public static boolean isRetryableServiceException(AmazonServiceException exception) {
        return RETRYABLE_STATUS_CODES.contains(exception.getStatusCode()) ||
               RETRYABLE_ERROR_CODES.contains(exception.getErrorCode());
    }

    /**
     * Returns true if the specified exception is a throttling error.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a throttling error message from a service, otherwise false.
     */
    public static boolean isThrottlingException(SdkBaseException exception) {
        return isAse(exception) && isThrottlingException(toAse(exception));
    }

    /**
     * Returns true if the specified exception is a throttling error.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a throttling error message from a service, otherwise false.
     */
    public static boolean isThrottlingException(AmazonServiceException exception) {
        return THROTTLING_ERROR_CODES.contains(exception.getErrorCode()) ||
               exception.getStatusCode() == 429;
    }

    /**
     * Returns true if the specified exception is a request entity too large error.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a request entity too large error message from a service, otherwise false.
     */
    public static boolean isRequestEntityTooLargeException(SdkBaseException exception) {
        return isAse(exception) && isRequestEntityTooLargeException(toAse(exception));
    }

    /**
     * Returns true if the specified exception is a request entity too large error.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a request entity too large error message from a service, otherwise false.
     */
    public static boolean isRequestEntityTooLargeException(AmazonServiceException exception) {
        return exception.getStatusCode() == HttpStatus.SC_REQUEST_TOO_LONG;
    }

    /**
     * Returns true if the specified exception is definitely a clock skew error.
     *
     * This cannot determine all instances of clock skew errors. For example, not all HEAD requests return an error code, so
     * there is no way to determine whether a failed HEAD response is definitely a clock skew error.
     *
     * @see ClockSkewAdjuster
     * @param exception The exception to test.
     * @return True if the exception is definitely a clock skew error, otherwise false.
     */
    public static boolean isClockSkewError(SdkBaseException exception) {
        return isAse(exception) && isClockSkewError(toAse(exception));
    }

    /**
     * Returns true if the specified exception is definitely a clock skew error.
     *
     * This cannot determine all instances of clock skew errors. For example, not all HEAD requests return an error code, so
     * there is no way to determine whether a failed HEAD response is definitely a clock skew error.
     *
     * @see ClockSkewAdjuster
     * @param exception The exception to test.
     * @return True if the exception is definitely a clock skew error, otherwise false.
     */
    public static boolean isClockSkewError(AmazonServiceException exception) {
        return CLOCK_SKEW_ERROR_CODES.contains(exception.getErrorCode());
    }

    private static boolean isAse(SdkBaseException e) {
        return e instanceof AmazonServiceException;
    }

    private static AmazonServiceException toAse(SdkBaseException e) {
        return (AmazonServiceException) e;
    }

}
