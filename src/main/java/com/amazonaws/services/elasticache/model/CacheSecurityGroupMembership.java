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
 * Represents a cache cluster's status within a particular cache security group.
 * </p>
 */
public class CacheSecurityGroupMembership implements Serializable {

    /**
     * The name of the cache security group.
     */
    private String cacheSecurityGroupName;

    /**
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cache cluster are modified.
     */
    private String status;

    /**
     * Default constructor for a new CacheSecurityGroupMembership object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheSecurityGroupMembership() {}
    
    /**
     * The name of the cache security group.
     *
     * @return The name of the cache security group.
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * The name of the cache security group.
     *
     * @param cacheSecurityGroupName The name of the cache security group.
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * The name of the cache security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName The name of the cache security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheSecurityGroupMembership withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }

    /**
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cache cluster are modified.
     *
     * @return The membership status in the cache security group. The status changes
     *         when a cache security group is modified, or when the cache security
     *         groups assigned to a cache cluster are modified.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cache cluster are modified.
     *
     * @param status The membership status in the cache security group. The status changes
     *         when a cache security group is modified, or when the cache security
     *         groups assigned to a cache cluster are modified.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cache cluster are modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The membership status in the cache security group. The status changes
     *         when a cache security group is modified, or when the cache security
     *         groups assigned to a cache cluster are modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheSecurityGroupMembership withStatus(String status) {
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
        if (getCacheSecurityGroupName() != null) sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheSecurityGroupMembership == false) return false;
        CacheSecurityGroupMembership other = (CacheSecurityGroupMembership)obj;
        
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null) return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    