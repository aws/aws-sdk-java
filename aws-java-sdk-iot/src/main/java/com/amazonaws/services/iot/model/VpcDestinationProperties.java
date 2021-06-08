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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of a virtual private cloud (VPC) destination.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcDestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     * 
     * @return The subnet IDs of the VPC destination.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs of the VPC destination.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs of the VPC destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDestinationProperties withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs of the VPC destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDestinationProperties withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     * 
     * @return The security groups of the VPC destination.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     * 
     * @param securityGroups
     *        The security groups of the VPC destination.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups of the VPC destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDestinationProperties withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     * 
     * @param securityGroups
     *        The security groups of the VPC destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDestinationProperties withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDestinationProperties withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     * </p>
     * 
     * @param roleArn
     *        The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     * </p>
     * 
     * @return The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     * </p>
     * 
     * @param roleArn
     *        The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDestinationProperties withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcDestinationProperties == false)
            return false;
        VpcDestinationProperties other = (VpcDestinationProperties) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public VpcDestinationProperties clone() {
        try {
            return (VpcDestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.VpcDestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
