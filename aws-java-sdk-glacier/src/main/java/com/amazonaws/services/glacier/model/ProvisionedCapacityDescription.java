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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition for a provisioned capacity unit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedCapacityDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that identifies the provisioned capacity unit.
     * </p>
     */
    private String capacityId;
    /**
     * <p>
     * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String expirationDate;

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

    public ProvisionedCapacityDescription withCapacityId(String capacityId) {
        setCapacityId(capacityId);
        return this;
    }

    /**
     * <p>
     * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param startDate
     *        The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param startDate
     *        The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedCapacityDescription withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param expirationDate
     *        The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
     */

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
     */

    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param expirationDate
     *        The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedCapacityDescription withExpirationDate(String expirationDate) {
        setExpirationDate(expirationDate);
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
            sb.append("CapacityId: ").append(getCapacityId()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedCapacityDescription == false)
            return false;
        ProvisionedCapacityDescription other = (ProvisionedCapacityDescription) obj;
        if (other.getCapacityId() == null ^ this.getCapacityId() == null)
            return false;
        if (other.getCapacityId() != null && other.getCapacityId().equals(this.getCapacityId()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityId() == null) ? 0 : getCapacityId().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedCapacityDescription clone() {
        try {
            return (ProvisionedCapacityDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.ProvisionedCapacityDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
