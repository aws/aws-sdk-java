/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the capability summary details. A trading capability contains the information required to transform incoming
 * EDI documents into JSON or XML outputs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CapabilitySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapabilitySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     */
    private String capabilityId;
    /**
     * <p>
     * The display name of the capability.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the capability was modified.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Returns a system-assigned unique identifier for the capability.
     */

    public void setCapabilityId(String capabilityId) {
        this.capabilityId = capabilityId;
    }

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @return Returns a system-assigned unique identifier for the capability.
     */

    public String getCapabilityId() {
        return this.capabilityId;
    }

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Returns a system-assigned unique identifier for the capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapabilitySummary withCapabilityId(String capabilityId) {
        setCapabilityId(capabilityId);
        return this;
    }

    /**
     * <p>
     * The display name of the capability.
     * </p>
     * 
     * @param name
     *        The display name of the capability.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the capability.
     * </p>
     * 
     * @return The display name of the capability.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name of the capability.
     * </p>
     * 
     * @param name
     *        The display name of the capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapabilitySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @see CapabilityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @return Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @see CapabilityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityType
     */

    public CapabilitySummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityType
     */

    public CapabilitySummary withType(CapabilityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the capability.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     * 
     * @return Returns a timestamp for creation date and time of the capability.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapabilitySummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the capability was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp that identifies the most recent date and time that the capability was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the capability was modified.
     * </p>
     * 
     * @return Returns a timestamp that identifies the most recent date and time that the capability was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the capability was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp that identifies the most recent date and time that the capability was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapabilitySummary withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getCapabilityId() != null)
            sb.append("CapabilityId: ").append(getCapabilityId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapabilitySummary == false)
            return false;
        CapabilitySummary other = (CapabilitySummary) obj;
        if (other.getCapabilityId() == null ^ this.getCapabilityId() == null)
            return false;
        if (other.getCapabilityId() != null && other.getCapabilityId().equals(this.getCapabilityId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilityId() == null) ? 0 : getCapabilityId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public CapabilitySummary clone() {
        try {
            return (CapabilitySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.b2bi.model.transform.CapabilitySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
