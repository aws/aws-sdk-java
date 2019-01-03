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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmProductInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID of the instance owner. This is only present if the product code is attached to the instance.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     * requester and associated with the specified instance.
     * </p>
     */
    private Boolean returnValue;

    /**
     * <p>
     * The AWS account ID of the instance owner. This is only present if the product code is attached to the instance.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the instance owner. This is only present if the product code is attached to the
     *        instance.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the instance owner. This is only present if the product code is attached to the instance.
     * </p>
     * 
     * @return The AWS account ID of the instance owner. This is only present if the product code is attached to the
     *         instance.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the instance owner. This is only present if the product code is attached to the instance.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the instance owner. This is only present if the product code is attached to the
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmProductInstanceResult withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     * requester and associated with the specified instance.
     * </p>
     * 
     * @param returnValue
     *        The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     *        requester and associated with the specified instance.
     */

    public void setReturn(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     * requester and associated with the specified instance.
     * </p>
     * 
     * @return The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     *         requester and associated with the specified instance.
     */

    public Boolean getReturn() {
        return this.returnValue;
    }

    /**
     * <p>
     * The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     * requester and associated with the specified instance.
     * </p>
     * 
     * @param returnValue
     *        The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     *        requester and associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmProductInstanceResult withReturn(Boolean returnValue) {
        setReturn(returnValue);
        return this;
    }

    /**
     * <p>
     * The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     * requester and associated with the specified instance.
     * </p>
     * 
     * @return The return value of the request. Returns <code>true</code> if the specified product code is owned by the
     *         requester and associated with the specified instance.
     */

    public Boolean isReturn() {
        return this.returnValue;
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getReturn() != null)
            sb.append("Return: ").append(getReturn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmProductInstanceResult == false)
            return false;
        ConfirmProductInstanceResult other = (ConfirmProductInstanceResult) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getReturn() == null ^ this.getReturn() == null)
            return false;
        if (other.getReturn() != null && other.getReturn().equals(this.getReturn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getReturn() == null) ? 0 : getReturn().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmProductInstanceResult clone() {
        try {
            return (ConfirmProductInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
