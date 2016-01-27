/*
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

import com.amazonaws.http.HttpMethodName;

/**
 * Represents a sign-able request being sent to an Amazon Web Service, including the
 * parameters being sent as part of the request, the endpoint to which the
 * request should be sent, etc.
 * <p>
 * This class is only intended for internal use inside the AWS client libraries.
 * Callers shouldn't ever interact directly with objects of this class.
 *
 * @param <T>
 *            The type of original, user facing request represented by this
 *            request.
 */
public interface SignableRequest<T> {

    /**
     * Sets the specified header for this request.
     *
     * @param name
     *            The name of the header to set.
     * @param value
     *            The header's value.
     */
    public void addHeader(String name, String value);

    /**
     * Returns a map of all the headers included in this request.
     *
     * @return A map of all the headers included in this request.
     */
    public Map<String, String> getHeaders();


    /**
     * Returns the path to the resource being requested.
     *
     * @return The path to the resource being requested.
     */
    public String getResourcePath();

    /**
     * Adds the specified request parameter to this request.
     *
     * @param name
     *            The name of the request parameter.
     * @param value
     *            The value of the request parameter.
     */
    public void addParameter(String name, String value);

    /**
     * Returns a map of all parameters in this request.
     *
     * @return A map of all parameters in this request.
     */
    public Map<String, List<String>> getParameters();

    /**
     * Returns the service endpoint (ex: "https://ec2.amazonaws.com") to which
     * this request should be sent.
     *
     * @return The service endpoint to which this request should be sent.
     */
    public URI getEndpoint();

    /**
     * Returns the HTTP method (GET, POST, etc) to use when sending this
     * request.
     *
     * @return The HTTP method to use when sending this request.
     */
    public HttpMethodName getHttpMethod();

    /**
     * Returns the optional value for time offset for this request.  This
     * will be used by the signer to adjust for potential clock skew.
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @return The optional value for time offset (in seconds) for this request.
     */
    public int getTimeOffset();

    /**
     * Returns the optional stream containing the payload data to include for
     * this request. Not all requests will contain payload data.
     *
     * @return The optional stream containing the payload data to include for
     *         this request.
     */
    public InputStream getContent();

    /**
     * Returns the optional raw stream containing the payload data to include
     * for this request, with all progress stream wrappers. Not all requests
     * contain payload data.
     *
     * @return The optional raw stream containing the payload data to include
     *         for this request, with all progress stream wrappers removed.
     */
    public InputStream getContentUnwrapped();

    /**
     * Returns the read limit info about the original request.
     */
    public ReadLimitInfo getReadLimitInfo();

    /**
     * Returns the original, user facing request object which this internal
     * request object is representing.
     *
     * @return an instance of request as an <code>Object</code>.
     */
    public Object getOriginalRequestObject();

    /**
     * Sets the optional stream containing the payload data to include for this
     * request. This is used, for example, for S3 chunk encoding.
     *
     * @param content
     *            The optional stream containing the payload data to include for
     *            this request.
     */
    public void setContent(InputStream content);
}
