/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An AWS user ID identifiying an AWS account, and the name of a
 * security group within that account.
 * </p>
 */
public class UserIdGroupPair {

    /**
     * The AWS user ID of an account.
     */
    private String userId;

    /**
     * The name of the security group in the specified user's account.
     */
    private String groupName;

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
     * The name of the security group in the specified user's account.
     *
     * @return The name of the security group in the specified user's account.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the security group in the specified user's account.
     *
     * @param groupName The name of the security group in the specified user's account.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the security group in the specified user's account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the security group in the specified user's account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UserIdGroupPair withGroupName(String groupName) {
        this.groupName = groupName;
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
        
        sb.append("UserId: " + userId + ", ");
        sb.append("GroupName: " + groupName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    