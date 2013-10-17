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
 * <li> <i>AuthorizeCacheSecurityGroupIngress</i> </li>
 * <li> <i>CreateCacheSecurityGroup</i> </li>
 * <li> <i>RevokeCacheSecurityGroupIngress</i> </li>
 * 
 * </ul>
 */
public class CacheSecurityGroup implements Serializable {

    /**
     * The AWS account ID of the cache security group owner.
     */
    private String ownerId;

    /**
     * The name of the cache security group.
     */
    private String cacheSecurityGroupName;

    /**
     * The description of the cache security group.
     */
    private String description;

    /**
     * A list of Amazon EC2 security groups that are associated with this
     * cache security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * The AWS account ID of the cache security group owner.
     *
     * @return The AWS account ID of the cache security group owner.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The AWS account ID of the cache security group owner.
     *
     * @param ownerId The AWS account ID of the cache security group owner.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The AWS account ID of the cache security group owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The AWS account ID of the cache security group owner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheSecurityGroup withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

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
    public CacheSecurityGroup withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }

    /**
     * The description of the cache security group.
     *
     * @return The description of the cache security group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the cache security group.
     *
     * @param description The description of the cache security group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the cache security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the cache security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheSecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A list of Amazon EC2 security groups that are associated with this
     * cache security group.
     *
     * @return A list of Amazon EC2 security groups that are associated with this
     *         cache security group.
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        if (eC2SecurityGroups == null) {
              eC2SecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>();
              eC2SecurityGroups.setAutoConstruct(true);
        }
        return eC2SecurityGroups;
    }
    
    /**
     * A list of Amazon EC2 security groups that are associated with this
     * cache security group.
     *
     * @param eC2SecurityGroups A list of Amazon EC2 security groups that are associated with this
     *         cache security group.
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>(eC2SecurityGroups.size());
        eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
        this.eC2SecurityGroups = eC2SecurityGroupsCopy;
    }
    
    /**
     * A list of Amazon EC2 security groups that are associated with this
     * cache security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups A list of Amazon EC2 security groups that are associated with this
     *         cache security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (getEC2SecurityGroups() == null) setEC2SecurityGroups(new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups.length));
        for (EC2SecurityGroup value : eC2SecurityGroups) {
            getEC2SecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of Amazon EC2 security groups that are associated with this
     * cache security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups A list of Amazon EC2 security groups that are associated with this
     *         cache security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheSecurityGroup withEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>(eC2SecurityGroups.size());
            eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
            this.eC2SecurityGroups = eC2SecurityGroupsCopy;
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
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getCacheSecurityGroupName() != null) sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getEC2SecurityGroups() != null) sb.append("EC2SecurityGroups: " + getEC2SecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheSecurityGroup == false) return false;
        CacheSecurityGroup other = (CacheSecurityGroup)obj;
        
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null) return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null) return false;
        if (other.getEC2SecurityGroups() != null && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false) return false; 
        return true;
    }
    
}
    