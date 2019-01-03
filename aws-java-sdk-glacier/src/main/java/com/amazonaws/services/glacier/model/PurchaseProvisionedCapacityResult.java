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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseProvisionedCapacityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that identifies the provisioned capacity unit.
     * </p>
     */
    private String capacityId;

    /**
     * <p>
     * The ID that identifies the provisioned capacity unit.
     * </p>
     * 
     * @param capacityId
     *        The ID that identifies the provisioned capacity unit.
     */

    public void setCapacityId(String capacityId) {
        this.capacityId = capacityId;
    }

    /**
     * <p>
     * The ID that identifies the provisioned capacity unit.
     * </p>
     * 
     * @return The ID that identifies the provisioned capacity unit.
     */

    public String getCapacityId() {
        return this.capacityId;
    }

    /**
     * <p>
     * The ID that identifies the provisioned capacity unit.
     * </p>
     * 
     * @param capacityId
     *        The ID that identifies the provisioned capacity unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseProvisionedCapacityResult withCapacityId(String capacityId) {
        setCapacityId(capacityId);
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
        if (getCapacityId() != null)
            sb.append("CapacityId: ").append(getCapacityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseProvisionedCapacityResult == false)
            return false;
        PurchaseProvisionedCapacityResult other = (PurchaseProvisionedCapacityResult) obj;
        if (other.getCapacityId() == null ^ this.getCapacityId() == null)
            return false;
        if (other.getCapacityId() != null && other.getCapacityId().equals(this.getCapacityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityId() == null) ? 0 : getCapacityId().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseProvisionedCapacityResult clone() {
        try {
            return (PurchaseProvisionedCapacityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
