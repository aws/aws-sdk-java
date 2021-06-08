/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations. In
 * the latter case, these are merged with any InvocationParameters specified on the Connection, with any values from the
 * Connection taking precedence.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/HttpParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     * wildcards ("*").
     * </p>
     */
    private java.util.List<String> pathParameterValues;
    /**
     * <p>
     * The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge
     * ApiDestination.
     * </p>
     */
    private java.util.Map<String, String> headerParameters;
    /**
     * <p>
     * The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or
     * EventBridge ApiDestination.
     * </p>
     */
    private java.util.Map<String, String> queryStringParameters;

    /**
     * <p>
     * The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     * wildcards ("*").
     * </p>
     * 
     * @return The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     *         wildcards ("*").
     */

    public java.util.List<String> getPathParameterValues() {
        return pathParameterValues;
    }

    /**
     * <p>
     * The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     * wildcards ("*").
     * </p>
     * 
     * @param pathParameterValues
     *        The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     *        wildcards ("*").
     */

    public void setPathParameterValues(java.util.Collection<String> pathParameterValues) {
        if (pathParameterValues == null) {
            this.pathParameterValues = null;
            return;
        }

        this.pathParameterValues = new java.util.ArrayList<String>(pathParameterValues);
    }

    /**
     * <p>
     * The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     * wildcards ("*").
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPathParameterValues(java.util.Collection)} or {@link #withPathParameterValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param pathParameterValues
     *        The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     *        wildcards ("*").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters withPathParameterValues(String... pathParameterValues) {
        if (this.pathParameterValues == null) {
            setPathParameterValues(new java.util.ArrayList<String>(pathParameterValues.length));
        }
        for (String ele : pathParameterValues) {
            this.pathParameterValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     * wildcards ("*").
     * </p>
     * 
     * @param pathParameterValues
     *        The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path
     *        wildcards ("*").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters withPathParameterValues(java.util.Collection<String> pathParameterValues) {
        setPathParameterValues(pathParameterValues);
        return this;
    }

    /**
     * <p>
     * The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge
     * ApiDestination.
     * </p>
     * 
     * @return The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge
     *         ApiDestination.
     */

    public java.util.Map<String, String> getHeaderParameters() {
        return headerParameters;
    }

    /**
     * <p>
     * The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge
     * ApiDestination.
     * </p>
     * 
     * @param headerParameters
     *        The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge
     *        ApiDestination.
     */

    public void setHeaderParameters(java.util.Map<String, String> headerParameters) {
        this.headerParameters = headerParameters;
    }

    /**
     * <p>
     * The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge
     * ApiDestination.
     * </p>
     * 
     * @param headerParameters
     *        The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge
     *        ApiDestination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters withHeaderParameters(java.util.Map<String, String> headerParameters) {
        setHeaderParameters(headerParameters);
        return this;
    }

    /**
     * Add a single HeaderParameters entry
     *
     * @see HttpParameters#withHeaderParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters addHeaderParametersEntry(String key, String value) {
        if (null == this.headerParameters) {
            this.headerParameters = new java.util.HashMap<String, String>();
        }
        if (this.headerParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.headerParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HeaderParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters clearHeaderParametersEntries() {
        this.headerParameters = null;
        return this;
    }

    /**
     * <p>
     * The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or
     * EventBridge ApiDestination.
     * </p>
     * 
     * @return The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or
     *         EventBridge ApiDestination.
     */

    public java.util.Map<String, String> getQueryStringParameters() {
        return queryStringParameters;
    }

    /**
     * <p>
     * The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or
     * EventBridge ApiDestination.
     * </p>
     * 
     * @param queryStringParameters
     *        The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or
     *        EventBridge ApiDestination.
     */

    public void setQueryStringParameters(java.util.Map<String, String> queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
    }

    /**
     * <p>
     * The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or
     * EventBridge ApiDestination.
     * </p>
     * 
     * @param queryStringParameters
     *        The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or
     *        EventBridge ApiDestination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters withQueryStringParameters(java.util.Map<String, String> queryStringParameters) {
        setQueryStringParameters(queryStringParameters);
        return this;
    }

    /**
     * Add a single QueryStringParameters entry
     *
     * @see HttpParameters#withQueryStringParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters addQueryStringParametersEntry(String key, String value) {
        if (null == this.queryStringParameters) {
            this.queryStringParameters = new java.util.HashMap<String, String>();
        }
        if (this.queryStringParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.queryStringParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryStringParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpParameters clearQueryStringParametersEntries() {
        this.queryStringParameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPathParameterValues() != null)
            sb.append("PathParameterValues: ").append(getPathParameterValues()).append(",");
        if (getHeaderParameters() != null)
            sb.append("HeaderParameters: ").append(getHeaderParameters()).append(",");
        if (getQueryStringParameters() != null)
            sb.append("QueryStringParameters: ").append(getQueryStringParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpParameters == false)
            return false;
        HttpParameters other = (HttpParameters) obj;
        if (other.getPathParameterValues() == null ^ this.getPathParameterValues() == null)
            return false;
        if (other.getPathParameterValues() != null && other.getPathParameterValues().equals(this.getPathParameterValues()) == false)
            return false;
        if (other.getHeaderParameters() == null ^ this.getHeaderParameters() == null)
            return false;
        if (other.getHeaderParameters() != null && other.getHeaderParameters().equals(this.getHeaderParameters()) == false)
            return false;
        if (other.getQueryStringParameters() == null ^ this.getQueryStringParameters() == null)
            return false;
        if (other.getQueryStringParameters() != null && other.getQueryStringParameters().equals(this.getQueryStringParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPathParameterValues() == null) ? 0 : getPathParameterValues().hashCode());
        hashCode = prime * hashCode + ((getHeaderParameters() == null) ? 0 : getHeaderParameters().hashCode());
        hashCode = prime * hashCode + ((getQueryStringParameters() == null) ? 0 : getQueryStringParameters().hashCode());
        return hashCode;
    }

    @Override
    public HttpParameters clone() {
        try {
            return (HttpParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.HttpParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
