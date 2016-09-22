/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to describe a <a>MethodResponse</a> resource.
 * </p>
 */
public class GetMethodResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The status code for the <a>MethodResponse</a> resource.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>MethodResponse</a> resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier for the <a>MethodResponse</a> resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>MethodResponse</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMethodResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the <a>MethodResponse</a> resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @return The <a>Resource</a> identifier for the <a>MethodResponse</a> resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the <a>MethodResponse</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMethodResponseRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP verb of the <a>Method</a> resource.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     * 
     * @return The HTTP verb of the <a>Method</a> resource.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP verb of the <a>Method</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMethodResponseRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The status code for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param statusCode
     *        The status code for the <a>MethodResponse</a> resource.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @return The status code for the <a>MethodResponse</a> resource.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code for the <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param statusCode
     *        The status code for the <a>MethodResponse</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMethodResponseRequest withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: " + getHttpMethod() + ",");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMethodResponseRequest == false)
            return false;
        GetMethodResponseRequest other = (GetMethodResponseRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public GetMethodResponseRequest clone() {
        return (GetMethodResponseRequest) super.clone();
    }
}
