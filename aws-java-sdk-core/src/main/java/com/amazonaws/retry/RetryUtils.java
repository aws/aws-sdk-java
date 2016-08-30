/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.apache.http.HttpStatus;

import com.amazonaws.AmazonServiceException;

import java.util.HashSet;
import java.util.Set;

public class RetryUtils {

    static final Set<String> THROTTLING_ERROR_CODES = new HashSet<String>(9);
    static final Set<String> CLOCK_SKEW_ERROR_CODES = new HashSet<String>(6);
    static final Set<Integer> RETRYABLE_STATUS_CODES = new HashSet<Integer>(4);

    static {
        THROTTLING_ERROR_CODES.add("Throttling");
        THROTTLING_ERROR_CODES.add("ThrottlingException");
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

        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_BAD_GATEWAY);
        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_SERVICE_UNAVAILABLE);
        RETRYABLE_STATUS_CODES.add(HttpStatus.SC_GATEWAY_TIMEOUT);
    }

    /**
     * Returns true if the specified exception is a retryable service side exception.
     *
     * @param ase The exception to test.
     * @return True if the exception resulted from a retryable service error, otherwise false.
     */
    public static boolean isRetryableServiceException(AmazonServiceException ase) {
        if (ase == null) {
            return false;
        }
        final int statusCode = ase.getStatusCode();
        return RETRYABLE_STATUS_CODES.contains(statusCode);
    }

    /**
     * Returns true if the specified exception is a throttling error.
     *
     * @param ase The exception to test.
     * @return True if the exception resulted from a throttling error message from a service,
     * otherwise false.
     */
    public static boolean isThrottlingException(AmazonServiceException ase) {
        if (ase == null) {
            return false;
        }
        return THROTTLING_ERROR_CODES.contains(ase.getErrorCode());
    }

    /**
     * Returns true if the specified exception is a request entity too large error.
     *
     * @param ase The exception to test.
     * @return True if the exception resulted from a request entity too large error message from a
     * service, otherwise false.
     */
    public static boolean isRequestEntityTooLargeException(AmazonServiceException ase) {
        return ase != null && ase.getStatusCode() == HttpStatus.SC_REQUEST_TOO_LONG;
    }

    /**
     * Returns true if the specified exception is a clock skew error.
     *
     * @param ase The exception to test.
     * @return True if the exception resulted from a clock skews error message from a service,
     * otherwise false.
     */
    public static boolean isClockSkewError(AmazonServiceException ase) {
        if (ase == null) {
            return false;
        }
        return CLOCK_SKEW_ERROR_CODES.contains(ase.getErrorCode());
    }

}
