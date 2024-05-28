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
 * A security group that can be used by interfaces in the VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SecurityGroupForVpc" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupForVpc implements Serializable, Cloneable {

    /**
     * <p>
     * The security group's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The security group name.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The security group owner ID.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The security group ID.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The security group tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The VPC ID in which the security group was created.
     * </p>
     */
    private String primaryVpcId;

    /**
     * <p>
     * The security group's description.
     * </p>
     * 
     * @param description
     *        The security group's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The security group's description.
     * </p>
     * 
     * @return The security group's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The security group's description.
     * </p>
     * 
     * @param description
     *        The security group's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupForVpc withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The security group name.
     * </p>
     * 
     * @param groupName
     *        The security group name.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The security group name.
     * </p>
     * 
     * @return The security group name.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The security group name.
     * </p>
     * 
     * @param groupName
     *        The security group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupForVpc withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The security group owner ID.
     * </p>
     * 
     * @param ownerId
     *        The security group owner ID.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The security group owner ID.
     * </p>
     * 
     * @return The security group owner ID.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The security group owner ID.
     * </p>
     * 
     * @param ownerId
     *        The security group owner ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupForVpc withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @param groupId
     *        The security group ID.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @return The security group ID.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @param groupId
     *        The security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupForVpc withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The security group tags.
     * </p>
     * 
     * @return The security group tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The security group tags.
     * </p>
     * 
     * @param tags
     *        The security group tags.
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
     * The security group tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The security group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupForVpc withTags(Tag... tags) {
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
     * The security group tags.
     * </p>
     * 
     * @param tags
     *        The security group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupForVpc withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The VPC ID in which the security group was created.
     * </p>
     * 
     * @param primaryVpcId
     *        The VPC ID in which the security group was created.
     */

    public void setPrimaryVpcId(String primaryVpcId) {
        this.primaryVpcId = primaryVpcId;
    }

    /**
     * <p>
     * The VPC ID in which the security group was created.
     * </p>
     * 
     * @return The VPC ID in which the security group was created.
     */

    public String getPrimaryVpcId() {
        return this.primaryVpcId;
    }

    /**
     * <p>
     * The VPC ID in which the security group was created.
     * </p>
     * 
     * @param primaryVpcId
     *        The VPC ID in which the security group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupForVpc withPrimaryVpcId(String primaryVpcId) {
        setPrimaryVpcId(primaryVpcId);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPrimaryVpcId() != null)
            sb.append("PrimaryVpcId: ").append(getPrimaryVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupForVpc == false)
            return false;
        SecurityGroupForVpc other = (SecurityGroupForVpc) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPrimaryVpcId() == null ^ this.getPrimaryVpcId() == null)
            return false;
        if (other.getPrimaryVpcId() != null && other.getPrimaryVpcId().equals(this.getPrimaryVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPrimaryVpcId() == null) ? 0 : getPrimaryVpcId().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupForVpc clone() {
        try {
            return (SecurityGroupForVpc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
