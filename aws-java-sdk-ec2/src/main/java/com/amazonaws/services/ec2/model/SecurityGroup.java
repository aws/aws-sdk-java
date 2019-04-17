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
 * Describes a security group
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the security group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissions;
    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * [EC2-VPC] The outbound rules associated with the security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissionsEgress;
    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * [EC2-VPC] The ID of the VPC for the security group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * A description of the security group.
     * </p>
     * 
     * @param description
     *        A description of the security group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     * 
     * @return A description of the security group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     * 
     * @param description
     *        A description of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @return The name of the security group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * 
     * @return The inbound rules associated with the security group.
     */

    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissions;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissions
     *        The inbound rules associated with the security group.
     */

    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissions);
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        The inbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withIpPermissions(IpPermission... ipPermissions) {
        if (this.ipPermissions == null) {
            setIpPermissions(new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissions.length));
        }
        for (IpPermission ele : ipPermissions) {
            this.ipPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissions
     *        The inbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the security group.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * 
     * @return The AWS account ID of the owner of the security group.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withOwnerId(String ownerId) {
        setOwnerId(ownerId);
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

    public SecurityGroup withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The outbound rules associated with the security group.
     * </p>
     * 
     * @return [EC2-VPC] The outbound rules associated with the security group.
     */

    public java.util.List<IpPermission> getIpPermissionsEgress() {
        if (ipPermissionsEgress == null) {
            ipPermissionsEgress = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissionsEgress;
    }

    /**
     * <p>
     * [EC2-VPC] The outbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissionsEgress
     *        [EC2-VPC] The outbound rules associated with the security group.
     */

    public void setIpPermissionsEgress(java.util.Collection<IpPermission> ipPermissionsEgress) {
        if (ipPermissionsEgress == null) {
            this.ipPermissionsEgress = null;
            return;
        }

        this.ipPermissionsEgress = new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissionsEgress);
    }

    /**
     * <p>
     * [EC2-VPC] The outbound rules associated with the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissionsEgress(java.util.Collection)} or {@link #withIpPermissionsEgress(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ipPermissionsEgress
     *        [EC2-VPC] The outbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withIpPermissionsEgress(IpPermission... ipPermissionsEgress) {
        if (this.ipPermissionsEgress == null) {
            setIpPermissionsEgress(new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissionsEgress.length));
        }
        for (IpPermission ele : ipPermissionsEgress) {
            this.ipPermissionsEgress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The outbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissionsEgress
     *        [EC2-VPC] The outbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withIpPermissionsEgress(java.util.Collection<IpPermission> ipPermissionsEgress) {
        setIpPermissionsEgress(ipPermissionsEgress);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     * 
     * @return Any tags assigned to the security group.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the security group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC for the security group.
     * </p>
     * 
     * @param vpcId
     *        [EC2-VPC] The ID of the VPC for the security group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC for the security group.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the VPC for the security group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC for the security group.
     * </p>
     * 
     * @param vpcId
     *        [EC2-VPC] The ID of the VPC for the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: ").append(getIpPermissions()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getIpPermissionsEgress() != null)
            sb.append("IpPermissionsEgress: ").append(getIpPermissionsEgress()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroup == false)
            return false;
        SecurityGroup other = (SecurityGroup) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getIpPermissionsEgress() == null ^ this.getIpPermissionsEgress() == null)
            return false;
        if (other.getIpPermissionsEgress() != null && other.getIpPermissionsEgress().equals(this.getIpPermissionsEgress()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getIpPermissionsEgress() == null) ? 0 : getIpPermissionsEgress().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroup clone() {
        try {
            return (SecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
