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
 * A value that applies only to a certain Cache Node Type.
 * </p>
 */
public class CacheNodeTypeSpecificValue {

    /**
     * Specifies the Cache Node type for which this value applies.
     */
    private String cacheNodeType;

    /**
     * Specifies the value for the Cache Node type.
     */
    private String value;

    /**
     * Default constructor for a new CacheNodeTypeSpecificValue object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheNodeTypeSpecificValue() {}
    
    /**
     * Specifies the Cache Node type for which this value applies.
     *
     * @return Specifies the Cache Node type for which this value applies.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * Specifies the Cache Node type for which this value applies.
     *
     * @param cacheNodeType Specifies the Cache Node type for which this value applies.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * Specifies the Cache Node type for which this value applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType Specifies the Cache Node type for which this value applies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNodeTypeSpecificValue withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }
    
    
    /**
     * Specifies the value for the Cache Node type.
     *
     * @return Specifies the value for the Cache Node type.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * Specifies the value for the Cache Node type.
     *
     * @param value Specifies the value for the Cache Node type.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * Specifies the value for the Cache Node type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value Specifies the value for the Cache Node type.
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
        sb.append("CacheNodeType: " + cacheNodeType + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    