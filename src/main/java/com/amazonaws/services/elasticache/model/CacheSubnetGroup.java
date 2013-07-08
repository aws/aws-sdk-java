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
 * Contains the result of a successful invocation of the following actions:
 * </p>
 * 
 * <ul>
 * <li> CreateCacheSubnetGroup </li>
 * <li> ModifyCacheSubnetGroup </li>
 * <li> DescribeCacheSubnetGroups </li>
 * <li> DeleteCacheSubnetGroup </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the DescribeCacheSubnetGroups action.
 * </p>
 */
public class CacheSubnetGroup  implements Serializable  {

    /**
     * Specifies the name of the Cache Subnet Group.
     */
    private String cacheSubnetGroupName;

    /**
     * Provides the description of the Cache Subnet Group.
     */
    private String cacheSubnetGroupDescription;

    /**
     * Provides the VPC ID of the Cache Subnet Group.
     */
    private String vpcId;

    /**
     * Contains a list of subnets for this group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Subnet> subnets;

    /**
     * Specifies the name of the Cache Subnet Group.
     *
     * @return Specifies the name of the Cache Subnet Group.
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * Specifies the name of the Cache Subnet Group.
     *
     * @param cacheSubnetGroupName Specifies the name of the Cache Subnet Group.
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * Specifies the name of the Cache Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName Specifies the name of the Cache Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSubnetGroup withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }
    
    
    /**
     * Provides the description of the Cache Subnet Group.
     *
     * @return Provides the description of the Cache Subnet Group.
     */
    public String getCacheSubnetGroupDescription() {
        return cacheSubnetGroupDescription;
    }
    
    /**
     * Provides the description of the Cache Subnet Group.
     *
     * @param cacheSubnetGroupDescription Provides the description of the Cache Subnet Group.
     */
    public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    }
    
    /**
     * Provides the description of the Cache Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupDescription Provides the description of the Cache Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSubnetGroup withCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
        return this;
    }
    
    
    /**
     * Provides the VPC ID of the Cache Subnet Group.
     *
     * @return Provides the VPC ID of the Cache Subnet Group.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Provides the VPC ID of the Cache Subnet Group.
     *
     * @param vpcId Provides the VPC ID of the Cache Subnet Group.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Provides the VPC ID of the Cache Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Provides the VPC ID of the Cache Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSubnetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    /**
     * Contains a list of subnets for this group.
     *
     * @return Contains a list of subnets for this group.
     */
    public java.util.List<Subnet> getSubnets() {
        
        if (subnets == null) {
              subnets = new com.amazonaws.internal.ListWithAutoConstructFlag<Subnet>();
              subnets.setAutoConstruct(true);
        }
        return subnets;
    }
    
    /**
     * Contains a list of subnets for this group.
     *
     * @param subnets Contains a list of subnets for this group.
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Subnet> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Subnet>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * Contains a list of subnets for this group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Contains a list of subnets for this group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSubnetGroup withSubnets(Subnet... subnets) {
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<Subnet>(subnets.length));
        for (Subnet value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of subnets for this group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Contains a list of subnets for this group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Subnet> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Subnet>(subnets.size());
            subnetsCopy.addAll(subnets);
            this.subnets = subnetsCopy;
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
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheSubnetGroupDescription() != null) sb.append("CacheSubnetGroupDescription: " + getCacheSubnetGroupDescription() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnets() != null) sb.append("Subnets: " + getSubnets() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSubnetGroupDescription() == null) ? 0 : getCacheSubnetGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheSubnetGroup == false) return false;
        CacheSubnetGroup other = (CacheSubnetGroup)obj;
        
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        if (other.getCacheSubnetGroupDescription() == null ^ this.getCacheSubnetGroupDescription() == null) return false;
        if (other.getCacheSubnetGroupDescription() != null && other.getCacheSubnetGroupDescription().equals(this.getCacheSubnetGroupDescription()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnets() == null ^ this.getSubnets() == null) return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false) return false; 
        return true;
    }
    
}
    