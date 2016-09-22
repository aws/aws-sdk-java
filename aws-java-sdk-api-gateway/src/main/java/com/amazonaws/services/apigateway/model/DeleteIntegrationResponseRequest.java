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
 * Represents a delete integration response request.
 * </p>
 */
public class DeleteIntegrationResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a delete integration response request's API identifier.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * Specifies a delete integration response request's resource identifier.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies a delete integration response request's HTTP method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * Specifies a delete integration response request's status code.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * Specifies a delete integration response request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a delete integration response request's API identifier.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * Specifies a delete integration response request's API identifier.
     * </p>
     * 
     * @return Specifies a delete integration response request's API identifier.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * Specifies a delete integration response request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a delete integration response request's API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIntegrationResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * Specifies a delete integration response request's resource identifier.
     * </p>
     * 
     * @param resourceId
     *        Specifies a delete integration response request's resource identifier.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specifies a delete integration response request's resource identifier.
     * </p>
     * 
     * @return Specifies a delete integration response request's resource identifier.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Specifies a delete integration response request's resource identifier.
     * </p>
     * 
     * @param resourceId
     *        Specifies a delete integration response request's resource identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIntegrationResponseRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies a delete integration response request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a delete integration response request's HTTP method.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies a delete integration response request's HTTP method.
     * </p>
     * 
     * @return Specifies a delete integration response request's HTTP method.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * Specifies a delete integration response request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a delete integration response request's HTTP method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIntegrationResponseRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * Specifies a delete integration response request's status code.
     * </p>
     * 
     * @param statusCode
     *        Specifies a delete integration response request's status code.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Specifies a delete integration response request's status code.
     * </p>
     * 
     * @return Specifies a delete integration response request's status code.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Specifies a delete integration response request's status code.
     * </p>
     * 
     * @param statusCode
     *        Specifies a delete integration response request's status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIntegrationResponseRequest withStatusCode(String statusCode) {
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

        if (obj instanceof DeleteIntegrationResponseRequest == false)
            return false;
        DeleteIntegrationResponseRequest other = (DeleteIntegrationResponseRequest) obj;
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
    public DeleteIntegrationResponseRequest clone() {
        return (DeleteIntegrationResponseRequest) super.clone();
    }
}
