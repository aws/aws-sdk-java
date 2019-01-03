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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the request to create a hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetReusableDelegationSetLimit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReusableDelegationSetLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that you can
     * associate with the specified reusable delegation set.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     */
    private String delegationSetId;

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that you can
     * associate with the specified reusable delegation set.
     * </p>
     * 
     * @param type
     *        Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that
     *        you can associate with the specified reusable delegation set.
     * @see ReusableDelegationSetLimitType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that you can
     * associate with the specified reusable delegation set.
     * </p>
     * 
     * @return Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that
     *         you can associate with the specified reusable delegation set.
     * @see ReusableDelegationSetLimitType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that you can
     * associate with the specified reusable delegation set.
     * </p>
     * 
     * @param type
     *        Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that
     *        you can associate with the specified reusable delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReusableDelegationSetLimitType
     */

    public GetReusableDelegationSetLimitRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that you can
     * associate with the specified reusable delegation set.
     * </p>
     * 
     * @param type
     *        Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the maximum number of hosted zones that
     *        you can associate with the specified reusable delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReusableDelegationSetLimitType
     */

    public GetReusableDelegationSetLimitRequest withType(ReusableDelegationSetLimitType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     * 
     * @param delegationSetId
     *        The ID of the delegation set that you want to get the limit for.
     */

    public void setDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
    }

    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     * 
     * @return The ID of the delegation set that you want to get the limit for.
     */

    public String getDelegationSetId() {
        return this.delegationSetId;
    }

    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     * 
     * @param delegationSetId
     *        The ID of the delegation set that you want to get the limit for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReusableDelegationSetLimitRequest withDelegationSetId(String delegationSetId) {
        setDelegationSetId(delegationSetId);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDelegationSetId() != null)
            sb.append("DelegationSetId: ").append(getDelegationSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReusableDelegationSetLimitRequest == false)
            return false;
        GetReusableDelegationSetLimitRequest other = (GetReusableDelegationSetLimitRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDelegationSetId() == null ^ this.getDelegationSetId() == null)
            return false;
        if (other.getDelegationSetId() != null && other.getDelegationSetId().equals(this.getDelegationSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDelegationSetId() == null) ? 0 : getDelegationSetId().hashCode());
        return hashCode;
    }

    @Override
    public GetReusableDelegationSetLimitRequest clone() {
        return (GetReusableDelegationSetLimitRequest) super.clone();
    }

}
