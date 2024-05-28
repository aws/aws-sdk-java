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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignPrivateNatGatewayAddressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * NAT gateway IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NatGatewayAddress> natGatewayAddresses;

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @return The ID of the NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateNatGatewayAddressResult withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * NAT gateway IP addresses.
     * </p>
     * 
     * @return NAT gateway IP addresses.
     */

    public java.util.List<NatGatewayAddress> getNatGatewayAddresses() {
        if (natGatewayAddresses == null) {
            natGatewayAddresses = new com.amazonaws.internal.SdkInternalList<NatGatewayAddress>();
        }
        return natGatewayAddresses;
    }

    /**
     * <p>
     * NAT gateway IP addresses.
     * </p>
     * 
     * @param natGatewayAddresses
     *        NAT gateway IP addresses.
     */

    public void setNatGatewayAddresses(java.util.Collection<NatGatewayAddress> natGatewayAddresses) {
        if (natGatewayAddresses == null) {
            this.natGatewayAddresses = null;
            return;
        }

        this.natGatewayAddresses = new com.amazonaws.internal.SdkInternalList<NatGatewayAddress>(natGatewayAddresses);
    }

    /**
     * <p>
     * NAT gateway IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNatGatewayAddresses(java.util.Collection)} or {@link #withNatGatewayAddresses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param natGatewayAddresses
     *        NAT gateway IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateNatGatewayAddressResult withNatGatewayAddresses(NatGatewayAddress... natGatewayAddresses) {
        if (this.natGatewayAddresses == null) {
            setNatGatewayAddresses(new com.amazonaws.internal.SdkInternalList<NatGatewayAddress>(natGatewayAddresses.length));
        }
        for (NatGatewayAddress ele : natGatewayAddresses) {
            this.natGatewayAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * NAT gateway IP addresses.
     * </p>
     * 
     * @param natGatewayAddresses
     *        NAT gateway IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateNatGatewayAddressResult withNatGatewayAddresses(java.util.Collection<NatGatewayAddress> natGatewayAddresses) {
        setNatGatewayAddresses(natGatewayAddresses);
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
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getNatGatewayAddresses() != null)
            sb.append("NatGatewayAddresses: ").append(getNatGatewayAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignPrivateNatGatewayAddressResult == false)
            return false;
        AssignPrivateNatGatewayAddressResult other = (AssignPrivateNatGatewayAddressResult) obj;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getNatGatewayAddresses() == null ^ this.getNatGatewayAddresses() == null)
            return false;
        if (other.getNatGatewayAddresses() != null && other.getNatGatewayAddresses().equals(this.getNatGatewayAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getNatGatewayAddresses() == null) ? 0 : getNatGatewayAddresses().hashCode());
        return hashCode;
    }

    @Override
    public AssignPrivateNatGatewayAddressResult clone() {
        try {
            return (AssignPrivateNatGatewayAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
