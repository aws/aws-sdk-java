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
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class DescribeWorkingStorageResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the DiskIds array is empty.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIds;

    /**
     * The total working storage in bytes in use by the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     */
    private Long workingStorageUsedInBytes;

    /**
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     */
    private Long workingStorageAllocatedInBytes;

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
    public DescribeWorkingStorageResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the DiskIds array is empty.
     *
     * @return An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the DiskIds array is empty.
     */
    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
              diskIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              diskIds.setAutoConstruct(true);
        }
        return diskIds;
    }
    
    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the DiskIds array is empty.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the DiskIds array is empty.
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
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the DiskIds array is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the DiskIds array is empty.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeWorkingStorageResult withDiskIds(String... diskIds) {
        if (getDiskIds() == null) setDiskIds(new java.util.ArrayList<String>(diskIds.length));
        for (String value : diskIds) {
            getDiskIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the DiskIds array is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the DiskIds array is empty.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeWorkingStorageResult withDiskIds(java.util.Collection<String> diskIds) {
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
     * The total working storage in bytes in use by the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     *
     * @return The total working storage in bytes in use by the gateway. If no
     *         working storage is configured for the gateway, this field returns 0.
     */
    public Long getWorkingStorageUsedInBytes() {
        return workingStorageUsedInBytes;
    }
    
    /**
     * The total working storage in bytes in use by the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     *
     * @param workingStorageUsedInBytes The total working storage in bytes in use by the gateway. If no
     *         working storage is configured for the gateway, this field returns 0.
     */
    public void setWorkingStorageUsedInBytes(Long workingStorageUsedInBytes) {
        this.workingStorageUsedInBytes = workingStorageUsedInBytes;
    }
    
    /**
     * The total working storage in bytes in use by the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workingStorageUsedInBytes The total working storage in bytes in use by the gateway. If no
     *         working storage is configured for the gateway, this field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeWorkingStorageResult withWorkingStorageUsedInBytes(Long workingStorageUsedInBytes) {
        this.workingStorageUsedInBytes = workingStorageUsedInBytes;
        return this;
    }

    /**
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     *
     * @return The total working storage in bytes allocated for the gateway. If no
     *         working storage is configured for the gateway, this field returns 0.
     */
    public Long getWorkingStorageAllocatedInBytes() {
        return workingStorageAllocatedInBytes;
    }
    
    /**
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     *
     * @param workingStorageAllocatedInBytes The total working storage in bytes allocated for the gateway. If no
     *         working storage is configured for the gateway, this field returns 0.
     */
    public void setWorkingStorageAllocatedInBytes(Long workingStorageAllocatedInBytes) {
        this.workingStorageAllocatedInBytes = workingStorageAllocatedInBytes;
    }
    
    /**
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workingStorageAllocatedInBytes The total working storage in bytes allocated for the gateway. If no
     *         working storage is configured for the gateway, this field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeWorkingStorageResult withWorkingStorageAllocatedInBytes(Long workingStorageAllocatedInBytes) {
        this.workingStorageAllocatedInBytes = workingStorageAllocatedInBytes;
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
        if (getWorkingStorageUsedInBytes() != null) sb.append("WorkingStorageUsedInBytes: " + getWorkingStorageUsedInBytes() + ",");
        if (getWorkingStorageAllocatedInBytes() != null) sb.append("WorkingStorageAllocatedInBytes: " + getWorkingStorageAllocatedInBytes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode()); 
        hashCode = prime * hashCode + ((getWorkingStorageUsedInBytes() == null) ? 0 : getWorkingStorageUsedInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkingStorageAllocatedInBytes() == null) ? 0 : getWorkingStorageAllocatedInBytes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkingStorageResult == false) return false;
        DescribeWorkingStorageResult other = (DescribeWorkingStorageResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getDiskIds() == null ^ this.getDiskIds() == null) return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false) return false; 
        if (other.getWorkingStorageUsedInBytes() == null ^ this.getWorkingStorageUsedInBytes() == null) return false;
        if (other.getWorkingStorageUsedInBytes() != null && other.getWorkingStorageUsedInBytes().equals(this.getWorkingStorageUsedInBytes()) == false) return false; 
        if (other.getWorkingStorageAllocatedInBytes() == null ^ this.getWorkingStorageAllocatedInBytes() == null) return false;
        if (other.getWorkingStorageAllocatedInBytes() != null && other.getWorkingStorageAllocatedInBytes().equals(this.getWorkingStorageAllocatedInBytes()) == false) return false; 
        return true;
    }
    
}
    