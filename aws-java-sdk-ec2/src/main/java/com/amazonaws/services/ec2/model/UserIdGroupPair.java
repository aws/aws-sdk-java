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
 * Describes a security group and AWS account ID pair.
 * </p>
 */
public class UserIdGroupPair implements Serializable, Cloneable {

    /**
     * The ID of an AWS account. EC2-Classic only.
     */
    private String userId;

    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use <code>GroupId</code>.
     */
    private String groupName;

    /**
     * The ID of the security group.
     */
    private String groupId;

    /**
     * The ID of an AWS account. EC2-Classic only.
     *
     * @return The ID of an AWS account. EC2-Classic only.
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * The ID of an AWS account. EC2-Classic only.
     *
     * @param userId The ID of an AWS account. EC2-Classic only.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * The ID of an AWS account. EC2-Classic only.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userId The ID of an AWS account. EC2-Classic only.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use <code>GroupId</code>.
     *
     * @return The name of the security group. In a request, use this parameter for a
     *         security group in EC2-Classic or a default VPC only. For a security
     *         group in a nondefault VPC, use <code>GroupId</code>.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use <code>GroupId</code>.
     *
     * @param groupName The name of the security group. In a request, use this parameter for a
     *         security group in EC2-Classic or a default VPC only. For a security
     *         group in a nondefault VPC, use <code>GroupId</code>.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use <code>GroupId</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the security group. In a request, use this parameter for a
     *         security group in EC2-Classic or a default VPC only. For a security
     *         group in a nondefault VPC, use <code>GroupId</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * The ID of the security group.
     *
     * @return The ID of the security group.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * The ID of the security group.
     *
     * @param groupId The ID of the security group.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * The ID of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId The ID of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withGroupId(String groupId) {
        this.groupId = groupId;
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
        if (getUserId() != null) sb.append("UserId: " + getUserId() + ",");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode()); 
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UserIdGroupPair == false) return false;
        UserIdGroupPair other = (UserIdGroupPair)obj;
        
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false; 
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        return true;
    }
    
    @Override
    public UserIdGroupPair clone() {
        try {
            return (UserIdGroupPair) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    