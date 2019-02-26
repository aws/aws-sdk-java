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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a VPC with a security group that references your security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SecurityGroupReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupReference implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of your security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The ID of the VPC with the referencing security group.
     * </p>
     */
    private String referencingVpcId;
    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The ID of your security group.
     * </p>
     * 
     * @param groupId
     *        The ID of your security group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of your security group.
     * </p>
     * 
     * @return The ID of your security group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of your security group.
     * </p>
     * 
     * @param groupId
     *        The ID of your security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupReference withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC with the referencing security group.
     * </p>
     * 
     * @param referencingVpcId
     *        The ID of the VPC with the referencing security group.
     */

    public void setReferencingVpcId(String referencingVpcId) {
        this.referencingVpcId = referencingVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with the referencing security group.
     * </p>
     * 
     * @return The ID of the VPC with the referencing security group.
     */

    public String getReferencingVpcId() {
        return this.referencingVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with the referencing security group.
     * </p>
     * 
     * @param referencingVpcId
     *        The ID of the VPC with the referencing security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupReference withReferencingVpcId(String referencingVpcId) {
        setReferencingVpcId(referencingVpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @return The ID of the VPC peering connection.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupReference withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getReferencingVpcId() != null)
            sb.append("ReferencingVpcId: ").append(getReferencingVpcId()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupReference == false)
            return false;
        SecurityGroupReference other = (SecurityGroupReference) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getReferencingVpcId() == null ^ this.getReferencingVpcId() == null)
            return false;
        if (other.getReferencingVpcId() != null && other.getReferencingVpcId().equals(this.getReferencingVpcId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getReferencingVpcId() == null) ? 0 : getReferencingVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupReference clone() {
        try {
            return (SecurityGroupReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
