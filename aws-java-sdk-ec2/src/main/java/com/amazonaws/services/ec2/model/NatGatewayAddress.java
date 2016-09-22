/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the IP addresses and network interface associated with a NAT gateway.
 * </p>
 */
public class NatGatewayAddress implements Serializable, Cloneable {

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     */
    private String privateIp;
    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address associated with the NAT gateway.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     * 
     * @return The Elastic IP address associated with the NAT gateway.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address associated with the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @return The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIp
     *        The private IP address associated with the Elastic IP address.
     */

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @return The private IP address associated with the Elastic IP address.
     */

    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIp
     *        The private IP address associated with the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withPrivateIp(String privateIp) {
        setPrivateIp(privateIp);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface associated with the NAT gateway.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     * 
     * @return The ID of the network interface associated with the NAT gateway.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface associated with the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getPrivateIp() != null)
            sb.append("PrivateIp: " + getPrivateIp() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NatGatewayAddress == false)
            return false;
        NatGatewayAddress other = (NatGatewayAddress) obj;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null)
            return false;
        if (other.getPrivateIp() != null && other.getPrivateIp().equals(this.getPrivateIp()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIp() == null) ? 0 : getPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public NatGatewayAddress clone() {
        try {
            return (NatGatewayAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
