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
package com.amazonaws.services.storagegateway.model;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> DescribeCacheOutput$CacheAllocatedInBytes </li>
 * <li> DescribeCacheOutput$CacheDirtyPercentage </li>
 * <li> DescribeCacheOutput$CacheHitPercentage </li>
 * <li> DescribeCacheOutput$CacheMissPercentage </li>
 * <li> DescribeCacheOutput$CacheUsedPercentage </li>
 * <li> DescribeCacheOutput$DiskIds </li>
 * <li> DescribeCacheOutput$GatewayARN </li>
 * 
 * </ul>
 */
public class DescribeCacheResult {

    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * List Gateways operations to return a list of gateways for your account
     * and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * An array of the gateway's local disk IDs that are configured as cache.
     * Each local disk ID is specified as a string (minimum length of 1 and
     * maximum length of 300). If no local disks are configured as cache,
     * then the <code>DiskIds</code> array is empty.
     */
    private java.util.List<String> diskIds;

    /**
     * The size allocated, in bytes, for the cache. If no cache is defined
     * for the gateway, this field returns 0.
     */
    private Long cacheAllocatedInBytes;

    /**
     * The percentage (0 to 100) of the cache storage in use. If no cached is
     * defined for the gateway, this field returns 0.
     */
    private Double cacheUsedPercentage;

    /**
     * The percentage of the cache that contains data that has not yet been
     * persisted to Amazon S3. If no cached is defined for the gateway, this
     * field returns 0.
     */
    private Double cacheDirtyPercentage;

    /**
     * The percentage (0 to 100) of data read from the storage volume that
     * was read from cache. If no cached is defined for the gateway, this
     * field returns 0.
     */
    private Double cacheHitPercentage;

    /**
     * TThe percentage (0 to 100) of data read from the storage volume that
     * was not read from the cache, but was read from Amazon S3. If no cached
     * is defined for the gateway, this field returns 0.
     */
    private Double cacheMissPercentage;

    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * List Gateways operations to return a list of gateways for your account
     * and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return In response, AWS Storage Gateway returns the ARN of the activated
     *         gateway. If you don't remember the ARN of a gateway, you can use the
     *         List Gateways operations to return a list of gateways for your account
     *         and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * List Gateways operations to return a list of gateways for your account
     * and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN In response, AWS Storage Gateway returns the ARN of the activated
     *         gateway. If you don't remember the ARN of a gateway, you can use the
     *         List Gateways operations to return a list of gateways for your account
     *         and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * List Gateways operations to return a list of gateways for your account
     * and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN In response, AWS Storage Gateway returns the ARN of the activated
     *         gateway. If you don't remember the ARN of a gateway, you can use the
     *         List Gateways operations to return a list of gateways for your account
     *         and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * An array of the gateway's local disk IDs that are configured as cache.
     * Each local disk ID is specified as a string (minimum length of 1 and
     * maximum length of 300). If no local disks are configured as cache,
     * then the <code>DiskIds</code> array is empty.
     *
     * @return An array of the gateway's local disk IDs that are configured as cache.
     *         Each local disk ID is specified as a string (minimum length of 1 and
     *         maximum length of 300). If no local disks are configured as cache,
     *         then the <code>DiskIds</code> array is empty.
     */
    public java.util.List<String> getDiskIds() {
        
        if (diskIds == null) {
            diskIds = new java.util.ArrayList<String>();
        }
        return diskIds;
    }
    
    /**
     * An array of the gateway's local disk IDs that are configured as cache.
     * Each local disk ID is specified as a string (minimum length of 1 and
     * maximum length of 300). If no local disks are configured as cache,
     * then the <code>DiskIds</code> array is empty.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as cache.
     *         Each local disk ID is specified as a string (minimum length of 1 and
     *         maximum length of 300). If no local disks are configured as cache,
     *         then the <code>DiskIds</code> array is empty.
     */
    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        java.util.List<String> diskIdsCopy = new java.util.ArrayList<String>(diskIds.size());
        diskIdsCopy.addAll(diskIds);
        this.diskIds = diskIdsCopy;
    }
    
    /**
     * An array of the gateway's local disk IDs that are configured as cache.
     * Each local disk ID is specified as a string (minimum length of 1 and
     * maximum length of 300). If no local disks are configured as cache,
     * then the <code>DiskIds</code> array is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as cache.
     *         Each local disk ID is specified as a string (minimum length of 1 and
     *         maximum length of 300). If no local disks are configured as cache,
     *         then the <code>DiskIds</code> array is empty.
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
     * An array of the gateway's local disk IDs that are configured as cache.
     * Each local disk ID is specified as a string (minimum length of 1 and
     * maximum length of 300). If no local disks are configured as cache,
     * then the <code>DiskIds</code> array is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as cache.
     *         Each local disk ID is specified as a string (minimum length of 1 and
     *         maximum length of 300). If no local disks are configured as cache,
     *         then the <code>DiskIds</code> array is empty.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheResult withDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
        } else {
            java.util.List<String> diskIdsCopy = new java.util.ArrayList<String>(diskIds.size());
            diskIdsCopy.addAll(diskIds);
            this.diskIds = diskIdsCopy;
        }

        return this;
    }
    
    /**
     * The size allocated, in bytes, for the cache. If no cache is defined
     * for the gateway, this field returns 0.
     *
     * @return The size allocated, in bytes, for the cache. If no cache is defined
     *         for the gateway, this field returns 0.
     */
    public Long getCacheAllocatedInBytes() {
        return cacheAllocatedInBytes;
    }
    
    /**
     * The size allocated, in bytes, for the cache. If no cache is defined
     * for the gateway, this field returns 0.
     *
     * @param cacheAllocatedInBytes The size allocated, in bytes, for the cache. If no cache is defined
     *         for the gateway, this field returns 0.
     */
    public void setCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
    }
    
    /**
     * The size allocated, in bytes, for the cache. If no cache is defined
     * for the gateway, this field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheAllocatedInBytes The size allocated, in bytes, for the cache. If no cache is defined
     *         for the gateway, this field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheResult withCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
        return this;
    }
    
    
    /**
     * The percentage (0 to 100) of the cache storage in use. If no cached is
     * defined for the gateway, this field returns 0.
     *
     * @return The percentage (0 to 100) of the cache storage in use. If no cached is
     *         defined for the gateway, this field returns 0.
     */
    public Double getCacheUsedPercentage() {
        return cacheUsedPercentage;
    }
    
    /**
     * The percentage (0 to 100) of the cache storage in use. If no cached is
     * defined for the gateway, this field returns 0.
     *
     * @param cacheUsedPercentage The percentage (0 to 100) of the cache storage in use. If no cached is
     *         defined for the gateway, this field returns 0.
     */
    public void setCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
    }
    
    /**
     * The percentage (0 to 100) of the cache storage in use. If no cached is
     * defined for the gateway, this field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheUsedPercentage The percentage (0 to 100) of the cache storage in use. If no cached is
     *         defined for the gateway, this field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheResult withCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
        return this;
    }
    
    
    /**
     * The percentage of the cache that contains data that has not yet been
     * persisted to Amazon S3. If no cached is defined for the gateway, this
     * field returns 0.
     *
     * @return The percentage of the cache that contains data that has not yet been
     *         persisted to Amazon S3. If no cached is defined for the gateway, this
     *         field returns 0.
     */
    public Double getCacheDirtyPercentage() {
        return cacheDirtyPercentage;
    }
    
    /**
     * The percentage of the cache that contains data that has not yet been
     * persisted to Amazon S3. If no cached is defined for the gateway, this
     * field returns 0.
     *
     * @param cacheDirtyPercentage The percentage of the cache that contains data that has not yet been
     *         persisted to Amazon S3. If no cached is defined for the gateway, this
     *         field returns 0.
     */
    public void setCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
    }
    
    /**
     * The percentage of the cache that contains data that has not yet been
     * persisted to Amazon S3. If no cached is defined for the gateway, this
     * field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheDirtyPercentage The percentage of the cache that contains data that has not yet been
     *         persisted to Amazon S3. If no cached is defined for the gateway, this
     *         field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheResult withCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
        return this;
    }
    
    
    /**
     * The percentage (0 to 100) of data read from the storage volume that
     * was read from cache. If no cached is defined for the gateway, this
     * field returns 0.
     *
     * @return The percentage (0 to 100) of data read from the storage volume that
     *         was read from cache. If no cached is defined for the gateway, this
     *         field returns 0.
     */
    public Double getCacheHitPercentage() {
        return cacheHitPercentage;
    }
    
    /**
     * The percentage (0 to 100) of data read from the storage volume that
     * was read from cache. If no cached is defined for the gateway, this
     * field returns 0.
     *
     * @param cacheHitPercentage The percentage (0 to 100) of data read from the storage volume that
     *         was read from cache. If no cached is defined for the gateway, this
     *         field returns 0.
     */
    public void setCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
    }
    
    /**
     * The percentage (0 to 100) of data read from the storage volume that
     * was read from cache. If no cached is defined for the gateway, this
     * field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheHitPercentage The percentage (0 to 100) of data read from the storage volume that
     *         was read from cache. If no cached is defined for the gateway, this
     *         field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheResult withCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
        return this;
    }
    
    
    /**
     * TThe percentage (0 to 100) of data read from the storage volume that
     * was not read from the cache, but was read from Amazon S3. If no cached
     * is defined for the gateway, this field returns 0.
     *
     * @return TThe percentage (0 to 100) of data read from the storage volume that
     *         was not read from the cache, but was read from Amazon S3. If no cached
     *         is defined for the gateway, this field returns 0.
     */
    public Double getCacheMissPercentage() {
        return cacheMissPercentage;
    }
    
    /**
     * TThe percentage (0 to 100) of data read from the storage volume that
     * was not read from the cache, but was read from Amazon S3. If no cached
     * is defined for the gateway, this field returns 0.
     *
     * @param cacheMissPercentage TThe percentage (0 to 100) of data read from the storage volume that
     *         was not read from the cache, but was read from Amazon S3. If no cached
     *         is defined for the gateway, this field returns 0.
     */
    public void setCacheMissPercentage(Double cacheMissPercentage) {
        this.cacheMissPercentage = cacheMissPercentage;
    }
    
    /**
     * TThe percentage (0 to 100) of data read from the storage volume that
     * was not read from the cache, but was read from Amazon S3. If no cached
     * is defined for the gateway, this field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheMissPercentage TThe percentage (0 to 100) of data read from the storage volume that
     *         was not read from the cache, but was read from Amazon S3. If no cached
     *         is defined for the gateway, this field returns 0.
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
        if (gatewayARN != null) sb.append("GatewayARN: " + gatewayARN + ", ");
        if (diskIds != null) sb.append("DiskIds: " + diskIds + ", ");
        if (cacheAllocatedInBytes != null) sb.append("CacheAllocatedInBytes: " + cacheAllocatedInBytes + ", ");
        if (cacheUsedPercentage != null) sb.append("CacheUsedPercentage: " + cacheUsedPercentage + ", ");
        if (cacheDirtyPercentage != null) sb.append("CacheDirtyPercentage: " + cacheDirtyPercentage + ", ");
        if (cacheHitPercentage != null) sb.append("CacheHitPercentage: " + cacheHitPercentage + ", ");
        if (cacheMissPercentage != null) sb.append("CacheMissPercentage: " + cacheMissPercentage + ", ");
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
    