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
 * A value that applies only to a certain cache node type.
 * </p>
 */
public class CacheNodeTypeSpecificValue implements Serializable {

    /**
     * The cache node type for which this value applies.
     */
    private String cacheNodeType;

    /**
     * The value for the cache node type.
     */
    private String value;

    /**
     * Default constructor for a new CacheNodeTypeSpecificValue object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheNodeTypeSpecificValue() {}
    
    /**
     * The cache node type for which this value applies.
     *
     * @return The cache node type for which this value applies.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The cache node type for which this value applies.
     *
     * @param cacheNodeType The cache node type for which this value applies.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The cache node type for which this value applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The cache node type for which this value applies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNodeTypeSpecificValue withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * The value for the cache node type.
     *
     * @return The value for the cache node type.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value for the cache node type.
     *
     * @param value The value for the cache node type.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value for the cache node type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value for the cache node type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNodeTypeSpecificValue withValue(String value) {
        this.value = value;
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
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheNodeTypeSpecificValue == false) return false;
        CacheNodeTypeSpecificValue other = (CacheNodeTypeSpecificValue)obj;
        
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
}
    