/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the allowed node types you can use to modify your cache
 * cluster or replication group.
 * </p>
 */
public class ListAllowedNodeTypeModificationsResult implements Serializable, Cloneable {

    /**
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cache cluster or replication group. <p>When
     * scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for
     * the <i>CacheNodeType</i> parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> scaleUpModifications;

    /**
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cache cluster or replication group. <p>When
     * scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for
     * the <i>CacheNodeType</i> parameter.
     *
     * @return A string list, each element of which specifies a cache node type which
     *         you can use to scale your cache cluster or replication group. <p>When
     *         scaling up a Redis cluster or replication group using
     *         <code>ModifyCacheCluster</code> or
     *         <code>ModifyReplicationGroup</code>, use a value from this list for
     *         the <i>CacheNodeType</i> parameter.
     */
    public java.util.List<String> getScaleUpModifications() {
        if (scaleUpModifications == null) {
              scaleUpModifications = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              scaleUpModifications.setAutoConstruct(true);
        }
        return scaleUpModifications;
    }
    
    /**
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cache cluster or replication group. <p>When
     * scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for
     * the <i>CacheNodeType</i> parameter.
     *
     * @param scaleUpModifications A string list, each element of which specifies a cache node type which
     *         you can use to scale your cache cluster or replication group. <p>When
     *         scaling up a Redis cluster or replication group using
     *         <code>ModifyCacheCluster</code> or
     *         <code>ModifyReplicationGroup</code>, use a value from this list for
     *         the <i>CacheNodeType</i> parameter.
     */
    public void setScaleUpModifications(java.util.Collection<String> scaleUpModifications) {
        if (scaleUpModifications == null) {
            this.scaleUpModifications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> scaleUpModificationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scaleUpModifications.size());
        scaleUpModificationsCopy.addAll(scaleUpModifications);
        this.scaleUpModifications = scaleUpModificationsCopy;
    }
    
    /**
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cache cluster or replication group. <p>When
     * scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for
     * the <i>CacheNodeType</i> parameter.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setScaleUpModifications(java.util.Collection)} or
     * {@link #withScaleUpModifications(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scaleUpModifications A string list, each element of which specifies a cache node type which
     *         you can use to scale your cache cluster or replication group. <p>When
     *         scaling up a Redis cluster or replication group using
     *         <code>ModifyCacheCluster</code> or
     *         <code>ModifyReplicationGroup</code>, use a value from this list for
     *         the <i>CacheNodeType</i> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(String... scaleUpModifications) {
        if (getScaleUpModifications() == null) setScaleUpModifications(new java.util.ArrayList<String>(scaleUpModifications.length));
        for (String value : scaleUpModifications) {
            getScaleUpModifications().add(value);
        }
        return this;
    }
    
    /**
     * A string list, each element of which specifies a cache node type which
     * you can use to scale your cache cluster or replication group. <p>When
     * scaling up a Redis cluster or replication group using
     * <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for
     * the <i>CacheNodeType</i> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scaleUpModifications A string list, each element of which specifies a cache node type which
     *         you can use to scale your cache cluster or replication group. <p>When
     *         scaling up a Redis cluster or replication group using
     *         <code>ModifyCacheCluster</code> or
     *         <code>ModifyReplicationGroup</code>, use a value from this list for
     *         the <i>CacheNodeType</i> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(java.util.Collection<String> scaleUpModifications) {
        if (scaleUpModifications == null) {
            this.scaleUpModifications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> scaleUpModificationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scaleUpModifications.size());
            scaleUpModificationsCopy.addAll(scaleUpModifications);
            this.scaleUpModifications = scaleUpModificationsCopy;
        }

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
        if (getScaleUpModifications() != null) sb.append("ScaleUpModifications: " + getScaleUpModifications() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getScaleUpModifications() == null) ? 0 : getScaleUpModifications().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAllowedNodeTypeModificationsResult == false) return false;
        ListAllowedNodeTypeModificationsResult other = (ListAllowedNodeTypeModificationsResult)obj;
        
        if (other.getScaleUpModifications() == null ^ this.getScaleUpModifications() == null) return false;
        if (other.getScaleUpModifications() != null && other.getScaleUpModifications().equals(this.getScaleUpModifications()) == false) return false; 
        return true;
    }
    
    @Override
    public ListAllowedNodeTypeModificationsResult clone() {
        try {
            return (ListAllowedNodeTypeModificationsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    