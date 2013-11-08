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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;


/**
 * Describe Cache Result
 */
public class DescribeCacheResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIds;

    private Long cacheAllocatedInBytes;

    private Double cacheUsedPercentage;

    private Double cacheDirtyPercentage;

    private Double cacheHitPercentage;

    private Double cacheMissPercentage;

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * Returns the value of the DiskIds property for this object.
     *
     * @return The value of the DiskIds property for this object.
     */
    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
              diskIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              diskIds.setAutoConstruct(true);
        }
        return diskIds;
    }
    
    /**
     * Sets the value of the DiskIds property for this object.
     *
     * @param diskIds The new value for the DiskIds property for this object.
     */
    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(diskIds.size());
        diskIdsCopy.addAll(diskIds);
        this.diskIds = diskIdsCopy;
    }
    
    /**
     * Sets the value of the DiskIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds The new value for the DiskIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withDiskIds(String... diskIds) {
        if (getDiskIds() == null) setDiskIds(new java.util.ArrayList<String>(diskIds.length));
        for (String value : diskIds) {
            getDiskIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the DiskIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds The new value for the DiskIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(diskIds.size());
            diskIdsCopy.addAll(diskIds);
            this.diskIds = diskIdsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the CacheAllocatedInBytes property for this
     * object.
     *
     * @return The value of the CacheAllocatedInBytes property for this object.
     */
    public Long getCacheAllocatedInBytes() {
        return cacheAllocatedInBytes;
    }
    
    /**
     * Sets the value of the CacheAllocatedInBytes property for this object.
     *
     * @param cacheAllocatedInBytes The new value for the CacheAllocatedInBytes property for this object.
     */
    public void setCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
    }
    
    /**
     * Sets the value of the CacheAllocatedInBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheAllocatedInBytes The new value for the CacheAllocatedInBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
        return this;
    }

    /**
     * Returns the value of the CacheUsedPercentage property for this object.
     *
     * @return The value of the CacheUsedPercentage property for this object.
     */
    public Double getCacheUsedPercentage() {
        return cacheUsedPercentage;
    }
    
    /**
     * Sets the value of the CacheUsedPercentage property for this object.
     *
     * @param cacheUsedPercentage The new value for the CacheUsedPercentage property for this object.
     */
    public void setCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
    }
    
    /**
     * Sets the value of the CacheUsedPercentage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheUsedPercentage The new value for the CacheUsedPercentage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
        return this;
    }

    /**
     * Returns the value of the CacheDirtyPercentage property for this
     * object.
     *
     * @return The value of the CacheDirtyPercentage property for this object.
     */
    public Double getCacheDirtyPercentage() {
        return cacheDirtyPercentage;
    }
    
    /**
     * Sets the value of the CacheDirtyPercentage property for this object.
     *
     * @param cacheDirtyPercentage The new value for the CacheDirtyPercentage property for this object.
     */
    public void setCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
    }
    
    /**
     * Sets the value of the CacheDirtyPercentage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheDirtyPercentage The new value for the CacheDirtyPercentage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
        return this;
    }

    /**
     * Returns the value of the CacheHitPercentage property for this object.
     *
     * @return The value of the CacheHitPercentage property for this object.
     */
    public Double getCacheHitPercentage() {
        return cacheHitPercentage;
    }
    
    /**
     * Sets the value of the CacheHitPercentage property for this object.
     *
     * @param cacheHitPercentage The new value for the CacheHitPercentage property for this object.
     */
    public void setCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
    }
    
    /**
     * Sets the value of the CacheHitPercentage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheHitPercentage The new value for the CacheHitPercentage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
        return this;
    }

    /**
     * Returns the value of the CacheMissPercentage property for this object.
     *
     * @return The value of the CacheMissPercentage property for this object.
     */
    public Double getCacheMissPercentage() {
        return cacheMissPercentage;
    }
    
    /**
     * Sets the value of the CacheMissPercentage property for this object.
     *
     * @param cacheMissPercentage The new value for the CacheMissPercentage property for this object.
     */
    public void setCacheMissPercentage(Double cacheMissPercentage) {
        this.cacheMissPercentage = cacheMissPercentage;
    }
    
    /**
     * Sets the value of the CacheMissPercentage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheMissPercentage The new value for the CacheMissPercentage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheResult withCacheMissPercentage(Double cacheMissPercentage) {
        this.cacheMissPercentage = cacheMissPercentage;
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
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getDiskIds() != null) sb.append("DiskIds: " + getDiskIds() + ",");
        if (getCacheAllocatedInBytes() != null) sb.append("CacheAllocatedInBytes: " + getCacheAllocatedInBytes() + ",");
        if (getCacheUsedPercentage() != null) sb.append("CacheUsedPercentage: " + getCacheUsedPercentage() + ",");
        if (getCacheDirtyPercentage() != null) sb.append("CacheDirtyPercentage: " + getCacheDirtyPercentage() + ",");
        if (getCacheHitPercentage() != null) sb.append("CacheHitPercentage: " + getCacheHitPercentage() + ",");
        if (getCacheMissPercentage() != null) sb.append("CacheMissPercentage: " + getCacheMissPercentage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode()); 
        hashCode = prime * hashCode + ((getCacheAllocatedInBytes() == null) ? 0 : getCacheAllocatedInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getCacheUsedPercentage() == null) ? 0 : getCacheUsedPercentage().hashCode()); 
        hashCode = prime * hashCode + ((getCacheDirtyPercentage() == null) ? 0 : getCacheDirtyPercentage().hashCode()); 
        hashCode = prime * hashCode + ((getCacheHitPercentage() == null) ? 0 : getCacheHitPercentage().hashCode()); 
        hashCode = prime * hashCode + ((getCacheMissPercentage() == null) ? 0 : getCacheMissPercentage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheResult == false) return false;
        DescribeCacheResult other = (DescribeCacheResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getDiskIds() == null ^ this.getDiskIds() == null) return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false) return false; 
        if (other.getCacheAllocatedInBytes() == null ^ this.getCacheAllocatedInBytes() == null) return false;
        if (other.getCacheAllocatedInBytes() != null && other.getCacheAllocatedInBytes().equals(this.getCacheAllocatedInBytes()) == false) return false; 
        if (other.getCacheUsedPercentage() == null ^ this.getCacheUsedPercentage() == null) return false;
        if (other.getCacheUsedPercentage() != null && other.getCacheUsedPercentage().equals(this.getCacheUsedPercentage()) == false) return false; 
        if (other.getCacheDirtyPercentage() == null ^ this.getCacheDirtyPercentage() == null) return false;
        if (other.getCacheDirtyPercentage() != null && other.getCacheDirtyPercentage().equals(this.getCacheDirtyPercentage()) == false) return false; 
        if (other.getCacheHitPercentage() == null ^ this.getCacheHitPercentage() == null) return false;
        if (other.getCacheHitPercentage() != null && other.getCacheHitPercentage().equals(this.getCacheHitPercentage()) == false) return false; 
        if (other.getCacheMissPercentage() == null ^ this.getCacheMissPercentage() == null) return false;
        if (other.getCacheMissPercentage() != null && other.getCacheMissPercentage().equals(this.getCacheMissPercentage()) == false) return false; 
        return true;
    }
    
}
    