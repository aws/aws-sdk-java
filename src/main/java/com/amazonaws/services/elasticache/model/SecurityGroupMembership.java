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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Represents a single cache security group and its status..
 * </p>
 */
public class SecurityGroupMembership implements Serializable {

    /**
     * The identifier of the cache security group.
     */
    private String securityGroupId;

    /**
     * The status of the cache security group membership. The status changes
     * whenever a cache security group is modified, or when the cache
     * security groups assigned to a cache cluster are modified.
     */
    private String status;

    /**
     * The identifier of the cache security group.
     *
     * @return The identifier of the cache security group.
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }
    
    /**
     * The identifier of the cache security group.
     *
     * @param securityGroupId The identifier of the cache security group.
     */
    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
    
    /**
     * The identifier of the cache security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupId The identifier of the cache security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SecurityGroupMembership withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * The status of the cache security group membership. The status changes
     * whenever a cache security group is modified, or when the cache
     * security groups assigned to a cache cluster are modified.
     *
     * @return The status of the cache security group membership. The status changes
     *         whenever a cache security group is modified, or when the cache
     *         security groups assigned to a cache cluster are modified.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the cache security group membership. The status changes
     * whenever a cache security group is modified, or when the cache
     * security groups assigned to a cache cluster are modified.
     *
     * @param status The status of the cache security group membership. The status changes
     *         whenever a cache security group is modified, or when the cache
     *         security groups assigned to a cache cluster are modified.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the cache security group membership. The status changes
     * whenever a cache security group is modified, or when the cache
     * security groups assigned to a cache cluster are modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the cache security group membership. The status changes
     *         whenever a cache security group is modified, or when the cache
     *         security groups assigned to a cache cluster are modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SecurityGroupMembership withStatus(String status) {
        this.status = status;
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
        if (getSecurityGroupId() != null) sb.append("SecurityGroupId: " + getSecurityGroupId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SecurityGroupMembership == false) return false;
        SecurityGroupMembership other = (SecurityGroupMembership)obj;
        
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null) return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    