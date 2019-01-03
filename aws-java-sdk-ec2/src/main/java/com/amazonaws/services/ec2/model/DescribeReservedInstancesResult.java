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
 * Contains the output for DescribeReservedInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Reserved Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstances> reservedInstances;

    /**
     * <p>
     * A list of Reserved Instances.
     * </p>
     * 
     * @return A list of Reserved Instances.
     */

    public java.util.List<ReservedInstances> getReservedInstances() {
        if (reservedInstances == null) {
            reservedInstances = new com.amazonaws.internal.SdkInternalList<ReservedInstances>();
        }
        return reservedInstances;
    }

    /**
     * <p>
     * A list of Reserved Instances.
     * </p>
     * 
     * @param reservedInstances
     *        A list of Reserved Instances.
     */

    public void setReservedInstances(java.util.Collection<ReservedInstances> reservedInstances) {
        if (reservedInstances == null) {
            this.reservedInstances = null;
            return;
        }

        this.reservedInstances = new com.amazonaws.internal.SdkInternalList<ReservedInstances>(reservedInstances);
    }

    /**
     * <p>
     * A list of Reserved Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstances(java.util.Collection)} or {@link #withReservedInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param reservedInstances
     *        A list of Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesResult withReservedInstances(ReservedInstances... reservedInstances) {
        if (this.reservedInstances == null) {
            setReservedInstances(new com.amazonaws.internal.SdkInternalList<ReservedInstances>(reservedInstances.length));
        }
        for (ReservedInstances ele : reservedInstances) {
            this.reservedInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Reserved Instances.
     * </p>
     * 
     * @param reservedInstances
     *        A list of Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesResult withReservedInstances(java.util.Collection<ReservedInstances> reservedInstances) {
        setReservedInstances(reservedInstances);
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
        if (getReservedInstances() != null)
            sb.append("ReservedInstances: ").append(getReservedInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesResult == false)
            return false;
        DescribeReservedInstancesResult other = (DescribeReservedInstancesResult) obj;
        if (other.getReservedInstances() == null ^ this.getReservedInstances() == null)
            return false;
        if (other.getReservedInstances() != null && other.getReservedInstances().equals(this.getReservedInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstances() == null) ? 0 : getReservedInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesResult clone() {
        try {
            return (DescribeReservedInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
