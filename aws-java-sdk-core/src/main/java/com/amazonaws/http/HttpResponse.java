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
package com.amazonaws.http;

import com.amazonaws.Request;
import com.amazonaws.util.CRC32ChecksumCalculatingInputStream;

import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/**
 * Represents an HTTP response returned by an AWS service in response to a
 * service request.
 */
public class HttpResponse {

    private final Request<?> request;
    private final HttpRequestBase httpRequest;

    private String statusText;
    private int statusCode;
    private InputStream content;
    private Map<String, String> headers = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
    private HttpContext context;

    /**
     * Constructs a new HttpResponse associated with the specified request.
     *
     * @param request
     *            The associated request that generated this response.
     * @param httpRequest
     *            The underlying http request that generated this response.
     * @throws IOException
     */
    public HttpResponse(Request<?> request, HttpRequestBase httpRequest) {
        this(request, httpRequest, null);
    }

    public HttpResponse(Request<?> request, HttpRequestBase httpRequest, HttpContext context) {
        this.request = request;
        this.httpRequest = httpRequest;
        this.context = context;
    }

    /**
     * Returns the original request associated with this response.
     *
     * @return The original request associated with this response.
     */
    public Request<?> getRequest() {
        return request;
    }

    /**
     * Returns the original http request associated with this response.
     *
     * @return The original http request associated with this response.
     */
    public HttpRequestBase getHttpRequest() {
        return httpRequest;
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
     * Looks up a header by name and returns its value. Does case insensitive comparison.
     *
     * @param headerName Name of header to get value for.
     * @return The header value of the given header. Null if header is not present.
     */
    public String getHeader(String headerName) {
        return headers.get(headerName);
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

    /**
     * Returns the CRC32 checksum calculated by the underlying CRC32ChecksumCalculatingInputStream.
     *
     * @return The CRC32 checksum.
     */
    public long getCRC32Checksum() {
        if (context == null) {
            return 0L;
        }
        CRC32ChecksumCalculatingInputStream crc32ChecksumInputStream =
                (CRC32ChecksumCalculatingInputStream)context.getAttribute(CRC32ChecksumCalculatingInputStream.class.getName());
        return crc32ChecksumInputStream == null ? 0L : crc32ChecksumInputStream.getCRC32Checksum();
    }

}
