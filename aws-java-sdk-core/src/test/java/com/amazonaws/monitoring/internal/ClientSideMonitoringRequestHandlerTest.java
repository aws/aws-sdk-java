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

package com.amazonaws.monitoring.internal;

import static com.amazonaws.http.HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER;
import static com.amazonaws.monitoring.ApiCallMonitoringEvent.API_CALL_MONITORING_EVENT_TYPE;
import static com.amazonaws.util.AwsClientSideMonitoringMetrics.MaxRetriesExceeded;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.internal.SignerConstants;
import com.amazonaws.handlers.HandlerAfterAttemptContext;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.timers.client.ClientExecutionTimeoutException;
import com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent;
import com.amazonaws.monitoring.ApiCallMonitoringEvent;
import com.amazonaws.monitoring.ApiMonitoringEvent;
import com.amazonaws.monitoring.MonitoringListener;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import com.amazonaws.util.AwsClientSideMonitoringMetrics;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.Throwables;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import utils.model.EmptyAmazonWebServiceRequest;

@RunWith(MockitoJUnitRunner.class)
public class ClientSideMonitoringRequestHandlerTest {

    private static final String SERVICE_NAME = "WowService";
    private static final String SERVICE_ID = "Wow";
    private static final String API_NAME = "WowMe";
    private static final String REGION = "us-east-1";
    private static final String SECURITY_TOKENS = "test";
    private static final String CLIENT_ID = "unit-test";

    private ClientSideMonitoringRequestHandler requestHandler;

    @Mock
    private MonitoringListener agentMonitoringListener;

    @Mock
    private MonitoringListener customMonitoringListener;

    @Before
    public void setup() {
        List<MonitoringListener> monitoringListeners = new ArrayList<MonitoringListener>();
        monitoringListeners.add(agentMonitoringListener);
        monitoringListeners.add(customMonitoringListener);
        requestHandler = new ClientSideMonitoringRequestHandler(CLIENT_ID, monitoringListeners);
    }

    @Test
    public void afterAttempt_Succeed_shouldSendApiCallAttemptEvent() {
        HandlerAfterAttemptContext context = getContext(getMetrics(1));
        requestHandler.afterAttempt(context);

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);

        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallAttemptMonitoringEvent.class));
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyRequiredEntries(event);
        verifySuccessfulAttemptEvent(event);
    }

    @Test
    public void afterAttempt_AwsException_shouldSendApiCallAttemptEvent() {
        AmazonServiceException exception = new AmazonServiceException("test");
        exception.setStatusCode(400);
        exception.setErrorCode("BadRequest");
        Map<String, String> header = new HashMap<String, String>();
        header.put("x-amzn-RequestId", "test");
        exception.setHttpHeaders(header);

        AWSRequestMetrics metrics = getMetrics(1);
        requestHandler.afterAttempt(getContext(metrics, exception));

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);
        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallAttemptMonitoringEvent.class));
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyRequiredEntries(event);
        verifyConditionalEntries(event, exception);
    }

    @Test
    public void afterAttempt_AwsExceptionWithOverSizeMessage_ShouldTrim() {
        AmazonServiceException exception = new AmazonServiceException(RandomStringUtils.randomAlphanumeric(1000));
        exception.setStatusCode(400);
        AWSRequestMetrics metrics = getMetrics(1);
        requestHandler.afterAttempt(getContext(metrics, exception));

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor = ArgumentCaptor.forClass
            (ApiCallAttemptMonitoringEvent.class);
        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyExceptionMessageSize(event.getAwsExceptionMessage());
    }

    @Test
    public void afterAttempt_ConnectionError_shouldSendApiCallAttemptEvent() {
        IOException ioException = new IOException("oops");

        AWSRequestMetrics metrics = getMetrics(1);
        requestHandler.afterAttempt(getContext(metrics, ioException));

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);
        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallAttemptMonitoringEvent.class));
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyRequiredEntries(event);
        verifyConditionalEntries(event, ioException);
    }

    @Test
    public void afterAttempt_sdkExceptionWithOverSizeMessage_ShouldTrim() {
        SdkClientException ioException = new SdkClientException(new IOException(RandomStringUtils.randomAlphanumeric(1200)));
        AWSRequestMetrics metrics = getMetrics(1);
        requestHandler.afterAttempt(getContext(metrics, ioException));

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);
        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyExceptionSize(event.getSdkException());
        verifyExceptionMessageSize(event.getSdkExceptionMessage());
    }

    @Test
    public void afterAttempt_OtherException_shouldSendApiCallAttemptEvent() {
        RuntimeException runtimeException = new RuntimeException("unexpected");

        AWSRequestMetrics metrics = getMetrics(1);
        requestHandler.afterAttempt(getContext(metrics, runtimeException));

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);
        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallAttemptMonitoringEvent.class));
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyRequiredEntries(event);
        verifyConditionalEntries(event, runtimeException);
    }

    @Test
    public void afterAttempt_SessionTokenLowerCase_ShouldStillWork() {
        Request<?> request = getRequest();
        request.setAWSRequestMetrics(getMetrics(1));
        request.getHeaders().clear();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("x-amz-security-token", SECURITY_TOKENS);
        request.setHeaders(headers);

        requestHandler.afterAttempt(getContext(request));

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
                ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);

        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallAttemptMonitoringEvent.class));
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyRequiredEntries(event);
        verifySuccessfulAttemptEvent(event);
    }

    @Test
    public void afterAttempt_SessionTokenCapitalized_ShouldStillWork() {
        Request<?> request = getRequest();
        request.setAWSRequestMetrics(getMetrics(1));
        request.getHeaders().clear();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(SignerConstants.X_AMZ_SECURITY_TOKEN, SECURITY_TOKENS);
        request.setHeaders(headers);

        requestHandler.afterAttempt(getContext(request));

        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
                ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);

        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallAttemptMonitoringEvent.class));
        ApiCallAttemptMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyRequiredEntries(event);
        verifySuccessfulAttemptEvent(event);
    }

    @Test
    public void afterAttempt_agentMonitoringListenerThrowException_shouldNotAffectCustomListener() {
        Request<?> request = getRequest();
        Response<?> response = getResponse(request);
        doThrow(new RuntimeException("Oops")).when(agentMonitoringListener).handleEvent(any(ApiMonitoringEvent.class));
        requestHandler.afterAttempt(getContext(response));
        verify(agentMonitoringListener, times(1)).handleEvent(any(ApiMonitoringEvent.class));
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiMonitoringEvent.class));
    }

    @Test
    public void afterAttempt_overSizeClientId_shouldTrim() {
        Request<?> request = getRequest();
        request.setAWSRequestMetrics(getMetrics(1));
        requestHandler.afterAttempt(getContext(getResponse(request)));
        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);
        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        ApiCallAttemptMonitoringEvent monitoringEvent = monitoringEventArgumentCaptor.getValue();
        assertThat(monitoringEvent.getClientId().length(), is(lessThanOrEqualTo(255)));
    }

    @Test
    public void afterAttempt_overSizeUserAgent_shouldTrim() {
        Request<?> request = getRequest();
        request.getOriginalRequest().getRequestClientOptions().appendUserAgent(RandomStringUtils.randomAlphanumeric(345));
        request.setAWSRequestMetrics(getMetrics(1));
        requestHandler.afterAttempt(getContext(getResponse(request)));
        ArgumentCaptor<ApiCallAttemptMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallAttemptMonitoringEvent.class);
        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        ApiCallAttemptMonitoringEvent monitoringEvent = monitoringEventArgumentCaptor.getValue();
        assertThat(monitoringEvent.getUserAgent().length(), is(lessThanOrEqualTo(256)));
    }

    @Test
    public void afterResponse_shouldSendApiCallMonitoringEvent() {
        Request<?> request = getRequest();
        AWSRequestMetrics metrics = getMetrics(3);
        request.setAWSRequestMetrics(metrics);
        requestHandler.afterResponse(request, getResponse(request));

        ArgumentCaptor<ApiCallMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallMonitoringEvent.class);

        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallMonitoringEvent.class));
        ApiCallMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyApiCallMonitoringEvent(3, event);
    }

    @Test
    public void afterError_shouldSendApiCallMonitoringEvent() {
        Request<?> request = getRequest();
        AWSRequestMetrics metrics = getMetrics(1);
        request.setAWSRequestMetrics(metrics);
        requestHandler.afterError(request, getResponse(request), new IOException(""));

        ArgumentCaptor<ApiCallMonitoringEvent> monitoringEventArgumentCaptor =
            ArgumentCaptor.forClass(ApiCallMonitoringEvent.class);

        verify(agentMonitoringListener, times(1)).handleEvent(monitoringEventArgumentCaptor.capture());
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiCallMonitoringEvent.class));
        ApiCallMonitoringEvent event = monitoringEventArgumentCaptor.getValue();
        verifyApiCallMonitoringEvent(1, event);
    }

    @Test
    public void afterResponse_customMonitoringListenerThrowException_shouldNotAffectAgentListener() {
        Request<?> request = getRequest();
        Response<?> response = getResponse(request);
        doThrow(new RuntimeException("Oops")).when(customMonitoringListener).handleEvent(any(ApiMonitoringEvent.class));
        requestHandler.afterResponse(request, response);
        verify(agentMonitoringListener, times(1)).handleEvent(any(ApiMonitoringEvent.class));
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiMonitoringEvent.class));
    }

    @Test
    public void afterError_customMonitoringListenerThrowException_shouldNotAffectAgentListener() {
        Request<?> request = getRequest();
        Response<?> response = getResponse(request);
        doThrow(new RuntimeException("Oops")).when(customMonitoringListener).handleEvent(any(ApiMonitoringEvent.class));
        requestHandler.afterError(request, response, new AmazonServiceException("test"));
        verify(agentMonitoringListener, times(1)).handleEvent(any(ApiMonitoringEvent.class));
        verify(customMonitoringListener, times(1)).handleEvent(any(ApiMonitoringEvent.class));
    }

    @Test
    public void afterError_maxRetriesExceeded() {
        Request<?> request = getRequest();
        AWSRequestMetrics metrics = getMetrics(3);
        metrics.addPropertyWith(MaxRetriesExceeded, true);
        request.setAWSRequestMetrics(metrics);
        requestHandler.afterError(request, getResponse(request), new IOException(""));

        ApiCallMonitoringEvent event = getCapturedEvent(ApiCallMonitoringEvent.class);
        assertThat(event.getMaxRetriesExceeded(), is(1));
    }

    @Test
    public void afterError_clientExecutionTimeoutException() {
        Request<?> request = getRequest();
        AWSRequestMetrics metrics = getMetrics(1);
        request.setAWSRequestMetrics(metrics);
        requestHandler.afterError(request, getResponse(request), new ClientExecutionTimeoutException(""));

        ApiCallMonitoringEvent event = getCapturedEvent(ApiCallMonitoringEvent.class);
        assertThat(event.getApiCallTimeout(), is(1));
    }

    @Test
    public void afterErrorWithoutApiCallAttemptExcludesFinalFields() {
        Request<?> request = getRequest();
        AWSRequestMetrics metrics = getMetrics(1);
        request.setAWSRequestMetrics(metrics);
        requestHandler.afterError(request, getResponse(request), new ClientExecutionTimeoutException(""));

        verifyEmptyFinalFields(getCapturedEvent(ApiCallMonitoringEvent.class));
    }

    @Test
    public void afterResponseIncludesFinalFieldsOfLastAttempt() {
        Request<?> request = getRequest();

        HandlerAfterAttemptContext failedAttempt =
                HandlerAfterAttemptContext.builder()
                                          .withRequest(request)
                                          .withResponse(getResponse(request))
                                          .withException(new AmazonServiceException("ErrorMessage"))
                                          .build();

        HandlerAfterAttemptContext successfulAttempt =
                HandlerAfterAttemptContext.builder()
                                          .withRequest(request)
                                          .withResponse(getResponse(request))
                                          .build();

        requestHandler.afterAttempt(failedAttempt);
        requestHandler.afterAttempt(successfulAttempt);
        requestHandler.afterResponse(successfulAttempt.getRequest(), successfulAttempt.getResponse());

        verifyFinalFields(getCapturedEvent(ApiCallMonitoringEvent.class),
                          getCapturedEvents(ApiCallAttemptMonitoringEvent.class, 2).get(1));
    }

    @Test
    public void afterErrorIncludesFinalAwsExceptionFieldsOfLastAttempt() {
        Request<?> request = getRequest();

        HandlerAfterAttemptContext failedAttempt =
                HandlerAfterAttemptContext.builder()
                                          .withRequest(request)
                                          .withResponse(getResponse(request))
                                          .withException(new AmazonServiceException("ErrorMessage"))
                                          .build();

        requestHandler.afterAttempt(failedAttempt);
        requestHandler.afterAttempt(failedAttempt);
        requestHandler.afterAttempt(failedAttempt);
        requestHandler.afterError(failedAttempt.getRequest(), failedAttempt.getResponse(), failedAttempt.getException());

        verifyFinalFields(getCapturedEvent(ApiCallMonitoringEvent.class),
                          getCapturedEvents(ApiCallAttemptMonitoringEvent.class, 3).get(2));
    }

    @Test
    public void afterErrorIncludesFinalSdkExceptionFieldsOfLastAttempt() {
        Request<?> request = getRequest();

        HandlerAfterAttemptContext failedAttempt =
                HandlerAfterAttemptContext.builder()
                                          .withRequest(request)
                                          .withResponse(getResponse(request))
                                          .withException(new RuntimeException("ErrorMessage"))
                                          .build();

        requestHandler.afterAttempt(failedAttempt);
        requestHandler.afterAttempt(failedAttempt);
        requestHandler.afterAttempt(failedAttempt);
        requestHandler.afterError(failedAttempt.getRequest(), failedAttempt.getResponse(), failedAttempt.getException());

        verifyFinalFields(getCapturedEvent(ApiCallMonitoringEvent.class),
                          getCapturedEvents(ApiCallAttemptMonitoringEvent.class, 3).get(2));
    }

    private <T extends ApiMonitoringEvent> T getCapturedEvent(Class<T> eventType) {
        return getCapturedEvents(eventType, 1).get(0);
    }

    private <T extends ApiMonitoringEvent> List<T> getCapturedEvents(Class<T> eventType, int expectedCount) {
        ArgumentCaptor<T> monitoringEventArgumentCaptor = ArgumentCaptor.forClass(eventType);

        verify(agentMonitoringListener, atLeastOnce()).handleEvent(monitoringEventArgumentCaptor.capture());

        List<T> matchingEvents = new ArrayList<T>();
        for (ApiMonitoringEvent event : monitoringEventArgumentCaptor.getAllValues()) {
            if (eventType.isInstance(event)) {
                matchingEvents.add(eventType.cast(event));
            }
        }

        if (matchingEvents.size() != expectedCount) {
            throw new AssertionError("Captured " + matchingEvents.size() + " " + eventType + " events, where " + expectedCount +
                                     " was expected.");
        }

        return matchingEvents;
    }

    private void verifyFinalFields(ApiCallMonitoringEvent callEvent, ApiCallAttemptMonitoringEvent callAttemptEvent) {
        assertThat(callEvent.getFinalHttpStatusCode(), is(callAttemptEvent.getHttpStatusCode()));
        assertThat(callEvent.getFinalAwsException(), is(callAttemptEvent.getAwsException()));
        assertThat(callEvent.getFinalAwsExceptionMessage(), is(callAttemptEvent.getAwsExceptionMessage()));
        assertThat(callEvent.getFinalSdkException(), is(callAttemptEvent.getSdkException()));
        assertThat(callEvent.getFinalSdkExceptionMessage(), is(callAttemptEvent.getSdkExceptionMessage()));
    }

    private void verifyEmptyFinalFields(ApiCallMonitoringEvent event) {
        assertThat(event.getFinalHttpStatusCode(), is(nullValue()));
        assertThat(event.getFinalAwsException(), is(nullValue()));
        assertThat(event.getFinalAwsExceptionMessage(), is(nullValue()));
        assertThat(event.getFinalSdkException(), is(nullValue()));
        assertThat(event.getFinalSdkExceptionMessage(), is(nullValue()));
    }

    /**
     * Generate metrics.
     */
    private AWSRequestMetrics getMetrics(int requestCount) {
        AWSRequestMetricsFullSupport metrics =
            new AWSRequestMetricsFullSupport();
        metrics.addProperty(AWSRequestMetrics.Field.ServiceName, SERVICE_NAME);
        metrics.startEvent(AwsClientSideMonitoringMetrics.ApiCallLatency);

        for (int i = 0; i < requestCount; i++) {
            metrics.startEvent(AWSRequestMetrics.Field.HttpRequestTime);
            metrics.startEvent(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            metrics.endEvent(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            metrics.startEvent(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            metrics.endEvent(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            metrics.endEvent(AWSRequestMetrics.Field.HttpRequestTime);
            metrics.endEvent(AwsClientSideMonitoringMetrics.ApiCallLatency);
        }

        metrics.setCounter(AWSRequestMetrics.Field.RequestCount, requestCount);
        return metrics;
    }

    /**
     * Verify ApiCallMonitoringEvent
     */
    private void verifyApiCallMonitoringEvent(int requestCount, ApiCallMonitoringEvent monitoringEvent) {
        verifyCommonFields(monitoringEvent);
        assertEquals(API_CALL_MONITORING_EVENT_TYPE, monitoringEvent.getType());
        assertEquals(requestCount, monitoringEvent.getAttemptCount().intValue());
        assertThat(monitoringEvent.getLatency(), is(notNullValue()));
    }

    private void verifySuccessfulAttemptEvent(ApiCallAttemptMonitoringEvent event) {
        assertNull(event.getSdkExceptionMessage());
        assertNull(event.getAwsExceptionMessage());
        assertNotNull(event.getHttpStatusCode());
        assertTrue(containsRequestId(event));
        assertNotNull(event.getRequestLatency());
    }

    /**
     * Verify ApiCallAttemptMonitoringEvent
     */
    private void verifyRequiredEntries(ApiCallAttemptMonitoringEvent monitoringEvent) {
        verifyCommonFields(monitoringEvent);
        assertEquals("ApiCallAttempt", monitoringEvent.getType());
        assertNotNull("fqdn should not be null", monitoringEvent.getFqdn());
        assertNotNull("attempt latency should not be null", monitoringEvent
            .getAttemptLatency());
        assertEquals("wow.service", monitoringEvent.getFqdn());
        assertEquals(SECURITY_TOKENS, monitoringEvent.getSessionToken());
        assertNotNull(monitoringEvent.getUserAgent());
    }

    private void verifyConditionalEntries(ApiCallAttemptMonitoringEvent event, Exception exception) {
        if (exception instanceof AmazonServiceException) {
            assertEquals(event.getHttpStatusCode(), event.getHttpStatusCode());
            assertNotNull("requestId cannot be null", event.getxAmznRequestId());
            assertEquals(((AmazonServiceException) exception).getErrorCode(), event.getAwsException());
            assertEquals(((AmazonServiceException) exception).getErrorMessage(), event.getAwsExceptionMessage());
            verifyExceptionMessageSize(event.getAwsExceptionMessage());
            verifyExceptionSize(event.getAwsException());
            assertNotNull(event.getRequestLatency());
            assertTrue("must contain requestId", containsRequestId(event));
            verifyNullSdkExceptionFields(event);
        } else {
            assertNull(event.getHttpStatusCode());
            verifyNullAwsExceptionFields(event);
            verifyExceptionMessageSize(event.getSdkExceptionMessage());
            verifyRequestIdNull(event);
            assertNull(event.getRequestLatency());
            verifyExceptionMessageSize(event.getSdkExceptionMessage());
            verifyExceptionSize(event.getSdkException());

            assertEquals(exception.getMessage() == null ? Throwables.getRootCause(exception).getMessage() : exception
                .getMessage(), event.getSdkExceptionMessage());
            assertEquals(exception.getClass().getName(), event.getSdkException());
        }
    }

    private void verifyNullAwsExceptionFields(ApiCallAttemptMonitoringEvent event) {
        assertNull(event.getAwsExceptionMessage());
        assertNull(event.getAwsException());
    }

    private void verifyNullSdkExceptionFields(ApiCallAttemptMonitoringEvent event) {
        assertNull(event.getSdkExceptionMessage());
        assertNull(event.getSdkException());
    }

    private void verifyRequestIdNull(ApiCallAttemptMonitoringEvent event) {
        assertNull(event.getxAmznRequestId());
        assertNull(event.getxAmzId2());
        assertNull(event.getxAmzRequestId());
    }

    private boolean containsRequestId(ApiCallAttemptMonitoringEvent event) {
        return event.getxAmznRequestId() != null || event.getxAmzId2() != null || event.getxAmzRequestId() != null;
    }

    private void verifyCommonFields(ApiMonitoringEvent monitoringEvent) {
        assertEquals(API_NAME, monitoringEvent.getApi());
        assertEquals(SERVICE_ID, monitoringEvent.getService());
        assertEquals(CLIENT_ID, monitoringEvent.getClientId());
        assertEquals(REGION, monitoringEvent.getRegion());
        assertNotNull("timestamp should not be null", monitoringEvent.getTimestamp());
        assertNotNull("type should not be null", monitoringEvent.getType());
        assertNotNull("Version should not be null", monitoringEvent.getVersion());
    }

    private void verifyExceptionSize(String exception) {
        assertTrue("Exception has maximum length of 128", exception.length() <= 128);
    }

    private void verifyExceptionMessageSize(String exceptionMessage) {
        assertTrue("Exception Message has maximum length of 512", exceptionMessage.length() <= 512);
    }

    private HandlerAfterAttemptContext getContext(Response<?> response) {
        return HandlerAfterAttemptContext.builder()
                                         .withRequest(getRequest())
                                         .withResponse(response)
                                         .build();
    }

    private HandlerAfterAttemptContext getContext(AWSRequestMetrics metrics, Exception exception) {
        Request<?> request = getRequest();
        request.setAWSRequestMetrics(metrics);
        return HandlerAfterAttemptContext.builder()
                                         .withRequest(request)
                                         .withException(exception)
                                         .build();
    }

    private HandlerAfterAttemptContext getContext(AWSRequestMetrics metrics) {
        Request<?> request = getRequest();
        request.setAWSRequestMetrics(metrics);

        return HandlerAfterAttemptContext.builder()
                                         .withRequest(request)
                                         .withResponse(getResponse(request))
                                         .build();
    }

    private HandlerAfterAttemptContext getContext(Request<?> request) {
        return HandlerAfterAttemptContext.builder()
                                         .withRequest(request)
                                         .withResponse(getResponse(request))
                                         .build();
    }

    private static Request<?> getRequest() {
        DefaultRequest<?> request = new DefaultRequest(
            new EmptyAmazonWebServiceRequest(), SERVICE_NAME);
        request.setEndpoint(URI.create("http://wow.service"));
        try {
            request.addHandlerContext(HandlerContextKey.SERVICE_ID, SERVICE_ID);
            request.addHandlerContext(HandlerContextKey.SIGNING_REGION, REGION);
            request.addHandlerContext(HandlerContextKey.OPERATION_NAME, API_NAME);
            request.addHeader("x-amz-security-token", SECURITY_TOKENS);
            request.setContent(new StringInputStream("Some content that could be read for multiple times."));
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Unable to set up the request content");
        }
        return request;
    }

    private static Response getResponse(Request request) {
        HttpResponse httpResponse = new HttpResponse(request, null);
        httpResponse.addHeader(X_AMZN_REQUEST_ID_HEADER, "123456");
        httpResponse.setStatusCode(200);
        return new Response("", httpResponse);
    }
}
