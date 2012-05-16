/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains a set of parameters and their values which can be applied to a Cache Cluster.
 * </p>
 */
public class CacheParameterGroup {

    /**
     * Provides the name of the Cache Parameter Group.
     */
    private String cacheParameterGroupName;

    /**
     * Provides the name of the Cache Parameter Group Family that this Cache
     * Parameter Group is compatible with.
     */
    private String cacheParameterGroupFamily;

    /**
     * Provides the customer-specified description for this Cache Parameter
     * Group.
     */
    private String description;

    /**
     * Provides the name of the Cache Parameter Group.
     *
     * @return Provides the name of the Cache Parameter Group.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * Provides the name of the Cache Parameter Group.
     *
     * @param cacheParameterGroupName Provides the name of the Cache Parameter Group.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * Provides the name of the Cache Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName Provides the name of the Cache Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheParameterGroup withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }
    
    
    /**
     * Provides the name of the Cache Parameter Group Family that this Cache
     * Parameter Group is compatible with.
     *
     * @return Provides the name of the Cache Parameter Group Family that this Cache
     *         Parameter Group is compatible with.
     */
    public String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }
    
    /**
     * Provides the name of the Cache Parameter Group Family that this Cache
     * Parameter Group is compatible with.
     *
     * @param cacheParameterGroupFamily Provides the name of the Cache Parameter Group Family that this Cache
     *         Parameter Group is compatible with.
     */
    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }
    
    /**
     * Provides the name of the Cache Parameter Group Family that this Cache
     * Parameter Group is compatible with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupFamily Provides the name of the Cache Parameter Group Family that this Cache
     *         Parameter Group is compatible with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheParameterGroup withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }
    
    
    /**
     * Provides the customer-specified description for this Cache Parameter
     * Group.
     *
     * @return Provides the customer-specified description for this Cache Parameter
     *         Group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Provides the customer-specified description for this Cache Parameter
     * Group.
     *
     * @param description Provides the customer-specified description for this Cache Parameter
     *         Group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Provides the customer-specified description for this Cache Parameter
     * Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Provides the customer-specified description for this Cache Parameter
     *         Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheParameterGroup withDescription(String description) {
        this.description = description;
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
        if (cacheParameterGroupName != null) sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        if (cacheParameterGroupFamily != null) sb.append("CacheParameterGroupFamily: " + cacheParameterGroupFamily + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroupFamily() == null) ? 0 : getCacheParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CacheParameterGroup == false) return false;
        CacheParameterGroup other = (CacheParameterGroup)obj;
        
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null) return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    