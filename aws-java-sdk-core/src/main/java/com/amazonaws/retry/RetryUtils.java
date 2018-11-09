/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * @deprecated By {@link RetryUtils#isRetryableServiceException(SdkBaseException)}
     */
    @Deprecated
    public static boolean isRetryableServiceException(AmazonServiceException exception) {
        return isRetryableServiceException((SdkBaseException) exception);
    }

    /**
     * Returns true if the specified exception is a retryable service side exception.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a retryable service error, otherwise false.
     */
    public static boolean isRetryableServiceException(SdkBaseException exception) {
        if (!isAse(exception)) {
            return false;
        }
        AmazonServiceException ase = toAse(exception);
        return RETRYABLE_STATUS_CODES.contains(ase.getStatusCode()) || RETRYABLE_ERROR_CODES.contains(ase.getErrorCode());
    }

    /**
     * @deprecated In favor of {@link RetryUtils#isThrottlingException(SdkBaseException)}
     */
    @Deprecated
    public static boolean isThrottlingException(AmazonServiceException exception) {
        return isThrottlingException((SdkBaseException) exception);
    }

    /**
     * Returns true if the specified exception is a throttling error.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a throttling error message from a service, otherwise false.
     */
    public static boolean isThrottlingException(SdkBaseException exception) {
        if (!isAse(exception)) {
            return false;
        }
        final AmazonServiceException ase = toAse(exception);
        return THROTTLING_ERROR_CODES.contains(ase.getErrorCode()) || ase.getStatusCode() == 429;
    }

    /**
     * @deprecated By {@link RetryUtils#isRequestEntityTooLargeException(SdkBaseException)}
     */
    @Deprecated
    public static boolean isRequestEntityTooLargeException(AmazonServiceException exception) {
        return isRequestEntityTooLargeException((SdkBaseException) exception);
    }

    /**
     * Returns true if the specified exception is a request entity too large error.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a request entity too large error message from a service, otherwise false.
     */
    public static boolean isRequestEntityTooLargeException(SdkBaseException exception) {
        return isAse(exception) && toAse(exception).getStatusCode() == HttpStatus.SC_REQUEST_TOO_LONG;
    }

    /**
     * @deprecated By {@link RetryUtils#isClockSkewError(SdkBaseException)}
     */
    @Deprecated
    public static boolean isClockSkewError(AmazonServiceException exception) {
        return isClockSkewError((SdkBaseException) exception);
    }

    /**
     * Returns true if the specified exception is a clock skew error.
     *
     * @param exception The exception to test.
     * @return True if the exception resulted from a clock skews error message from a service, otherwise false.
     */
    public static boolean isClockSkewError(SdkBaseException exception) {
        return isAse(exception) && CLOCK_SKEW_ERROR_CODES.contains(toAse(exception).getErrorCode());
    }

    private static boolean isAse(SdkBaseException e) {
        return e instanceof AmazonServiceException;
    }

    private static AmazonServiceException toAse(SdkBaseException e) {
        return (AmazonServiceException) e;
    }

}
