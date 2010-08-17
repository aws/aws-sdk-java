/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.AmazonWebServiceRequest;

public class HttpRequest {

    private Map<String, String> parameters = new HashMap<String, String>();
    private Map<String, String> headers = new HashMap<String, String>();
    private HttpMethodName methodName;
    private String serviceName;
    private URI endpoint;
    private String resourcePath;
    private InputStream inputStream;
    private AmazonWebServiceRequest originalRequest;

    /**
     * Construct request with http method name
     *
     * Supported methods are: GET POST DELETE HEAD PUT
     *
     * @param methodName
     *            http method name
     */
    public HttpRequest(HttpMethodName methodName) {
        this.methodName = methodName;
    }

    /**
     * Returns http request method
     *
     * @return http request method
     */
    public HttpMethodName getMethodName() {
        return methodName;
    }

    /**
     * Sets the name of the Amazon service this request is for.
     *
     * @param serviceName
     *            The name of the Amazon service this request is for.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Returns the name of the Amazon service this request is for.
     *
     * @return The name of the Amazon service this request is for.
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Returns the service endpoint (ex: "https://ec2.amazonaws.com") to which
     * this HTTP request should be sent.
     *
     * @return The service endpoint to which this HTTP request should be sent.
     */
    public URI getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the service endpoint (ex: "https://ec2.amazonaws.com") to which this
     * HTTP request should be sent.
     *
     * @param endpoint
     *            The service endpoint to which this HTTP request should be
     *            sent.
     */
    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Returns list of request parameters
     *
     * @return list of request parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Returns a map of the headers associated with this request
     *
     * @return a map of the headers associated with this request
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Adds the specified header name and value to this request.
     *
     * @param name
     *            The name of the header.
     * @param value
     *            The value of the header.
     */
    public void addHeader(String name, String value) {
        headers.put(name, value);
    }

    /**
     * Removes header from request
     *
     * @param name
     *            header name to remove
     */
    public void removeHeader(String name) {
        this.headers.remove(name);
    }

    public void addParameter(String name, String value) {
        this.parameters.put(name, value);
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public HttpRequest withParameter(String name, String value) {
        addParameter(name, value);
        return this;
    }

    /**
     * Returns the resource path associated with this request.
     *
     * @return The resource path associated with this request.
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * Sets the resource path associated with this request.
     *
     * @param resourcePath
     *            The resource path associated with this request.
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * Sets the input stream containing the content to include with this
     * request.
     *
     * @param inputStream
     *            The input stream containing the content to include with this
     *            request.
     */
    public void setContent(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * Returns the input stream containing the content to include with this
     * request.
     *
     * @return The input stream containing the content to include with this
     *         request.
     */
    public InputStream getContent() {
        return inputStream;
    }

    /**
     * Sets the original request, as constructed by the SDK user, for which this
     * HTTP request is being executed.
     *
     * @param request
     *            The original request constructed by the end user.
     */
    public void setOriginalRequest(AmazonWebServiceRequest request) {
        this.originalRequest = request;
    }

    /**
     * Returns the original request, as constructed by the SDK user, for which
     * this HTTP request is being executed.
     *
     * @return request The original request constructed by the end user.
     */
    public AmazonWebServiceRequest getOriginalRequest() {
        return originalRequest;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(getMethodName().toString() + " ");
        builder.append(getEndpoint().toString() + " ");

        builder.append("/"
                + (getResourcePath() != null ? getResourcePath() : "")
                + " ");

        if (!getParameters().isEmpty()) {
            builder.append("Parameters: (");
            for (String key : getParameters().keySet()) {
                String value = getParameters().get(key);
                builder.append(key + ": " + value + ", ");
            }
            builder.append(") ");
        }

        if (!getHeaders().isEmpty()) {
            builder.append("Headers: (");
            for (String key : getHeaders().keySet()) {
                String value = getHeaders().get(key);
                builder.append(key + ": " + value + ", ");
            }
            builder.append(") ");
        }

        return builder.toString();
    }

}
