/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a get integration response request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntegrationResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] Specifies a get integration response request's resource identifier.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * [Required] Specifies a get integration response request's HTTP method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * [Required] Specifies a get integration response request's status code.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's resource identifier.
     * </p>
     * 
     * @param resourceId
     *        [Required] Specifies a get integration response request's resource identifier.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's resource identifier.
     * </p>
     * 
     * @return [Required] Specifies a get integration response request's resource identifier.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's resource identifier.
     * </p>
     * 
     * @param resourceId
     *        [Required] Specifies a get integration response request's resource identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        [Required] Specifies a get integration response request's HTTP method.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's HTTP method.
     * </p>
     * 
     * @return [Required] Specifies a get integration response request's HTTP method.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        [Required] Specifies a get integration response request's HTTP method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's status code.
     * </p>
     * 
     * @param statusCode
     *        [Required] Specifies a get integration response request's status code.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's status code.
     * </p>
     * 
     * @return [Required] Specifies a get integration response request's status code.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * [Required] Specifies a get integration response request's status code.
     * </p>
     * 
     * @param statusCode
     *        [Required] Specifies a get integration response request's status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseRequest withStatusCode(String statusCode) {
        setStatusCode(statusCode);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntegrationResponseRequest == false)
            return false;
        GetIntegrationResponseRequest other = (GetIntegrationResponseRequest) obj;
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
    public GetIntegrationResponseRequest clone() {
        return (GetIntegrationResponseRequest) super.clone();
    }

}
