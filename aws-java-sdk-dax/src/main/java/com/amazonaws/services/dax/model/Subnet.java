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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the subnet associated with a DAX cluster. This parameter refers to subnets defined in Amazon Virtual
 * Private Cloud (Amazon VPC) and used with DAX.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/Subnet" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subnet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-assigned identifier for the subnet.
     * </p>
     */
    private String subnetIdentifier;
    /**
     * <p>
     * The Availability Zone (AZ) for subnet subnet.
     * </p>
     */
    private String subnetAvailabilityZone;

    /**
     * <p>
     * The system-assigned identifier for the subnet.
     * </p>
     * 
     * @param subnetIdentifier
     *        The system-assigned identifier for the subnet.
     */

    public void setSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
    }

    /**
     * <p>
     * The system-assigned identifier for the subnet.
     * </p>
     * 
     * @return The system-assigned identifier for the subnet.
     */

    public String getSubnetIdentifier() {
        return this.subnetIdentifier;
    }

    /**
     * <p>
     * The system-assigned identifier for the subnet.
     * </p>
     * 
     * @param subnetIdentifier
     *        The system-assigned identifier for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetIdentifier(String subnetIdentifier) {
        setSubnetIdentifier(subnetIdentifier);
        return this;
    }

    /**
     * <p>
     * The Availability Zone (AZ) for subnet subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone (AZ) for subnet subnet.
     */

    public void setSubnetAvailabilityZone(String subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) for subnet subnet.
     * </p>
     * 
     * @return The Availability Zone (AZ) for subnet subnet.
     */

    public String getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) for subnet subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone (AZ) for subnet subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetAvailabilityZone(String subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
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
        if (getSubnetIdentifier() != null)
            sb.append("SubnetIdentifier: ").append(getSubnetIdentifier()).append(",");
        if (getSubnetAvailabilityZone() != null)
            sb.append("SubnetAvailabilityZone: ").append(getSubnetAvailabilityZone());
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
        if (other.getSubnetIdentifier() == null ^ this.getSubnetIdentifier() == null)
            return false;
        if (other.getSubnetIdentifier() != null && other.getSubnetIdentifier().equals(this.getSubnetIdentifier()) == false)
            return false;
        if (other.getSubnetAvailabilityZone() == null ^ this.getSubnetAvailabilityZone() == null)
            return false;
        if (other.getSubnetAvailabilityZone() != null && other.getSubnetAvailabilityZone().equals(this.getSubnetAvailabilityZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIdentifier() == null) ? 0 : getSubnetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode());
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
        com.amazonaws.services.dax.model.transform.SubnetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
