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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the active domain environment.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>AvailabilityZoneInfo</code> for the domain.
     * </p>
     */
    private java.util.List<AvailabilityZoneInfo> availabilityZoneInformation;

    /**
     * <p>
     * A list of <code>AvailabilityZoneInfo</code> for the domain.
     * </p>
     * 
     * @return A list of <code>AvailabilityZoneInfo</code> for the domain.
     */

    public java.util.List<AvailabilityZoneInfo> getAvailabilityZoneInformation() {
        return availabilityZoneInformation;
    }

    /**
     * <p>
     * A list of <code>AvailabilityZoneInfo</code> for the domain.
     * </p>
     * 
     * @param availabilityZoneInformation
     *        A list of <code>AvailabilityZoneInfo</code> for the domain.
     */

    public void setAvailabilityZoneInformation(java.util.Collection<AvailabilityZoneInfo> availabilityZoneInformation) {
        if (availabilityZoneInformation == null) {
            this.availabilityZoneInformation = null;
            return;
        }

        this.availabilityZoneInformation = new java.util.ArrayList<AvailabilityZoneInfo>(availabilityZoneInformation);
    }

    /**
     * <p>
     * A list of <code>AvailabilityZoneInfo</code> for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZoneInformation(java.util.Collection)} or
     * {@link #withAvailabilityZoneInformation(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availabilityZoneInformation
     *        A list of <code>AvailabilityZoneInfo</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentInfo withAvailabilityZoneInformation(AvailabilityZoneInfo... availabilityZoneInformation) {
        if (this.availabilityZoneInformation == null) {
            setAvailabilityZoneInformation(new java.util.ArrayList<AvailabilityZoneInfo>(availabilityZoneInformation.length));
        }
        for (AvailabilityZoneInfo ele : availabilityZoneInformation) {
            this.availabilityZoneInformation.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>AvailabilityZoneInfo</code> for the domain.
     * </p>
     * 
     * @param availabilityZoneInformation
     *        A list of <code>AvailabilityZoneInfo</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentInfo withAvailabilityZoneInformation(java.util.Collection<AvailabilityZoneInfo> availabilityZoneInformation) {
        setAvailabilityZoneInformation(availabilityZoneInformation);
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
        if (getAvailabilityZoneInformation() != null)
            sb.append("AvailabilityZoneInformation: ").append(getAvailabilityZoneInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentInfo == false)
            return false;
        EnvironmentInfo other = (EnvironmentInfo) obj;
        if (other.getAvailabilityZoneInformation() == null ^ this.getAvailabilityZoneInformation() == null)
            return false;
        if (other.getAvailabilityZoneInformation() != null && other.getAvailabilityZoneInformation().equals(this.getAvailabilityZoneInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZoneInformation() == null) ? 0 : getAvailabilityZoneInformation().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentInfo clone() {
        try {
            return (EnvironmentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.EnvironmentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
