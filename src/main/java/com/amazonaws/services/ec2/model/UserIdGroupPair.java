/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An AWS user ID identifying an AWS account, and the name of a security group within that account.
 * </p>
 */
public class UserIdGroupPair implements Serializable {

    /**
     * The AWS user ID of an account.
     */
    private String userId;

    /**
     * Name of the security group in the specified AWS account. Cannot be
     * used when specifying a CIDR IP address range.
     */
    private String groupName;

    /**
     * ID of the security group in the specified AWS account. Cannot be used
     * when specifying a CIDR IP address range.
     */
    private String groupId;

    /**
     * The AWS user ID of an account.
     *
     * @return The AWS user ID of an account.
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * The AWS user ID of an account.
     *
     * @param userId The AWS user ID of an account.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * The AWS user ID of an account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userId The AWS user ID of an account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UserIdGroupPair withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Name of the security group in the specified AWS account. Cannot be
     * used when specifying a CIDR IP address range.
     *
     * @return Name of the security group in the specified AWS account. Cannot be
     *         used when specifying a CIDR IP address range.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * Name of the security group in the specified AWS account. Cannot be
     * used when specifying a CIDR IP address range.
     *
     * @param groupName Name of the security group in the specified AWS account. Cannot be
     *         used when specifying a CIDR IP address range.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * Name of the security group in the specified AWS account. Cannot be
     * used when specifying a CIDR IP address range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName Name of the security group in the specified AWS account. Cannot be
     *         used when specifying a CIDR IP address range.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UserIdGroupPair withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * ID of the security group in the specified AWS account. Cannot be used
     * when specifying a CIDR IP address range.
     *
     * @return ID of the security group in the specified AWS account. Cannot be used
     *         when specifying a CIDR IP address range.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * ID of the security group in the specified AWS account. Cannot be used
     * when specifying a CIDR IP address range.
     *
     * @param groupId ID of the security group in the specified AWS account. Cannot be used
     *         when specifying a CIDR IP address range.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * ID of the security group in the specified AWS account. Cannot be used
     * when specifying a CIDR IP address range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId ID of the security group in the specified AWS account. Cannot be used
     *         when specifying a CIDR IP address range.
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
    
}
    