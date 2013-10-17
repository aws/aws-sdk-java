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
 * Describes a permission to launch an Amazon Machine Image (AMI).
 * </p>
 */
public class LaunchPermission implements Serializable {

    /**
     * The AWS user ID of the user involved in this launch permission.
     */
    private String userId;

    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: <code>all</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
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
     * Available groups: <code>all</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @return The AWS group of the user involved in this launch permission. <p>
     *         Available groups: <code>all</code>
     *
     * @see PermissionGroup
     */
    public String getGroup() {
        return group;
    }
    
    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: <code>all</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group The AWS group of the user involved in this launch permission. <p>
     *         Available groups: <code>all</code>
     *
     * @see PermissionGroup
     */
    public void setGroup(String group) {
        this.group = group;
    }
    
    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: <code>all</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group The AWS group of the user involved in this launch permission. <p>
     *         Available groups: <code>all</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PermissionGroup
     */
    public LaunchPermission withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: <code>all</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group The AWS group of the user involved in this launch permission. <p>
     *         Available groups: <code>all</code>
     *
     * @see PermissionGroup
     */
    public void setGroup(PermissionGroup group) {
        this.group = group.toString();
    }
    
    /**
     * The AWS group of the user involved in this launch permission. <p>
     * Available groups: <code>all</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group The AWS group of the user involved in this launch permission. <p>
     *         Available groups: <code>all</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PermissionGroup
     */
    public LaunchPermission withGroup(PermissionGroup group) {
        this.group = group.toString();
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
        if (getGroup() != null) sb.append("Group: " + getGroup() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode()); 
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LaunchPermission == false) return false;
        LaunchPermission other = (LaunchPermission)obj;
        
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false; 
        if (other.getGroup() == null ^ this.getGroup() == null) return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false) return false; 
        return true;
    }
    
}
    