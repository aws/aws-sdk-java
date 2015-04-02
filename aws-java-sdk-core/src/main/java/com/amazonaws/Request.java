/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.URI;
import java.util.Map;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;

/**
 * Represents a request being sent to an Amazon Web Service, including the
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
public interface Request<T> extends SignableRequest<T> {
    /**
     * Sets all headers, clearing any existing ones.
     */
    public void setHeaders(Map<String, String> headers);

    /**
     * Sets the path to the resource being requested.
     *
     * @param path
     *            The path to the resource being requested.
     */
    public void setResourcePath(String path);

    /**
     * Adds the specified request parameter to this request, and returns the
     * updated request object.
     *
     * @param name
     *            The name of the request parameter.
     * @param value
     *            The value of the request parameter.
     *
     * @return The updated request object.
     */
    public Request<T> withParameter(String name, String value);

    /**
     * Sets all parameters, clearing any existing values.
     */
    public void setParameters(Map<String, String> parameters);

    /**
     * Sets the service endpoint (ex: "https://ec2.amazonaws.com") to which this
     * request should be sent.
     *
     * @param endpoint
     *            The service endpoint to which this request should be sent.
     */
    public void setEndpoint(URI endpoint);

    /**
     * Sets the HTTP method (GET, POST, etc) to use when sending this request.
     * 
     * @param httpMethod
     *            The HTTP method to use when sending this request.
     */
    public void setHttpMethod(HttpMethodName httpMethod);

    /**
     * Returns the name of the Amazon service this request is for.
     *
     * @return The name of the Amazon service this request is for.
     */
    public String getServiceName();

    /**
     * Returns the original, user facing request object which this internal
     * request object is representing.
     */
    public AmazonWebServiceRequest getOriginalRequest();

    /**
     * Sets the optional value for time offset for this request.  This
     * will be used by the signer to adjust for potential clock skew.  
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @param timeOffset
     *            The optional value for time offset (in seconds) for this request.
     */
    public void setTimeOffset(int timeOffset);

    /**
     * Sets the optional value for time offset for this request.  This
     * will be used by the signer to adjust for potential clock skew.  
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @return The updated request object.
     */
    public Request<T> withTimeOffset(int timeOffset);

    /**
     * Returns the request metrics.
     */
    public AWSRequestMetrics getAWSRequestMetrics();

    /**
     * Bind the request metrics to the request. Note metrics can be captured
     * before the request is created.
     * 
     * @throws IllegalStateException if the binding has already occurred
     */
    public void setAWSRequestMetrics(AWSRequestMetrics metrics);
}
