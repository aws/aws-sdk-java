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
package com.amazonaws.opensdk;

import com.amazonaws.annotation.Immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Configuration scoped to the request level. To create see {@link #builder()}
 */
@Immutable
public class SdkRequestConfig {

    private final Integer httpRequestTimeout;
    private final Integer totalExecutionTimeout;
    private final Map<String, String> customHeaders;
    private final Map<String, List<String>> customQueryParams;

    private SdkRequestConfig(Integer httpRequestTimeout,
                             Integer totalExecutionTimeout,
                             Map<String, String> customHeaders,
                             Map<String, List<String>> customQueryParams) {
        this.httpRequestTimeout = httpRequestTimeout;
        this.totalExecutionTimeout = totalExecutionTimeout;
        this.customHeaders = Collections.unmodifiableMap(customHeaders);
        this.customQueryParams = Collections.unmodifiableMap(customQueryParams);
    }

    /**
     * See {@link Builder#httpRequestTimeout}.
     *
     * @return Current request timeout value.
     */
    public Integer getHttpRequestTimeout() {
        return httpRequestTimeout;
    }

    /**
     * See {@link Builder#totalExecutionTimeout}.
     *
     * @return Current client execution timeout value.
     */
    public Integer getTotalExecutionTimeout() {
        return totalExecutionTimeout;
    }

    /**
     * See {@link Builder#customHeader(String, String)}.
     *
     * @return Unmodifiable map of custom headers.
     */
    public Map<String, String> getCustomHeaders() {
        return customHeaders;
    }

    /**
     * See {@link Builder#customQueryParam(String, String)}.
     *
     * @return Unmodifiable map of custom query parameters.
     */
    public Map<String, List<String>> getCustomQueryParams() {
        return customQueryParams;
    }

    /**
     * @return A {@link Builder} instance that is initialized with the values of this config.
     */
    public Builder copyBuilder() {
        Builder b = new Builder();
        b.httpRequestTimeout = httpRequestTimeout;
        b.totalExecutionTimeout = totalExecutionTimeout;
        b.customHeaders = new HashMap<>(customHeaders);
        b.customQueryParams = new HashMap<>(customQueryParams);
        return b;
    }

    /**
     * @return Builder object used to configure and create a {@link SdkRequestConfig}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Interface for building a {@link SdkRequestConfig} object.
     */
    public static class Builder {

        private Integer httpRequestTimeout;
        private Integer totalExecutionTimeout;
        private Map<String, String> customHeaders = new HashMap<>();
        private Map<String, List<String>> customQueryParams = new HashMap<>();

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
         * @param httpRequestTimeout The amount of time to wait (in milliseconds) for the request to
         *                       complete before giving up and timing out. A non-positive value
         *                       disables the timeout for this request.
         * @return This object for method chaining.
         * @see {@link #totalExecutionTimeout(int)} to enforce a timeout across all retries
         */
        public Builder httpRequestTimeout(int httpRequestTimeout) {
            this.httpRequestTimeout = httpRequestTimeout;
            return this;
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
         * @param totalExecutionTimeout The amount of time (in milliseconds) to allow the client to
         *                               complete the execution of an API call. A non-positive value
         *                               disables the timeout for this request.
         * @return This object for method chaining.
         * @see {@link #httpRequestTimeout(int)} to enforce a timeout per HTTP request
         */
        public Builder totalExecutionTimeout(int totalExecutionTimeout) {
            this.totalExecutionTimeout = totalExecutionTimeout;
            return this;
        }

        /**
         * Put a new custom header to the map of custom header names to custom header values. <p>
         * NOTE: Custom header values set via this method will overwrite any conflicting values
         * coming from the request parameters.
         *
         * @param name  The name of the header to add
         * @param value The value of the header to add
         * @return This object for method chaining.
         */
        public Builder customHeader(String name, String value) {
            customHeaders.put(name, value);
            return this;
        }

        /**
         * Add a custom query parameter for the request. Since multiple values are allowed for the
         * same query parameter, this method does NOT overwrite any existing parameter values in the
         * request.
         *
         * @param name  The name of the query parameter
         * @param value The value of the query parameter. Only the parameter name will be added in
         *              the URI if the value is set to null. For example, customQueryParameter("param",
         *              null) will be serialized to "?param", while customQueryParameter("param",
         *              "") will be serialized to "?param=".
         * @return This object for method chaining.
         */
        public Builder customQueryParam(String name, String value) {
            customQueryParams.computeIfAbsent(name, key -> new ArrayList<>());
            customQueryParams.get(name).add(value);
            return this;
        }

        /**
         * Builds the {@link SdkRequestConfig} with the current state of the builder.
         *
         * @return Immutable {@link SdkRequestConfig} object. See {@link BaseRequest#sdkRequestConfig(SdkRequestConfig)}.
         */
        public SdkRequestConfig build() {
            return new SdkRequestConfig(httpRequestTimeout,
                                        totalExecutionTimeout,
                                        customHeaders,
                                        customQueryParams);
        }
    }
}
