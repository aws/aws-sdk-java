/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.Request;

/**
 * Represents an HTTP response returned by an AWS service in response to a
 * service request.
 */
public class HttpResponse {
    private Request request;
    private String statusText;
    private int statusCode;
    private InputStream content;
    private Map<String, String> headers = new HashMap<String, String>();

    /**
     * Constructs a new HttpResponse associated with the specified request.
     *
     * @param request
     *            The associated request that generated this response.
     */
    public HttpResponse(Request request) {
        this.request = request;
    }

    /**
     * Returns the HttpRequest associated with this response.
     *
     * @return The HttpRequest associated with this response.
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Returns the HTTP headers returned with this response.
     *
     * @return The set of HTTP headers returned with this HTTP response.
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Adds an HTTP header to the set associated with this response.
     *
     * @param name
     *            The name of the HTTP header.
     * @param value
     *            The value of the HTTP header.
     */
    public void addHeader(String name, String value) {
        headers.put(name, value);
    }

    /**
     * Sets the input stream containing the response content.
     *
     * @param content
     *            The input stream containing the response content.
     */
    public void setContent(InputStream content) {
        this.content = content;
    }

    /**
     * Returns the input stream containing the response content.
     *
     * @return The input stream containing the response content.
     */
    public InputStream getContent() {
        return content;
    }

    /**
     * Sets the HTTP status text returned with this response.
     *
     * @param statusText
     *            The HTTP status text (ex: "Not found") returned with this
     *            response.
     */
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    /**
     * Returns the HTTP status text associated with this response.
     *
     * @return The HTTP status text associated with this response.
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the HTTP status code that was returned with this response.
     *
     * @param statusCode
     *            The HTTP status code (ex: 200, 404, etc) associated with this
     *            response.
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Returns the HTTP status code (ex: 200, 404, etc) associated with this
     * response.
     *
     * @return The HTTP status code associated with this response.
     */
    public int getStatusCode() {
        return statusCode;
    }

}
