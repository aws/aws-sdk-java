/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a NAT gateway.
 * </p>
 */
public class NatGateway implements Serializable, Cloneable {

    /**
     * The ID of the VPC in which the NAT gateway is located.
     */
    private String vpcId;

    /**
     * The ID of the subnet in which the NAT gateway is located.
     */
    private String subnetId;

    /**
     * The ID of the NAT gateway.
     */
    private String natGatewayId;

    /**
     * The date and time the NAT gateway was created.
     */
    private java.util.Date createTime;

    /**
     * The date and time the NAT gateway was deleted, if applicable.
     */
    private java.util.Date deleteTime;

    /**
     * Information about the IP addresses and network interface associated
     * with the NAT gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NatGatewayAddress> natGatewayAddresses;

    /**
     * The state of the NAT gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, failed, available, deleting, deleted
     */
    private String state;

    /**
     * If the NAT gateway could not be created, specifies the error code for
     * the failure. (<code>InsufficientFreeAddressesInSubnet</code> |
     * <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> |
     * <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>)
     */
    private String failureCode;

    /**
     * If the NAT gateway could not be created, specifies the error message
     * for the failure, that corresponds to the error code. <ul> <li>For
     * InsufficientFreeAddressesInSubnet: <code>Subnet has insufficient free
     * addresses to create this NAT gateway</code></li> <li>For
     * Gateway.NotAttached: <code>Network vpc-xxxxxxxx has no Internet
     * gateway attached</code></li> <li>For InvalidAllocationID.NotFound:
     * <code>Elastic IP address eipalloc-xxxxxxxx could not be associated
     * with this NAT gateway</code></li> <li>For Resource.AlreadyAssociated:
     * <code>Elastic IP address eipalloc-xxxxxxxx is already
     * associated</code></li> <li>For InternalError: <code>Network interface
     * eni-xxxxxxxx, created and used internally by this NAT gateway is in an
     * invalid state. Please try again.</code></li> </ul>
     */
    private String failureMessage;

    /**
     * The ID of the VPC in which the NAT gateway is located.
     *
     * @return The ID of the VPC in which the NAT gateway is located.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC in which the NAT gateway is located.
     *
     * @param vpcId The ID of the VPC in which the NAT gateway is located.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC in which the NAT gateway is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC in which the NAT gateway is located.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The ID of the subnet in which the NAT gateway is located.
     *
     * @return The ID of the subnet in which the NAT gateway is located.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet in which the NAT gateway is located.
     *
     * @param subnetId The ID of the subnet in which the NAT gateway is located.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet in which the NAT gateway is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet in which the NAT gateway is located.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the NAT gateway.
     *
     * @return The ID of the NAT gateway.
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }
    
    /**
     * The ID of the NAT gateway.
     *
     * @param natGatewayId The ID of the NAT gateway.
     */
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }
    
    /**
     * The ID of the NAT gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGatewayId The ID of the NAT gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * The date and time the NAT gateway was created.
     *
     * @return The date and time the NAT gateway was created.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * The date and time the NAT gateway was created.
     *
     * @param createTime The date and time the NAT gateway was created.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * The date and time the NAT gateway was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The date and time the NAT gateway was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * The date and time the NAT gateway was deleted, if applicable.
     *
     * @return The date and time the NAT gateway was deleted, if applicable.
     */
    public java.util.Date getDeleteTime() {
        return deleteTime;
    }
    
    /**
     * The date and time the NAT gateway was deleted, if applicable.
     *
     * @param deleteTime The date and time the NAT gateway was deleted, if applicable.
     */
    public void setDeleteTime(java.util.Date deleteTime) {
        this.deleteTime = deleteTime;
    }
    
    /**
     * The date and time the NAT gateway was deleted, if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteTime The date and time the NAT gateway was deleted, if applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withDeleteTime(java.util.Date deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * Information about the IP addresses and network interface associated
     * with the NAT gateway.
     *
     * @return Information about the IP addresses and network interface associated
     *         with the NAT gateway.
     */
    public java.util.List<NatGatewayAddress> getNatGatewayAddresses() {
        if (natGatewayAddresses == null) {
              natGatewayAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<NatGatewayAddress>();
              natGatewayAddresses.setAutoConstruct(true);
        }
        return natGatewayAddresses;
    }
    
    /**
     * Information about the IP addresses and network interface associated
     * with the NAT gateway.
     *
     * @param natGatewayAddresses Information about the IP addresses and network interface associated
     *         with the NAT gateway.
     */
    public void setNatGatewayAddresses(java.util.Collection<NatGatewayAddress> natGatewayAddresses) {
        if (natGatewayAddresses == null) {
            this.natGatewayAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NatGatewayAddress> natGatewayAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NatGatewayAddress>(natGatewayAddresses.size());
        natGatewayAddressesCopy.addAll(natGatewayAddresses);
        this.natGatewayAddresses = natGatewayAddressesCopy;
    }
    
    /**
     * Information about the IP addresses and network interface associated
     * with the NAT gateway.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNatGatewayAddresses(java.util.Collection)} or
     * {@link #withNatGatewayAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGatewayAddresses Information about the IP addresses and network interface associated
     *         with the NAT gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withNatGatewayAddresses(NatGatewayAddress... natGatewayAddresses) {
        if (getNatGatewayAddresses() == null) setNatGatewayAddresses(new java.util.ArrayList<NatGatewayAddress>(natGatewayAddresses.length));
        for (NatGatewayAddress value : natGatewayAddresses) {
            getNatGatewayAddresses().add(value);
        }
        return this;
    }
    
    /**
     * Information about the IP addresses and network interface associated
     * with the NAT gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGatewayAddresses Information about the IP addresses and network interface associated
     *         with the NAT gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withNatGatewayAddresses(java.util.Collection<NatGatewayAddress> natGatewayAddresses) {
        if (natGatewayAddresses == null) {
            this.natGatewayAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NatGatewayAddress> natGatewayAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NatGatewayAddress>(natGatewayAddresses.size());
            natGatewayAddressesCopy.addAll(natGatewayAddresses);
            this.natGatewayAddresses = natGatewayAddressesCopy;
        }

        return this;
    }

    /**
     * The state of the NAT gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, failed, available, deleting, deleted
     *
     * @return The state of the NAT gateway.
     *
     * @see NatGatewayState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the NAT gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, failed, available, deleting, deleted
     *
     * @param state The state of the NAT gateway.
     *
     * @see NatGatewayState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the NAT gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, failed, available, deleting, deleted
     *
     * @param state The state of the NAT gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see NatGatewayState
     */
    public NatGateway withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the NAT gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, failed, available, deleting, deleted
     *
     * @param state The state of the NAT gateway.
     *
     * @see NatGatewayState
     */
    public void setState(NatGatewayState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the NAT gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, failed, available, deleting, deleted
     *
     * @param state The state of the NAT gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see NatGatewayState
     */
    public NatGateway withState(NatGatewayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * If the NAT gateway could not be created, specifies the error code for
     * the failure. (<code>InsufficientFreeAddressesInSubnet</code> |
     * <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> |
     * <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>)
     *
     * @return If the NAT gateway could not be created, specifies the error code for
     *         the failure. (<code>InsufficientFreeAddressesInSubnet</code> |
     *         <code>Gateway.NotAttached</code> |
     *         <code>InvalidAllocationID.NotFound</code> |
     *         <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>)
     */
    public String getFailureCode() {
        return failureCode;
    }
    
    /**
     * If the NAT gateway could not be created, specifies the error code for
     * the failure. (<code>InsufficientFreeAddressesInSubnet</code> |
     * <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> |
     * <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>)
     *
     * @param failureCode If the NAT gateway could not be created, specifies the error code for
     *         the failure. (<code>InsufficientFreeAddressesInSubnet</code> |
     *         <code>Gateway.NotAttached</code> |
     *         <code>InvalidAllocationID.NotFound</code> |
     *         <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>)
     */
    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }
    
    /**
     * If the NAT gateway could not be created, specifies the error code for
     * the failure. (<code>InsufficientFreeAddressesInSubnet</code> |
     * <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> |
     * <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureCode If the NAT gateway could not be created, specifies the error code for
     *         the failure. (<code>InsufficientFreeAddressesInSubnet</code> |
     *         <code>Gateway.NotAttached</code> |
     *         <code>InvalidAllocationID.NotFound</code> |
     *         <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withFailureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }

    /**
     * If the NAT gateway could not be created, specifies the error message
     * for the failure, that corresponds to the error code. <ul> <li>For
     * InsufficientFreeAddressesInSubnet: <code>Subnet has insufficient free
     * addresses to create this NAT gateway</code></li> <li>For
     * Gateway.NotAttached: <code>Network vpc-xxxxxxxx has no Internet
     * gateway attached</code></li> <li>For InvalidAllocationID.NotFound:
     * <code>Elastic IP address eipalloc-xxxxxxxx could not be associated
     * with this NAT gateway</code></li> <li>For Resource.AlreadyAssociated:
     * <code>Elastic IP address eipalloc-xxxxxxxx is already
     * associated</code></li> <li>For InternalError: <code>Network interface
     * eni-xxxxxxxx, created and used internally by this NAT gateway is in an
     * invalid state. Please try again.</code></li> </ul>
     *
     * @return If the NAT gateway could not be created, specifies the error message
     *         for the failure, that corresponds to the error code. <ul> <li>For
     *         InsufficientFreeAddressesInSubnet: <code>Subnet has insufficient free
     *         addresses to create this NAT gateway</code></li> <li>For
     *         Gateway.NotAttached: <code>Network vpc-xxxxxxxx has no Internet
     *         gateway attached</code></li> <li>For InvalidAllocationID.NotFound:
     *         <code>Elastic IP address eipalloc-xxxxxxxx could not be associated
     *         with this NAT gateway</code></li> <li>For Resource.AlreadyAssociated:
     *         <code>Elastic IP address eipalloc-xxxxxxxx is already
     *         associated</code></li> <li>For InternalError: <code>Network interface
     *         eni-xxxxxxxx, created and used internally by this NAT gateway is in an
     *         invalid state. Please try again.</code></li> </ul>
     */
    public String getFailureMessage() {
        return failureMessage;
    }
    
    /**
     * If the NAT gateway could not be created, specifies the error message
     * for the failure, that corresponds to the error code. <ul> <li>For
     * InsufficientFreeAddressesInSubnet: <code>Subnet has insufficient free
     * addresses to create this NAT gateway</code></li> <li>For
     * Gateway.NotAttached: <code>Network vpc-xxxxxxxx has no Internet
     * gateway attached</code></li> <li>For InvalidAllocationID.NotFound:
     * <code>Elastic IP address eipalloc-xxxxxxxx could not be associated
     * with this NAT gateway</code></li> <li>For Resource.AlreadyAssociated:
     * <code>Elastic IP address eipalloc-xxxxxxxx is already
     * associated</code></li> <li>For InternalError: <code>Network interface
     * eni-xxxxxxxx, created and used internally by this NAT gateway is in an
     * invalid state. Please try again.</code></li> </ul>
     *
     * @param failureMessage If the NAT gateway could not be created, specifies the error message
     *         for the failure, that corresponds to the error code. <ul> <li>For
     *         InsufficientFreeAddressesInSubnet: <code>Subnet has insufficient free
     *         addresses to create this NAT gateway</code></li> <li>For
     *         Gateway.NotAttached: <code>Network vpc-xxxxxxxx has no Internet
     *         gateway attached</code></li> <li>For InvalidAllocationID.NotFound:
     *         <code>Elastic IP address eipalloc-xxxxxxxx could not be associated
     *         with this NAT gateway</code></li> <li>For Resource.AlreadyAssociated:
     *         <code>Elastic IP address eipalloc-xxxxxxxx is already
     *         associated</code></li> <li>For InternalError: <code>Network interface
     *         eni-xxxxxxxx, created and used internally by this NAT gateway is in an
     *         invalid state. Please try again.</code></li> </ul>
     */
    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
    
    /**
     * If the NAT gateway could not be created, specifies the error message
     * for the failure, that corresponds to the error code. <ul> <li>For
     * InsufficientFreeAddressesInSubnet: <code>Subnet has insufficient free
     * addresses to create this NAT gateway</code></li> <li>For
     * Gateway.NotAttached: <code>Network vpc-xxxxxxxx has no Internet
     * gateway attached</code></li> <li>For InvalidAllocationID.NotFound:
     * <code>Elastic IP address eipalloc-xxxxxxxx could not be associated
     * with this NAT gateway</code></li> <li>For Resource.AlreadyAssociated:
     * <code>Elastic IP address eipalloc-xxxxxxxx is already
     * associated</code></li> <li>For InternalError: <code>Network interface
     * eni-xxxxxxxx, created and used internally by this NAT gateway is in an
     * invalid state. Please try again.</code></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureMessage If the NAT gateway could not be created, specifies the error message
     *         for the failure, that corresponds to the error code. <ul> <li>For
     *         InsufficientFreeAddressesInSubnet: <code>Subnet has insufficient free
     *         addresses to create this NAT gateway</code></li> <li>For
     *         Gateway.NotAttached: <code>Network vpc-xxxxxxxx has no Internet
     *         gateway attached</code></li> <li>For InvalidAllocationID.NotFound:
     *         <code>Elastic IP address eipalloc-xxxxxxxx could not be associated
     *         with this NAT gateway</code></li> <li>For Resource.AlreadyAssociated:
     *         <code>Elastic IP address eipalloc-xxxxxxxx is already
     *         associated</code></li> <li>For InternalError: <code>Network interface
     *         eni-xxxxxxxx, created and used internally by this NAT gateway is in an
     *         invalid state. Please try again.</code></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NatGateway withFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getNatGatewayId() != null) sb.append("NatGatewayId: " + getNatGatewayId() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getDeleteTime() != null) sb.append("DeleteTime: " + getDeleteTime() + ",");
        if (getNatGatewayAddresses() != null) sb.append("NatGatewayAddresses: " + getNatGatewayAddresses() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getFailureCode() != null) sb.append("FailureCode: " + getFailureCode() + ",");
        if (getFailureMessage() != null) sb.append("FailureMessage: " + getFailureMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode()); 
        hashCode = prime * hashCode + ((getNatGatewayAddresses() == null) ? 0 : getNatGatewayAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode()); 
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NatGateway == false) return false;
        NatGateway other = (NatGateway)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null) return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        if (other.getDeleteTime() == null ^ this.getDeleteTime() == null) return false;
        if (other.getDeleteTime() != null && other.getDeleteTime().equals(this.getDeleteTime()) == false) return false; 
        if (other.getNatGatewayAddresses() == null ^ this.getNatGatewayAddresses() == null) return false;
        if (other.getNatGatewayAddresses() != null && other.getNatGatewayAddresses().equals(this.getNatGatewayAddresses()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getFailureCode() == null ^ this.getFailureCode() == null) return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false) return false; 
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null) return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public NatGateway clone() {
        try {
            return (NatGateway) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    