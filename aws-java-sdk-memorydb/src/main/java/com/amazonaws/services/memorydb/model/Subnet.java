/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the subnet associated with a cluster. This parameter refers to subnets defined in Amazon Virtual Private
 * Cloud (Amazon VPC) and used with MemoryDB.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/Subnet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subnet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The Availability Zone where the subnet resides
     * </p>
     */
    private AvailabilityZone availabilityZone;

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @param identifier
     *        The unique identifier for the subnet.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @return The unique identifier for the subnet.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @param identifier
     *        The unique identifier for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the subnet resides
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the subnet resides
     */

    public void setAvailabilityZone(AvailabilityZone availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the subnet resides
     * </p>
     * 
     * @return The Availability Zone where the subnet resides
     */

    public AvailabilityZone getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the subnet resides
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the subnet resides
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withAvailabilityZone(AvailabilityZone availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subnet == false)
            return false;
        Subnet other = (Subnet) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public Subnet clone() {
        try {
            return (Subnet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.SubnetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
