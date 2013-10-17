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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createCacheParameterGroup(CreateCacheParameterGroupRequest) CreateCacheParameterGroup operation}.
 * <p>
 * The <i>CreateCacheParameterGroup</i> operation creates a new cache parameter group. A cache parameter group is a collection of parameters that you
 * apply to all of the nodes in a cache cluster.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createCacheParameterGroup(CreateCacheParameterGroupRequest)
 */
public class CreateCacheParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A user-specified name for the cache parameter group.
     */
    private String cacheParameterGroupName;

    /**
     * The name of the cache parameter group family the cache parameter group
     * can be used with. <p>Valid values are: <code>memcached1.4</code> |
     * <code>redis2.6</code>
     */
    private String cacheParameterGroupFamily;

    /**
     * A user-specified description for the cache parameter group.
     */
    private String description;

    /**
     * Default constructor for a new CreateCacheParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateCacheParameterGroupRequest() {}
    
    /**
     * Constructs a new CreateCacheParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheParameterGroupName A user-specified name for the cache
     * parameter group.
     * @param cacheParameterGroupFamily The name of the cache parameter group
     * family the cache parameter group can be used with. <p>Valid values
     * are: <code>memcached1.4</code> | <code>redis2.6</code>
     * @param description A user-specified description for the cache
     * parameter group.
     */
    public CreateCacheParameterGroupRequest(String cacheParameterGroupName, String cacheParameterGroupFamily, String description) {
        setCacheParameterGroupName(cacheParameterGroupName);
        setCacheParameterGroupFamily(cacheParameterGroupFamily);
        setDescription(description);
    }

    /**
     * A user-specified name for the cache parameter group.
     *
     * @return A user-specified name for the cache parameter group.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * A user-specified name for the cache parameter group.
     *
     * @param cacheParameterGroupName A user-specified name for the cache parameter group.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * A user-specified name for the cache parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName A user-specified name for the cache parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * The name of the cache parameter group family the cache parameter group
     * can be used with. <p>Valid values are: <code>memcached1.4</code> |
     * <code>redis2.6</code>
     *
     * @return The name of the cache parameter group family the cache parameter group
     *         can be used with. <p>Valid values are: <code>memcached1.4</code> |
     *         <code>redis2.6</code>
     */
    public String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }
    
    /**
     * The name of the cache parameter group family the cache parameter group
     * can be used with. <p>Valid values are: <code>memcached1.4</code> |
     * <code>redis2.6</code>
     *
     * @param cacheParameterGroupFamily The name of the cache parameter group family the cache parameter group
     *         can be used with. <p>Valid values are: <code>memcached1.4</code> |
     *         <code>redis2.6</code>
     */
    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }
    
    /**
     * The name of the cache parameter group family the cache parameter group
     * can be used with. <p>Valid values are: <code>memcached1.4</code> |
     * <code>redis2.6</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupFamily The name of the cache parameter group family the cache parameter group
     *         can be used with. <p>Valid values are: <code>memcached1.4</code> |
     *         <code>redis2.6</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCacheParameterGroupRequest withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }

    /**
     * A user-specified description for the cache parameter group.
     *
     * @return A user-specified description for the cache parameter group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A user-specified description for the cache parameter group.
     *
     * @param description A user-specified description for the cache parameter group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A user-specified description for the cache parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A user-specified description for the cache parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCacheParameterGroupRequest withDescription(String description) {
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
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getCacheParameterGroupFamily() != null) sb.append("CacheParameterGroupFamily: " + getCacheParameterGroupFamily() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
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

        if (obj instanceof CreateCacheParameterGroupRequest == false) return false;
        CreateCacheParameterGroupRequest other = (CreateCacheParameterGroupRequest)obj;
        
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null) return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    