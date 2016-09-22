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
 * The GET request to get all the usage plans of the caller's account.
 * </p>
 */
public class GetUsagePlansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The zero-based array index specifying the position of the to-be-retrieved <a>UsagePlan</a> resource.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The identifier of the API key associated with the usage plans.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The number of <a>UsagePlan</a> resources to be returned as the result.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The zero-based array index specifying the position of the to-be-retrieved <a>UsagePlan</a> resource.
     * </p>
     * 
     * @param position
     *        The zero-based array index specifying the position of the to-be-retrieved <a>UsagePlan</a> resource.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The zero-based array index specifying the position of the to-be-retrieved <a>UsagePlan</a> resource.
     * </p>
     * 
     * @return The zero-based array index specifying the position of the to-be-retrieved <a>UsagePlan</a> resource.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The zero-based array index specifying the position of the to-be-retrieved <a>UsagePlan</a> resource.
     * </p>
     * 
     * @param position
     *        The zero-based array index specifying the position of the to-be-retrieved <a>UsagePlan</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlansRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The identifier of the API key associated with the usage plans.
     * </p>
     * 
     * @param keyId
     *        The identifier of the API key associated with the usage plans.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the API key associated with the usage plans.
     * </p>
     * 
     * @return The identifier of the API key associated with the usage plans.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the API key associated with the usage plans.
     * </p>
     * 
     * @param keyId
     *        The identifier of the API key associated with the usage plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlansRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The number of <a>UsagePlan</a> resources to be returned as the result.
     * </p>
     * 
     * @param limit
     *        The number of <a>UsagePlan</a> resources to be returned as the result.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The number of <a>UsagePlan</a> resources to be returned as the result.
     * </p>
     * 
     * @return The number of <a>UsagePlan</a> resources to be returned as the result.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The number of <a>UsagePlan</a> resources to be returned as the result.
     * </p>
     * 
     * @param limit
     *        The number of <a>UsagePlan</a> resources to be returned as the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlansRequest withLimit(Integer limit) {
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
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
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

        if (obj instanceof GetUsagePlansRequest == false)
            return false;
        GetUsagePlansRequest other = (GetUsagePlansRequest) obj;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
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

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetUsagePlansRequest clone() {
        return (GetUsagePlansRequest) super.clone();
    }
}
