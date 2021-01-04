/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.internal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.internal.AWS4SignerUtils;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.retry.ClockSkewAdjuster;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicyAdapter;
import com.amazonaws.retry.v2.RetryPolicy;
import com.amazonaws.retry.v2.RetryPolicyContext;
import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHttpResponse;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Before;
import org.junit.Test;

public class SdkRequestHeaderProviderTest {
    private static final DateTimeFormatter timeFormatter = DateTimeFormat.forPattern("EEE, dd MMM yyyy HH:mm:ss 'GMT'").withZoneUTC();
    private SdkRequestRetryHeaderProvider headerProvider;
    private static final ClientConfiguration CONFIGURATION = new ClientConfiguration();
    private static final RetryPolicyAdapter RETRY_POLICY = new RetryPolicyAdapter(PredefinedRetryPolicies.getDefaultRetryPolicy(), CONFIGURATION);
    private ClockSkewAdjuster clockSkewAdjuster;

    @Before
    public void setup() {
        clockSkewAdjuster = new ClockSkewAdjuster();
        headerProvider = new SdkRequestRetryHeaderProvider(CONFIGURATION, RETRY_POLICY, clockSkewAdjuster);
    }

    @Test
    public void maxAttemptNotAvailable_shouldNotContainMax() {
        Request<?> request = new DefaultRequest("test");

        headerProvider = new SdkRequestRetryHeaderProvider(CONFIGURATION, new RetryPolicy() {
            @Override
            public long computeDelayBeforeNextRetry(RetryPolicyContext context) {
                return 0;
            }

            @Override
            public boolean shouldRetry(RetryPolicyContext context) {
                return false;
            }
        }, clockSkewAdjuster);

        headerProvider.addSdkRequestRetryHeader(request, 1);
        assertThat(request.getHeaders().get("amz-sdk-request"), equalTo("attempt=1"));
    }

    @Test
    public void nullEstimatedSkew_shouldNotContainTtl() {
        Request<?> request = new DefaultRequest("test");
        headerProvider.addSdkRequestRetryHeader(request, 1);
        assertThat(request.getHeaders().get("amz-sdk-request"), equalTo("attempt=1;max=" + (RETRY_POLICY.getMaxErrorRetry() + 1)));
    }

    @Test
    public void nonNullEstimatedSkew_ttlShouldBePresent() {
        Request<?> request = new DefaultRequest("test");

        long currentTime = updateEstimatedSkew(request);

        headerProvider.addSdkRequestRetryHeader(request, 2);
        String expectedTtl = AWS4SignerUtils.formatTimestamp(currentTime + CONFIGURATION.getSocketTimeout());
        assertThat(request.getHeaders().get("amz-sdk-request"), equalTo(String.format("ttl=%s;attempt=2;max=%s", expectedTtl, RETRY_POLICY.getMaxErrorRetry() + 1)));
    }

    @Test
    public void operationWithStreamingOutput_shouldNotContainTtl() {
        Request<?> request = new DefaultRequest("test");
        request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, true);

        updateEstimatedSkew(request);
        headerProvider.addSdkRequestRetryHeader(request, 2);
        assertThat(request.getHeaders().get("amz-sdk-request"), equalTo(String.format("attempt=2;max=%s", RETRY_POLICY.getMaxErrorRetry() + 1)));
    }

    @Test
    public void operationWithStreamingInput_shouldNotContainTtl() {
        Request<?> request = new DefaultRequest("test");
        request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, true);
        updateEstimatedSkew(request);
        headerProvider.addSdkRequestRetryHeader(request, 2);
        assertThat(request.getHeaders().get("amz-sdk-request"), equalTo(String.format("attempt=2;max=%s", RETRY_POLICY.getMaxErrorRetry() + 1)));
    }

    private static String rfcTime(long time) {
        return timeFormatter.print(time);
    }

    private long updateEstimatedSkew(Request<?> request) {
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, 200, "200 ok");
        long currentTime = System.currentTimeMillis();
        basicHttpResponse.setHeader("Date", rfcTime(currentTime));
        clockSkewAdjuster.updateEstimatedSkew(new ClockSkewAdjuster.AdjustmentRequest()
                                                  .clientRequest(request)
                                                  .serviceResponse(basicHttpResponse));
        return currentTime;
    }
}