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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest) ModifyCacheSubnetGroup operation}.
 * <p>
 * Modifies an existing Cache Subnet Group.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest)
 */
public class ModifyCacheSubnetGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name for the Cache Subnet Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. <p>Example:
     * <code>mysubnetgroup</code>
     */
    private String cacheSubnetGroupName;

    /**
     * The description for the Cache Subnet Group.
     */
    private String cacheSubnetGroupDescription;

    /**
     * The EC2 Subnet IDs for the Cache Subnet Group.
     */
    private java.util.List<String> subnetIds;

    /**
     * The name for the Cache Subnet Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. <p>Example:
     * <code>mysubnetgroup</code>
     *
     * @return The name for the Cache Subnet Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters or hyphens. <p>Example:
     *         <code>mysubnetgroup</code>
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * The name for the Cache Subnet Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. <p>Example:
     * <code>mysubnetgroup</code>
     *
     * @param cacheSubnetGroupName The name for the Cache Subnet Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters or hyphens. <p>Example:
     *         <code>mysubnetgroup</code>
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * The name for the Cache Subnet Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. <p>Example:
     * <code>mysubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName The name for the Cache Subnet Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters or hyphens. <p>Example:
     *         <code>mysubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyCacheSubnetGroupRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }
    
    
    /**
     * The description for the Cache Subnet Group.
     *
     * @return The description for the Cache Subnet Group.
     */
    public String getCacheSubnetGroupDescription() {
        return cacheSubnetGroupDescription;
    }
    
    /**
     * The description for the Cache Subnet Group.
     *
     * @param cacheSubnetGroupDescription The description for the Cache Subnet Group.
     */
    public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    }
    
    /**
     * The description for the Cache Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupDescription The description for the Cache Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyCacheSubnetGroupRequest withCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
        return this;
    }
    
    
    /**
     * The EC2 Subnet IDs for the Cache Subnet Group.
     *
     * @return The EC2 Subnet IDs for the Cache Subnet Group.
     */
    public java.util.List<String> getSubnetIds() {
        
        if (subnetIds == null) {
            subnetIds = new java.util.ArrayList<String>();
        }
        return subnetIds;
    }
    
    /**
     * The EC2 Subnet IDs for the Cache Subnet Group.
     *
     * @param subnetIds The EC2 Subnet IDs for the Cache Subnet Group.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        java.util.List<String> subnetIdsCopy = new java.util.ArrayList<String>(subnetIds.size());
        subnetIdsCopy.addAll(subnetIds);
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * The EC2 Subnet IDs for the Cache Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The EC2 Subnet IDs for the Cache Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyCacheSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * The EC2 Subnet IDs for the Cache Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The EC2 Subnet IDs for the Cache Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyCacheSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
        } else {
            java.util.List<String> subnetIdsCopy = new java.util.ArrayList<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
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
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ", ");
        if (getCacheSubnetGroupDescription() != null) sb.append("CacheSubnetGroupDescription: " + getCacheSubnetGroupDescription() + ", ");
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSubnetGroupDescription() == null) ? 0 : getCacheSubnetGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyCacheSubnetGroupRequest == false) return false;
        ModifyCacheSubnetGroupRequest other = (ModifyCacheSubnetGroupRequest)obj;
        
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        if (other.getCacheSubnetGroupDescription() == null ^ this.getCacheSubnetGroupDescription() == null) return false;
        if (other.getCacheSubnetGroupDescription() != null && other.getCacheSubnetGroupDescription().equals(this.getCacheSubnetGroupDescription()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        return true;
    }
    
}
    