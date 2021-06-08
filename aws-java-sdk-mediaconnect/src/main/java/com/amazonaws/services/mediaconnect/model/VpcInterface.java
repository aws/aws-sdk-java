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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The settings for a VPC Source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/VpcInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcInterface implements Serializable, Cloneable, StructuredPojo {

    /** Immutable and has to be a unique against other VpcInterfaces in this Flow */
    private String name;
    /** IDs of the network interfaces created in customer's account by MediaConnect. */
    private java.util.List<String> networkInterfaceIds;
    /** The type of network interface. */
    private String networkInterfaceType;
    /** Role Arn MediaConnect can assumes to create ENIs in customer's account */
    private String roleArn;
    /** Security Group IDs to be used on ENI. */
    private java.util.List<String> securityGroupIds;
    /** Subnet must be in the AZ of the Flow */
    private String subnetId;

    /**
     * Immutable and has to be a unique against other VpcInterfaces in this Flow
     * 
     * @param name
     *        Immutable and has to be a unique against other VpcInterfaces in this Flow
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Immutable and has to be a unique against other VpcInterfaces in this Flow
     * 
     * @return Immutable and has to be a unique against other VpcInterfaces in this Flow
     */

    public String getName() {
        return this.name;
    }

    /**
     * Immutable and has to be a unique against other VpcInterfaces in this Flow
     * 
     * @param name
     *        Immutable and has to be a unique against other VpcInterfaces in this Flow
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterface withName(String name) {
        setName(name);
        return this;
    }

    /**
     * IDs of the network interfaces created in customer's account by MediaConnect.
     * 
     * @return IDs of the network interfaces created in customer's account by MediaConnect.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * IDs of the network interfaces created in customer's account by MediaConnect.
     * 
     * @param networkInterfaceIds
     *        IDs of the network interfaces created in customer's account by MediaConnect.
     */

    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds);
    }

    /**
     * IDs of the network interfaces created in customer's account by MediaConnect.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        IDs of the network interfaces created in customer's account by MediaConnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterface withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new java.util.ArrayList<String>(networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * IDs of the network interfaces created in customer's account by MediaConnect.
     * 
     * @param networkInterfaceIds
     *        IDs of the network interfaces created in customer's account by MediaConnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterface withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * The type of network interface.
     * 
     * @param networkInterfaceType
     *        The type of network interface.
     * @see NetworkInterfaceType
     */

    public void setNetworkInterfaceType(String networkInterfaceType) {
        this.networkInterfaceType = networkInterfaceType;
    }

    /**
     * The type of network interface.
     * 
     * @return The type of network interface.
     * @see NetworkInterfaceType
     */

    public String getNetworkInterfaceType() {
        return this.networkInterfaceType;
    }

    /**
     * The type of network interface.
     * 
     * @param networkInterfaceType
     *        The type of network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceType
     */

    public VpcInterface withNetworkInterfaceType(String networkInterfaceType) {
        setNetworkInterfaceType(networkInterfaceType);
        return this;
    }

    /**
     * The type of network interface.
     * 
     * @param networkInterfaceType
     *        The type of network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceType
     */

    public VpcInterface withNetworkInterfaceType(NetworkInterfaceType networkInterfaceType) {
        this.networkInterfaceType = networkInterfaceType.toString();
        return this;
    }

    /**
     * Role Arn MediaConnect can assumes to create ENIs in customer's account
     * 
     * @param roleArn
     *        Role Arn MediaConnect can assumes to create ENIs in customer's account
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * Role Arn MediaConnect can assumes to create ENIs in customer's account
     * 
     * @return Role Arn MediaConnect can assumes to create ENIs in customer's account
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * Role Arn MediaConnect can assumes to create ENIs in customer's account
     * 
     * @param roleArn
     *        Role Arn MediaConnect can assumes to create ENIs in customer's account
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterface withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Security Group IDs to be used on ENI.
     * 
     * @return Security Group IDs to be used on ENI.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * Security Group IDs to be used on ENI.
     * 
     * @param securityGroupIds
     *        Security Group IDs to be used on ENI.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * Security Group IDs to be used on ENI.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Security Group IDs to be used on ENI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterface withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * Security Group IDs to be used on ENI.
     * 
     * @param securityGroupIds
     *        Security Group IDs to be used on ENI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterface withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * Subnet must be in the AZ of the Flow
     * 
     * @param subnetId
     *        Subnet must be in the AZ of the Flow
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * Subnet must be in the AZ of the Flow
     * 
     * @return Subnet must be in the AZ of the Flow
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * Subnet must be in the AZ of the Flow
     * 
     * @param subnetId
     *        Subnet must be in the AZ of the Flow
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterface withSubnetId(String subnetId) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: ").append(getNetworkInterfaceIds()).append(",");
        if (getNetworkInterfaceType() != null)
            sb.append("NetworkInterfaceType: ").append(getNetworkInterfaceType()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
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

        if (obj instanceof VpcInterface == false)
            return false;
        VpcInterface other = (VpcInterface) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getNetworkInterfaceType() == null ^ this.getNetworkInterfaceType() == null)
            return false;
        if (other.getNetworkInterfaceType() != null && other.getNetworkInterfaceType().equals(this.getNetworkInterfaceType()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceType() == null) ? 0 : getNetworkInterfaceType().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public VpcInterface clone() {
        try {
            return (VpcInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.VpcInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
