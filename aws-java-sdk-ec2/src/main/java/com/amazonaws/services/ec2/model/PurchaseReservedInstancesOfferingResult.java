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
 * <p>
 * Contains the output of PurchaseReservedInstancesOffering.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedInstancesOfferingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The IDs of the purchased Reserved Instances.
     * </p>
     */
    private String reservedInstancesId;

    /**
     * <p>
     * The IDs of the purchased Reserved Instances.
     * </p>
     * 
     * @param reservedInstancesId
     *        The IDs of the purchased Reserved Instances.
     */

    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The IDs of the purchased Reserved Instances.
     * </p>
     * 
     * @return The IDs of the purchased Reserved Instances.
     */

    public String getReservedInstancesId() {
        return this.reservedInstancesId;
    }

    /**
     * <p>
     * The IDs of the purchased Reserved Instances.
     * </p>
     * 
     * @param reservedInstancesId
     *        The IDs of the purchased Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedInstancesOfferingResult withReservedInstancesId(String reservedInstancesId) {
        setReservedInstancesId(reservedInstancesId);
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
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: ").append(getReservedInstancesId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedInstancesOfferingResult == false)
            return false;
        PurchaseReservedInstancesOfferingResult other = (PurchaseReservedInstancesOfferingResult) obj;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedInstancesOfferingResult clone() {
        try {
            return (PurchaseReservedInstancesOfferingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
