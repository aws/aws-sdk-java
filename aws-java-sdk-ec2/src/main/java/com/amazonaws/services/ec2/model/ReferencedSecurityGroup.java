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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the security group that is referenced in the security group rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReferencedSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferencedSecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     */
    private String peeringStatus;
    /**
     * <p>
     * The account ID.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @return The ID of the security group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencedSecurityGroup withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     * 
     * @param peeringStatus
     *        The status of a VPC peering connection, if applicable.
     */

    public void setPeeringStatus(String peeringStatus) {
        this.peeringStatus = peeringStatus;
    }

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     * 
     * @return The status of a VPC peering connection, if applicable.
     */

    public String getPeeringStatus() {
        return this.peeringStatus;
    }

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     * 
     * @param peeringStatus
     *        The status of a VPC peering connection, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencedSecurityGroup withPeeringStatus(String peeringStatus) {
        setPeeringStatus(peeringStatus);
        return this;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @param userId
     *        The account ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @return The account ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @param userId
     *        The account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencedSecurityGroup withUserId(String userId) {
        setUserId(userId);
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

    public ReferencedSecurityGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
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

    public ReferencedSecurityGroup withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
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
        if (getPeeringStatus() != null)
            sb.append("PeeringStatus: ").append(getPeeringStatus()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
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

        if (obj instanceof ReferencedSecurityGroup == false)
            return false;
        ReferencedSecurityGroup other = (ReferencedSecurityGroup) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getPeeringStatus() == null ^ this.getPeeringStatus() == null)
            return false;
        if (other.getPeeringStatus() != null && other.getPeeringStatus().equals(this.getPeeringStatus()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
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
        hashCode = prime * hashCode + ((getPeeringStatus() == null) ? 0 : getPeeringStatus().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public ReferencedSecurityGroup clone() {
        try {
            return (ReferencedSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
