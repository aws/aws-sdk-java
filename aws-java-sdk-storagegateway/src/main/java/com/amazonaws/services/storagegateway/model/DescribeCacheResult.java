/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> diskIds;
    /**
     * <p>
     * The amount of cache in bytes allocated to the a gateway.
     * </p>
     */
    private Long cacheAllocatedInBytes;
    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The
     * sample is taken at the end of the reporting period.
     * </p>
     */
    private Double cacheUsedPercentage;
    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to
     * AWS. The sample is taken at the end of the reporting period.
     * </p>
     */
    private Double cacheDirtyPercentage;
    /**
     * <p>
     * Percent of application read operations from the file shares that are served from cache. The sample is taken at
     * the end of the reporting period.
     * </p>
     */
    private Double cacheHitPercentage;
    /**
     * <p>
     * Percent of application read operations from the file shares that are not served from cache. The sample is taken
     * at the end of the reporting period.
     * </p>
     */
    private Double cacheMissPercentage;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * 
     * @return An array of strings that identify disks that are to be configured as working storage. Each string have a
     *         minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *         API.
     */

    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
            diskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return diskIds;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * 
     * @param diskIds
     *        An array of strings that identify disks that are to be configured as working storage. Each string have a
     *        minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *        API.
     */

    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        this.diskIds = new com.amazonaws.internal.SdkInternalList<String>(diskIds);
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskIds(java.util.Collection)} or {@link #withDiskIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param diskIds
     *        An array of strings that identify disks that are to be configured as working storage. Each string have a
     *        minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withDiskIds(String... diskIds) {
        if (this.diskIds == null) {
            setDiskIds(new com.amazonaws.internal.SdkInternalList<String>(diskIds.length));
        }
        for (String ele : diskIds) {
            this.diskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * 
     * @param diskIds
     *        An array of strings that identify disks that are to be configured as working storage. Each string have a
     *        minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
        return this;
    }

    /**
     * <p>
     * The amount of cache in bytes allocated to the a gateway.
     * </p>
     * 
     * @param cacheAllocatedInBytes
     *        The amount of cache in bytes allocated to the a gateway.
     */

    public void setCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
    }

    /**
     * <p>
     * The amount of cache in bytes allocated to the a gateway.
     * </p>
     * 
     * @return The amount of cache in bytes allocated to the a gateway.
     */

    public Long getCacheAllocatedInBytes() {
        return this.cacheAllocatedInBytes;
    }

    /**
     * <p>
     * The amount of cache in bytes allocated to the a gateway.
     * </p>
     * 
     * @param cacheAllocatedInBytes
     *        The amount of cache in bytes allocated to the a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        setCacheAllocatedInBytes(cacheAllocatedInBytes);
        return this;
    }

    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The
     * sample is taken at the end of the reporting period.
     * </p>
     * 
     * @param cacheUsedPercentage
     *        Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup.
     *        The sample is taken at the end of the reporting period.
     */

    public void setCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
    }

    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The
     * sample is taken at the end of the reporting period.
     * </p>
     * 
     * @return Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup.
     *         The sample is taken at the end of the reporting period.
     */

    public Double getCacheUsedPercentage() {
        return this.cacheUsedPercentage;
    }

    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The
     * sample is taken at the end of the reporting period.
     * </p>
     * 
     * @param cacheUsedPercentage
     *        Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup.
     *        The sample is taken at the end of the reporting period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withCacheUsedPercentage(Double cacheUsedPercentage) {
        setCacheUsedPercentage(cacheUsedPercentage);
        return this;
    }

    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to
     * AWS. The sample is taken at the end of the reporting period.
     * </p>
     * 
     * @param cacheDirtyPercentage
     *        The file share's contribution to the overall percentage of the gateway's cache that has not been persisted
     *        to AWS. The sample is taken at the end of the reporting period.
     */

    public void setCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
    }

    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to
     * AWS. The sample is taken at the end of the reporting period.
     * </p>
     * 
     * @return The file share's contribution to the overall percentage of the gateway's cache that has not been
     *         persisted to AWS. The sample is taken at the end of the reporting period.
     */

    public Double getCacheDirtyPercentage() {
        return this.cacheDirtyPercentage;
    }

    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to
     * AWS. The sample is taken at the end of the reporting period.
     * </p>
     * 
     * @param cacheDirtyPercentage
     *        The file share's contribution to the overall percentage of the gateway's cache that has not been persisted
     *        to AWS. The sample is taken at the end of the reporting period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withCacheDirtyPercentage(Double cacheDirtyPercentage) {
        setCacheDirtyPercentage(cacheDirtyPercentage);
        return this;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are served from cache. The sample is taken at
     * the end of the reporting period.
     * </p>
     * 
     * @param cacheHitPercentage
     *        Percent of application read operations from the file shares that are served from cache. The sample is
     *        taken at the end of the reporting period.
     */

    public void setCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are served from cache. The sample is taken at
     * the end of the reporting period.
     * </p>
     * 
     * @return Percent of application read operations from the file shares that are served from cache. The sample is
     *         taken at the end of the reporting period.
     */

    public Double getCacheHitPercentage() {
        return this.cacheHitPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are served from cache. The sample is taken at
     * the end of the reporting period.
     * </p>
     * 
     * @param cacheHitPercentage
     *        Percent of application read operations from the file shares that are served from cache. The sample is
     *        taken at the end of the reporting period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withCacheHitPercentage(Double cacheHitPercentage) {
        setCacheHitPercentage(cacheHitPercentage);
        return this;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are not served from cache. The sample is taken
     * at the end of the reporting period.
     * </p>
     * 
     * @param cacheMissPercentage
     *        Percent of application read operations from the file shares that are not served from cache. The sample is
     *        taken at the end of the reporting period.
     */

    public void setCacheMissPercentage(Double cacheMissPercentage) {
        this.cacheMissPercentage = cacheMissPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are not served from cache. The sample is taken
     * at the end of the reporting period.
     * </p>
     * 
     * @return Percent of application read operations from the file shares that are not served from cache. The sample is
     *         taken at the end of the reporting period.
     */

    public Double getCacheMissPercentage() {
        return this.cacheMissPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are not served from cache. The sample is taken
     * at the end of the reporting period.
     * </p>
     * 
     * @param cacheMissPercentage
     *        Percent of application read operations from the file shares that are not served from cache. The sample is
     *        taken at the end of the reporting period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheResult withCacheMissPercentage(Double cacheMissPercentage) {
        setCacheMissPercentage(cacheMissPercentage);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getDiskIds() != null)
            sb.append("DiskIds: ").append(getDiskIds()).append(",");
        if (getCacheAllocatedInBytes() != null)
            sb.append("CacheAllocatedInBytes: ").append(getCacheAllocatedInBytes()).append(",");
        if (getCacheUsedPercentage() != null)
            sb.append("CacheUsedPercentage: ").append(getCacheUsedPercentage()).append(",");
        if (getCacheDirtyPercentage() != null)
            sb.append("CacheDirtyPercentage: ").append(getCacheDirtyPercentage()).append(",");
        if (getCacheHitPercentage() != null)
            sb.append("CacheHitPercentage: ").append(getCacheHitPercentage()).append(",");
        if (getCacheMissPercentage() != null)
            sb.append("CacheMissPercentage: ").append(getCacheMissPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheResult == false)
            return false;
        DescribeCacheResult other = (DescribeCacheResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        if (other.getCacheAllocatedInBytes() == null ^ this.getCacheAllocatedInBytes() == null)
            return false;
        if (other.getCacheAllocatedInBytes() != null && other.getCacheAllocatedInBytes().equals(this.getCacheAllocatedInBytes()) == false)
            return false;
        if (other.getCacheUsedPercentage() == null ^ this.getCacheUsedPercentage() == null)
            return false;
        if (other.getCacheUsedPercentage() != null && other.getCacheUsedPercentage().equals(this.getCacheUsedPercentage()) == false)
            return false;
        if (other.getCacheDirtyPercentage() == null ^ this.getCacheDirtyPercentage() == null)
            return false;
        if (other.getCacheDirtyPercentage() != null && other.getCacheDirtyPercentage().equals(this.getCacheDirtyPercentage()) == false)
            return false;
        if (other.getCacheHitPercentage() == null ^ this.getCacheHitPercentage() == null)
            return false;
        if (other.getCacheHitPercentage() != null && other.getCacheHitPercentage().equals(this.getCacheHitPercentage()) == false)
            return false;
        if (other.getCacheMissPercentage() == null ^ this.getCacheMissPercentage() == null)
            return false;
        if (other.getCacheMissPercentage() != null && other.getCacheMissPercentage().equals(this.getCacheMissPercentage()) == false)
            return false;
        return true;
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
    public DescribeCacheResult clone() {
        try {
            return (DescribeCacheResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
