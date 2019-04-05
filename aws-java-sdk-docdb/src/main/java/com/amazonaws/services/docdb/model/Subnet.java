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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed information about a subnet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/Subnet" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subnet implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the identifier of the subnet.
     * </p>
     */
    private String subnetIdentifier;
    /**
     * <p>
     * Specifies the Availability Zone for the subnet.
     * </p>
     */
    private AvailabilityZone subnetAvailabilityZone;
    /**
     * <p>
     * Specifies the status of the subnet.
     * </p>
     */
    private String subnetStatus;

    /**
     * <p>
     * Specifies the identifier of the subnet.
     * </p>
     * 
     * @param subnetIdentifier
     *        Specifies the identifier of the subnet.
     */

    public void setSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier of the subnet.
     * </p>
     * 
     * @return Specifies the identifier of the subnet.
     */

    public String getSubnetIdentifier() {
        return this.subnetIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier of the subnet.
     * </p>
     * 
     * @param subnetIdentifier
     *        Specifies the identifier of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetIdentifier(String subnetIdentifier) {
        setSubnetIdentifier(subnetIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the Availability Zone for the subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        Specifies the Availability Zone for the subnet.
     */

    public void setSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * Specifies the Availability Zone for the subnet.
     * </p>
     * 
     * @return Specifies the Availability Zone for the subnet.
     */

    public AvailabilityZone getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * Specifies the Availability Zone for the subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        Specifies the Availability Zone for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the subnet.
     * </p>
     * 
     * @param subnetStatus
     *        Specifies the status of the subnet.
     */

    public void setSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
    }

    /**
     * <p>
     * Specifies the status of the subnet.
     * </p>
     * 
     * @return Specifies the status of the subnet.
     */

    public String getSubnetStatus() {
        return this.subnetStatus;
    }

    /**
     * <p>
     * Specifies the status of the subnet.
     * </p>
     * 
     * @param subnetStatus
     *        Specifies the status of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withSubnetStatus(String subnetStatus) {
        setSubnetStatus(subnetStatus);
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
            sb.append("SubnetAvailabilityZone: ").append(getSubnetAvailabilityZone()).append(",");
        if (getSubnetStatus() != null)
            sb.append("SubnetStatus: ").append(getSubnetStatus());
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
        if (other.getSubnetStatus() == null ^ this.getSubnetStatus() == null)
            return false;
        if (other.getSubnetStatus() != null && other.getSubnetStatus().equals(this.getSubnetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIdentifier() == null) ? 0 : getSubnetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSubnetStatus() == null) ? 0 : getSubnetStatus().hashCode());
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

}
