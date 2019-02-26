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
package com.amazonaws.opensdk.model;

import com.amazonaws.opensdk.BaseRequest;
import com.amazonaws.opensdk.SdkRequestConfig;
import com.amazonaws.http.HttpMethodName;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Low level request class for accessing the service resources. This class is
 * useful for example when an operation was not modeled or otherwise unable to
 * be represented by a higher level modeled request class.
 * <p>
 * This defaults to a {@link HttpMethodName#GET} request.
 */
public class RawRequest extends BaseRequest {
    private static final long serialVersionUID = 1L;

    private String path;

    private HttpMethodName httpMethod = HttpMethodName.GET;

    private transient InputStream payload;

    private Map<String, String> headers = new HashMap<>();
    private Map<String, List<String>> queryParameters = new HashMap<>();
    // This is kept separate from the BaseRequest's, which allows us to later
    // override/merge in headers and query parameters set at the RawRequest
    // level.
    private transient SdkRequestConfig requestConfig = SdkRequestConfig.builder().build();
    private boolean requestConfigDirty = true;

    /**
     * @return The path to the resource.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path to the resource.
     *
     * @param path The path.
     *
     * @return This object for method chaining.
     */
    public RawRequest path(String path) {
        this.path = path;
        return this;
    }

    /**
     * @return The HTTP method to perform against the configured resource.
     */
    public HttpMethodName httpMethod() {
        return httpMethod;
    }

    /**
     * Set the HTTP method to perform against the configured resouce.
     *
     * @param httpMethod The HTTP method.
     *
     * @return This object for method chaining.
     */
    public RawRequest httpMethod(HttpMethodName httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * Set a header value for the underlying HTTP request.
     * <p>
     * Headers set with this method will take precedence over headers found in
     * the configured {@link SdkRequestConfig}.
     *
     * @param name The name of the header.
     * @param value The value of the header.
     *
     * @return This object for method chaining.
     */
    public RawRequest header(String name, String value) {
        headers.put(name, value);
        setRequestConfigDirty();
        return this;
    }

    /**
     * Set a query parameter value for the underlying HTTP request.
     * <p>
     * Query parameters set with this method will be merged with query
     * parameters found in the configured {@link SdkRequestConfig}.
     *
     * @param name The name of the header.
     * @param value The value of the header.
     *
     * @return This object for method chaining.
     */
    public RawRequest queryParameter(String name, String value) {
        queryParameters.computeIfAbsent(name, k -> new ArrayList<>());
        queryParameters.get(name).add(value);
        setRequestConfigDirty();
        return this;
    }

    /**
     * Set a payload for the underlying HTTP request.
     *
     * @param is The payload.
     *
     * @return This object for method chaining.
     */
    public RawRequest payload(InputStream is) {
        this.payload = is;
        return this;
    }

    /**
     * @return The payload.
     */
    public InputStream payload() {
        return this.payload;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Header values set using {@link #header(String, String)} take precedence
     * over values present in the request config. Query parameter values set
     * using {@link #queryParameter(String, String)} will be merged with the
     * values present in the request config.
     *
     * @param sdkRequestConfig The request config.
     *
     * @return This object for method chaining.
     */
    @Override
    public RawRequest sdkRequestConfig(SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        setRequestConfigDirty();
        return this;
    }

    @Override
    public SdkRequestConfig sdkRequestConfig() {
        if (requestConfigDirty) {
            SdkRequestConfig.Builder builder = super.sdkRequestConfig().copyBuilder();
            queryParameters.forEach((p, values) -> values
                    .forEach(v -> builder.customQueryParam(p, v)));
            headers.forEach(builder::customHeader);
            requestConfig = builder.build();
            requestConfigDirty = false;
        }
        return requestConfig;
    }

    private void setRequestConfigDirty() {
        requestConfigDirty = true;
    }
}
