/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.opensdk.config;

import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;

import java.util.Optional;

/**
 * Configuration options to customize the various timeouts used by the client.
 */
public class TimeoutConfiguration {

    private Integer socketTimeout;
    private Integer connectionTimeout;
    private Integer httpRequestTimeout;
    private Integer totalExecutionTimeout;

    /**
     * Returns the amount of time to wait (in milliseconds) for data to be transferred over an
     * established, open connection before the connection times out and is closed. A value of 0
     * means infinity, and isn't recommended.
     * <p>
     * Default value is {@value ApiGatewayClientConfigurationFactory#DEFAULT_SOCKET_TIMEOUT}.
     * </p>
     *
     * @return The amount of time to wait (in milliseconds) for data to be transferred over an
     *         established, open connection before the connection times out and is closed.
     */
    public Optional<Integer> getSocketTimeout() {
        return Optional.ofNullable(socketTimeout);
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for data to be transferred over an
     * established, open connection before the connection times out and is closed.
     * <p>
     *  Default value is {@value ApiGatewayClientConfigurationFactory#DEFAULT_SOCKET_TIMEOUT}.
     * </p>
     *
     * @param socketTimeout The amount of time to wait (in milliseconds) for data to be transferred over an
     *                      established, open connection before the connection is times out and is closed.
     */
    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for data to be transferred over an
     * established, open connection before the connection times out and is closed.
     * <p>
     *  Default value is {@value ApiGatewayClientConfigurationFactory#DEFAULT_SOCKET_TIMEOUT}.
     * </p>
     *
     * @param socketTimeout The amount of time to wait (in milliseconds) for data to be transferred over an
     *                      established, open connection before the connection is times out and is closed.
     * @return This object for method chaining.
     */
    public TimeoutConfiguration socketTimeout(Integer socketTimeout) {
        setSocketTimeout(socketTimeout);
        return this;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) when initially establishing a connection
     * before giving up and timing out. A value of 0 means infinity, and is not recommended.
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_TIMEOUT}.
     * </p>
     *
     * @return The amount of time to wait (in milliseconds) when initially establishing a connection
     *         before giving up and timing out.
     */
    public Optional<Integer> getConnectionTimeout() {
        return Optional.ofNullable(connectionTimeout);
    }

    /**
     * Sets the amount of time to wait (in milliseconds) when initially establishing a connection
     * before giving up and timing out.
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_TIMEOUT}.
     * </p>
     *
     * @param connectionTimeout The amount of time to wait (in milliseconds) when initially establishing a
     *                          connection before giving up and timing out.
     */
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) when initially establishing a connection
     * before giving up and timing out.
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_TIMEOUT}.
     * </p>
     *
     * @param connectionTimeout The amount of time to wait (in milliseconds) when initially establishing a
     *                          connection before giving up and timing out.
     * @return This object for method chaining.
     */
    public TimeoutConfiguration connectionTimeout(Integer connectionTimeout) {
        setConnectionTimeout(connectionTimeout);
        return this;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) for a HTTP request to complete before
     * giving up and timing out.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * </p>
     * <p>
     * The http request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, this feature
     * should not be used when absolute precision is needed.
     * </p>
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_REQUEST_TIMEOUT},
     * which indicates the feature is disabled.
     * </p>
     *
     * @return The amount of time to wait (in milliseconds) for the request to complete before
     *         giving up and timing out.
     */
    public Optional<Integer> getHttpRequestTimeout() {
        return Optional.ofNullable(httpRequestTimeout);
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for a single HTTP request to complete before giving
     * up and timing out.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * </p>
     * <p>
     * The http request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, this feature
     * should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This timeout is disabled by default.
     * </p>
     *
     * @param httpRequestTimeout The amount of time to wait (in milliseconds) for the request to complete before
     *                       giving up and timing out.
     */
    public void setHttpRequestTimeout(Integer httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for a single HTTP request to complete before giving
     * up and timing out.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * </p>
     * <p>
     * The http request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, this feature
     * should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This timeout is disabled by default.
     * </p>
     *
     * @param httpRequestTimeout The amount of time to wait (in milliseconds) for the request to complete before
     *                       giving up and timing out.
     * @return This object for method chaining.
     */
    public TimeoutConfiguration httpRequestTimeout(Integer httpRequestTimeout) {
        setHttpRequestTimeout(httpRequestTimeout);
        return this;
    }

    /**
     * Returns the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes all HTTP requests (even retries), unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * </p>
     * <p>
     * The total execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This timeout is disabled by default.
     * </p>
     *
     * @return The amount of time (in milliseconds) to allow the client to complete the execution of
     *         an API call.
     */
    public Optional<Integer> getTotalExecutionTimeout() {
        return Optional.ofNullable(totalExecutionTimeout);
    }

    /**
     * Sets the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes all HTTP requests (even retries), unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * </p>
     * <p>
     * The total execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This timeout is disabled by default.
     * </p>
     *
     * @param totalExecutionTimeout The amount of time (in milliseconds) to allow the client to complete the execution
     *                               of an API call.
     */
    public void setTotalExecutionTimeout(Integer totalExecutionTimeout) {
        this.totalExecutionTimeout = totalExecutionTimeout;
    }

    /**
     * Sets the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes all HTTP requests (even retries), unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * </p>
     * <p>
     * The total execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This timeout is disabled by default.
     * </p>
     *
     * @param totalExecutionTimeout The amount of time (in milliseconds) to allow the client to complete the execution
     *                               of an API call.
     * @return This object for method chaining.
     */
    public TimeoutConfiguration totalExecutionTimeout(Integer totalExecutionTimeout) {
        setTotalExecutionTimeout(totalExecutionTimeout);
        return this;
    }

}
