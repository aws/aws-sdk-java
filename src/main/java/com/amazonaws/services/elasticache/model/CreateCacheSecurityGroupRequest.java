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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createCacheSecurityGroup(CreateCacheSecurityGroupRequest) CreateCacheSecurityGroup operation}.
 * <p>
 * The <i>CreateCacheSecurityGroup</i> operation creates a new cache security group. Use a cache security group to control access to one or more cache
 * clusters.
 * </p>
 * <p>
 * Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud (VPC). If you are creating a cluster
 * inside of a VPC, use a cache subnet group instead. For more information, see <i>CreateCacheSubnetGroup</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createCacheSecurityGroup(CreateCacheSecurityGroupRequest)
 */
public class CreateCacheSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A name for the cache security group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be the word "Default". <p>Example:
     * <code>mysecuritygroup</code>
     */
    private String cacheSecurityGroupName;

    /**
     * A description for the cache security group.
     */
    private String description;

    /**
     * Default constructor for a new CreateCacheSecurityGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateCacheSecurityGroupRequest() {}
    
    /**
     * Constructs a new CreateCacheSecurityGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheSecurityGroupName A name for the cache security group.
     * This value is stored as a lowercase string. <p>Constraints: Must
     * contain no more than 255 alphanumeric characters. Must not be the word
     * "Default". <p>Example: <code>mysecuritygroup</code>
     * @param description A description for the cache security group.
     */
    public CreateCacheSecurityGroupRequest(String cacheSecurityGroupName, String description) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
        setDescription(description);
    }

    /**
     * A name for the cache security group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be the word "Default". <p>Example:
     * <code>mysecuritygroup</code>
     *
     * @return A name for the cache security group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be the word "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * A name for the cache security group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be the word "Default". <p>Example:
     * <code>mysecuritygroup</code>
     *
     * @param cacheSecurityGroupName A name for the cache security group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be the word "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * A name for the cache security group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be the word "Default". <p>Example:
     * <code>mysecuritygroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName A name for the cache security group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be the word "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCacheSecurityGroupRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }

    /**
     * A description for the cache security group.
     *
     * @return A description for the cache security group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the cache security group.
     *
     * @param description A description for the cache security group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the cache security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the cache security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCacheSecurityGroupRequest withDescription(String description) {
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
        if (getCacheSecurityGroupName() != null) sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateCacheSecurityGroupRequest == false) return false;
        CreateCacheSecurityGroupRequest other = (CreateCacheSecurityGroupRequest)obj;
        
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null) return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    