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
 * Defines a set of EC2 Security groups that are allowed to access a Cache Cluster.
 * </p>
 */
public class CacheSecurityGroup {

    /**
     * Provides the AWS ID of the owner of a specific Cache Security Group.
     */
    private String ownerId;

    /**
     * Specifies the name of the Cache Security Group.
     */
    private String cacheSecurityGroupName;

    /**
     * Provides the description of the Cache Security Group.
     */
    private String description;

    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    private java.util.List<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * Provides the AWS ID of the owner of a specific Cache Security Group.
     *
     * @return Provides the AWS ID of the owner of a specific Cache Security Group.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * Provides the AWS ID of the owner of a specific Cache Security Group.
     *
     * @param ownerId Provides the AWS ID of the owner of a specific Cache Security Group.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * Provides the AWS ID of the owner of a specific Cache Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId Provides the AWS ID of the owner of a specific Cache Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSecurityGroup withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    
    /**
     * Specifies the name of the Cache Security Group.
     *
     * @return Specifies the name of the Cache Security Group.
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * Specifies the name of the Cache Security Group.
     *
     * @param cacheSecurityGroupName Specifies the name of the Cache Security Group.
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * Specifies the name of the Cache Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName Specifies the name of the Cache Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSecurityGroup withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }
    
    
    /**
     * Provides the description of the Cache Security Group.
     *
     * @return Provides the description of the Cache Security Group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Provides the description of the Cache Security Group.
     *
     * @param description Provides the description of the Cache Security Group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Provides the description of the Cache Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Provides the description of the Cache Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @return Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        
        if (eC2SecurityGroups == null) {
            eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>();
        }
        return eC2SecurityGroups;
    }
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @param eC2SecurityGroups Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }

        java.util.List<EC2SecurityGroup> eC2SecurityGroupsCopy = new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups.size());
        eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
        this.eC2SecurityGroups = eC2SecurityGroupsCopy;
    }
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups Contains a list of <a>EC2SecurityGroup</a> elements.
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
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSecurityGroup withEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
        } else {
            java.util.List<EC2SecurityGroup> eC2SecurityGroupsCopy = new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups.size());
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
        if (ownerId != null) sb.append("OwnerId: " + ownerId + ", ");
        if (cacheSecurityGroupName != null) sb.append("CacheSecurityGroupName: " + cacheSecurityGroupName + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        if (eC2SecurityGroups != null) sb.append("EC2SecurityGroups: " + eC2SecurityGroups + ", ");
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
    