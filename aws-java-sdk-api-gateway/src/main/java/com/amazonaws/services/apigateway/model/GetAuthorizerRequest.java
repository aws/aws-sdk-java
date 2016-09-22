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
 * Request to describe an existing <a>Authorizer</a> resource.
 * </p>
 */
public class GetAuthorizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizer</a> resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The identifier of the <a>Authorizer</a> resource.
     * </p>
     */
    private String authorizerId;

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizer</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>Authorizer</a> resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizer</a> resource.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier for the <a>Authorizer</a> resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizer</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>Authorizer</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The identifier of the <a>Authorizer</a> resource.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of the <a>Authorizer</a> resource.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * The identifier of the <a>Authorizer</a> resource.
     * </p>
     * 
     * @return The identifier of the <a>Authorizer</a> resource.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * The identifier of the <a>Authorizer</a> resource.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of the <a>Authorizer</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerRequest withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
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
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: " + getAuthorizerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizerRequest == false)
            return false;
        GetAuthorizerRequest other = (GetAuthorizerRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthorizerRequest clone() {
        return (GetAuthorizerRequest) super.clone();
    }
}
