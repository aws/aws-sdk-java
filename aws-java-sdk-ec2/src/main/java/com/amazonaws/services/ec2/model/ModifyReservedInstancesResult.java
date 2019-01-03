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
 * Contains the output of ModifyReservedInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReservedInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the modification.
     * </p>
     */
    private String reservedInstancesModificationId;

    /**
     * <p>
     * The ID for the modification.
     * </p>
     * 
     * @param reservedInstancesModificationId
     *        The ID for the modification.
     */

    public void setReservedInstancesModificationId(String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
    }

    /**
     * <p>
     * The ID for the modification.
     * </p>
     * 
     * @return The ID for the modification.
     */

    public String getReservedInstancesModificationId() {
        return this.reservedInstancesModificationId;
    }

    /**
     * <p>
     * The ID for the modification.
     * </p>
     * 
     * @param reservedInstancesModificationId
     *        The ID for the modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReservedInstancesResult withReservedInstancesModificationId(String reservedInstancesModificationId) {
        setReservedInstancesModificationId(reservedInstancesModificationId);
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
        if (getReservedInstancesModificationId() != null)
            sb.append("ReservedInstancesModificationId: ").append(getReservedInstancesModificationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReservedInstancesResult == false)
            return false;
        ModifyReservedInstancesResult other = (ModifyReservedInstancesResult) obj;
        if (other.getReservedInstancesModificationId() == null ^ this.getReservedInstancesModificationId() == null)
            return false;
        if (other.getReservedInstancesModificationId() != null
                && other.getReservedInstancesModificationId().equals(this.getReservedInstancesModificationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstancesModificationId() == null) ? 0 : getReservedInstancesModificationId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReservedInstancesResult clone() {
        try {
            return (ModifyReservedInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
