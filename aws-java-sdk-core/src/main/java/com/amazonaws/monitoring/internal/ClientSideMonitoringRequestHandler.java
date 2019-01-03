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

import static com.amazonaws.util.AWSRequestMetrics.Field.HttpRequestTime;
import static com.amazonaws.util.AwsClientSideMonitoringMetrics.MaxRetriesExceeded;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.Response;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.internal.SignerConstants;
import com.amazonaws.handlers.HandlerAfterAttemptContext;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.timers.client.ClientExecutionTimeoutException;
import com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent;
import com.amazonaws.monitoring.ApiCallMonitoringEvent;
import com.amazonaws.monitoring.MonitoringEvent;
import com.amazonaws.monitoring.MonitoringListener;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsClientSideMonitoringMetrics;
import com.amazonaws.util.CollectionUtils;
import com.amazonaws.util.ImmutableMapParameter;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.Throwables;
import com.amazonaws.util.TimingInfo;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Client Side Monitoring Request Handler to generate monitoring events and send them to agent listener.
 */
@SdkInternalApi
public final class ClientSideMonitoringRequestHandler extends RequestHandler2 {

    private static final Log LOG = LogFactory.getLog(ClientSideMonitoringRequestHandler.class);
    private static final String X_AMZN_REQUEST_ID_HEADER_KEY = "x-amzn-RequestId";
    private static final String X_AMZ_REQUEST_ID_HEADER_KEY = "x-amz-request-id";
    private static final String X_AMZ_REQUEST_ID_2_HEADER_KEY = "x-amz-id-2";

    private static final String EXCEPTION_MESSAGE_KEY = "ExceptionMessage";
    private static final String EXCEPTION_KEY = "Exception";
    private static final String CLIENT_ID_KEY = "ClientId";
    private static final String USER_AGENT_KEY = "UserAgent";

    private static final HandlerContextKey<ApiCallAttemptMonitoringEvent> LAST_CALL_ATTEMPT =
            new HandlerContextKey<ApiCallAttemptMonitoringEvent>("LastCallAttemptMonitoringEvent");

    private static final Integer VERSION = 1;
    private static final List<String> SECURITY_TOKENS = Arrays.asList("x-amz-security-token",
                                                                      SignerConstants.X_AMZ_SECURITY_TOKEN);

    private static final Map<String, Integer> ENTRY_TO_MAX_SIZE = new ImmutableMapParameter.Builder<String, Integer>()
        .put(CLIENT_ID_KEY, 255)
        .put(USER_AGENT_KEY, 256)
        .put(EXCEPTION_MESSAGE_KEY, 512)
        .put(EXCEPTION_KEY, 128).build();

    private final String clientId;

    private final Collection<MonitoringListener> monitoringListeners;

    public ClientSideMonitoringRequestHandler(String clientId, Collection<MonitoringListener> monitoringListeners) {
        this.clientId = trimValueIfExceedsMaxLength(CLIENT_ID_KEY, clientId);
        this.monitoringListeners = monitoringListeners;
    }

    @Override
    public void afterAttempt(HandlerAfterAttemptContext context) {
        ApiCallAttemptMonitoringEvent event = generateApiCallAttemptMonitoringEvent(context);
        context.getRequest().addHandlerContext(LAST_CALL_ATTEMPT, event);
        handToMonitoringListeners(event);
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
        ApiCallMonitoringEvent event = generateApiCallMonitoringEvent(request);
        handToMonitoringListeners(event);
    }

    @Override
    public void afterError(Request<?> request, Response<?> response, Exception e) {
        ApiCallMonitoringEvent event = generateApiCallMonitoringEvent(request, e);
        handToMonitoringListeners(event);
    }

    /**
     * Collect {@link ApiCallAttemptMonitoringEvent} per attempt.
     */
    private ApiCallAttemptMonitoringEvent generateApiCallAttemptMonitoringEvent(HandlerAfterAttemptContext context) {
        Request<?> request = context.getRequest();
        AWSRequestMetrics metrics = context.getRequest().getAWSRequestMetrics();

        String apiName = request.getHandlerContext(HandlerContextKey.OPERATION_NAME);
        String serviceId = request.getHandlerContext(HandlerContextKey.SERVICE_ID);
        String sessionToken = getSessionToken(request.getHeaders());
        String region = request.getHandlerContext(HandlerContextKey.SIGNING_REGION);

        String accessKey = null;
        if (request.getHandlerContext(HandlerContextKey.AWS_CREDENTIALS) != null) {
            accessKey = request.getHandlerContext(HandlerContextKey.AWS_CREDENTIALS).getAWSAccessKeyId();
        }

        String fqdn = extractFqdn(request.getEndpoint());
        TimingInfo timingInfo = metrics == null ? null : metrics.getTimingInfo();

        TimingInfo httpRequestTime;
        Long timestamp = null;
        Long attemptLatency = null;

        if (timingInfo != null && timingInfo.getLastSubMeasurement(HttpRequestTime.name()) != null) {
            httpRequestTime = timingInfo.getLastSubMeasurement(HttpRequestTime.name());
            timestamp = httpRequestTime.getStartEpochTimeMilliIfKnown();
            attemptLatency = convertToLongIfNotNull(httpRequestTime.getTimeTakenMillisIfKnown());
        }

        ApiCallAttemptMonitoringEvent event = new ApiCallAttemptMonitoringEvent()
            .withFqdn(fqdn)
            .withVersion(VERSION)
            .withService(serviceId)
            .withClientId(clientId)
            .withRegion(region)
            .withAccessKey(accessKey)
            .withUserAgent(trimValueIfExceedsMaxLength(USER_AGENT_KEY, getDefaultUserAgent(request)))
            .withTimestamp(timestamp)
            .withAttemptLatency(attemptLatency)
            .withSessionToken(sessionToken)
            .withApi(apiName);

        addConditionalFieldsToAttemptEvent(metrics, context, event);
        return event;
    }

    /**
     * Collect {@link ApiCallMonitoringEvent} per request.
     */
    private ApiCallMonitoringEvent generateApiCallMonitoringEvent(Request<?> request) {
        String apiName = request.getHandlerContext(HandlerContextKey.OPERATION_NAME);
        String serviceId = request.getHandlerContext(HandlerContextKey.SERVICE_ID);
        String region = request.getHandlerContext(HandlerContextKey.SIGNING_REGION);
        ApiCallAttemptMonitoringEvent lastApiCallAttempt = request.getHandlerContext(LAST_CALL_ATTEMPT);

        Long timestamp = null;
        Long latency = null;
        Integer requestCount = 0;
        AWSRequestMetrics metrics = request.getAWSRequestMetrics();

        if (metrics != null) {
            TimingInfo timingInfo = metrics.getTimingInfo();
            requestCount = timingInfo.getCounter(AWSRequestMetrics.Field.RequestCount.name()) == null ? 0 :
                           timingInfo.getCounter(AWSRequestMetrics.Field.RequestCount.name()).intValue();

            TimingInfo latencyTimingInfo = timingInfo.getSubMeasurement(AwsClientSideMonitoringMetrics.ApiCallLatency.name());
            if (latencyTimingInfo != null) {
                latency = convertToLongIfNotNull(latencyTimingInfo.getTimeTakenMillisIfKnown());
                timestamp = latencyTimingInfo.getStartEpochTimeMilliIfKnown();
            }
        }

        ApiCallMonitoringEvent event = new ApiCallMonitoringEvent()
                .withApi(apiName)
                .withVersion(VERSION)
                .withRegion(region)
                .withService(serviceId)
                .withClientId(clientId)
                .withAttemptCount(requestCount)
                .withLatency(latency)
                .withUserAgent(trimValueIfExceedsMaxLength(USER_AGENT_KEY, getDefaultUserAgent(request)))
                .withTimestamp(timestamp);

        if (lastApiCallAttempt != null) {
            event.withFinalAwsException(lastApiCallAttempt.getAwsException())
                 .withFinalAwsExceptionMessage(lastApiCallAttempt.getAwsExceptionMessage())
                 .withFinalSdkException(lastApiCallAttempt.getSdkException())
                 .withFinalSdkExceptionMessage(lastApiCallAttempt.getSdkExceptionMessage())
                 .withFinalHttpStatusCode(lastApiCallAttempt.getHttpStatusCode());
        }

        return event;
    }

    private ApiCallMonitoringEvent generateApiCallMonitoringEvent(Request<?> request, Exception e) {
        ApiCallMonitoringEvent event = generateApiCallMonitoringEvent(request);
        AWSRequestMetrics metrics = request.getAWSRequestMetrics();

        if (e instanceof ClientExecutionTimeoutException) {
            event.withApiCallTimeout(1);
        }

        if (metrics != null && !CollectionUtils.isNullOrEmpty(metrics.getProperty(MaxRetriesExceeded))) {
            boolean maxRetriesExceeded = (Boolean) metrics.getProperty(MaxRetriesExceeded).get(0);
            event.withMaxRetriesExceeded(maxRetriesExceeded ? 1 : 0);
        }

        return event;
    }

    /**
     * Add conditional fields to {@link ApiCallAttemptMonitoringEvent} based on the
     * {@link HandlerAfterAttemptContext#getResponse()} and {@link HandlerAfterAttemptContext#getException()}
     */
    private void addConditionalFieldsToAttemptEvent(AWSRequestMetrics metrics, HandlerAfterAttemptContext context,
                                                    ApiCallAttemptMonitoringEvent event) {
        TimingInfo timingInfo = metrics == null ? null : metrics.getTimingInfo();
        Response<?> response = context.getResponse();
        Integer statusCode = null;
        String xAmznRequestId = null;
        String xAmzRequestId = null;
        String xAmzId2 = null;
        Long requestLatency = null;

        Map<String, String> responseHeaders = null;
        if (response != null && response.getHttpResponse() != null) {
            responseHeaders = response.getHttpResponse().getHeaders();
            statusCode = response.getHttpResponse().getStatusCode();
            requestLatency = calculateRequestLatency(timingInfo);
        } else if (context.getException() instanceof AmazonServiceException) {
            responseHeaders = ((AmazonServiceException) context.getException()).getHttpHeaders();
            statusCode = extractHttpStatusCode((AmazonServiceException) context.getException());
            requestLatency = calculateRequestLatency(timingInfo);
        }

        if (responseHeaders != null) {
            xAmznRequestId = responseHeaders.get(X_AMZN_REQUEST_ID_HEADER_KEY);
            xAmzRequestId = responseHeaders.get(X_AMZ_REQUEST_ID_HEADER_KEY);
            xAmzId2 = responseHeaders.get(X_AMZ_REQUEST_ID_2_HEADER_KEY);
        }

        event.withXAmznRequestId(xAmznRequestId)
             .withXAmzRequestId(xAmzRequestId)
             .withXAmzId2(xAmzId2)
             .withHttpStatusCode(statusCode)
             .withRequestLatency(requestLatency);
        addException(context.getException(), event);
    }

    private void handToMonitoringListeners(MonitoringEvent event) {
        for (MonitoringListener monitoringListener : monitoringListeners) {
            try {
                monitoringListener.handleEvent(event);
            } catch (Exception exception) {
                if (LOG.isDebugEnabled()) {
                    LOG.debug(String.format("MonitoringListener: %s failed to handle event", monitoringListener.toString()),
                              exception);
                }
            }
        }
    }

    /**
     * Extract fqdn from endpoint. eg: https:some-service.aws.com:8080 -> some-service.aws.com
     */
    private String extractFqdn(URI endpoint) {
        if (endpoint == null) {
            return null;
        }

        return endpoint.getHost();
    }

    /**
     * If the entry exceeds the maximum length limit associated with the entry, its value will be trimmed to meet its limit.
     */
    private String trimValueIfExceedsMaxLength(String entry, String value) {
        if (value == null) {
            return null;
        }

        String result = value;
        Integer maximumSize = ENTRY_TO_MAX_SIZE.get(entry);
        if (maximumSize != null && value.length() > maximumSize) {
            result = value.substring(0, maximumSize);
        }
        return result;
    }

    /**
     * Get the default user agent and append the user agent marker if there are any.
     */
    private String getDefaultUserAgent(Request<?> request) {
        String userAgentMarker = request.getOriginalRequest().getRequestClientOptions().getClientMarker(RequestClientOptions
                                                                                                            .Marker.USER_AGENT);
        String userAgent = ClientConfiguration.DEFAULT_USER_AGENT;
        if (StringUtils.hasValue(userAgentMarker)) {
            userAgent += " " + userAgentMarker;
        }
        return userAgent;
    }

    private String getSessionToken(Map<String, String> requestHeaders) {
        for (String header : SECURITY_TOKENS) {
            if (requestHeaders.get(header) != null) {
                return requestHeaders.get(header);
            }
        }
        return null;
    }

    private Long convertToLongIfNotNull(Double number) {
        if (number == null) {
            return null;
        }

        return number.longValue();
    }

    /**
     * Calculate the request latency. RequestLatency = httpClientSendRequestTime + HttpClientReceiveResponseTime
     */
    private Long calculateRequestLatency(TimingInfo timingInfo) {
        if (timingInfo == null) {
            return null;
        }

        TimingInfo httpClientSendRequestTime = timingInfo.getLastSubMeasurement(AWSRequestMetrics.Field.HttpClientSendRequestTime
                                                                                    .name());
        TimingInfo httpClientReceiveResponseTime = timingInfo.getLastSubMeasurement(AWSRequestMetrics.Field
                                                                                        .HttpClientReceiveResponseTime.name());
        if (httpClientSendRequestTime != null && httpClientSendRequestTime.getTimeTakenMillisIfKnown() != null &&
            httpClientReceiveResponseTime != null && httpClientReceiveResponseTime.getTimeTakenMillisIfKnown() != null) {
            return httpClientSendRequestTime.getTimeTakenMillisIfKnown().longValue()
                   + httpClientReceiveResponseTime.getTimeTakenMillisIfKnown().longValue();
        }
        return null;
    }

    private void addException(Exception exception, ApiCallAttemptMonitoringEvent event) {
        if (exception == null) {
            return;
        }

        if (exception instanceof AmazonServiceException) {
            String errorCode = ((AmazonServiceException) exception).getErrorCode();
            String errorMessage = ((AmazonServiceException) exception).getErrorMessage();

            event.withAwsException(trimValueIfExceedsMaxLength(EXCEPTION_KEY, errorCode));
            event.withAwsExceptionMessage(trimValueIfExceedsMaxLength(EXCEPTION_MESSAGE_KEY, errorMessage));
        } else {
            String exceptionClassName = exception.getClass().getName();
            String exceptionMessage = getRootCauseMessage(exception);

            event.withSdkException(trimValueIfExceedsMaxLength(EXCEPTION_KEY, exceptionClassName));
            event.withSdkExceptionMessage(trimValueIfExceedsMaxLength(EXCEPTION_MESSAGE_KEY, exceptionMessage));
        }
    }

    private String getRootCauseMessage(Exception exception) {
        if (exception.getMessage() != null) {
            return exception.getMessage();
        }

        return Throwables.getRootCause(exception).getMessage();
    }

    private int extractHttpStatusCode(AmazonServiceException exception) {
        return exception.getStatusCode();
    }
}
