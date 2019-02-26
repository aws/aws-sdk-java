/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http.request;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ReadLimitInfo;
import com.amazonaws.Request;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;

import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class EmptyHttpRequest implements Request<Object> {

    private final URI endpoint;
    private final HttpMethodName httpMethod;
    private AmazonWebServiceRequest originalRequest = new AmazonWebServiceRequest() {
    };

    private final InputStream content;

    public EmptyHttpRequest(String endpoint, HttpMethodName httpMethod) {
        this(endpoint, httpMethod, null);
    }

    public EmptyHttpRequest(String endpoint, HttpMethodName httpMethod,
                            InputStream payload) {
        this.endpoint = URI.create(endpoint);
        this.httpMethod = httpMethod;
        this.content = payload;
    }

    @Override
    public void addHeader(String name, String value) {
    }

    @Override
    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }

    @Override
    public void setHeaders(Map<String, String> headers) {
    }

    @Override
    public void setResourcePath(String path) {
    }

    @Override
    public String getResourcePath() {
        return null;
    }

    @Override
    public void addParameter(String name, String value) {
    }

    @Override
    public Request<Object> withParameter(String name, String value) {
        return this;
    }

    @Override
    public void addParameters(String name, List<String> values) {
    }

    @Override
    public Map<String, List<String>> getParameters() {
        return Collections.emptyMap();
    }

    @Override
    public void setParameters(Map<String, List<String>> parameters) {
    }

    @Override
    public URI getEndpoint() {
        return endpoint;
    }

    @Override
    public void setEndpoint(URI endpoint) {
        throw new UnsupportedOperationException();
    }

    @Override
    public HttpMethodName getHttpMethod() {
        return httpMethod;
    }

    @Override
    public void setHttpMethod(HttpMethodName httpMethod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InputStream getContent() {
        return content;
    }

    @Override
    public void setContent(InputStream content) {
    }

    @Override
    public String getServiceName() {
        return null;
    }

    @Override
    public AmazonWebServiceRequest getOriginalRequest() {
        return originalRequest;
    }

    public void setOriginalRequest(AmazonWebServiceRequest originalRequest) {
        this.originalRequest = originalRequest;
    }

    @Override
    public int getTimeOffset() {
        return 0;
    }

    @Override
    public void setTimeOffset(int timeOffset) {
    }

    @Override
    public Request<Object> withTimeOffset(int timeOffset) {
        return this;
    }

    @Override
    public AWSRequestMetrics getAWSRequestMetrics() {
        return null;
    }

    @Override
    public void setAWSRequestMetrics(AWSRequestMetrics metrics) {
    }

    @Override
    public ReadLimitInfo getReadLimitInfo() {
        return new AmazonWebServiceRequest() {
        };
    }

    @Override
    public InputStream getContentUnwrapped() {
        return null;
    }

    @Override
    public Object getOriginalRequestObject() {
        return new AmazonWebServiceRequest() {
        };
    }


    @Override
    public <X> void addHandlerContext(HandlerContextKey<X> key, X value) {

    }

    @Override
    public <X> X getHandlerContext(HandlerContextKey<X> key) {
        return null;
    }

}
