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
 * Describes a permission to launch an Amazon Machine Image (AMI).
 * </p>
 */
public class LaunchPermission {

    /**
     * The AWS user ID of the user involved in this launch permission.
     */
    private String userId;

    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: all
     */
    private String group;

    /**
     * The AWS user ID of the user involved in this launch permission.
     *
     * @return The AWS user ID of the user involved in this launch permission.
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * The AWS user ID of the user involved in this launch permission.
     *
     * @param userId The AWS user ID of the user involved in this launch permission.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * The AWS user ID of the user involved in this launch permission.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userId The AWS user ID of the user involved in this launch permission.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchPermission withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    
    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: all
     *
     * @return The AWS group of the user involved in this launch permission. <p>
     *         Available groups: all
     */
    public String getGroup() {
        return group;
    }
    
    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: all
     *
     * @param group The AWS group of the user involved in this launch permission. <p>
     *         Available groups: all
     */
    public void setGroup(String group) {
        this.group = group;
    }
    
    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: all
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param group The AWS group of the user involved in this launch permission. <p>
     *         Available groups: all
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchPermission withGroup(String group) {
        this.group = group;
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
        sb.append("Group: " + group + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    