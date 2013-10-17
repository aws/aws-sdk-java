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
 * Represents the output of one of the following operations:
 * </p>
 * 
 * <ul>
 * <li> <i>ModifyCacheParameterGroup</i> </li>
 * <li> <i>ResetCacheParameterGroup</i> </li>
 * 
 * </ul>
 */
public class ModifyCacheParameterGroupResult implements Serializable {

    /**
     * The name of the cache parameter group.
     */
    private String cacheParameterGroupName;

    /**
     * The name of the cache parameter group.
     *
     * @return The name of the cache parameter group.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group.
     *
     * @param cacheParameterGroupName The name of the cache parameter group.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyCacheParameterGroupResult withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
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
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyCacheParameterGroupResult == false) return false;
        ModifyCacheParameterGroupResult other = (ModifyCacheParameterGroupResult)obj;
        
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        return true;
    }
    
}
    