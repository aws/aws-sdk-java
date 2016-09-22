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
 * Request to describe an existing <a>Authorizers</a> resource.
 * </p>
 */
public class GetAuthorizersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizers</a> resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * If not all <a>Authorizer</a> resources in the response were present, the position will specify where to start the
     * next page of results.
     * </p>
     */
    private String position;
    /**
     * <p>
     * Limit the number of <a>Authorizer</a> resources in the response.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizers</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>Authorizers</a> resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizers</a> resource.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier for the <a>Authorizers</a> resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Authorizers</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>Authorizers</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizersRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * If not all <a>Authorizer</a> resources in the response were present, the position will specify where to start the
     * next page of results.
     * </p>
     * 
     * @param position
     *        If not all <a>Authorizer</a> resources in the response were present, the position will specify where to
     *        start the next page of results.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * If not all <a>Authorizer</a> resources in the response were present, the position will specify where to start the
     * next page of results.
     * </p>
     * 
     * @return If not all <a>Authorizer</a> resources in the response were present, the position will specify where to
     *         start the next page of results.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * If not all <a>Authorizer</a> resources in the response were present, the position will specify where to start the
     * next page of results.
     * </p>
     * 
     * @param position
     *        If not all <a>Authorizer</a> resources in the response were present, the position will specify where to
     *        start the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizersRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * Limit the number of <a>Authorizer</a> resources in the response.
     * </p>
     * 
     * @param limit
     *        Limit the number of <a>Authorizer</a> resources in the response.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Limit the number of <a>Authorizer</a> resources in the response.
     * </p>
     * 
     * @return Limit the number of <a>Authorizer</a> resources in the response.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Limit the number of <a>Authorizer</a> resources in the response.
     * </p>
     * 
     * @param limit
     *        Limit the number of <a>Authorizer</a> resources in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizersRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizersRequest == false)
            return false;
        GetAuthorizersRequest other = (GetAuthorizersRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthorizersRequest clone() {
        return (GetAuthorizersRequest) super.clone();
    }
}
