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
 * Desired VPC Interface for a Flow
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/VpcInterfaceRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcInterfaceRequest implements Serializable, Cloneable, StructuredPojo {

    /** The name of the VPC Interface. This value must be unique within the current flow. */
    private String name;
    /**
     * The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     * networkInterfaceType.
     */
    private String networkInterfaceType;
    /** Role Arn MediaConnect can assumes to create ENIs in customer's account */
    private String roleArn;
    /** Security Group IDs to be used on ENI. */
    private java.util.List<String> securityGroupIds;
    /** Subnet must be in the AZ of the Flow */
    private String subnetId;

    /**
     * The name of the VPC Interface. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the VPC Interface. This value must be unique within the current flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the VPC Interface. This value must be unique within the current flow.
     * 
     * @return The name of the VPC Interface. This value must be unique within the current flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the VPC Interface. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the VPC Interface. This value must be unique within the current flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterfaceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     * networkInterfaceType.
     * 
     * @param networkInterfaceType
     *        The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     *        networkInterfaceType.
     * @see NetworkInterfaceType
     */

    public void setNetworkInterfaceType(String networkInterfaceType) {
        this.networkInterfaceType = networkInterfaceType;
    }

    /**
     * The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     * networkInterfaceType.
     * 
     * @return The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     *         networkInterfaceType.
     * @see NetworkInterfaceType
     */

    public String getNetworkInterfaceType() {
        return this.networkInterfaceType;
    }

    /**
     * The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     * networkInterfaceType.
     * 
     * @param networkInterfaceType
     *        The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     *        networkInterfaceType.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceType
     */

    public VpcInterfaceRequest withNetworkInterfaceType(String networkInterfaceType) {
        setNetworkInterfaceType(networkInterfaceType);
        return this;
    }

    /**
     * The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     * networkInterfaceType.
     * 
     * @param networkInterfaceType
     *        The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the
     *        networkInterfaceType.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceType
     */

    public VpcInterfaceRequest withNetworkInterfaceType(NetworkInterfaceType networkInterfaceType) {
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

    public VpcInterfaceRequest withRoleArn(String roleArn) {
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

    public VpcInterfaceRequest withSecurityGroupIds(String... securityGroupIds) {
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

    public VpcInterfaceRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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

    public VpcInterfaceRequest withSubnetId(String subnetId) {
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

        if (obj instanceof VpcInterfaceRequest == false)
            return false;
        VpcInterfaceRequest other = (VpcInterfaceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getNetworkInterfaceType() == null) ? 0 : getNetworkInterfaceType().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public VpcInterfaceRequest clone() {
        try {
            return (VpcInterfaceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.VpcInterfaceRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
