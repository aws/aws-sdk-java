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

/**
 * <p>
 * Describes the IP addresses and network interface associated with a NAT gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NatGatewayAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NatGatewayAddress implements Serializable, Cloneable {

    /**
     * <p>
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The private IP address associated with the NAT gateway.
     * </p>
     */
    private String privateIp;
    /**
     * <p>
     * [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * [Public NAT gateway only] The association ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * Defines if the IP address is the primary address.
     * </p>
     */
    private Boolean isPrimary;
    /**
     * <p>
     * The address failure message.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The address status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @param allocationId
     *        [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT
     *        gateway.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @return [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT
     *         gateway.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @param allocationId
     *        [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT
     *        gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withAllocationId(String allocationId) {
        setAllocationId(allocationId);
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
     * <p>
     * The private IP address associated with the NAT gateway.
     * </p>
     * 
     * @param privateIp
     *        The private IP address associated with the NAT gateway.
     */

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * <p>
     * The private IP address associated with the NAT gateway.
     * </p>
     * 
     * @return The private IP address associated with the NAT gateway.
     */

    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * <p>
     * The private IP address associated with the NAT gateway.
     * </p>
     * 
     * @param privateIp
     *        The private IP address associated with the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withPrivateIp(String privateIp) {
        setPrivateIp(privateIp);
        return this;
    }

    /**
     * <p>
     * [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
     * </p>
     * 
     * @param publicIp
     *        [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
     * </p>
     * 
     * @return [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
     * </p>
     * 
     * @param publicIp
     *        [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * [Public NAT gateway only] The association ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @param associationId
     *        [Public NAT gateway only] The association ID of the Elastic IP address that's associated with the NAT
     *        gateway.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * [Public NAT gateway only] The association ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @return [Public NAT gateway only] The association ID of the Elastic IP address that's associated with the NAT
     *         gateway.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * [Public NAT gateway only] The association ID of the Elastic IP address that's associated with the NAT gateway.
     * </p>
     * 
     * @param associationId
     *        [Public NAT gateway only] The association ID of the Elastic IP address that's associated with the NAT
     *        gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * Defines if the IP address is the primary address.
     * </p>
     * 
     * @param isPrimary
     *        Defines if the IP address is the primary address.
     */

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * <p>
     * Defines if the IP address is the primary address.
     * </p>
     * 
     * @return Defines if the IP address is the primary address.
     */

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    /**
     * <p>
     * Defines if the IP address is the primary address.
     * </p>
     * 
     * @param isPrimary
     *        Defines if the IP address is the primary address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withIsPrimary(Boolean isPrimary) {
        setIsPrimary(isPrimary);
        return this;
    }

    /**
     * <p>
     * Defines if the IP address is the primary address.
     * </p>
     * 
     * @return Defines if the IP address is the primary address.
     */

    public Boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * <p>
     * The address failure message.
     * </p>
     * 
     * @param failureMessage
     *        The address failure message.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The address failure message.
     * </p>
     * 
     * @return The address failure message.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The address failure message.
     * </p>
     * 
     * @param failureMessage
     *        The address failure message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGatewayAddress withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The address status.
     * </p>
     * 
     * @param status
     *        The address status.
     * @see NatGatewayAddressStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The address status.
     * </p>
     * 
     * @return The address status.
     * @see NatGatewayAddressStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The address status.
     * </p>
     * 
     * @param status
     *        The address status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NatGatewayAddressStatus
     */

    public NatGatewayAddress withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The address status.
     * </p>
     * 
     * @param status
     *        The address status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NatGatewayAddressStatus
     */

    public NatGatewayAddress withStatus(NatGatewayAddressStatus status) {
        this.status = status.toString();
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
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getPrivateIp() != null)
            sb.append("PrivateIp: ").append(getPrivateIp()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getIsPrimary() != null)
            sb.append("IsPrimary: ").append(getIsPrimary()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null)
            return false;
        if (other.getPrivateIp() != null && other.getPrivateIp().equals(this.getPrivateIp()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getIsPrimary() == null ^ this.getIsPrimary() == null)
            return false;
        if (other.getIsPrimary() != null && other.getIsPrimary().equals(this.getIsPrimary()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIp() == null) ? 0 : getPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getIsPrimary() == null) ? 0 : getIsPrimary().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
