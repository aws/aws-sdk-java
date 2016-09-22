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
 * Describes a security group and AWS account ID pair.
 * </p>
 */
public class UserIdGroupPair implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced
     * security group is returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS account.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a default
     * VPC only. For a security group in a nondefault VPC, use the security group ID.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     */
    private String vpcPeeringConnectionId;
    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     */
    private String peeringStatus;

    /**
     * <p>
     * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced
     * security group is returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS account.
     * </p>
     * 
     * @param userId
     *        The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced
     *        security group is returned.</p>
     *        <p>
     *        [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS
     *        account.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced
     * security group is returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS account.
     * </p>
     * 
     * @return The ID of an AWS account. For a referenced security group in another VPC, the account ID of the
     *         referenced security group is returned.</p>
     *         <p>
     *         [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS
     *         account.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced
     * security group is returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS account.
     * </p>
     * 
     * @param userId
     *        The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced
     *        security group is returned.</p>
     *        <p>
     *        [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdGroupPair withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a default
     * VPC only. For a security group in a nondefault VPC, use the security group ID.
     * </p>
     * 
     * @param groupName
     *        The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a
     *        default VPC only. For a security group in a nondefault VPC, use the security group ID.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a default
     * VPC only. For a security group in a nondefault VPC, use the security group ID.
     * </p>
     * 
     * @return The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a
     *         default VPC only. For a security group in a nondefault VPC, use the security group ID.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a default
     * VPC only. For a security group in a nondefault VPC, use the security group ID.
     * </p>
     * 
     * @param groupName
     *        The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a
     *        default VPC only. For a security group in a nondefault VPC, use the security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdGroupPair withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

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

    public UserIdGroupPair withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the referenced security group, if applicable.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     * 
     * @return The ID of the VPC for the referenced security group, if applicable.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the referenced security group, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdGroupPair withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection, if applicable.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     * 
     * @return The ID of the VPC peering connection, if applicable.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdGroupPair withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
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

    public UserIdGroupPair withPeeringStatus(String peeringStatus) {
        setPeeringStatus(peeringStatus);
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() + ",");
        if (getPeeringStatus() != null)
            sb.append("PeeringStatus: " + getPeeringStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserIdGroupPair == false)
            return false;
        UserIdGroupPair other = (UserIdGroupPair) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        if (other.getPeeringStatus() == null ^ this.getPeeringStatus() == null)
            return false;
        if (other.getPeeringStatus() != null && other.getPeeringStatus().equals(this.getPeeringStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        hashCode = prime * hashCode + ((getPeeringStatus() == null) ? 0 : getPeeringStatus().hashCode());
        return hashCode;
    }

    @Override
    public UserIdGroupPair clone() {
        try {
            return (UserIdGroupPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
