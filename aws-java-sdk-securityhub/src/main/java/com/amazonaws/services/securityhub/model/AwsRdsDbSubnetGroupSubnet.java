/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a subnet in a subnet group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbSubnetGroupSubnet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSubnetGroupSubnet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a subnet in the subnet group.
     * </p>
     */
    private String subnetIdentifier;
    /**
     * <p>
     * Information about the Availability Zone for a subnet in the subnet group.
     * </p>
     */
    private AwsRdsDbSubnetGroupSubnetAvailabilityZone subnetAvailabilityZone;
    /**
     * <p>
     * The status of a subnet in the subnet group.
     * </p>
     */
    private String subnetStatus;

    /**
     * <p>
     * The identifier of a subnet in the subnet group.
     * </p>
     * 
     * @param subnetIdentifier
     *        The identifier of a subnet in the subnet group.
     */

    public void setSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
    }

    /**
     * <p>
     * The identifier of a subnet in the subnet group.
     * </p>
     * 
     * @return The identifier of a subnet in the subnet group.
     */

    public String getSubnetIdentifier() {
        return this.subnetIdentifier;
    }

    /**
     * <p>
     * The identifier of a subnet in the subnet group.
     * </p>
     * 
     * @param subnetIdentifier
     *        The identifier of a subnet in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroupSubnet withSubnetIdentifier(String subnetIdentifier) {
        setSubnetIdentifier(subnetIdentifier);
        return this;
    }

    /**
     * <p>
     * Information about the Availability Zone for a subnet in the subnet group.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        Information about the Availability Zone for a subnet in the subnet group.
     */

    public void setSubnetAvailabilityZone(AwsRdsDbSubnetGroupSubnetAvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * Information about the Availability Zone for a subnet in the subnet group.
     * </p>
     * 
     * @return Information about the Availability Zone for a subnet in the subnet group.
     */

    public AwsRdsDbSubnetGroupSubnetAvailabilityZone getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * Information about the Availability Zone for a subnet in the subnet group.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        Information about the Availability Zone for a subnet in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroupSubnet withSubnetAvailabilityZone(AwsRdsDbSubnetGroupSubnetAvailabilityZone subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The status of a subnet in the subnet group.
     * </p>
     * 
     * @param subnetStatus
     *        The status of a subnet in the subnet group.
     */

    public void setSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
    }

    /**
     * <p>
     * The status of a subnet in the subnet group.
     * </p>
     * 
     * @return The status of a subnet in the subnet group.
     */

    public String getSubnetStatus() {
        return this.subnetStatus;
    }

    /**
     * <p>
     * The status of a subnet in the subnet group.
     * </p>
     * 
     * @param subnetStatus
     *        The status of a subnet in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroupSubnet withSubnetStatus(String subnetStatus) {
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

        if (obj instanceof AwsRdsDbSubnetGroupSubnet == false)
            return false;
        AwsRdsDbSubnetGroupSubnet other = (AwsRdsDbSubnetGroupSubnet) obj;
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
    public AwsRdsDbSubnetGroupSubnet clone() {
        try {
            return (AwsRdsDbSubnetGroupSubnet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbSubnetGroupSubnetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
