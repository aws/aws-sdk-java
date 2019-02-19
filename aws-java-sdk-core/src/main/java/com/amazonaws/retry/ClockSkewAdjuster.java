/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.retry;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.SdkBaseException;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.ValidationUtils;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/**
 * Applies heuristics to suggest a clock skew adjustment that should be applied to future requests based on a given service error.
 *
 * This handles cases that are definitely clock skew errors (where {@link RetryUtils#isClockSkewError} is true) as well as
 * cases that may or may not be clock skew errors.
 */
@ThreadSafe
@SdkInternalApi
public final class ClockSkewAdjuster {
    private static final Log log = LogFactory.getLog(ClockSkewAdjuster.class);

    /**
     * The HTTP status codes associated with authentication errors. These status codes may be caused by skewed clock.
     */
    private static final Set<Integer> AUTHENTICATION_ERROR_STATUS_CODES;

    /**
     * When we get an error that may be due to a clock skew error, and our clock is different than the service clock, this is
     * the difference threshold (in seconds) beyond which we will recommend a clock skew adjustment.
     */
    private static final int CLOCK_SKEW_ADJUST_THRESHOLD_IN_SECONDS = 4 * 60;

    static {
        Set<Integer> statusCodes = new HashSet<Integer>();
        statusCodes.add(401);
        statusCodes.add(403);
        AUTHENTICATION_ERROR_STATUS_CODES = Collections.unmodifiableSet(statusCodes);
    }

    /**
     * Recommend a {@link ClockSkewAdjustment}, based on the provided {@link AdjustmentRequest}.
     */
    public ClockSkewAdjustment getAdjustment(AdjustmentRequest adjustmentRequest) {
        ValidationUtils.assertNotNull(adjustmentRequest, "adjustmentRequest");
        ValidationUtils.assertNotNull(adjustmentRequest.exception, "adjustmentRequest.exception");
        ValidationUtils.assertNotNull(adjustmentRequest.clientRequest, "adjustmentRequest.clientRequest");
        ValidationUtils.assertNotNull(adjustmentRequest.serviceResponse, "adjustmentRequest.serviceResponse");

        int timeSkewInSeconds = 0;
        boolean isAdjustmentRecommended = false;

        try {
            if (isAdjustmentRecommended(adjustmentRequest)) {
                Date serverDate = getServerDate(adjustmentRequest);

                if (serverDate != null) {
                    timeSkewInSeconds = timeSkewInSeconds(getCurrentDate(adjustmentRequest), serverDate);
                    isAdjustmentRecommended = true;
                }
            }
        } catch (RuntimeException e) {
            log.warn("Unable to correct for clock skew.", e);
        }

        return new ClockSkewAdjustment(isAdjustmentRecommended, timeSkewInSeconds);
    }

    private boolean isAdjustmentRecommended(AdjustmentRequest adjustmentRequest) {
        if (!(adjustmentRequest.exception instanceof AmazonServiceException)) {
            return false;
        }

        AmazonServiceException exception = (AmazonServiceException) adjustmentRequest.exception;

        return isDefinitelyClockSkewError(exception) ||
               (mayBeClockSkewError(exception) && clientRequestWasSkewed(adjustmentRequest));
    }

    private boolean isDefinitelyClockSkewError(AmazonServiceException exception) {
        return RetryUtils.isClockSkewError(exception);
    }

    private boolean mayBeClockSkewError(AmazonServiceException exception) {
        return AUTHENTICATION_ERROR_STATUS_CODES.contains(exception.getStatusCode());
    }

    private boolean clientRequestWasSkewed(AdjustmentRequest adjustmentRequest) {
        Date serverDate = getServerDate(adjustmentRequest);
        if (serverDate == null) {
            return false;
        }

        int requestClockSkew = timeSkewInSeconds(getClientDate(adjustmentRequest), serverDate);
        return Math.abs(requestClockSkew) > CLOCK_SKEW_ADJUST_THRESHOLD_IN_SECONDS;
    }

    /**
     * Calculate the time skew between a client and server date. This value has the same semantics of
     * {@link Request#setTimeOffset(int)}. Positive values imply the client clock is "fast" and negative values imply
     * the client clock is "slow".
     */
    private int timeSkewInSeconds(Date clientTime, Date serverTime) {
        ValidationUtils.assertNotNull(clientTime, "clientTime");
        ValidationUtils.assertNotNull(serverTime, "serverTime");

        long value = (clientTime.getTime() - serverTime.getTime()) / 1000;

        if ((int) value != value) {
            throw new IllegalStateException("Time is too skewed to adjust: (clientTime: " + clientTime.getTime() + ", " +
                                            "serverTime: " + serverTime.getTime() + ")");
        }
        return (int) value;
    }

    private Date getCurrentDate(AdjustmentRequest adjustmentRequest) {
        return new Date(adjustmentRequest.currentTime);
    }

    private Date getClientDate(AdjustmentRequest adjustmentRequest) {
        return new Date(adjustmentRequest.currentTime - (long)(adjustmentRequest.clientRequest.getTimeOffset() * 1000));
    }

    private Date getServerDate(AdjustmentRequest adjustmentRequest) {
        String serverDateStr = null;
        try {
            Header[] responseDateHeader = adjustmentRequest.serviceResponse.getHeaders("Date");

            if (responseDateHeader.length > 0) {
                serverDateStr = responseDateHeader[0].getValue();
                log.debug("Reported server date (from 'Date' header): " + serverDateStr);
                return DateUtils.parseRFC822Date(serverDateStr);
            }

            // SQS doesn't return Date header
            final String exceptionMessage = adjustmentRequest.exception.getMessage();
            serverDateStr = getServerDateFromException(exceptionMessage);

            if (serverDateStr != null) {
                log.debug("Reported server date (from exception message): " + serverDateStr);
                return DateUtils.parseCompressedISO8601Date(serverDateStr);
            }

            log.debug("Server did not return a date, so clock skew adjustments will not be applied.");
            return null;
        } catch (RuntimeException e) {
            log.warn("Unable to parse clock skew offset from response: " + serverDateStr, e);
            return null;
        }
    }

    /**
     * Returns date string from the exception message body in form of yyyyMMdd'T'HHmmss'Z' We
     * needed to extract date from the message body because SQS is the only service that does
     * not provide date header in the response. Example, when device time is behind than the
     * server time than we get a string that looks something like this: "Signature expired:
     * 20130401T030113Z is now earlier than 20130401T034613Z (20130401T040113Z - 15 min.)"
     *
     * SWF: Signature not yet current: 20140819T173921Z is still later than 20140819T173829Z
     * (20140819T173329Z + 5 min.)
     *
     * @param body The message from where the server time is being extracted
     * @return Return datetime in string format (yyyyMMdd'T'HHmmss'Z')
     */
    private String getServerDateFromException(String body) {
        final int startPos = body.indexOf("(");
        int endPos = body.indexOf(" + ");
        if (endPos == -1) {
            endPos = body.indexOf(" - ");
        }
        return endPos == -1 ? null : body.substring(startPos + 1, endPos);
    }

    @NotThreadSafe
    public static final class AdjustmentRequest {
        private Request<?> clientRequest;
        private HttpResponse serviceResponse;
        private SdkBaseException exception;
        private long currentTime = System.currentTimeMillis();

        public AdjustmentRequest clientRequest(Request<?> clientRequest) {
            this.clientRequest = clientRequest;
            return this;
        }

        public AdjustmentRequest serviceResponse(HttpResponse serviceResponse) {
            this.serviceResponse = serviceResponse;
            return this;
        }

        public AdjustmentRequest exception(SdkBaseException exception) {
            this.exception = exception;
            return this;
        }

        @SdkTestInternalApi
        public AdjustmentRequest currentTime(long currentTime) {
            this.currentTime = currentTime;
            return this;
        }
    }

    @ThreadSafe
    public static final class ClockSkewAdjustment {
        private final boolean shouldAdjustForSkew;
        private final int adjustmentInSeconds;

        private ClockSkewAdjustment(boolean shouldAdjust, int adjustmentInSeconds) {
            this.shouldAdjustForSkew = shouldAdjust;
            this.adjustmentInSeconds = adjustmentInSeconds;
        }

        public boolean shouldAdjustForSkew() {
            return shouldAdjustForSkew;
        }

        public int inSeconds() {
            if (!shouldAdjustForSkew) {
                throw new IllegalStateException("An adjustment is not recommended.");
            }

            return adjustmentInSeconds;
        }
    }
}
