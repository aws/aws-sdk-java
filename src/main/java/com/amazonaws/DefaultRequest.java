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
package com.amazonaws;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.http.HttpMethodName;

/**
 * Default implementation of the {@linkplain com.amazonaws.Request} interface.
 * <p>
 * This class is only intended for internal use inside the AWS client libraries.
 * Callers shouldn't ever interact directly with objects of this class.
 */
public class DefaultRequest<T> implements Request<T> {

    /** The resource path being requested */
    private String resourcePath;

    /** Map of the parameters being sent as part of this request */
    private Map<String, String> parameters = new HashMap<String, String>();

    /** Map of the headers included in this request */
    private Map<String, String> headers = new HashMap<String, String>();

    /** The service endpoint to which this request should be sent */
    private URI endpoint;

    /** The name of the service to which this request is being sent */
    private String serviceName;

    /**
     * The original, user facing request object which this internal request
     * object is representing
     */
    private final AmazonWebServiceRequest originalRequest;

    /** The HTTP method to use when sending this request. */
    private HttpMethodName httpMethod = HttpMethodName.POST;

    /** An optional stream from which to read the request payload. */
	private InputStream content;

    /**
     * Constructs a new DefaultRequest with the specified service name and the
     * original, user facing request object.
     *
     * @param serviceName
     *            The name of the service to which this request is being sent.
     * @param originalRequest
     *            The original, user facing, AWS request being represented by
     *            this internal request object.
     */
    public DefaultRequest(AmazonWebServiceRequest originalRequest, String serviceName) {
        this.serviceName = serviceName;
        this.originalRequest = originalRequest;
    }

    /**
     * Constructs a new DefaultRequest with the specified service name and no
     * specified original, user facing request object.
     *
     * @param serviceName
     *            The name of the service to which this request is being sent.
     */
    public DefaultRequest(String serviceName) {
        this(null, serviceName);
    }


    /**
     * Returns the original, user facing request object which this internal
     * request object is representing.
     *
     * @return The original, user facing request object which this request
     *         object is representing.
     */
    public AmazonWebServiceRequest getOriginalRequest() {
        return originalRequest;
    }

    /**
     * @see com.amazonaws.Request#addHeader(java.lang.String, java.lang.String)
     */
    public void addHeader(String name, String value) {
        headers.put(name, value);
    }

    /**
     * @see com.amazonaws.Request#getHeaders()
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * @see com.amazonaws.Request#setResourcePath(java.lang.String)
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * @see com.amazonaws.Request#getResourcePath()
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * @see com.amazonaws.Request#addParameter(java.lang.String, java.lang.String)
     */
    public void addParameter(String name, String value) {
        parameters.put(name, value);
    }

    /**
     * @see com.amazonaws.Request#getParameters()
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * @see com.amazonaws.Request#withParameter(java.lang.String, java.lang.String)
     */
    public Request<T> withParameter(String name, String value) {
        addParameter(name, value);
        return this;
    }

    /**
     * @see com.amazonaws.Request#getHttpMethod()
     */
    public HttpMethodName getHttpMethod() {
    	return httpMethod;
    }

    /**
     * @see com.amazonaws.Request#setHttpMethod(com.amazonaws.http.HttpMethodName)
     */
    public void setHttpMethod(HttpMethodName httpMethod) {
		this.httpMethod = httpMethod;
    }

    /**
     * @see com.amazonaws.Request#setEndpoint(java.net.URI)
     */
    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @see com.amazonaws.Request#getEndpoint()
     */
    public URI getEndpoint() {
        return endpoint;
    }

    /**
     * @see com.amazonaws.Request#getServiceName()
     */
    public String getServiceName() {
        return serviceName;
    }

	/** 
	 * @see com.amazonaws.Request#getContent() 
	 */
	public InputStream getContent() {
		return content;
	}

	/**
	 * @see com.amazonaws.Request#setContent(java.io.InputStream)
	 */
	public void setContent(InputStream content) {
		this.content = content;
	}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(getHttpMethod().toString() + " ");
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
