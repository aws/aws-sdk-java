/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * A value that applies only to a certain cache node type.
 * </p>
 */
public class CacheNodeTypeSpecificValue implements Serializable, Cloneable {

    /**
     * <p>
     * The cache node type for which this value applies.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The value for the cache node type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The cache node type for which this value applies.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type for which this value applies.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type for which this value applies.
     * </p>
     * 
     * @return The cache node type for which this value applies.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The cache node type for which this value applies.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type for which this value applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNodeTypeSpecificValue withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The value for the cache node type.
     * </p>
     * 
     * @param value
     *        The value for the cache node type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the cache node type.
     * </p>
     * 
     * @return The value for the cache node type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the cache node type.
     * </p>
     * 
     * @param value
     *        The value for the cache node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNodeTypeSpecificValue withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheNodeTypeSpecificValue == false)
            return false;
        CacheNodeTypeSpecificValue other = (CacheNodeTypeSpecificValue) obj;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
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
    public CacheNodeTypeSpecificValue clone() {
        try {
            return (CacheNodeTypeSpecificValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
