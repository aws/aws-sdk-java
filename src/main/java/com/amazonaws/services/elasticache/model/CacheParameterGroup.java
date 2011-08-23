/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains a set of parameters and their values which can be applied to
 * a Cache Cluster.
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
        sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        sb.append("CacheParameterGroupFamily: " + cacheParameterGroupFamily + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    