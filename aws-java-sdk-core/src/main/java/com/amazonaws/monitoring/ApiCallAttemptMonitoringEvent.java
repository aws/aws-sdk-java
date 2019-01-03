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

package com.amazonaws.monitoring;


/**
 * A Monitoring Event that described the results of an Api Call Attempt.
 */
public class ApiCallAttemptMonitoringEvent extends ApiMonitoringEvent {

    public static final String API_CALL_ATTEMPT_MONITORING_EVENT_TYPE = "ApiCallAttempt";

    private String fqdn;
    private String accessKey;
    private String sessionToken;
    private Integer httpStatusCode;
    private String xAmznRequestId;
    private String xAmzRequestId;
    private String xAmzId2;
    private String awsException;
    private String awsExceptionMessage;
    private String sdkException;
    private String sdkExceptionMessage;
    private Long attemptLatency;
    private Long requestLatency;

    @Override
    public ApiCallAttemptMonitoringEvent withApi(String api) {
        this.api = api;
        return this;
    }

    @Override
    public ApiCallAttemptMonitoringEvent withVersion(Integer version) {
        this.version = version;
        return this;
    }

    @Override
    public ApiCallAttemptMonitoringEvent withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    @Override
    public ApiCallAttemptMonitoringEvent withService(String service) {
        this.service = service;
        return this;
    }

    @Override
    public ApiCallAttemptMonitoringEvent withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * This is when the request attempt is passed to the http client.
     */
    @Override
    public ApiCallAttemptMonitoringEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * @return the fully-qualified domain name of the endpoint that the request attempt was submitted to.
     */
    public String getFqdn() {
        return fqdn;
    }

    /**
     * Sets the fqdn
     *
     * @param fqdn The new fqdn value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Sets the region
     *
     * @param region The new region value.
     * @return This object for method chaining.
     */
    @Override
    public ApiCallAttemptMonitoringEvent withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * @return Contains the aws_access_key value that was used to sign the http request.
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * Sets the accessKey
     *
     * @param accessKey The new accessKey value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * @return Contains the session token passed in the x-amz-security-token header.
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the sessionToken
     *
     * @param sessionToken The new sessionToken value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    /**
     * @return the attempt's response status code, as returned by the http client.
     */
    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    /**
     * Sets the httpStatusCode
     *
     * @param httpStatusCode The new httpStatusCode value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    /**
     * @return the value of x-amzn-RequestId in response header
     */
    public String getxAmznRequestId() {
        return xAmznRequestId;
    }

    /**
     * Sets the value of x-amzn-RequestId in response header
     *
     * @param xAmznRequestId The new value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withXAmznRequestId(String xAmznRequestId) {
        this.xAmznRequestId = xAmznRequestId;
        return this;
    }

    /**
     * @return the value of x-amz-request-id in response header
     */
    public String getxAmzRequestId() {
        return xAmzRequestId;
    }

    /**
     * Sets the value of x-amz-request-id in response header
     *
     * @param xAmzRequestId The new value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withXAmzRequestId(String xAmzRequestId) {
        this.xAmzRequestId = xAmzRequestId;
        return this;
    }

    /**
     * @return the value of x-amz-id-2 in response header
     */
    public String getxAmzId2() {
        return xAmzId2;
    }

    /**
     * Sets the value of x-amz-id-2 in response header
     *
     * @param xAmzId2 the new value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withXAmzId2(String xAmzId2) {
        this.xAmzId2 = xAmzId2;
        return this;
    }

    /**
     * @return the Aws exception code
     */
    public String getAwsException() {
        return awsException;
    }

    /**
     * Sets the awsException
     *
     * @param awsException The new awsException value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withAwsException(String awsException) {
        this.awsException = awsException;
        return this;
    }

    /**
     * @return the exception message
     */
    public String getAwsExceptionMessage() {
        return awsExceptionMessage;
    }

    /**
     * Sets the awsExceptionMessage
     *
     * @param awsExceptionMessage The new awsExceptionMessage value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withAwsExceptionMessage(String awsExceptionMessage) {
        this.awsExceptionMessage = awsExceptionMessage;
        return this;
    }

    /**
     * @return the exception class name
     */
    public String getSdkException() {
        return sdkException;
    }

    /**
     * Sets the sdkException
     *
     * @param sdkException The new sdkException value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withSdkException(String sdkException) {
        this.sdkException = sdkException;
        return this;
    }

    /**
     * @return Contains the full text for any attempt-level failure that is due to something other than an Aws exception.
     */
    public String getSdkExceptionMessage() {
        return sdkExceptionMessage;
    }

    /**
     * Sets the sdkExceptionMessage
     *
     * @param sdkExceptionMessage The new sdkExceptionMessage value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withSdkExceptionMessage(String sdkExceptionMessage) {
        this.sdkExceptionMessage = sdkExceptionMessage;
        return this;
    }

    /**
     * @return the elapsed time, in milliseconds, between the construction of the http request and the point in time where the
     * http response has been parsed or the attempt has definitively failed
     */
    public Long getAttemptLatency() {
        return attemptLatency;
    }

    /**
     * Sets the latency
     *
     * @param attemptLatency The new latency value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withAttemptLatency(Long attemptLatency) {
        this.attemptLatency = attemptLatency;
        return this;
    }

    /**
     * @return the time interval (in milliseconds) between when the request begins transmission to the service and when the response has been parsed, excluding streaming payloads.
     */
    public Long getRequestLatency() {
        return requestLatency;
    }

    /**
     * Sets the requestLatency
     *
     * @param requestLatency The new requestLatency value.
     * @return This object for method chaining.
     */
    public ApiCallAttemptMonitoringEvent withRequestLatency(Long requestLatency) {
        this.requestLatency = requestLatency;
        return this;
    }

    @Override
    public String getType() {
        return API_CALL_ATTEMPT_MONITORING_EVENT_TYPE;
    }
}
