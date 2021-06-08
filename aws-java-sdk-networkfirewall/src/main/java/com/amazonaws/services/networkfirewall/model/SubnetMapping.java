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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ID for a subnet that you want to associate with the firewall. This is used with <a>CreateFirewall</a> and
 * <a>AssociateSubnets</a>. AWS Network Firewall creates an instance of the associated firewall in each subnet that you
 * specify, to filter traffic in the subnet's Availability Zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/SubnetMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @param subnetId
     *        The unique identifier for the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @return The unique identifier for the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The unique identifier for the subnet.
     * </p>
     * 
     * @param subnetId
     *        The unique identifier for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetMapping withSubnetId(String subnetId) {
        setSubnetId(subnetId);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubnetMapping == false)
            return false;
        SubnetMapping other = (SubnetMapping) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public SubnetMapping clone() {
        try {
            return (SubnetMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.SubnetMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
