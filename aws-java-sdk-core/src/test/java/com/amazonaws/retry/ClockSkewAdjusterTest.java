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
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SdkBaseException;
import com.amazonaws.retry.ClockSkewAdjuster.AdjustmentRequest;
import com.amazonaws.retry.ClockSkewAdjuster.ClockSkewAdjustment;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.Assert;
import org.junit.Test;

public class ClockSkewAdjusterTest {
    private static final int SKEWED_SECONDS = 60 * 60;
    private static final int SKEWED_MILLIS = SKEWED_SECONDS * 1000;

    private ClockSkewAdjuster adjuster = new ClockSkewAdjuster();
    private Date unskewedDate = new Date();
    private Date futureSkewedDate = new Date(unskewedDate.getTime() + SKEWED_MILLIS);
    private Date pastSkewedDate = new Date(unskewedDate.getTime() - SKEWED_MILLIS);

    @Test
    public void nonSkewErrorsDoNotAdjust() {
        assertDoNotAdjust(clientRequest(0), new SdkBaseException(""), httpResponse(futureSkewedDate));
        assertDoNotAdjust(clientRequest(0), amazonServiceException("", "NotFound", 404), httpResponse(unskewedDate));
        assertDoNotAdjust(clientRequest(1000), amazonServiceException("", "NotFound", 404), httpResponse(unskewedDate));
        assertDoNotAdjust(clientRequest(0), amazonServiceException("", "InternalServiceError", 500), httpResponse(unskewedDate));
        assertDoNotAdjust(clientRequest(0), amazonServiceException("", "NotFound", 404), httpResponse(futureSkewedDate));
        assertDoNotAdjust(clientRequest(0), amazonServiceException("", "NotFound", 404), httpResponse(pastSkewedDate));
    }

    @Test
    public void obviousSkewErrorsAdjust() {
        assertAdjusts(-SKEWED_SECONDS, clientRequest(0), amazonServiceException("", "RequestTimeTooSkewed", 400), httpResponse(futureSkewedDate));
        assertAdjusts(SKEWED_SECONDS, clientRequest(0), amazonServiceException("", "InvalidSignatureException", 400), httpResponse(pastSkewedDate));
        assertAdjusts(0, clientRequest(0), amazonServiceException("", "RequestTimeTooSkewed", 400), httpResponse(unskewedDate));
    }

    @Test
    public void noDateHeaderCanStillAdjust() {
        assertAdjusts(-SKEWED_SECONDS,
                      clientRequest(0),
                      amazonServiceException(sqsExceptionMessage(unskewedDate, futureSkewedDate), "RequestTimeTooSkewed", 400),
                      httpResponse());
        assertAdjusts(SKEWED_SECONDS,
                      clientRequest(0),
                      amazonServiceException(sqsExceptionMessage(unskewedDate, pastSkewedDate), "RequestTimeTooSkewed", 400),
                      httpResponse());
    }

    @Test
    public void invalidDateFormatsDontAdjust() {
        assertDoNotAdjust(clientRequest(0),
                          amazonServiceException(sqsExceptionMessage("X", "Y"), "RequestTimeTooSkewed", 400),
                          httpResponse());
        assertDoNotAdjust(clientRequest(0),
                          amazonServiceException("", "RequestTimeTooSkewed", 400),
                          httpResponse("X"));
    }

    @Test
    public void noDateNoAdjust() {
        assertDoNotAdjust(clientRequest(0), amazonServiceException("", "RequestTimeTooSkewed", 403), httpResponse());
    }

    @Test
    public void authenticationErrorsDontAdjustIfTimeIsntSkewed() {
        assertDoNotAdjust(clientRequest(0), amazonServiceException("", "", 403), httpResponse(unskewedDate));
        assertDoNotAdjust(clientRequest(0), amazonServiceException("", "", 401), httpResponse(unskewedDate));
    }

    @Test
    public void authenticationErrorsAdjustIfTimeIsSkewed() {
        assertAdjusts(-SKEWED_SECONDS, clientRequest(0), amazonServiceException("", "", 401), httpResponse(futureSkewedDate));
        assertAdjusts(SKEWED_SECONDS, clientRequest(0), amazonServiceException("", "", 401), httpResponse(pastSkewedDate));
        assertAdjusts(-SKEWED_SECONDS, clientRequest(0), amazonServiceException("", "", 403), httpResponse(futureSkewedDate));
        assertAdjusts(SKEWED_SECONDS, clientRequest(0), amazonServiceException("", "", 403), httpResponse(pastSkewedDate));
        assertAdjusts(-SKEWED_SECONDS, clientRequest(SKEWED_SECONDS), amazonServiceException("", "", 401), httpResponse(unskewedDate));
        assertAdjusts(SKEWED_SECONDS, clientRequest(-SKEWED_SECONDS), amazonServiceException("", "", 403), httpResponse(unskewedDate));
    }

    private String sqsExceptionMessage(Date clientTime, Date serverTime) {
        String requestTimeString = formatCompressedIso8601Date(clientTime);
        String serverTimeString = formatCompressedIso8601Date(serverTime);
        return sqsExceptionMessage(requestTimeString, serverTimeString);
    }

    private String sqsExceptionMessage(String clientTime, String serverTime) {
        return "Signature expired: " + serverTime + " is now earlier than " + clientTime +
               " (" + serverTime + " - 15 min.)";
    }

    private String formatCompressedIso8601Date(Date date) {
        return DateTimeFormat.forPattern("yyyyMMdd'T'HHmmss'Z'")
                             .withZone(new FixedDateTimeZone("GMT", "GMT", 0, 0))
                             .print(date.getTime());
    }

    private void assertDoNotAdjust(Request<?> clientRequest,
                                   SdkBaseException exception,
                                   HttpResponse serviceResponse) {
        Assert.assertFalse(getRecommendation(clientRequest, exception, serviceResponse).shouldAdjustForSkew());
    }

    private void assertAdjusts(int expectedRecommendation,
                               Request<?> clientRequest,
                               SdkBaseException exception,
                               HttpResponse serviceResponse) {
        ClockSkewAdjustment recommendation = getRecommendation(clientRequest,
                                                               exception,
                                                               serviceResponse,
                                                               System.currentTimeMillis() - (clientRequest.getTimeOffset() * 1000));
        Assert.assertTrue(recommendation.shouldAdjustForSkew());

        // We adjust based on the current time, so as long as we're within 10 seconds of the expected recommendation,
        // we're alright.
        Assert.assertTrue(Math.abs(expectedRecommendation - recommendation.inSeconds()) < 10);
    }

    private ClockSkewAdjustment getRecommendation(Request<?> clientRequest,
                                                  SdkBaseException exception,
                                                  HttpResponse serviceResponse) {
        return adjuster.getAdjustment(new AdjustmentRequest().clientRequest(clientRequest)
                                                             .exception(exception)
                                                             .serviceResponse(serviceResponse));
    }

    private ClockSkewAdjustment getRecommendation(Request<?> clientRequest,
                                                  SdkBaseException exception,
                                                  HttpResponse serviceResponse,
                                                  long currentTime) {
        return adjuster.getAdjustment(new AdjustmentRequest().clientRequest(clientRequest)
                                                             .exception(exception)
                                                             .serviceResponse(serviceResponse)
                                                             .currentTime(currentTime));
    }

    private Request<?> clientRequest(int requestOffset) {
        return new DefaultRequest<Void>("").withTimeOffset(requestOffset);
    }

    private AmazonServiceException amazonServiceException(String errorMessage, String errorCode, int statusCode) {
        AmazonServiceException ase = new AmazonServiceException(errorMessage);
        ase.setErrorCode(errorCode);
        ase.setStatusCode(statusCode);
        return ase;
    }

    private HttpResponse httpResponse() {
        return httpResponse((String) null);
    }

    private HttpResponse httpResponse(Date dateHeader) {
        return httpResponse(DateUtils.formatRFC822Date(dateHeader));
    }

    private HttpResponse httpResponse(String dateHeader) {
        BasicHttpResponse response = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("1.1", 1, 1), 0, ""));
        if (dateHeader != null) {
            response.setHeader("Date", dateHeader);
        }
        return response;
    }
}